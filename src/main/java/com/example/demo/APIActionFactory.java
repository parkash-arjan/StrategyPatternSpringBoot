package com.example.demo;

import com.api.annotation.APIActionEntity;
import com.api.processing.APIAction;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class APIActionFactory{
  private Map<String,APIAction> apiActionMap;
  @Autowired
  public APIActionFactory(Set<APIAction> apiActionSet,@Value("${account_type}") String accountType){
    System.out.println("Auto wiring Set APIActionFactory = " + apiActionSet.size());
    setUpAPIActions(apiActionSet,accountType);
  }
  public APIAction findAPIActionByName(String apiActionName){
    return apiActionMap.get(apiActionName);
  }
  private void setUpAPIActions(Set<APIAction> apiActionSet,String accountType){
    apiActionMap = new HashMap<>();
    apiActionSet.forEach(
        apiAction -> {
          APIActionEntity actionAnnotation = apiAction.getClass().getAnnotation(APIActionEntity.class);
          if(accountType.equalsIgnoreCase(actionAnnotation.accountType()[0].name())){
            apiActionMap.put(actionAnnotation.name(),apiAction);
          }
        });
  }
}