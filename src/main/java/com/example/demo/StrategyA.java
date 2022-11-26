package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class StrategyA implements Strategy {

  @Override
  public void doStuff() {
    System.out.println("Doing stuff in A...");
  }

  @Override
  public StrategyName getStrategyName() {
    return StrategyName.StrategyA;
  }
}