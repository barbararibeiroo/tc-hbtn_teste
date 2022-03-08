import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class TesteEmail {
	@Test
	public void testar_email_com_arroba() {
		boolean emal = Pessoa.emailValid("email_teste@dominio.com.br");
		assertTrue(emal);
	}
	@Test
	public void testar_email_mais_50_caracteres() {
		boolean emal = Pessoa.emailValid("email_teste@dominio.com.br");
		assertFalse(emal);
	}
	@Test void testar_email_sem_arroba() {
		boolean emal = Pessoa.emailValid("email_teste@dominio.com.br");
		assertEquals(emal, false);
	
	}
	

}
