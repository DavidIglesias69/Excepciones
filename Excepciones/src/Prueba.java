public class Prueba {
	
	
	public static void main(String[] args) throws DavidException {

		String cadena = "Hola soy David";
		char delimitador = ' ';
		
		
		String[] palabras = split(cadena, delimitador);
		for (int i = 0; i < palabras.length; i++) {
			System.out.println(palabras[i]);
		}
		
		
	}
	
	
	
	public static double division() throws DavidException{
		Scanner num1 = new Scanner(System.in);
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

	public String[] split (String cadena, char deli) throws DavidException {
		int contador=0;
		for (int i = 0; i < cadena.length; i++) {		

			if (cadena.charAt(i)== deli) {
				contador = cadena.length();

			} else {
				throw new DavidException("no esta el limitador");

			}
			String [] array = new String [contador+1];
			StringBuffer sr = new StringBuffer();
			if (cadena.charAt(i)==deli) {
				sr.append()
			}
		}
	}



}

