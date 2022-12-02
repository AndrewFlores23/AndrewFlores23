//(c) A+ Computer Science
//www.apluscompsci.com
//Name
import java.util.regex.*;
import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		String fin="";
		int count=0;
		for(int i=0; i<s.length();i++) {
			if(count>9) {
				count=0;
			}
			if(s.substring(i,i+1).matches("[aeiouAEIOU]")){
				fin+=(count);
				count++;
			}
			else {
				fin+=(s.substring(i,i+1));
			}
		}
		return fin;
	}
}


