package cat.udl.ampli.strategy.battle.attack.factory;

import cat.udl.ampli.strategy.battle.attack.Attack;

public interface AttackAbstractFactory {

    Attack getPhysicalAttack();

    Attack getSpecialAttack();

    Attack getWeatherAttack();
}
