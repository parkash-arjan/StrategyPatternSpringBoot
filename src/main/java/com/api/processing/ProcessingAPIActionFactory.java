package com.api.processing;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProcessingAPIActionFactory {
  private Map<APIActionName, ProcessingAPIAction> processingAPIActionMap;


  @Autowired
  public ProcessingAPIActionFactory(Set<ProcessingAPIAction> processingAPIActionSet) {
    System.out.println("Auto wiring Set = " + processingAPIActionSet.size());
    setUpAPIActions(processingAPIActionSet);
  }

  public ProcessingAPIAction findAPIAction(APIActionName apiActionName) {
    return processingAPIActionMap.get(apiActionName);
  }
  private void setUpAPIActions(Set<ProcessingAPIAction> processingAPIActionSet) {
    processingAPIActionMap = new HashMap<APIActionName, ProcessingAPIAction>();
    processingAPIActionSet.forEach(
        apiAction ->processingAPIActionMap.put(apiAction.getActionName(),apiAction));
  }
}
