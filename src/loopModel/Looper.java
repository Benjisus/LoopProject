package loopModel;
import java.util.ArrayList;

public class Looper
{
	private ArrayList<String> graveNameList;
	
	public Looper()
	{
		graveNameList = new ArrayList<String>();
		
		fillTheGraveNameList();
	}
	
	public ArrayList<String> getGraveNameList()
	{
		return graveNameList;
	}
	
	private void fillTheGraveNameList()
	{
		graveNameList.add("Elwood Thomas Johnson Jr.");
		graveNameList.add("Thomas L. Johnson");
		graveNameList.add("Waler S. Grys");
		graveNameList.add("Carla L. Thomas");
		graveNameList.add("W.G. Thomas");
		graveNameList.add("Karl Alvin Thorson");
		graveNameList.add("Nadine Richardson");
		graveNameList.add("Thomas Pugmire");
		graveNameList.add("Roy Alvin Pederson");
		graveNameList.add("Dora A. Osborne Pederson");
		graveNameList.add("Farrbil Pugmire");
	}
	public String loopResultOne()
	{
		String loopResult = "";
		int numberOfTimes = 0;

		for (int counter = 17; counter >= 5; counter -= 2)
		{
			loopResult += counter + ", ";
			numberOfTimes++;
		}

		loopResult += " was the last time";
		loopResult += "\nThe loop executed " + numberOfTimes + " times. ";

		return loopResult;
	}

	public String loopResultTwo()
	{
		String loopResult = "";
		int numberOfTimes = 0;
		for (int pennies = 0; pennies < 100; pennies++)
		{
			for (int nickle = 0; nickle < 20; nickle++)
			{
				for (int dime = 0; dime < 10; dime++)
				{
					for (int quarter = 0; quarter < 4; quarter++)
					{

						//loopResult += "count is " + count + "\n";
						for (int dollar = 0; dollar < 1; dollar++)
						{
							//loopResult += "otherCount is " + otherCount + "\n";
							numberOfTimes++;
						}
					}
				}
			}
		}
		loopResult += "The loop executed " + numberOfTimes + " times - wow!";
		return loopResult;
	}

}
