package cat.udl.ampli.strategy.battle.attack;

import cat.udl.ampli.strategy.battle.BattleContext;

public class PhysicalAttack extends Attack {

    private final int dm = 2;

    @Override
    public void attack(BattleContext battle) {
        battle.damage(dm);
        battle.finishTurn();
    }
}
