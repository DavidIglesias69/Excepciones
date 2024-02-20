import java.util.Scanner;

public class Prueba {


	public static void main(String[] args) throws DavidException {

		String cadena = "Hola soy David y hector es un paquete";
		char delimitador = ' ';


		String[] palabras = split(cadena, delimitador);
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}


	}



	public static double division() throws DavidException{
		Scanner sr = new Scanner(System.in);
		System.out.println("dime el primer numero");
		int num1= sr.nextInt();
		System.out.println("dime el primer numero");
		int num2= sr.nextInt();
		if (num2==0) {
			throw new DavidException("no se puede hacer esa operacion prohibido dividir entre 0.");

		} else {
			double division =num1 /num2;
			return division;
		}
	}
	public static int array ()throws DavidException {
		System.out.println("dime posicion de la array");
		Scanner aa= new Scanner (System.in);
		int num1= aa.nextInt();
		int [] array={1,2,3,4,5};
		if (num1>array.length || num1<0) {
			throw new DavidException("esta fuera de la array.");
		}else {
			return array[num1];
		}

	}
	public static void cadenaLeer () throws DavidException{
		System.out.println("dime una cifra");
		Scanner ww = new Scanner(System.in);
		String cadena= ww.nextLine();
		for (int i = 0; i < cadena.length(); i++) {
			if (cadena.charAt(i)== '0' || cadena.charAt(i)== '1' ||cadena.charAt(i)== '2' || cadena.charAt(i)== '3' || cadena.charAt(i)== '4' || cadena.charAt(i)== '5' ||cadena.charAt(i)== '6' || cadena.charAt(i)== '7' ||cadena.charAt(i)== '8' || cadena.charAt(i)== '9') {

			}else {
				throw new DavidException("hay un caracter que no es un número");
			}


		}
		System.out.println(Integer.parseInt(cadena));
	}

	public static String[] split (String cadena, char deli) throws DavidException {

		int contador=0;

		for (int i = 0; i < cadena.length(); i++) {		

			if (cadena.charAt(i) == deli) {
				contador++;
			}

		}

		if(contador == 0) {
			throw new DavidException("no esta el limitador");
		}


		String [] array = new String [contador+1];
		int posicion=0;
		StringBuffer sr = new StringBuffer();
		for (int i = 0; i < cadena.length(); i++) {
			if(cadena.charAt(i)==deli){
				array[posicion]=sr.toString();
				sr = new StringBuffer();
				posicion++;		
			}else if(i==cadena.length()-1) {
				sr.append(cadena.charAt(i));
				array[posicion]=sr.toString();
				
			}else {
				sr.append(cadena.charAt(i));
			}
		}

		return array;

	}



}

