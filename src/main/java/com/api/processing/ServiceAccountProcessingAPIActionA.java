package com.api.processing;

import com.api.annotation.APIType;
import com.api.annotation.Action;
import com.api.annotation.ActionAssociation;
import com.example.demo.APIActionName;
import org.springframework.stereotype.Component;

@Component
@Action(name = "APIActionA" , accountType =  ActionAssociation.SERVICE_ACCOUNT , apiType = APIType.PROCESSING)
public class ServiceAccountProcessingAPIActionA implements APIAction {
  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.SERVICE_ACCOUNT_PROCESSING_API_ACTION_A;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
