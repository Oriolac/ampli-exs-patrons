package cat.udl.ampli.strategy_abstract_factory.attack;

import cat.udl.ampli.strategy_abstract_factory.BattleContext;
import cat.udl.ampli.strategy_abstract_factory.weather.Weather;

public class WeatherAttack extends Attack{

    private final Weather weather;

    public WeatherAttack(Weather weather) {
        this.weather = weather;
    }

    @Override
    public void attack(BattleContext battle) {
        battle.setWeather(weather);
        battle.finishTurn();
    }
}
