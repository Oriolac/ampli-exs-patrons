package cat.udl.ampli.strategy_abstract_factory.attack.factory;

import cat.udl.ampli.strategy_abstract_factory.attack.Attack;

public interface AttackAbstractFactory {

    Attack getPhysicalAttack();
    Attack getSpecialAttack();
    Attack getWeatherAttack();
}
