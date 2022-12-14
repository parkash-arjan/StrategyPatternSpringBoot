package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com")
public class APIApplication implements CommandLineRunner {

//	@Autowired
//	SomeService someService;
//
//	@Autowired
//	ProcessingAPIService processingAPIService;
//
//	@Autowired
//	TransactionAPIService transactionAPIService;

  @Autowired
  APIService apiService;

  public static void main(String[] args) {
    SpringApplication.run(APIApplication.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
    //someService.findSome();
    //processingAPIService.getApiAction();
    //transactionAPIService.getApiAction();
    apiService.getApiAction();

  }
}
