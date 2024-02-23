
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcepcionesTest {

	@Test
	void testOutOfBounds() {
		int[] numeros= new int[5];
		assertThrows(IndexOutOfBoundsException.class, ()-> {System.out.println(numeros[6]);
		}
		);
	}
	
@Test
void testNullPointerExcepcion () {
	
	assertThrows(NullPointerException.class,
			()-> {
				Integer numero =null;
				System.out.println(numero.equals(3));
		;
	}
	);
}

@Test
void testDivision () throws DavidException {
	int num1 =10;
	int num2 = 5;
	assertEquals (2, Prueba.division(num1, num2));
	
}

@Test
void testDivision2 () throws DavidException{
	int num1 =10;
	int num2 = 0;
	
	assertThrows(DavidException.class, ()->
		 Prueba.division(num1, num2));
	
	}
	
	@Test
}



