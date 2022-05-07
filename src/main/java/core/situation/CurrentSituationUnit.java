package main.java.core.situation;
import java.util.HashMap;
import java.util.*;
import java.util.ArrayList;
public class CurrentSituationUnit extends CurrentSituation {
	 private static CurrentSituationUnit currentSituationUnit = new CurrentSituationUnit();
	    
	    ArrayList<  CurrentSituationUnit> situations;

	    private CurrentSituationUnit() {
	        situations = new ArrayList<>();
	    }

	    public static CurrentSituationUnit getVariable(){
	        return currentSituationUnit;
	    }

	    public CurrentSituationUnit DoInitialSituation(){
	    	int index = situations.indexOf(InitialSituation.class);
	    	CurrentSituation situation = situations.get(index);
	    	if(situation == null){
	    		situation = new CurrentSituation();
	    		situations.add(situation);
	    		}
	    	return situation;
	    	}
	    public HomeSituation DoHomeSituation(){
	    	int index = situations.indexOf(HomeSituation.class);
	    	HomeSituation situation = situations.get(index);
	        if(situation == null){
	            situation = new HomeSituation();
	            situations.add(situation);
	        }
	        return situation;
	    }

	    public CurrentSituation DoCharacterChoose(){
	    	int index = situations.indexOf(CharacterChoose.class);
            CharacterChoose situation = situations.get(index);
	        if(situation == null){
	            situation = new CharacterChoose();
	            situations.add(situation);
	        }
	        return situation;
	    }

	    public CurrentSituation DoTAMoveSituation(){
	    	int index = situations.indexOf(TAMoveSituation.class);
	    	CurrentSituation situation = situations.get(index);
	        if(situation == null){
	            situation = new TAMoveSituation();
	            situations.add(situation);
	        }
	        return situation;
	    }

	    public MidtermSituation DoMidtermSituation(){
	    	int index = situations.indexOf(MidtermSituation.class);
            MidtermSituation situation = situations.get(index);
	        if(situation == null){
	            situation = new MidtermSituation();
	            situations.add(situation);
	        }
	        return situation;
	    }

	    public CurrentSituation DoTAsituation(){
	    	int index = situations.indexOf(MidtermSituation.class);
            CurrentSituation situation = situations.get(index);
	        if(situation == null){
	            situation = new TAsituation();
	            situations.add(situation);
	        }
	        return situation;
	    }

	    public CurrentSituation DoPassCourse(){
	    	int index = situations.indexOf(PassCourse.class);
            CurrentSituation situation = situations.get(index);
	        if(situation == null){
	            situation = new PassCourse();
	            situations.add(situation);
	        }
	        return situation;
	    }
            
	}


