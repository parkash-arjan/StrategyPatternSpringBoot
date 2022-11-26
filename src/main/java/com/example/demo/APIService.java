package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import com.api.processing.ServiceAccountProcessingAPIActionA;
import com.api.processing.UserAccountProcessingAPIActionA;
import com.api.transaction.ServiceAccountTransactionAPIActionA;
import com.api.transaction.UserAccountTransactionAPIActionA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIService {
  @Autowired
  APIActionFactory apiActionFactory;

  public void getApiAction(){

    APIAction apiAction = apiActionFactory.findAPIAction("APIActionA");
    String actionOutput = apiAction.execute(new APIActionParameters());
    System.out.println(actionOutput);

//    apiActionFactory.findAPIActionClass(ServiceAccountProcessingAPIActionA.class);
//    apiActionFactory.findAPIActionClass(UserAccountProcessingAPIActionA.class);
//
//    apiActionFactory.findAPIActionClass(ServiceAccountTransactionAPIActionA.class);
//    apiActionFactory.findAPIActionClass(UserAccountTransactionAPIActionA.class);

  }
}
