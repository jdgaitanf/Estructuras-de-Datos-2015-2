
public class Rectangulo extends Figuras{
	//Atributos
	private double alto;
    private double ancho;
  //Constructor por defecto
	public Rectangulo (){
		super();		            
        alto=1;
        ancho=1;
	}
	//Constructor para los demás casos
	public Rectangulo (double al, double an){
		super();		            
        alto=al;
        ancho=an;
	}
	//Método para el cáculo del área
	public double area(){
		double AreaR=(alto)*(ancho);
		if (alto<0||ancho<0)AreaR=-1;
		return AreaR;
	}
	//Método para el cáculo del perímetro
	public double perimetro(){
		double perimetro=((2*(alto))+(2*(ancho)));
		if (alto<0||ancho<0)perimetro=-1;
		return perimetro;
		
	}
	//Método para establecer el nombre de la figura
	public String nombre(){		
		return "rectángulo";		
	}

}
