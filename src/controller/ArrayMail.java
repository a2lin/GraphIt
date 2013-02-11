package controller;

import java.util.ArrayList;

import model.BaseSort;

/**
 * Testing help
 * @author Alexander Lin
 *
 */
public class ArrayMail {
	private int[] state;
	public ArrayList<ArrayListener> notifyList;
	
	public ArrayMail()
	{
		notifyList = new ArrayList<ArrayListener>();
	}
	public int[] getState()
	{
		return state;
	}
	public void setState(int[] state)
	{
		this.state = state;
		notifyList();
	}
	public void notifyList()
	{
		for(int i = 0; i < notifyList.size();i++)
		{
			notifyList.get(i).notifyThis();
		}
	}
	public void register(ArrayListener li)
	{
		notifyList.add(li);
	}
	public void deregister(ArrayListener li)
	{
		notifyList.remove(li);
	}
}
