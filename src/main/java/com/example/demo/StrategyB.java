package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class StrategyB  implements Strategy{
  @Override
  public void doStuff() {
    System.out.println("Doing stuff in B...");
  }
  @Override
  public StrategyName getStrategyName() {
    return StrategyName.StrategyB;
  }
}