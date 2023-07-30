package week2.assignments;

public class Automation extends MultipleLanguage  {

	public void java() {
		System.out.println("Java is the mother language of all other languages");
		
	}

	public void selenium() {
		System.out.println("Selenium is a web based automation testing tool ");
		
	}

	
	public void ruby() {
		System.out.println("Ruby also supports selenium");
		
	}
	
	public static void main(String[] args) {
		
		Language lang = new Automation();
		lang.java();
	
	    TestTool test=new Automation();
	    test.selenium();
	    
	    TestTool others = new Automation();
	    others.ruby();
	    others.python();
	    
	    
	
	
	}



}
