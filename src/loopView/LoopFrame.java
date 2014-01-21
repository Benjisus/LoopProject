package loopView;

import javax.swing.JFrame;

import loopController.LoopController;

/**
 * GUI Framework for Loop Project
 * @author bham6713
 *@version 1.0 11/5/13 Basic setup of Class.
 */


public class LoopFrame extends JFrame
{
	//Data members
	private LoopPanel basePanel;
	private LoopController baseController;
	
	/**
	 * Creates a JFrame based window for the Loop Project.
	 * @param baseController A link to the controller for MVC paradigm.
	 */
	//Constructor 
	public LoopFrame(LoopController baseController)
	{
		this.baseController = baseController;
		basePanel = new LoopPanel(baseController);
		
		setupFrame();
		
	}
	
	/**
	 * Sets up from for the GUI
	 */
	// Helper Methods
	public void setupFrame()
	{
		this.setContentPane(basePanel);
		this.setSize(500,500);
		this.setVisible(true);
	}

}
