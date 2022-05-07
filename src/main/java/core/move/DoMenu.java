package main.java.core.move;
import main.java.core.Scheme;
import main.java.core.situation.CurrentSituation;
import main.java.core.situation.CurrentSituationUnit;
import main.java.core.situation.HomeSituation;
import main.java.core.situation.InitialSituation;
import main.java.core.situation*;





public class DoMenu implements Move {
	private final String TEXT = "Menu Bar";

	@Override
	public void Move1() {
		 Scheme.getVariable().getCurrentSituation().setCurrentSituationType(CurrentSituation.CurrentSituationType.SLIDES);
		 Scheme.getVariable().setCurrentSituation(CurrentSituationUnit.getVariable().DoHomeSituation());
		
	}

	@Override
	public String print() {
		// TODO Auto-generated method stub
		return TEXT;
	}

}
