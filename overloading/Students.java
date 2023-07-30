package method.overloading;

public class Students {

	public int getStudentInfo(int id) {
		System.out.println("This is my id no "+ id);
		return id;
		
	}
	
	public void getStudentsInfo( int id , String name) {
		System.out.println (name );
	}
	
	public void getStudentsInfo( String email , long phoneNumber) {
		System.out.println( email + phoneNumber);
	}
	
	public static void main(String[] args) {
		
		Students info=new Students();
		info.getStudentInfo(45365);
		info.getStudentsInfo(85658, "Lavanya");
		info.getStudentsInfo("lavvenkat@yahoo.in" , 9586586985l);
		
		
	}

	
}
