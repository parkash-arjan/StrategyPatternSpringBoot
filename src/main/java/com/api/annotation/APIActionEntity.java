package com.api.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface APIActionEntity {
  String name();
  ActionAssociation[] accountType() default  ActionAssociation.USER_ACCOUNT;
  APIType[] apiType();
}
