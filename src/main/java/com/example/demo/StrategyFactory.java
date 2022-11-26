package com.example.demo;

import java.util.EnumMap;
import java.util.Map;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class StrategyFactory {

  private Map<StrategyName, Strategy> strategies;

  @Autowired
  public StrategyFactory(Set<Strategy> strategySet) {
    log.info("Auto wiring Set = {}", strategySet.size());
    createStrategy(strategySet);
  }

  public Strategy findStrategy(StrategyName strategyName) {

    return strategies.get(strategyName);
  }

  private void createStrategy(Set<Strategy> strategySet) {
    strategies = new EnumMap<>(StrategyName.class);
    strategySet.forEach(
        strategy -> strategies.put(strategy.getStrategyName(), strategy));
  }
}
