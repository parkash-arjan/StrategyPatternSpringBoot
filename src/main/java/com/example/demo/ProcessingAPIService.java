package com.example.demo;

import com.api.processing.APIActionName;
import com.api.processing.APIActionParameters;
import com.api.processing.ProcessingAPIAction;
import com.api.processing.ProcessingAPIActionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProcessingAPIService {
  @Autowired
  ProcessingAPIActionFactory processingAPIActionFactory;
  public void getApiAction(){
    ProcessingAPIAction processingAPIAction = processingAPIActionFactory.findAPIAction(APIActionName.OLD_API_ACTION_A);
    String actionOutput = processingAPIAction.execute(new APIActionParameters());
    System.out.println(actionOutput);
  }
}
