package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class StrategyD  implements Strategy{
  @Override
  public void doStuff() {
    System.out.println("Doing stuff in C...");
  }
  @Override
  public StrategyName getStrategyName() {
    return StrategyName.StrategyC;
  }
}