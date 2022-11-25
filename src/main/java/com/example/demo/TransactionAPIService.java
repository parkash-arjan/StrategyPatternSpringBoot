package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionName;
import com.api.processing.APIActionParameters;
import com.api.transaction.TransactionAPIActionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionAPIService {
  @Autowired
  TransactionAPIActionFactory transactionAPIActionFactory;
  public void getApiAction(){
    APIAction processingAPIAction = transactionAPIActionFactory.findAPIAction(APIActionName.OLD_API_ACTION_A);
    String actionOutput = processingAPIAction.execute(new APIActionParameters());
    System.out.println(actionOutput);
  }
}
