
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ExcepcionesTest {

	@Test
	void testOutOfBounds() {
		int[] numeros= new int[5];
		assertThrows(IndexOfBoundsException.class, ()-> {System.out.println(numeros[6]);
		}
		);
		
		
	}

}
