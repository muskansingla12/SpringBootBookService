package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class CallBookService implements CommandLineRunner {
    public void callbookservice(){

        RestTemplate restTemplate = new RestTemplate();
        Book book = restTemplate.getForObject("https://book-service1234.cfapps.eu10.hana.ondemand.com/getbook",Book.class);
        System.out.println("The name of the person is "+book.getName());
        System.out.println("The name of the author is"+book.getAuthor_name());
    }

    @Override
    public void run(String... args) throws Exception {
        callbookservice();
    }
}
