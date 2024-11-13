package com.tnsif.abstraction;

public class AbstractDemo {
 public static void main(String[]args) {
	 Square sq=new Square ();
	 Rectangle rt=new Rectangle ();
	 sq.calArea ();
	 sq.show();
	 rt.calArea();
	 rt.show();
	 
	 System.out.println();
	 Shape shape;
	 shape=new Square(12.5f);
	 shape.calArea ();
	 shape.show();
	 shape=new Rectangle (10,20);
	 
	 shape.calArea();
	 shape.show();
	 
 }
}
