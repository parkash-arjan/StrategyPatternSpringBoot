package com.api.processing;

import com.api.annotation.APIType;
import com.api.annotation.Action;
import com.api.annotation.ActionAssociation;
import com.example.demo.APIActionName;
import org.springframework.stereotype.Component;

@Component
@Action(name = "APIActionC" , accountType =  ActionAssociation.USER_ACCOUNT , apiType = APIType.PROCESSING)
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
