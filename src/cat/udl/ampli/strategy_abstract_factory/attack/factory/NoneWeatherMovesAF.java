package cat.udl.ampli.strategy_abstract_factory.attack.factory;

import cat.udl.ampli.strategy_abstract_factory.attack.Attack;
import cat.udl.ampli.strategy_abstract_factory.attack.PhysicalAttack;
import cat.udl.ampli.strategy_abstract_factory.attack.SpecialAttack;
import cat.udl.ampli.strategy_abstract_factory.attack.WeatherAttack;

public class NoneWeatherMovesAF implements AttackAbstractFactory{
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
