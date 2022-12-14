package com.api.transaction;

import com.api.APIActionName;
import com.api.processing.APIAction;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class TransactionAPIActionFactory {

  private final String accountType;
  private Map<APIActionName, APIAction> transactionAPIActionMap;

  @Autowired
  public TransactionAPIActionFactory(Set<APIAction> transactionAPIActionSet,
      @Value("${account_type}") String accountType) {
    log.info(
        "Auto wiring Set TransactionAPIActionFactory = {}", transactionAPIActionSet.size());
    this.accountType = accountType;
    setUpAPIActions(transactionAPIActionSet, accountType);
  }

  public APIAction findAPIAction(String apiActionName) {

    return transactionAPIActionMap.get(APIActionName.valueOf(accountType + "_" + apiActionName));
  }

  private void setUpAPIActions(Set<APIAction> transactionAPIActionSet, String accountType) {
    transactionAPIActionMap = new EnumMap<>(APIActionName.class);
    transactionAPIActionSet.removeIf(e -> !e.getActionName().name().contains(accountType));
    transactionAPIActionSet.forEach(
        apiAction -> transactionAPIActionMap.put(apiAction.getActionName(), apiAction));
  }
}
