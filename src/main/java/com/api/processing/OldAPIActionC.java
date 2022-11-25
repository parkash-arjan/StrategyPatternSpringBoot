package com.api.processing;

import org.springframework.stereotype.Component;

@Component
public class OldAPIActionC implements APIAction {

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.OLD_API_ACTION_C;
  }
}
