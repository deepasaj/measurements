public class Meter extends Length {

	public Meter(int val) {
		super(val);
		// TODO Auto-generated constructor stub
	}
	public Meter(Length l)
	{
		super(l);
	}

	@Override
	public String toString() {
		return String.valueOf(this.valueInMeter) + "M";

	}



}
