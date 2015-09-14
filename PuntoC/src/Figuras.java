import java.util.Scanner;
//Clase abstarcta que servirá para agrupar los objetos
abstract class Figuras
{
	protected Scanner teclado;
	
	public Figuras(){
		teclado=new Scanner(System.in); //En caso de que queramos pedir los valores por teclado
	}
	//Métodos abstractos obligatorios en las clases hijo, de acuerdo al requerimiento
	public abstract double area();
	public abstract double perimetro();
	public abstract String nombre();
}