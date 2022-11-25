package com.example.demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StrategyFactory {
  private Map<StrategyName, Strategy> strategies;

  @Autowired
  public StrategyFactory(Set<Strategy> strategySet) {
    System.out.println("Auto wiring Set = " + strategySet.size());
    createStrategy(strategySet);
  }

  public Strategy findStrategy(StrategyName strategyName) {

    return strategies.get(strategyName);
  }
  private void createStrategy(Set<Strategy> strategySet) {
    strategies = new HashMap<StrategyName, Strategy>();
    strategySet.forEach(
        strategy ->strategies.put(strategy.getStrategyName(), strategy));
  }
}
