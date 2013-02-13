package model;

import java.util.*;
import controller.*;
import java.util.Collections;

public class BubbleSort implements BaseSort{
	private int[] values;
	ArrayMail arr;

	public BubbleSort(ArrayMail arr)
	{
		this.arr = arr;
	}
	
	@Override
	public void sort(int[] origValues, ArrayMail m) {
		//Implementation of Selection Sort
		this.values = origValues;
		randomize();
		for(int j=0; j < values.length; j++)
		{
			for(int i = 0; i < values.length-1; i++)
			{
				if(values[i]>values[i+1])
				{
					int temp = values[i];
					values[i] = values[i+1];
					values[i+1] = temp;
					m.setState(values);
				}
			}
		}
	}
	private void randomize() {
		for(int i = values.length-1; i > 0; i--)
		{
			double toSwitch = Math.random()*values.length;
			int switchLocation = (int)toSwitch;
			int temp = values[i];
			values[i] = values[switchLocation];
			values[switchLocation] = temp;
		}
		System.out.println("===============");
		for(int i = 0; i < values.length; i++)
		{
			System.out.print(values[i]);
		}
		System.out.println("");
	}

}
