package monster.controller;

import monster.model.MarshmallowMonster;



public class MonsterController
{
	
	private MarshmallowMonster firstMonster;

	private MarshmallowMonster ricky;
	
	public MonsterController()
	{
		firstmonster = new MarshmallowMonster("ricky",2,false,2,1);
				
					

		         								
		         								
		
	}
	
	
	public void start()
	{
		System.out.println("Here is my monster: " + firstMonster); 
	}
}