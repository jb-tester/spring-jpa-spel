package com.mytests.spring_data.spring_jpa_spel.data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

/**
 * *
 * <p>Created by irina on 29.03.2021.</p>
 * <p>Project: spring-jpa-spel</p>
 * *
 */
@Entity
public class Contact {

    private int id;
    private String firstname;
    private String lastname;
    private String telephone;
    private String email;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "firstname")
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Basic
    @Column(name = "lastname")
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "telephone")
    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return id == contact.id && Objects.equals(firstname, contact.firstname) && Objects.equals(lastname,
                contact.lastname) && Objects.equals(telephone, contact.telephone) && Objects.equals(email, contact.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstname, lastname, telephone, email);
    }

    @Override
    public String toString() {
        return "Contact: " +
                "id=" + id +
                ", firstname='" + firstname + 
                "', lastname='" + lastname + 
                "', telephone='" + telephone  +
                "', email='" + email + 
                "'\n";
    }
}
