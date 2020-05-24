package cat.udl.ampli.strategy_abstract_factory;

import cat.udl.ampli.strategy_abstract_factory.weather.Weather;

public class BattleContext {
    private final Brawler brawlerA;
    private final Brawler brawlerB;
    private Turn turn;
    private Weather weather;
    Brawler target;

    public BattleContext(Brawler brawlerA, Brawler brawlerB, Weather weather) {
        this.brawlerA = brawlerA;
        turn = Turn.A;
        this.brawlerB = brawlerB;
        this.weather = weather;
    }

    public void damage(int damage) {
        if (turn.equals(Turn.A)) {
            target = brawlerB;
        } else {
            target = brawlerA;
        }
        target.gotPunched(damage);
    }

    public void setWeather(Weather w) {
        weather = w;
    }

    public void finishTurn() {
        if (turn.equals(Turn.A))
            turn = Turn.B;
        else
            turn = Turn.A;

    }
}
