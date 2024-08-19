package controller;

public class Controller1
{

	public Controller1()
	{
		super();
	}
	
	public int ContDig (int n, int cont)
	{
		if (n < Math.pow(10, cont))
		{
			return cont;
		}
		else
		{
			return ContDig (n, (cont + 1));
		}
	}
	
}
