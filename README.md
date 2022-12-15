# **Introduction**
Hey there! My name is Andres Flores I'm an up-and-coming computer programmer and amateur musician. 

This page is here to serve as a sort of library for personal projects involving Computer Science, Music Production, and other related endeavors I have worked on throughout my personal life and High School career.

Additionally, this page is ordered by classes and the school year in which I took them in order to allow for easy access to specific projects and files.

## **Computer Programming 2019-2020**
<details><summary>CLICK HERE</summary>
<p>
  
- Learned basic Java programming, with a focus on variable types, loops, and lists.
- Solved the (At the time) challenging problem: "VowelCounter".
	<details><summary>Problem</summary>
	<p>
		
	> Change all of the vowels in the String to numbers.  Make sure the numbers range 
		
	> from 0-9 and that you reset the number to 0 when you get to a count > 9.  
	
	> Sample Data:
		
	> abcdef
		
	> hhhhhhh
		
	> aaaaaaa
		
	> catpigdatrathogbogfrogmoosegeese
		
	> hhhhhhh1234356HHHHDH
		
	> AEIOUaeiou87878alkjdaslwlejrlajflawjkflwj
		
	> 
		
	> x
		
	> e
		
	</p>
	</details>
	
	<details><summary>Solution</summary>
	<p>	
		
 	```Java
		
  	public static String getNumberString( String s){
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
		
  	```
		
	</p>
	</details>
	
</p>
</details>

## **AP Computer Science 2020-2021** 
<details><summary>CLICK HERE</summary>
<p>
  
- Deepened my understanding of Java Programming, focusing on Arrays, ArrayLists, and Recursion. 
- Learned how to pprperly use recursion to create useful output (Such as a program that returns numbers in the Fibonacci Sequence)
	
	<details><summary>Example of Fibonacci Program</summary>
	<p>
		
	```Java
	public static int FibonacciSequence(int current, int previous, int length) //calculates numbers in the fibonacci sequence.
	{
		if(length>0) 
		{
			int temp=current+previous;
			previous=current;
			current=temp;
			return(FibonacciSequence(current, previous, length-1));
		}
		
		return current;
	}
		
	public static int FibonacciNumber(int position) //essentially just serves to make the original input 
						 	 //look pretty (so it's only 1 number you have to input istead of 3)
	{
		if(position==1) 
		{
			return 0;
		}
		
		if(position==2)
		{
			return 1;
		}
		
		return FibonacciSequence(0,1,position-1);
	}
		
	public static void main(String[] args) 
	{
		int count=10; //change it to whatver position you want in the fibonnaci sequence.
		System.out.println(FibonacciNumber(count));
	}
		
	```
		
	</p>
		
</p>
</details>

## **Computer Programming II 2021-2022** 
<details><summary>CLICK HERE</summary>
<p>
  
Throughout Computer Programming II, I contributed to or participated in the following:
- Raspberry PI desktop  and workstation setup.
- Learned how to properly utilize Linux interfaces and command prompt interfaces.
- Achieving a Java Certification MTA: Introduction to Programming Using Java [Found Here](https://www.credly.com/badges/19f80676-15d3-48bb-8a3f-3b7ef92afd1a/public_url ).
- Learning the basics of github page creation.
  
</p>
</details>

## **Practicum of IT 2022-2023** 
<details><summary>CLICK HERE</summary>
<p>
  
Throughout Practicum of IT, I contributed to or participated in the following:
- Creation of a Discord bot capable of returning a user's join date, uploading images, providing comedic commentary, and other useful functions.
- Learned basic Python programming
- Achieving a Python Certification ([PCEP-30-02] PCEP – Certified Entry-Level Python Programmer) [Found Here](https://www.credly.com/badges/6f038b9c-e571-4d2e-8d79-51f3505fb7ee/public_url)
  
</p>
</details>

## **Personal Projects, Achievements, and Contributions 2004-Present**
<details><summary>CLICK HERE</summary>
<p>
  
Be it through my personal hobbies, friends, or other opportunities given to me, throughout my life I have contributed to or participated in the following:
- Beta tester & Play tester for the Undertale Fangame "[TeamSwitched!Underswap](https://gamejolt.com/games/tsunderswap/160094)" (Credited as Dr. Magnum)
- Created a YouTube [channel](https://www.youtube.com/@Dr.Magnum) where I upload covers and original compositions.
- Regional Competitor for UIL Computer Science (2021-2022)
- State Competitor for BPA Java Programming (2021-2022)
- State Medalist for the UIL Latino History Essay Competition.
  
#### **Examples of some of my music production:**
<details><summary>Click Here!</summary>
<p>


##### Chiptune Covers
- [Magnet Man's Stage (MMII) Cover](https://youtu.be/-tfT5oIRvnM)
##### Techno Covers
- (W.I.P)
##### Piano Covers
- (W.I.P)
##### Original Compositions
- (W.I.P)
	
</p>
</details>
  
</p>
</details>

