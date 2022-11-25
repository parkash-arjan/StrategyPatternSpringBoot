package com.api.processing;

public interface ProcessingAPIAction {


  String execute(APIActionParameters apiActionParameters);
  APIActionName getActionName();

}
