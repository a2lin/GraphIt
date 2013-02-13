package controller;

import javax.swing.JFrame;

import model.BubbleSort;

import view.*;
public class GraphDriver implements ArrayListener {
	  ArrayMail arr = new ArrayMail();
	  MainDisplay panel = new MainDisplay();
	  public static void main(String arg[]){
		GraphDriver gd = new GraphDriver();
	    JFrame frame = new JFrame("GraphIt");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setSize(600,600);

	    
	    int[] blah = {100,200,300,400};
	    gd.panel.setArray(blah);
	  
	    int[] thisArray = new int[600];
	    for(int i = 0; i < thisArray.length; i++)
	    {
	    	thisArray[i] = i;
	    }
	    BubbleSort bubble = new BubbleSort(gd.arr);
	    gd.arr.register(gd);
	    bubble.sort(thisArray,gd.arr);


	    frame.setContentPane(gd.panel);
	    frame.setVisible(true);
	  }

	@Override
	public void notifyThis() {
		panel.setArray(arr.getState());
	}
}
