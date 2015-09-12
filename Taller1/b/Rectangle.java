public class Rectangle {
	private float recWidth = 0;
	private float recLong = 0;
	public Rectangle(){
		recWidth = 1;
		recLong = 1;
	}
	public void setWidth(float valueW){
		if(valueW>=1 || valueW<=20){recWidth = valueW;}
		else{System.out.println("value out of range");}
	}
	public float getWidth(){
		return recWidth;
	}
	public void setLong(float valueL){
		if(valueL>=1 || valueL<=20){recLong = valueL;}
		else{System.out.println("value out of range");}
	}
	public float getLong(){
		return recLong;
	}
	public float getPerimeter(){
		return(2*(recWidth+recLong));
	}
	public float getArea(){
		return(recWidth*recLong);
	}
}