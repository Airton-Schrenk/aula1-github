package util;

public class CalculatorPen {
	public static double IPE_SAUDE = 0.031;
	
	public static double liqPen(double cotaPen, double irrf, double previd) {
		return cotaPen - (cotaPen * IPE_SAUDE) - irrf - previd;
	}

}
