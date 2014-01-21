package loopController;

import java.util.ArrayList;

import loopModel.Looper;
import loopView.LoopFrame;

public class LoopController
{
	private Looper myLooper;
	private LoopFrame appFrame;
	private int clickCount;
	
	public LoopController()
	{
		myLooper = new Looper();
	}
	
	public Looper getMyLooper()
	{
		return myLooper;
	}
	
	public void start()
	{
		appFrame = new LoopFrame(this);
	}
	
	public String getLoopResults()
	{
		String results = "";
	
		results =loopBackwardOverList();
		return results; 
	}
	
	public String getListResults(int position)
	{
		String currentResult = "";
		
//		ArrayList<String> tempList = myLooper.getGraveNameList();
//		currentResult = tempList.get(position);
		if(position < myLooper.getGraveNameList().size())
		{
			currentResult = myLooper.getGraveNameList().get(position);	
		}
		return currentResult;
	}
	
	private String loopBackwardOverList()
	{
		String results = "";
		
		for(int position = myLooper.getGraveNameList().size()-1; position >= 0; position--)
		{
			results += myLooper.getGraveNameList().get(position) +"\n";
		}
		
		return results;
	}
	

	private String loopOverList()
	{
		String results = "";
		
		for(int position = 0; position<myLooper.getGraveNameList().size(); position++)
		{
			results += myLooper.getGraveNameList().get(position) +"\n";
		}
		
		return results;
	}
}
