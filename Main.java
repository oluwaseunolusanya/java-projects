public class Main{
	// Create a checkAge() method with an integer variable called age
	static void checkAge(int age){
		if (age < 18){
			System.out.println("Access Denied.");
		}else{
			System.out.println("Access Granted.");
		}
	}
	
	public static void main(String[] args){
		/*System.out.println("Hello World!");
		String firstName = "John ";
		String lastName = "Doe";
		String fullName = firstName + lastName;
		System.out.println(fullName)*/;
		checkAge(19);
	}
}