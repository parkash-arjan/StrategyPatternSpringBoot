package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import com.api.transaction.TransactionAPIActionFactory;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class TransactionAPIService {

  @Autowired
  TransactionAPIActionFactory transactionAPIActionFactory;
  @Value("${account_type}")
  private String accountType;

  public void getApiAction() {
    APIAction transactionAPIAction = transactionAPIActionFactory.findAPIAction(
        "TRANSACTION_API_ACTION_C");
    String actionOutput = transactionAPIAction.execute(new APIActionParameters());
    log.info(actionOutput);
  }
}
