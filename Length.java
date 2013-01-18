public class Length {
	int valueInMeter;

	public Length(int valueInMeter) { 
		// TODO Auto-generated constructor stub
		this.valueInMeter = valueInMeter;
	}
	public Length(Length l)
	{
		this.valueInMeter=l.valueInMeter;
	}

	@Override
	public boolean equals(Object l) {
		Length ll = (Length) l;
		return this.valueInMeter == ll.valueInMeter;
	}

	public Length sum(Length ll) {
		// TODO Auto-generated method stub
		return new Meter(this.valueInMeter + ll.valueInMeter);
	}
	public Area area(Length len2) {
		// TODO Auto-generated method stub
		return new MeterSquared(this.valueInMeter*len2.valueInMeter);
	}


}
