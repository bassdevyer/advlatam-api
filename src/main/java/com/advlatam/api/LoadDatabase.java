package com.advlatam.api;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

  @Bean
  CommandLineRunner initDatabase(CarRepository repository) {
    return args -> {
      log.info("Preloading " + repository.save(new Car("PQR111", "#2F329F", "2012 Chrysler 300", "2C3CCAFJ2CH801561", "Nuevo")));
      log.info("Preloading " + repository.save(new Car("PQR113", "#FFFFFF", "1988 Acura Legend", "JH4KA4531JC024340", "" )));
    };
  }
}