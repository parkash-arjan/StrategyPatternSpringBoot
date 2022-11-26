package com.api.transaction;

import com.api.processing.APIAction;
import com.example.demo.APIActionName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;

@Component
public class TransactionAPIActionFactory {
  private final String accountType;
  private Map<APIActionName, APIAction> transactionAPIActionMap;
  @Autowired
  public TransactionAPIActionFactory(Set<APIAction> transactionAPIActionSet,@Value("${account_type}") String accountType) {
    System.out.println("Auto wiring Set TransactionAPIActionFactory = " + transactionAPIActionSet.size());
    this.accountType = accountType;
    setUpAPIActions(transactionAPIActionSet,accountType);
  }

  public APIAction findAPIAction(String apiActionName) {

    return transactionAPIActionMap.get(APIActionName.valueOf(accountType + "_" +apiActionName));
  }
  private void setUpAPIActions(Set<APIAction> transactionAPIActionSet,String accountType) {
    transactionAPIActionMap = new EnumMap<>(APIActionName.class);
    transactionAPIActionSet.removeIf(e-> !e.getActionName().name().contains(accountType));
    transactionAPIActionSet.forEach(
        apiAction -> transactionAPIActionMap.put(apiAction.getActionName(),apiAction));
  }
}
