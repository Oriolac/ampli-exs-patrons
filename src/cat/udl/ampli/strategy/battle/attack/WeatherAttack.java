package cat.udl.ampli.strategy.battle.attack;

import cat.udl.ampli.strategy.battle.BattleContext;
import cat.udl.ampli.strategy.battle.weather.Weather;

public class WeatherAttack extends Attack {

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
