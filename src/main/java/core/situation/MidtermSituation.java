package main.java.core.situation;
import main.java.core.Scheme;
import main.java.core.move.MoveMain;
import main.java.core.move.GetHighScore;
import main.java.core.move.MidtermMove;
public class MidtermSituation extends CurrentSituation {
    public MidtermSituation() {
        super.setCurrentSituationType(CurrentSituationType.CLASSROOM);
        super.setTitle("Midterm");
        super.setText("It is your midterm time." +
                "\nWhat do you do?");
        if(!Scheme.getVariable().doesHasScore()) {
            super.addMove(1, MoveMain.getVariable().DoMidtermMove());
        }
        super.addMove(2, MoveMain.getVariable().DoGetHighScore());
    }
}