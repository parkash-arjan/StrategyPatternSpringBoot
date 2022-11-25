package com.api.processing;

import com.example.demo.APIActionName;

public interface APIAction {
  String execute(APIActionParameters apiActionParameters);
  APIActionName getActionName();

}
