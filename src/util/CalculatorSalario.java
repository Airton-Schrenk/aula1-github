package util;

public class CalculatorSalario {
	public static final double PREVID = 0.14;
	public static final double IRRF = 0.275;
	
	public static double calcIrrf(double salario) {
		return salario * IRRF;
	}
	
	public static double calcPrevid(double salario) {
		return ((salario - 5875.00) * PREVID);
	}
	
	public static double salLiq(double salario) {
		return salario;
	}
}
