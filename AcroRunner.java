//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Flores

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class AcroRunner
{
	public static void main( String args[] ) throws IOException
	{
		File text = new File("acro.dat");
		Scanner scan = new Scanner(text);
		Acronyms test = new Acronyms();
		int i=0;
		int g= Integer.parseInt((scan.nextLine()));
	
		while(i<g) {
			test.putEntry(scan.nextLine());
			i++;
		}
		System.out.println("====    MAP CONTENTS    ====\n\n");
		
		System.out.println(test.toString());
		System.out.println("\n\n====    READ LINES      ====\n\n");
		while(scan.hasNextLine()) {
		System.out.println(test.convert(scan.nextLine()));
		}
	
	}
}