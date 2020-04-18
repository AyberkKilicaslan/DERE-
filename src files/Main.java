import java.awt.Color;
import java.io.*;
import java.util.*;

import enigma.console.TextAttributes;
import enigma.core.Enigma;
public class Main {

	public static void main(String[] args) throws IOException
	{
		//For Enigma Library
		Enigma.getConsole("Dere Project", 100,30).setTextAttributes(new TextAttributes(Color.GREEN));
		
		
		
		System.out.println("Hi Commander! Today is a wonderful day, please make us a favor and enter a command!");
		System.out.println("Do you want to exit from the program, enter \"exit\" command... ");
		System.out.println("Do you want to get some help, enter \"help\" command... ");
		
		//Create Method Object
		Methods methods = new Methods();
		methods.userInput();
	

	}
	

}
