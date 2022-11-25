package com.api.processing;

public interface APIAction {


  String execute(APIActionParameters apiActionParameters);
  APIActionName getActionName();

}
