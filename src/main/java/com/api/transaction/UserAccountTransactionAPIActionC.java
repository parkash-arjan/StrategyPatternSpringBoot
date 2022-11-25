package com.api.transaction;

import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import com.example.demo.APIActionName;
import org.springframework.stereotype.Component;

@Component
public class UserAccountTransactionAPIActionC implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.USER_ACCOUNT_TRANSACTION_API_ACTION_C;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
