package view;

import controller.Controller1;

public class Main1 
{

	public static void main(String[] args) 
	{
		Controller1 c = new Controller1();
		
		int n = 100000000;
		int cont = 1;
		
		int resultado = c.ContDig(n, cont);
		
		System.out.println(n + ", tem " + resultado + " digitos." );
		
	}
	
}
