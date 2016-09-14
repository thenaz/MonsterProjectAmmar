package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	
	private MarshmallowMonster firstMonster;

	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("ricky",2,false,2,1,2,2);
	}
	
	public void start()
	{
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
		if(firstMonster.getEyeCount() > 3)
		{
			System.out.println("Thats a lot of eyes!!!!");
		}
	}
	
}