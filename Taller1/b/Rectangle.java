package puntob;

public class Rectangle {
	private float recWidth = 1;
	private float recLong = 1;
	public Rectangle(){
		recWidth = 1;
		recLong = 1;
	}

	public float getRecWidth() {
		return recWidth;
	}


	public Rectangle(float recWidth, float recLong) {

		setRecWidth(recWidth);
		setRecLong(recLong);

	}

	public void setRecWidth(float recWidth) {

		if(recWidth>=1 && recWidth<=20){this.recWidth = recWidth;}
		else{System.out.println("value out of range");}
	}

	public float getRecLong() {
		return recLong;
	}


	public void setRecLong(float recLong) {

		if(recLong>=1 && recLong<=20){this.recLong = recLong;}
		else
			System.out.println("value out of range");

	}

	public float getPerimeter(){
		return(2*(recWidth+recLong));
	}
	public float getArea(){
		return(recWidth*recLong);
	}
}
