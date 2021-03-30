package com.mytests.spring_data.spring_jpa_spel.services;

import com.mytests.spring_data.spring_jpa_spel.data.Contact;
import com.mytests.spring_data.spring_jpa_spel.repositories.ContactRepo;
import com.mytests.spring_data.spring_jpa_spel.repositories.MyUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * *
 * <p>Created by irina on 29.03.2021.</p>
 * <p>Project: spring-jpa-spel</p>
 * *
 */
@Service
public class ContactService {

    @Autowired
    private ContactRepo contactRepo;
    
    public void displayCustomQuery1Results(){
        String rez = "";
        for (Contact contact : contactRepo.findByCustomQuery1("irina")) {
            rez = rez+contact.toString();
        }
        System.out.println("**********************************");
        System.out.println("query1");
        System.out.println(rez);
        System.out.println("**********************************");
    }
    public void displayCustomQuery2Results(){
        String rez = "";
        for (Contact contact : contactRepo.findByCustomQuery2("van")) {
            rez = rez+contact.toString();
        }
        System.out.println("**********************************");
        System.out.println("query2");
        System.out.println(rez);
        System.out.println("**********************************");
    }
    public void displayCustomQuery3Results(){
        String rez = "";
        for (Contact contact : contactRepo.findByCustomQuery3(new MyUtil(2))) {
            rez = rez+contact.toString();
        }
        System.out.println("**********************************");
        System.out.println("query3");
        System.out.println(rez);
        System.out.println("**********************************");
    }
    public void displayCustomQuery4Results(){
        String rez = "";
        for (Contact contact : contactRepo.findByCustomQuery4("_921_9")) {
            rez = rez+contact.toString();
        }
        System.out.println("**********************************");
        System.out.println("query4");
        System.out.println(rez);
        System.out.println("**********************************");
    }
}
