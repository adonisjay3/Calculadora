import java.util.Scanner;

public class Calculardora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner read= new Scanner(System.in);
		int opcion;
		int n1;
		int n2;
		int r;
		
		System.out.println("Elije la operacion");
		System.out.println("1.Suma");
		System.out.println("2.Resta");
		System.out.println("3.Multiplacion");
		System.out.println("4.Divison");
		opcion = read.nextInt();
		
		
		System.out.println("Escribe el primer numero");
		n1 =read.nextInt();
		System.out.println("Escribe el segundo numero");
		n2 =read.nextInt();
		
		switch(opcion) {
		case 1:
			r=n1+n2;
			System.out.println("La respuesta es "+r);
		    break;
		case 2:
			r=n1-n2;
			System.out.println("La respuesta es "+r);
			break;
		case 3:
			r=n1*n2;
			System.out.println("La respuesta es "+r);
			break;
		case 4:
			r=n1/n2;
			System.out.println("La respuesta es "+r);
			break;
			
		}
		

	}

}
