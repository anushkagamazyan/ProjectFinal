package main.java.core.characters;
import main.java.core.move.Move;
import main.java.core.move.KillingAbility;
public class Ta implements Characters {
    private int skills;
    private int ph;
    private int lm;
    private int energyForAttack;
    private Move move;

    public Ta(int skills, int ph, int lm, int energyForAttack) {
        this.skills = skills;
        this.ph = ph;
        this.lm = lm;
        this.energyForAttack = energyForAttack;
        this.move = null;
    }

    @Override
    public int getPractice() {
        return skills;
    }

    @Override
    public void setPractice(int skills) {
        this.skills = skills;
    }

    @Override
    public void increasePractice(int number) {
        this.skills += number;
    }

    @Override
    public int getPh() {
        return ph;
    }

    @Override
    public void setPh(int ph) {
        this.ph = ph;
    }

    @Override
    public void increasePh(int number) {
        this.ph += number;
    }

    @Override
    public void decreasePh(int number) {
        this.ph -= number;
    }

    @Override
    public int getLm() {
        return lm;
    }

    @Override
    public void setLm(int lm) {
        this.lm = lm;
    }

    @Override
    public void increaseLm(int number) {
        this.lm += number;
    }

    @Override
    public void decreaseLm(int number) {
        this.lm -= number;
    }

    @Override
    public int getEnergyForAttack() {
        return energyForAttack;
    }

    @Override
    public void setEnergyForAttack(int energyForAttack) {
        this.energyForAttack = energyForAttack;
    }

    @Override
    public Move getMove() {
        return move;
    }

    public void setMove(Move move) {
        this.move = move;
    }
}