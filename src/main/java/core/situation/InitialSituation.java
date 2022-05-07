package main.java.core.situation;
import main.java.core.move.MoveMain;
import main.java.core.move.FailMove;
import main.java.core.move.GetHighScore;
import main.java.core.move.StressedMove;

public class InitialSituation extends CurrentSituation {
    public InitialSituation() {
        super.CurrentSituationType(CurrentSituationType.CLASSROOM);
        super.setTitle("Start");
        super.setText("You have gained a low score" +
                "\nWhat do you do?");
        super.addMove(1, MoveMain.getVariable().DoStressedMove());
        super.addMove(2, MoveMain.getVariable().DoGetHighScore());

    }}
