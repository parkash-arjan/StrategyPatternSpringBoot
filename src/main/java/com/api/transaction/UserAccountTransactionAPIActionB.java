package com.api.transaction;

import com.api.annotation.APIType;
import com.api.annotation.Action;
import com.api.annotation.ActionAssociation;
import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import com.example.demo.APIActionName;
import org.springframework.stereotype.Component;

@Component
@Action(name = "APIActionB" , accountType =  ActionAssociation.USER_ACCOUNT , apiType = APIType.TRANSACTION)
public class UserAccountTransactionAPIActionB implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.USER_ACCOUNT_TRANSACTION_API_ACTION_B;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
