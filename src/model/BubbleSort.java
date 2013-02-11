package model;

import java.util.*;
import controller.*;
import java.util.Collections;

public class BubbleSort implements ArrayListener,BaseSort{
	private int[] values;
	@Override
	
	public void sort(int[] origValues, ArrayMail m) {
		//Implementation of Selection Sort
		this.values = origValues;
		randomize();
		for(int i = 0; i < values.length-1; i++)
		{
			if(values[i]<values[i+1])
			{
				int temp = values[i];
				values[i] = values[i+1];
				values[i+1] = temp;
				m.setState(values);
			}
		}	
	}
	private void randomize() {
		for(int i = 0; i < values.length; i++)
		{
			Collections.shuffle(Arrays.asList(values));
		}
	}
	@Override
	public void notifyThis() {
		System.out.println(values);	
	}
}
