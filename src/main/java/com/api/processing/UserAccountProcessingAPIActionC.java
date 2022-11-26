package com.api.processing;

import com.api.APIActionName;
import com.api.annotation.APIActionEntity;
import com.api.annotation.APIType;
import com.api.annotation.ActionAssociation;
import org.springframework.stereotype.Component;

@Component
@APIActionEntity(name = "APIActionC", accountType = ActionAssociation.USER_ACCOUNT, apiType = APIType.PROCESSING)
public class UserAccountProcessingAPIActionC implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.USER_ACCOUNT_PROCESSING_API_ACTION_C;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
