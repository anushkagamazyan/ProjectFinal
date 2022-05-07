package main.java.core.situation;
import  main.java.core.Scheme;
import main.java.core.move.*;

public class HomeSituation extends CurrentSituation {
    public HomeSituation() {
        super.setCurrentSituationType(CurrentSituationType.SLIDES);
        super.setTitle("Home");
        super.setText("Home");
        if(Scheme.getVariable().getCurrentSituation() == null) {
            super.addMove(1, MoveMain.getVariable().DoMoveStart());
            super.addMove(2, MoveMain.getVariable().DoResume());
            super.addMove(3, MoveMain.getVariable().DoMoveExit());
            }else{
            super.addMove(1, MoveMain.getVariable().DoMoveContnue());
            super.addMove(2, MoveMain.getVariable().DoMoveSave());
            super.addMove(3, MoveMain.getVariable().DoResume());
            super.addMove(4, MoveMain.getVariable().DoMoveExit());
        }
    }
}