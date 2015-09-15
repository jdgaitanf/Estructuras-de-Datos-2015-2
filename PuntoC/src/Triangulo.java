public class Triangulo extends Figuras{
	//Atributos
    private double lado1;
    private double lado2;
    private double lado3;
  //Constructor por defecto
	public Triangulo (){
		super();		            
        lado1=1;
        lado2=1;
        lado3=1;
	}
	//Constructor para los demás casos
	public Triangulo (double l1,double l2,double l3){
		super();		            
        lado1=l1;
        lado2=l2;
        lado3=l3;
	}
	//Método para el cálculo del área
	@Override 
	public double area(){			
		double s=((lado1+lado2+lado3)/2);
		double AreaR = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
		Double d1 = new Double(AreaR);
		if (d1.isNaN()) AreaR=-1; //Cuando el valor no está dentro de los números reales
		return AreaR;
	}
	//Método para el cáculo del perímetro
	@Override 
	public double perimetro(){
		double perimetro=(lado1+lado2+lado3);
		return perimetro;
	}
	//Método para establecer el nombre de la figura
	@Override 
	public String nombre(){		
		return "triángulo";		
	}
}
