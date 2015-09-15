public class Pila {
	//Se define la clase Nodo
    class Nodo {
        double area;
        double perimetro;
        String nombreObjeto;
        Nodo sig;
    }
	//Se instancia el objeto
    private Nodo raiz;
    //Constructor de la clase
    public Pila () {
        raiz=null;
    }
    //Método para insertar cuando el objeto es un círculo
    public void insertar(Circulo objeto) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.area = objeto.area();
        nuevo.perimetro = objeto.perimetro();
        nuevo.nombreObjeto = objeto.nombre();
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    //Método para insertar cuando el objeto es un triángulo
    public void insertar(Triangulo objeto) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.area = objeto.area();
        nuevo.perimetro = objeto.perimetro();
        nuevo.nombreObjeto = objeto.nombre();
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
  //Método para insertar cuando el objeto es un rectángulo
    public void insertar(Rectangulo objeto) {
    	Nodo nuevo;
        nuevo = new Nodo();
        nuevo.area = objeto.area();
        nuevo.perimetro = objeto.perimetro();
        nuevo.nombreObjeto = objeto.nombre();
        if (raiz==null)
        {
            nuevo.sig = null;
            raiz = nuevo;
        }
        else
        {
            nuevo.sig = raiz;
            raiz = nuevo;
        }
    }
    //Método para imprimir
    public void imprimir() {
        Nodo reco=raiz;
        System.out.println("Listado de todos los elementos de la pila.");
        while (reco!=null) {
        	if (reco.area==-1||reco.perimetro==-1){
        		System.out.println("el área o el perímetro para el" + reco.nombreObjeto + " no están definidos o dan como resultado números negativos");
        	}else{
            System.out.println("el area del " + reco.nombreObjeto + " es " + reco.area +" y el perimetro es " + reco.perimetro);
            }
        	reco=reco.sig;
        }
        
    }
    

}