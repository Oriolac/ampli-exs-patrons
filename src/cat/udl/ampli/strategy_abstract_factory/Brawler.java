package cat.udl.ampli.strategy_abstract_factory;

import cat.udl.ampli.strategy_abstract_factory.attack.Attack;
import cat.udl.ampli.strategy_abstract_factory.attack.factory.AttackAbstractFactory;

public class Brawler {

    private int HP;
    private final AttackAbstractFactory atFact;

    public Brawler(int HP, AttackAbstractFactory atFact) {
        this.HP = HP;
        this.atFact = atFact;
    }

    public void gotPunched(int dm) {
        HP -= dm;
    }

    public Attack physicalAttack(){
        return atFact.getPhysicalAttack();
    }

    public boolean isDead() {
        return HP <= 0;
    }
}
