package monster.model;

public class MarshmallowMonster
{

	private String name;
	private double hairCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;
	private int jetpackCount;
	
	public MarshmallowMonster()
	{
		this.name = "no name here";
		this.hairCount = 5;
	    this.eyeCount = 5;
	    this.hasBellyButton = false;
	    this.armCount = 5;
	    this.noseCount = 5;
	    this.jetpackCount = 1;
	}
	
	public MarshmallowMonster(String name, double hairCount)
	{
	this.name = name;
	}
	
	public MarshmallowMonster(String name, double legCount, boolean hasBellyButton, int noseCount, int armCount, int jetpackCount, int hairCount)
	{
		this.name = name;
		this.hairCount = hairCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.jetpackCount = jetpackCount;
		this.noseCount = noseCount;
		this.armCount = armCount;
		
	}
}
