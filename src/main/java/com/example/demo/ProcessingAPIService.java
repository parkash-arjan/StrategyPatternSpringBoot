package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import com.api.processing.ProcessingAPIActionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ProcessingAPIService {

  @Value("${account_type}")
  private String accountType;
  @Autowired
  ProcessingAPIActionFactory processingAPIActionFactory;

  public void getApiAction() {
    APIAction processingAPIAction = processingAPIActionFactory.findAPIAction(
        "PROCESSING_API_ACTION_B");
    String actionOutput = processingAPIAction.execute(new APIActionParameters());
    System.out.println(actionOutput);
  }
}
