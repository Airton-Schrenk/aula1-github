package devices;

public class ComboDevice extends Device implements Scanner, Printer{
	
	public ComboDevice(String serialNumber) {
		super(serialNumber);
	}

	@Override
	public void print(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Combo printing: "+doc);
	}

	@Override
	public String scan() {
		// TODO Auto-generated method stub
		return "Combo scan result";
	}

	@Override
	public void processDoc(String doc) {
		// TODO Auto-generated method stub
		System.out.println("Combo processing: "+doc);
	}
}
