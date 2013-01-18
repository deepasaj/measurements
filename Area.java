
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
		System.out.println("printing area");
		return area1.areaInMeters == this.areaInMeters;
	}

}
