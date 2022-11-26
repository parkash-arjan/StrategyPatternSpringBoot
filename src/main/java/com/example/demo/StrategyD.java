package com.example.demo;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StrategyD implements Strategy {

  @Override
  public void doStuff() {
    log.info("Doing stuff in C...");
  }

  @Override
  public StrategyName getStrategyName() {
    return StrategyName.STRATEGY_C;
  }
}