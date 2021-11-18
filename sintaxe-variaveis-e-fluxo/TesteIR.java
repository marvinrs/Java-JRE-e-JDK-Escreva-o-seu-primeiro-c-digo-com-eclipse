
public class TesteIR {

	public static void main(String[] args) {

		double salario = 3300.0;
		double impostoRenda;
		if (salario >= 1900.0 && salario <= 2800.0) {
			impostoRenda = 0.075 * salario;
			System.out.println("Sem imposto de Renda é " + impostoRenda);
			System.out.println("Você pode deduzir até 142,00");
		} else if (salario >= 2800.01 && salario <= 3751.0) {
			impostoRenda = 0.15 * salario;
			System.out.println("Sem imposto de Renda é " + impostoRenda);
			System.out.println("Você pode deduzir até 350,00");
		} else if (salario >= 3751.01 && salario <= 4664.00) {
			impostoRenda = 0.225 * salario;
			System.out.println("Sem imposto de Renda é " + impostoRenda);
			System.out.println("Você pode deduzir até 636,00");
		}
	}

}
