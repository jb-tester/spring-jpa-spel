package com.mytests.spring_data.spring_jpa_spel.repositories;

import com.mytests.spring_data.spring_jpa_spel.data.Contact;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * *
 * <p>Created by irina on 29.03.2021.</p>
 * <p>Project: spring-jpa-spel</p>
 * *
 */
public interface ContactRepo extends CrudRepository<Contact, Integer> {

    // https://youtrack.jetbrains.com/issue/IDEA-186558, https://youtrack.jetbrains.com/issue/IDEA-265462
    @Query("select contact from #{#entityName} contact where contact.firstname=?#{[0]} ")
    List<Contact> findByCustomQuery1(String firstname);

    // https://youtrack.jetbrains.com/issue/IDEA-186558, https://youtrack.jetbrains.com/issue/IDEA-265462
    @Query("select contact from Contact contact where contact.lastname like %:#{[0]}% and contact.lastname like %:lastname%")
    List<Contact> findByCustomQuery2(@Param("lastname") String lastname);

    // https://youtrack.jetbrains.com/issue/IDEA-186558, https://youtrack.jetbrains.com/issue/IDEA-260945
    @Query("select contact from Contact contact where contact.id = :#{#util.number} or contact.email = ?#{T(com.mytests.spring_data.spring_jpa_spel.repositories.MyUtil2).mail} ")
    List<Contact> findByCustomQuery3(@Param("util") MyUtil util);
    
    //https://youtrack.jetbrains.com/issue/IDEA-265496
    @Query("select c from Contact c where c.telephone like %?#{escape([0])}% escape ?#{escapeCharacter()}")
    //@Query("select contact from Contact contact where contact.telephone like %:tel%")
    List<Contact> findByCustomQuery4(@Param("tel") String tel);
}
