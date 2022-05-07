package main.java.core.situation;

import main.java.core.situation.TAMoveSituation;
import main.java.core.move.FailMove;
import main.java.core.move.GetHighScore;

public class TAsituation extends CurrentSituation {
    public TAsituation() {
        super.setCurrentSituationType(CurrentSituationType.CLASSROOM);
        super.setTitle("Situation!");
        super.setText("TA is checking Homework." +
                "\nWhat do you do?");
        super.addAction(1, new DoTAMove());
        super.addAction(2, new DoGetHighScore());
    }
}