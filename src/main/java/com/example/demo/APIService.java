package com.example.demo;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class APIService {

  @Autowired
  APIActionFactory apiActionFactory;

  public void getApiAction() {
    APIAction apiAction = apiActionFactory.findAPIActionByName("APIActionA");
    String actionOutput = apiAction.execute(new APIActionParameters());
    log.info(actionOutput);

    apiAction = apiActionFactory.findAPIActionByName("APIActionB");
    actionOutput = apiAction.execute(new APIActionParameters());
    log.info(actionOutput);

    apiAction = apiActionFactory.findAPIActionByName("APIActionC");
    actionOutput = apiAction.execute(new APIActionParameters());
    log.info(actionOutput);
  }
}
