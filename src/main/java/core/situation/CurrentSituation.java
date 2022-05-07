package main.java.core.situation;
import main.java.core.Scheme;
import main.java.core.situation.HomeSituation;
import main.java.core.move.Move;
import java.util.ArrayList;
public class CurrentSituation {
    private CurrentSituation currentSituation;
    private String title;
    private String text;
    private ArrayList<Move> actions = new ArrayList<Move>();
    public CurrentSituation getCurrentSituation() {
        return currentSituation;
    }
    public void setCurrentSituation(CurrentSituation currentSituation) {
        this.currentSituation = currentSituation;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String name) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<Move> getActions() {
        return actions;
    }

    public void setActions(ArrayList<Move> actions) {
        this.actions = actions;
    }

    public void addMove( Move action){
        actions.add(action);
    }
    public enum CurrentSituationType  {
        SLIDES(),
        CLASSROOM(),
        EXAM(),
        DONE()
    }
	public void CurrentSituationType(CurrentSituationType classroom) {
		
	}

	public void setCurrentSituationType(main.java.core.situation.CurrentSituation.CurrentSituationType exam) {
		
	}
}