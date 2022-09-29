package Polymorphism;

public class shape {
	 public void area(String Star)
	 {
		 System.out.println("Star");
	 }
	 public void  area (String Star, String Ellipse)
	 {
		 System.out.println("Star and Ellipse");
		 
	 }
	 public void area(String Star, String Ellipse,String Square)
	 {
		 System.out.println("Star and Ellipse and Square");
		 
	 }
	 public static void main(String[]args)
	 {
		 shape s =new shape();
		 s.area("Star");
		 s.area("Star", "Ellipse");
		 s.area("Star", "Ellipse", "Square");
		 
		 
	
	 
	 }
}