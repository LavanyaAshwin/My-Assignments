package org.system;

public class Desktop extends Computer {
	
	public void desktopSize() {

          System.out.println("My desktop size is bigger");
	}
	
	public static void main(String[] args) {
		
		Desktop size=new Desktop();
		size.desktopSize();
		size.computerModel();
		
		
	}

}
