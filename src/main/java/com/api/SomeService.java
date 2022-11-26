package com.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SomeService {

  @Autowired
  private StrategyFactory strategyFactory;

  public void findSome() {

    // Now get the strategy by passing the name
    Strategy strategy =
        strategyFactory.findStrategy(StrategyName.STRATEGY_A);
    // you can now call the methods defined in strategy.
    strategy.doStuff();
  }
}