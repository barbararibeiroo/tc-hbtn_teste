
public class OperacaoBasica {

	public static double testar_sqrt(int num) {
		return Math.sqrt(num);

	}

	public static String numero_primo(int num) {
		if (num <= 1) {
			return "Número invalido. Numero menor ou igual a 1 não é primo";
		}

		if (num % 2 == 0) {
			return "Número válido, mas o numero não é primo";
		} else {
			return "Numero válido, o numero é primo";

		}

	}
}
