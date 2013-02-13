package view;

import java.awt.*;
import javax.swing.*;

public class MainDisplay extends JPanel{

	int[] currentInts;
  // Create a constructor method
  public MainDisplay(){
    super();
    
  }

  // The following methods are instance methods.
  public void paintComponent(Graphics g){
	  super.paintComponent(g);
  }
  
  public void paint(Graphics g)
  {
	  super.paint(g);
	  for(int i = 0; i < currentInts.length; i++)
	  {
		  g.drawRect(i*600/currentInts.length, 0, 600/currentInts.length, currentInts[i]);
	  }
  }

  public void setArray(int[] arrayToPrint)
  {
	  this.currentInts = arrayToPrint;
	  repaint();
  }
}
