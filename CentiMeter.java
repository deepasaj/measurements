public class CentiMeter extends Length {

	public CentiMeter(int val) {
		// TODO Auto-generated constructor stub
		super(val / 100);
	}
	public CentiMeter(Length l)
	{
		super(l);
	}

	@Override
	public String toString() {
		return String.valueOf(this.valueInMeter * 100) + "cm";

	}


}
