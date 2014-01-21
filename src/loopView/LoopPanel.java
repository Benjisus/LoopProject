package loopView;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpringLayout;

import loopController.LoopController;
import loopModel.Looper;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoopPanel extends JPanel
{
	// Data Members
	private Looper appBot;
	private LoopController baseController;
	
	private JButton submitButton;
	private JTextArea loopArea;
	private SpringLayout baseLayout;
	private JScrollPane textPane;
	
	//Constructor 
	public LoopPanel(LoopController baseController)
	{
		this.baseController = baseController;
		this.appBot = baseController.getMyLooper();
		
		submitButton = new JButton("Click me!");
		loopArea = new JTextArea(20,30);
		textPane = new JScrollPane(loopArea);
		baseLayout = new SpringLayout();
		setupPanel();
		setupLayout();
		setupListeners();
		
		startChat();
	}
		
		private void startChat()
		{
			
		}
		
		private void setupPanel()
		{
			this.setLayout(baseLayout);
			this.add(textPane);
			this.add(submitButton);
			
			this.setBackground(new Color(113, 45, 250));
			
			loopArea.setLineWrap(true);
			loopArea.setWrapStyleWord(true);
			
			
			
			
		}
		
		private void setupLayout()
		{
			
			baseLayout.putConstraint(SpringLayout.WEST, submitButton, 6, SpringLayout.EAST, textPane);
			baseLayout.putConstraint(SpringLayout.SOUTH, submitButton, 0, SpringLayout.SOUTH, this);
		}
		
		private void setupListeners()
		{
			submitButton.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent click) 
				{
					loopArea.append(baseController.getLoopResults());
				}
			});
		}
	}


