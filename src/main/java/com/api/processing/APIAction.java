package com.api.processing;

import com.api.APIActionName;

public interface APIAction {

  String execute(APIActionParameters apiActionParameters);

  APIActionName getActionName();

}
