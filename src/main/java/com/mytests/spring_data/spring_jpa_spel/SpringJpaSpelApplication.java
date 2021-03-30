package com.mytests.spring_data.spring_jpa_spel;

import com.mytests.spring_data.spring_jpa_spel.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
//@EnableJpaRepositories(escapeCharacter = '_')
public class SpringJpaSpelApplication implements CommandLineRunner {
     @Autowired
    ApplicationContext ctx;
    public static void main(String[] args) {
        SpringApplication.run(SpringJpaSpelApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        ContactService contactService = ctx.getBean(ContactService.class);
        contactService.displayCustomQuery1Results(); 
        contactService.displayCustomQuery2Results(); 
        contactService.displayCustomQuery3Results(); 
        contactService.displayCustomQuery4Results(); 
    }
}
