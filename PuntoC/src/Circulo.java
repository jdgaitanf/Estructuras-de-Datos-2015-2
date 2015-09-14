public class Circulo extends Figuras{
	//Atributos
    private double radio;
	//Constructor por defecto
	public Circulo (){
		super();		            
        radio=1;
	}
	//Constructor para los demás casos
	public Circulo (double r){
		super();		            
        radio=r;
	}
	//Método para el cálculo del área
	public double area(){
		double AreaR=(3.14*(radio)*(radio));
		if (AreaR<0)AreaR=-1;
		return AreaR;
	}
	//Método para el cáculo del perímetro
	public double perimetro(){
		double perimetro=(2*3.14*(radio));
		if (perimetro<0)perimetro=-1;
		return perimetro;
	}
	//Método para establecer el nombre de la figura
	public String nombre(){		
		return "círculo";		
	}

}
