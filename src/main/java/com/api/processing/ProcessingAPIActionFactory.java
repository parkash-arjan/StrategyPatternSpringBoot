package com.api.processing;

import com.api.APIActionName;
import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class ProcessingAPIActionFactory {

  private final String accountType;
  private Map<APIActionName, APIAction> processingAPIActionMap;

  @Autowired
  public ProcessingAPIActionFactory(Set<APIAction> processingAPIActionSet,
      @Value("${account_type}") String accountType) {
    log.info(
        "Auto wiring Set ProcessingAPIActionFactory = {}", processingAPIActionSet.size());
    this.accountType = accountType;
    setUpAPIActions(processingAPIActionSet);
  }

  public APIAction findAPIAction(String apiActionName) {
    return processingAPIActionMap.get(APIActionName.valueOf(accountType + "_" + apiActionName));
  }

  private void setUpAPIActions(Set<APIAction> processingAPIActionSet) {
    processingAPIActionMap = new EnumMap<>(APIActionName.class);
    processingAPIActionSet.removeIf(e -> !e.getActionName().name().contains(accountType));
    processingAPIActionSet.forEach(
        apiAction -> processingAPIActionMap.put(apiAction.getActionName(), apiAction));
  }
}
