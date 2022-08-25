import java.io.Console;


public class Carro {

	public static void main(String[] args) {
		
		String marca = "toyota";
		System.out.println("La marca del carro es: " + marca);

		Console consola = System.console();
		marca = consola.readLine();
		System.out.println("La marca ingresada carro es: " + marca);

		/* tarea subirlo a git
		agregar modelo al carro 
		el modelo va hacer entero*/
		

	}

}