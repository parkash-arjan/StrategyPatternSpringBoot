package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class APIService {

  @Autowired
  APIActionFactory apiActionFactory;

  public void getApiAction() {
    APIAction apiAction = apiActionFactory.findAPIActionByName("APIActionA");
    String actionOutput = apiAction.execute(new APIActionParameters());
    System.out.println(actionOutput);

    apiAction = apiActionFactory.findAPIActionByName("APIActionB");
    actionOutput = apiAction.execute(new APIActionParameters());
    System.out.println(actionOutput);

    apiAction = apiActionFactory.findAPIActionByName("APIActionC");
    actionOutput = apiAction.execute(new APIActionParameters());
    System.out.println(actionOutput);
  }
}
