package cat.udl.ampli.strategy.battle.attack.factory;

import cat.udl.ampli.strategy.battle.attack.Attack;
import cat.udl.ampli.strategy.battle.attack.PhysicalAttack;
import cat.udl.ampli.strategy.battle.attack.SpecialAttack;
import cat.udl.ampli.strategy.battle.attack.WeatherAttack;

public class NoneWeatherMovesAF implements AttackAbstractFactory {
    @Override
    public Attack getPhysicalAttack() {
        return new PhysicalAttack();
    }

    @Override
    public Attack getSpecialAttack() {
        return new SpecialAttack();
    }

    @Override
    public Attack getWeatherAttack() {
        return new WeatherAttack(null);
    }
}
