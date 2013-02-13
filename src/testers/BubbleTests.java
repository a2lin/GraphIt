package testers;

import model.*;
import controller.*;
import junit.framework.TestCase;

public class BubbleTests extends TestCase {
	public BubbleTests (final String name)
	{
		super(name);
	}
	
	public void testIsSorted()
	{
		ArrayMail m = new ArrayMail();
		BubbleSort bs = new BubbleSort(m);
		int[] values = {1,2,3,4,5,6,7,8,9};
		OutputGenerator op = new OutputGenerator(m);
		m.register(op);
		bs.sort(values, m);
	}
	
	private void printArray(int[] acs)
	{
		System.out.println("");
		for(int a: acs)
		{
			System.out.print(""+a);
		}
	}
	
	private class OutputGenerator implements ArrayListener
	{
		ArrayMail m;
		public OutputGenerator(ArrayMail m)
		{
			this.m = m;
		}
		int[] state;
		@Override
		public void notifyThis() {
			state = m.getState();
			printArray(state);
		}
	}

		
}
