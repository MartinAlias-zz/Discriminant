/*
 *Programmed By: Martin Horciak
 *Programmed For: Mr.L.Calomeni
 *Course: ICS201
 *Date: Monday, December 12, 2016.
 *Program Description:	Create an application  that prompts the user
 *						for three values (a,b,c). Then displys "no roots"
 *						if the answer is negative, "One root" if the
 *						answer is zero, and "Two roots" if the answer is
 *						positive.
 */

 import java.util.Scanner;								//import scanner

 class Discriminant {									//class decloration w/ opening and closing brace
 	public static void main (String [] args) {			//main method w/ opening and closing brace

 		double a, b, c;					//variable decloration
 		double discriminant;			//variable decloration

 		Scanner input = new Scanner (System.in);		//Scanner creation

 		System.out.print ("Enter the value for a: ");	//System output for "a"
 		a = input.nextDouble ();
 		System.out.print ("Enter the value for b: ");
 		b = input.nextDouble ();
 		System.out.print ("Enter the value for c: ");
 		c = input.nextDouble ();
 		input.close();

 		discriminant= (b*b)-(4*a*c);

 		if (discriminant > 0.0) {
 			System.out.println ("\nTwo Roots");
 		}else if (discriminant == 0.0)  {
 			System.out.println ("\nOne Root");
 		}else{
 			System.out.println ("\n No Roots");
 		}
 	}
 }