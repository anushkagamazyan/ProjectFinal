package main.java.core.situation;
import main.java.core.move.MoveMain;
import main.java.core.move.FailMove;
import main.java.core.move.StressedMove;
import main.java.core.move.MidtermMove;
public class PassCourse extends CurrentSituation {
    public PassCourse() {
        super.setCurrentSituationType(CurrentSituationType.CLASSROOM);
        super.setTitle("Passing Course");
        super.setText("You should pass the course." +
                "\nWhat should you do?");
        super.addMove(1, MoveMain.getVariable().DoStressedMove());
        super.addMove(2, MoveMain.getVariable().DoFailMove());
    }
}