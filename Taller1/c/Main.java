
public class Main {
	public static void main(String[] args){
		//Se instancias los objetos que queremos evaluar.
		Circulo circ1=new Circulo();
		Triangulo trian1=new Triangulo();
		Rectangulo rect1=new Rectangulo();
		Circulo circ2=new Circulo(1);
		Triangulo trian2=new Triangulo(2,4,6);
		Rectangulo rect2=new Rectangulo(6,4);
		Circulo circ3=new Circulo(2);
		Triangulo trian3=new Triangulo(5,2,7);
		Rectangulo rect3=new Rectangulo(4,8);
		Circulo circ4=new Circulo(3);
		Triangulo trian4=new Triangulo(5,7,2);
		Rectangulo rect4=new Rectangulo(6,3);
		Circulo circ5=new Circulo(4);
		Triangulo trian5=new Triangulo(6,8,1);
		Rectangulo rect5=new Rectangulo(3,5);
		//Se instancia la lista tipo pila
        Pila pila1=new Pila();
        //Se insertan los objetos previamente instanciados en la pila
        pila1.insertar(circ1);
        pila1.insertar(trian1);
        pila1.insertar(rect1);
        pila1.insertar(circ2);
        pila1.insertar(trian2);
        pila1.insertar(rect2);
        pila1.insertar(circ3);
        pila1.insertar(trian3);
        pila1.insertar(rect3);
        pila1.insertar(circ4);
        pila1.insertar(trian4);
        pila1.insertar(rect4);
        pila1.insertar(circ5);
        pila1.insertar(trian5);
        pila1.insertar(rect5);
        pila1.imprimir();

	}

}
