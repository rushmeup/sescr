package com.acs.scraping.seleniumScraping;

import com.acs.scraping.seleniumScraping.scrapper.ScrapperTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SeleniumScrapingApplication implements CommandLineRunner{

    
    
    @Autowired
    ScrapperTest test;
            
    public static void main(String[] args) {
            SpringApplication.run(SeleniumScrapingApplication.class, args);
    }

    @Override
    public void run(String... strings) throws Exception {
        test.testScrapper();
        System.out.println("Merge!!!");
    }
}
