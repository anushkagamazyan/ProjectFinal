package main.java.core.characters;

public class CharactersCollection {
	public static Characters buildStudent(){
        return new Student(0, 100, 20, 10);
    }

    public static Characters buildLecturer(){
        return new Lecturer(0,  50, 40, 20);
    }
    public static Characters buildTa(){
        return new Ta(10,  80, 0, 15);
    }
}


