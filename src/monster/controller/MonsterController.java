package monster.controller;

import monster.model.MarshmallowMonster;
import java.util.Scanner;


public class MonsterController
{
	
	private MarshmallowMonster firstMonster;
	private Scanner keyboardInput;
	public MonsterController()
	{
		firstMonster = new MarshmallowMonster("ricky",2,false,2,1,2,2);
		keyboardInput = new Scanner(System.in);
	}
	
	public void start()
	{
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
		if(firstMonster.getEyeCount() > 3)
		{
			System.out.println("Thats a lot of eyes!!!! - Scary");
		}
	}
	{
		System.out.println("Here is my monster: " + firstMonster);
		System.out.println("My monster has this many eyes: " + firstMonster.getEyeCount());
		
//		if (firstMonster.getEyeCount() > 3)
//		{
//			System.out.println("Thats a lot of eyes!!!! - Scary");
//		}
		
		System.out.println("Do you watn to change my name?");
		String answer = keyboardInput.nextLine();
		
		if (answer.equalsIgnoreCase("yes"))
		{
			System.out.println("What do yo want my name to be?");
			String newName = keyboardInput.nextLine();
			firstMonster.setName(newName);
		}
		System.out.println(firstMonster);
		}
		
}