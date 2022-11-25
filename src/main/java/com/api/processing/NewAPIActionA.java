package com.api.processing;

import org.springframework.stereotype.Component;

@Component
public class NewAPIActionA implements  ProcessingAPIAction{

  public static void main(String[] args){
    System.out.println(new NewAPIActionA().getClass().getCanonicalName());
    System.out.println(new NewAPIActionA().getClass().getName());
  }

  @Override
  public String execute(APIActionParameters apiActionParameters) {
    return this.getClass().getName();
  }

  @Override
  public APIActionName getActionName() {
    return APIActionName.NEW_API_ACTION_A;
  }
}
