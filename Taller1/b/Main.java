package puntob;

import puntob.Rectangle;

public class Mainb {
	public static void main(String[] args){
		Rectangle first=new Rectangle();
		Rectangle second=new Rectangle(2,2);
		Rectangle third=new Rectangle(3,3);
		Rectangle fourth=new Rectangle(4,4);
		Rectangle fifth=new Rectangle(5,5);
		
		System.out.println(first.getArea());
		System.out.println(first.getPerimeter());
		System.out.println(second.getArea());
		System.out.println(second.getPerimeter());
		System.out.println(third.getArea());
		System.out.println(third.getPerimeter());
		System.out.println(fourth.getArea());
		System.out.println(fourth.getPerimeter());
		System.out.println(fifth.getArea());
		System.out.println(fifth.getPerimeter());
	}
}
