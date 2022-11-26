package com.api;

import com.api.processing.APIAction;
import com.api.processing.ServiceAccountProcessingAPIActionA;
import com.api.processing.ServiceAccountProcessingAPIActionB;
import com.api.processing.ServiceAccountProcessingAPIActionC;
import com.api.processing.UserAccountProcessingAPIActionA;
import com.api.processing.UserAccountProcessingAPIActionB;
import com.api.processing.UserAccountProcessingAPIActionC;
import com.api.transaction.ServiceAccountTransactionAPIActionA;
import com.api.transaction.ServiceAccountTransactionAPIActionB;
import com.api.transaction.ServiceAccountTransactionAPIActionC;
import com.api.transaction.UserAccountTransactionAPIActionA;
import com.api.transaction.UserAccountTransactionAPIActionB;
import com.api.transaction.UserAccountTransactionAPIActionC;

public enum APIActionNameClass {

  SERVICE_ACCOUNT_PROCESSING_API_ACTION_A(ServiceAccountProcessingAPIActionA.class),
  USER_ACCOUNT_PROCESSING_API_ACTION_A(UserAccountProcessingAPIActionA.class),

  SERVICE_ACCOUNT_PROCESSING_API_ACTION_B(ServiceAccountProcessingAPIActionB.class),
  USER_ACCOUNT_PROCESSING_API_ACTION_B(UserAccountProcessingAPIActionB.class),

  SERVICE_ACCOUNT_PROCESSING_API_ACTION_C(ServiceAccountProcessingAPIActionC.class),
  USER_ACCOUNT_PROCESSING_API_ACTION_C(UserAccountProcessingAPIActionC.class),

  SERVICE_ACCOUNT_TRANSACTION_API_ACTION_A(ServiceAccountTransactionAPIActionA.class),
  USER_ACCOUNT_TRANSACTION_API_ACTION_A(UserAccountTransactionAPIActionA.class),

  SERVICE_ACCOUNT_TRANSACTION_API_ACTION_B(ServiceAccountTransactionAPIActionB.class),
  USER_ACCOUNT_TRANSACTION_API_ACTION_B(UserAccountTransactionAPIActionB.class),

  SERVICE_ACCOUNT_TRANSACTION_API_ACTION_C(ServiceAccountTransactionAPIActionC.class),
  USER_ACCOUNT_TRANSACTION_API_ACTION_C(UserAccountTransactionAPIActionC.class);

  private final Class<? extends APIAction> apiAction;

  APIActionNameClass(Class<? extends APIAction> apiActionClass) {
    this.apiAction = apiActionClass;
  }
}




