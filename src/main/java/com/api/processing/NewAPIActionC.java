package com.api.processing;

import org.springframework.stereotype.Component;

@Component
public class NewAPIActionC implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.NEW_API_ACTION_C;
  }
}
