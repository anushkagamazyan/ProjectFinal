package main.java.core;
import main.java.core.characters.Characters;
import main.java.core.situation.CurrentSituation;
import main.java.core.move.MoveMain;
public class Scheme  {
	    private static Characters player;
	    private static Characters opponent;
	    private boolean hasScore = false;
	    private static CurrentSituation beforeCurrentSituation;
	    private static CurrentSituation currentSituation;

	    private static Scheme scheme = new Scheme(null);

	    public static Scheme getVariable() {
	        return scheme;
	    }

	    private Scheme(CurrentSituation currentSituation) {
	        this.currentSituation = currentSituation;
	    }

	    public  static CurrentSituation currentSituation() {
	        return currentSituation;
	    }

	    public void setCurrentSituation(CurrentSituation currentSituation) {
	    	beforeCurrentSituation = this.currentSituation;
	        this.currentSituation = currentSituation;
	    }

	    public static CurrentSituation getBeforeCurrentSituation() {
	        return beforeCurrentSituation;
	    }
	    public CurrentSituation getCurrentSituation() {
	        return beforeCurrentSituation;
	    }

	    public void setBeforeCurrentSituation (CurrentSituation beforeCurrentSituation) {
	        this.beforeCurrentSituation = beforeCurrentSituation;
	    }

	    public static Characters getPlayer() {
	        return player;
	    }

	    public void setPlayer(Character playerCharacter) {
	        this.player = player;
	    }

	    public static Characters getOpponent() {
	        return opponent;
	    }

	    public void setOpponent(Characters opponent) {
	        this.opponent = opponent;
	    }

	    public boolean doesHasScore() {
	        return hasScore;
	    }

	    public void setHasScore(boolean hasScore) {
	        this.hasScore = hasScore;
	    }

		

}
