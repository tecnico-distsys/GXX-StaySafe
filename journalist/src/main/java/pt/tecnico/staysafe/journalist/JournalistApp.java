package pt.tecnico.staysafe.journalist;


public class JournalistApp {
	
	public static void main(String[] args) {
		System.out.println(JournalistApp.class.getSimpleName());
		
		// receive and print arguments
		System.out.printf("Received %d arguments%n", args.length);
		for (int i = 0; i < args.length; i++) {
			System.out.printf("arg[%d] = %s%n", i, args[i]);
		}
	}

}
