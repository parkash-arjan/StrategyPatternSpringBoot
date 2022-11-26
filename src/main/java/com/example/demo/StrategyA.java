package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StrategyA implements Strategy {

  @Override
  public void doStuff() {
    log.info("Doing stuff in A...");
  }

  @Override
  public StrategyName getStrategyName() {
    return StrategyName.STRATEGY_A;
  }
}