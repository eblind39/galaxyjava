package galaxy;

/*
 * Package Java App:
 * 1. javac Main.java
 * 2. jar cfm Main.jar manifest.txt Main.class
 * 3. java -jar Main.jar
 */
public class Main {
	public static void main(String args[]) {
		System.out.println("Hola Mundo!...");
		
		DataTypes dataTypes = new DataTypes();
		dataTypes.imprimirDatosMiembro();
		
		WrapperClasses wrapperClasses = new WrapperClasses();
		wrapperClasses.AutoboxingUnboxing();
		
		Operators operators = new Operators();
	}
}
