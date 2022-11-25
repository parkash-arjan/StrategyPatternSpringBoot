package com.api.transaction;

import com.api.processing.APIAction;
import com.api.processing.APIActionName;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TransactionAPIActionFactory {
  private Map<APIActionName, APIAction> transactionAPIActionMap;


  @Autowired
  public TransactionAPIActionFactory(Set<APIAction> transactionAPIActionSet) {
    System.out.println("Auto wiring Set = " + transactionAPIActionSet.size());
    setUpAPIActions(transactionAPIActionSet);
  }

  public APIAction findAPIAction(APIActionName apiActionName) {
    return transactionAPIActionMap.get(apiActionName);
  }
  private void setUpAPIActions(Set<APIAction> transactionAPIActionSet) {
    transactionAPIActionMap = new HashMap<APIActionName, APIAction>();
    transactionAPIActionSet.forEach(
        apiAction -> transactionAPIActionMap.put(apiAction.getActionName(),apiAction));
  }
}
