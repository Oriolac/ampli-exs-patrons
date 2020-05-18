package cat.udl.ampli.strategy_abstract_factory.attack;

import cat.udl.ampli.strategy_abstract_factory.BattleContext;

public class PhysicalAttack extends Attack {

    private final int dm = 2;

    @Override
    public void attack(BattleContext battle) {
        battle.damage(dm);
        battle.finishTurn();
    }
}
