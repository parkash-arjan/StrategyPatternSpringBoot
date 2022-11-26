package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import com.api.transaction.TransactionAPIActionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class TransactionAPIService {

  @Autowired
  TransactionAPIActionFactory transactionAPIActionFactory;
  @Value("${account_type}")
  private String accountType;

  public void getApiAction() {
    APIAction transactionAPIAction = transactionAPIActionFactory.findAPIAction(
        "TRANSACTION_API_ACTION_C");
    String actionOutput = transactionAPIAction.execute(new APIActionParameters());
    System.out.println(actionOutput);
  }
}
