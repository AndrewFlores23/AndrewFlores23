//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Andrew Flores

import java.io.File;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;
import java.util.Scanner;
import static java.lang.System.*;

public class Acronyms
{
	private Map<String,String> acronymTable;

	public Acronyms()
	{

		acronymTable = new TreeMap();

	}

	public void putEntry(String entry)
	{
		String[] squid = entry.split(" - ");
		acronymTable.put(squid[0],squid[1]);



	}

	public String convert(String sent)
	{
		Scanner chop = new Scanner(sent);
		String output ="";
		String doin ="";
		while(chop.hasNext()) {
			doin=chop.next();
			if(doin.contains(".")&&acronymTable.containsKey(doin.replace(".", ""))) {
				output+=acronymTable.get(doin.replace(".",""))+". ";
			}
			else if(acronymTable.containsKey(doin.replace(".", ""))) {
				output+=acronymTable.get(doin.replace(".",""))+" ";
			}
			else {
				output+=doin+" ";
			}
		}



		return output;
	}

	public String toString()
	{
		
		return acronymTable.toString().replaceAll(",","\n");
	}
}