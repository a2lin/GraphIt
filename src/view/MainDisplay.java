package view;

import java.awt.*;
import javax.swing.*;

public class MainDisplay extends JPanel{

	int[] currentInts={0};

  public MainDisplay(){
    super();
    
  }

  public void paintComponent(Graphics g){
	  super.paintComponent(g);
  }
  
  public void paint(Graphics g)
  {
	  super.paintComponent(g);
	  for(int i = 0; i < currentInts.length; i++)
	  {
		  g.drawLine(i, 0, i, currentInts[i]);
	  }
  }

  public void setArray(int[] arrayToPrint)
  {
	  this.currentInts = arrayToPrint;
	  repaint();
  }
}
