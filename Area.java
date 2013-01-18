
public abstract class Area {
	int areaInMeters;

	public Area(int areaInMeters) 
	{
		// TODO Auto-generated constructor stub
		this.areaInMeters=areaInMeters;
	}
	@Override
	public boolean equals(Object obj1)
	{
		Area area1=(Area)obj1;
		return area1.areaInMeters == this.areaInMeters;
		System.out.println("Ending area");
	}

}
