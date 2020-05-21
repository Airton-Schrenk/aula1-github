package course;

public class Aula30EscopoInic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 40.00;
		double discount;
		if(price < 200.00){
		discount = price * 0.1;
		}
		else{
		discount = 0;
		}
		System.out.println(discount);
	}

}
