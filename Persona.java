import java.io.Console;
public class Persona{ 
	
	public static void main(String args[]) {
     	 /*System.out.print("Hola mundo");
     	 System.out.print("este nuevo texto");
		Console console = System.console();
		String str = console.readLine("Enter Input : ");
		System.out.print(str);*/
		String nombre = " yajaira ";
		String genero = "femenino";
		int edad = 22;
		System.out.println("El nombre de la persona es : " + nombre + " y su genero es " + genero + "y su edad es:" + String.valueOf(edad) );

		Console terminal = System.console();
		nombre = terminal.readLine("Ingrese su nombre: ");
		System.out.println("Su nombre es: " + nombre);

		genero = terminal.readLine("Ingrese su  nuevo genero: ");
		System.out.println("Su genero es: " + genero);
		
		String ingresoDeEdad = terminal.readLine("Ingrese su  nueva edad: ");
		edad = Integer.valueOf(ingresoDeEdad);
		System.out.println("Su edad es: " + String.valueOf(edad) );




    }

}