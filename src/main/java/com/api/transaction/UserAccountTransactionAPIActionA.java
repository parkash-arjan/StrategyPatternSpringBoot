package com.api.transaction;

import com.api.APIActionName;
import com.api.annotation.APIActionEntity;
import com.api.annotation.APIType;
import com.api.annotation.ActionAssociation;
import com.api.processing.APIAction;
import com.api.processing.APIActionParameters;
import org.springframework.stereotype.Component;

@Component
@APIActionEntity(name = "APIActionA", accountType = ActionAssociation.USER_ACCOUNT, apiType = APIType.TRANSACTION)
public class UserAccountTransactionAPIActionA implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.USER_ACCOUNT_TRANSACTION_API_ACTION_A;
  }

  @Override
  public String toString() {
    return this.getClass().getName();
  }
}
