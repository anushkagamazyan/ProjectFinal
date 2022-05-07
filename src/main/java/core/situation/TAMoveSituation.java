package main.java.core.situation;
import  main.java.core.Scheme;
import main.java.core.characters.CharactersCollection;
import main.java.core.move.MoveMain;
import main.java.core.move.FighterMove;

	public class TAMoveSituation extends CurrentSituation {
	    public TAMoveSituation() {
	        super.setCurrentSituationType(CurrentSituationType.EXAM);
	        super.setTitle("TAmoveSituation");
	        if(Scheme.getVariable().getOpponent() == null) {
	            Scheme.getVariable().setOpponent(CharactersCollection.buildTa());
	        }
	        String text = new StringBuilder()
	                .append("TA - ").append("ph:").append(Scheme.getVariable().getOpponent().getPh())
	                .append("\nPlayer - ").append("hp:").append(Scheme.getVariable().getPlayer().getPh())
	                .toString();
	        super.setText(text);
	        super.addMove(1, MoveMain.getVariable().DoFighterMove());
	        super.addMove(2, Scheme.getVariable().getPlayer().getMove());

	    }
	}


