package com.api.processing;

import com.api.APIActionName;
import com.api.annotation.APIActionEntity;
import com.api.annotation.APIType;
import com.api.annotation.ActionAssociation;
import org.springframework.stereotype.Component;

@Component
@APIActionEntity(name = "APIActionA", accountType = ActionAssociation.SERVICE_ACCOUNT, apiType = APIType.PROCESSING)
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
