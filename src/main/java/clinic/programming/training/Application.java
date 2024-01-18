package clinic.programming.training;

import java.util.*;
import org.apache.commons.lang3.StringUtils;

public class Application {
    
    public Application() {
        System.out.println ("Inside Application");
    }
	
	public int countWords(String s){
		String []words=StringUtils.split(s," ");
		return words.length;
	}
	
	public void greet(){
		List<String> g=new ArrayList<>();
		g.add("Hello");
		for(String s:g) System.out.println(s);
	}

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
    	System.out.println ("Starting Application");
		Application app = new Application();
		app.greet();
		System.out.println("Enter a sentence:");
		System.out.println("No.of words="+app.countWords(sc.nextLine()));
    }
}