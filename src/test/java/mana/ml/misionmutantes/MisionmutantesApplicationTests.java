package mana.ml.misionmutantes;

import mana.ml.misionmutantes.rest.MutanteREST;
import mana.ml.misionmutantes.rest.RegistroADNREST;
import mana.ml.misionmutantes.utilities.Matriz;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class MisionmutantesApplicationTests {

	@InjectMocks
	private MutanteREST mutanteREST;

	@InjectMocks
	private RegistroADNREST registroADNREST;

	@Test
	void contextLoads() {

	}

	@Test
	void testMatriz(){
		String aMt = "A,T,G,C,G,A,C,A,G,T,G,C,T,T,A,T,G,T,A,G,A,A,G,G,T,C,C,C,T,A,T,C,A,C,T,G";
		List<Matriz> matriz = registroADNREST.matriz(aMt);
		aMt = aMt.replaceAll(",","").trim();
		assertEquals(aMt.length(),matriz.size());

		/**
		 * 1 = Horizontal
		 * 10 = Vertical
		 * 11 = Oblicua
		 */

		boolean validarDM = registroADNREST.isMutante(matriz, 1);
		//assertTrue(validarDM);
		assertFalse(validarDM);

		String adn = registroADNREST.diagnosticoBaseNitrogenada(matriz.size());
		assertEquals(adn.length(),aMt.length());
	}


}
