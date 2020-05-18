package cat.udl.ampli.strategy_abstract_factory.attack;

import cat.udl.ampli.strategy_abstract_factory.BattleContext;

public class SpecialAttack extends Attack{
    private final int dm = 10;
    @Override
    public void attack(BattleContext battle) {
        battle.damage(dm);
        battle.finishTurn();
    }
}
