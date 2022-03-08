
public class OperacaoBasicaTeste {

	public static boolean testar_sqrt() {
		if (OperacaoBasica.testar_sqrt(49) == 7) {
			return true;
		}
		return false;
	}

	public static boolean testar_primo() {
		if (OperacaoBasica.numero_primo(7).equals("Numero válido, o numero é primo")) {
			return true;
		}
		return false;
	}

	public static boolean testar_nao_primo() {
		if (OperacaoBasica.numero_primo(4).equals("Número válido, mas o numero não é primo")) {
			return true;
		}
		return false;
	}

	public static boolean testar_primo_menor_zero() {
		if (OperacaoBasica.numero_primo(-2).equals("Número invalido. Numero menor ou igual a 1 não é primo")) {
			return true;
		}
		return false;
	}

}