package com.api.transaction;

import com.api.processing.APIActionName;
import com.api.processing.APIActionParameters;
import com.api.processing.APIAction;
import org.springframework.stereotype.Component;

@Component
public class NewAPITransactionActionC implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.NEW_API_ACTION_A;
  }
}
