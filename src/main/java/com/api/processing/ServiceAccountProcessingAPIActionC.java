package com.api.processing;

import com.api.annotation.APIActionEntity;
import com.api.annotation.APIType;
import com.api.annotation.ActionAssociation;
import com.example.demo.APIActionName;
import org.springframework.stereotype.Component;

@Component
@APIActionEntity(name = "APIActionC" , accountType =  ActionAssociation.SERVICE_ACCOUNT , apiType = APIType.PROCESSING)
public class ServiceAccountProcessingAPIActionC implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.SERVICE_ACCOUNT_PROCESSING_API_ACTION_C;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
