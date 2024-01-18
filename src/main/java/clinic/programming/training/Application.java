package clinic.programming.training;

import java.util.*;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public void greet(){
		List<String> g=new ArrayList<>();
		g.add("Hello");
		for(String s:g) System.out.println(s);
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
    }
}