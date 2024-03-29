# **Introduction**
Greetings! My name is Andres Flores. I'm an up-and-coming computer programmer and amateur musician. 

This page is here to serve as a sort of library for personal projects involving Computer Science, Music Production, and other related endeavors I have worked on throughout my personal and academic career.

Additionally, this page is ordered by classes and the year(s) in which I took them in order to allow for easy access to specific projects and files.

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
- Learned how to properly use recursion to create useful output such as a program that returns numbers in the 
Fibonacci Sequence (A series of numbers in which each number ( Fibonacci number ) is the sum of the two preceding numbers. Usually Beginning with 0,1,1)
	
	
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
	</details?	
</p>
</details>

## **Computer Programming II 2021-2022** 
<details><summary>CLICK HERE</summary>
<p>
  
Throughout Computer Programming II, I contributed to or participated in the following:
- Raspberry PI desktop and workstation setup.
- Learned how to properly utilize Linux interfaces and command prompt interfaces.
- Achieving a Java Certification MTA: Introduction to Programming Using Java [Found Here](https://www.credly.com/badges/19f80676-15d3-48bb-8a3f-3b7ef92afd1a/public_url ).
- Learning the basics of github page creation.
- Sucessfuly set up and created a Java server-client connection project.
	
	<details><summary>More Detail</summary>
	<p>
		
	![JavaClientServer](https://user-images.githubusercontent.com/104638953/208008827-f06edbcb-ed6c-4600-a3b2-f9ab0fb5b3de.jpg)
		
	>  We utilized the raspberry pi workstations I mentioned earlier to set up a server that allowed the 3 machines we had set up to communicate with
	   each other in order to collaborate on programming projects and the like. In turn, we also learned the purpose and benefit of having utilizing a server
	   (Such as the security benefits and why it's beneficial for computers to not directly connect to one another but simply send their data/signals to the 	    servers which then relay it back to the other machines.)
		
	>  Furthermore, in order to set up said server, we had to get familiar with utilizing the command line interface and managing/utilizing data such as our
	   IP adress and wireless wifi connections.
		
	</p>
	</details>
		
</p>
</details>

## **Practicum of IT 2022-2023** 
<details><summary>CLICK HERE</summary>
<p>
  
Throughout Practicum of IT, I contributed to or participated in the following:
- Learned basic Python programming
- Achieving a Python Certification ([PCEP-30-02] PCEP – Certified Entry-Level Python Programmer) [Found Here](https://www.credly.com/badges/6f038b9c-e571-4d2e-8d79-51f3505fb7ee/public_url)
- Creation of a Discord bot capable of returning a user's join date, uploading images, providing comedic commentary, and other useful functions.
 	<details><summary>Example of code used</summary>
	<p>
		
	```Python
		
	#Main 
		
	import discord

	TOKEN = 'Discord Bot Token Goes Here)

	client = discord.Client(intents=discord.Intents.all())


	@client.event
	async def on_ready():
    	print(f'{client.user} has connected to Discord!')


	client.run(TOKEN)
			
	```
	</p>
	</details>
	
	<details><summary>More Examples (Lengthier)</summary>
	<p>
		
	```Python
	#Commands			
	import discord
	import random		
	import datetime as dt
	from dotenv import load_dotenv
	import youtube_dl
	from discord.ext import commands, tasks
	import os
		
	TOKEN = "Discord Bot Token Went Here"

	intents = discord.Intents.all()
	client = discord.Client(intents=intents)
	os.chdir(r"C:\Users\'name of user goes here'\Desktop\BotImages")
	discord_bot = commands.Bot(command_prefix='!', intents=intents)


	@discord_bot.command(name='morningquote')
	async def msg(ctx):
 	   quotes = [
	        "It's a new day",
	        (
   	         "Be positive"
 	       ),
	    ]
	    response = random.choice(quotes)
	    await ctx.send(response)


	@discord_bot.command(name='glissy')
	async def msg(ctx):
	    quotes = [
	        "This moment\'s glissy word of the day is: Capybara",
	        (
	            "This moment\'s glissy word of the day is: DaBaby"
 	       ),
 	   ]
	    response = random.choice(quotes)
  	  await ctx.send(response)

	@discord_bot.command(name='funnypic')
	async def send_img(ctx):
	    pics = [
	        'wildcat.png', 'dog.png', 'makeup-eyebrows16.jpg',
	        (
  	          'el grande.png'
  	      ),
  	  ]
 	   result = random.choice(pics)
 	   await ctx.send("le funny", file=discord.File(result))


	@discord_bot.command(name='lacreatura')
	async def send_img(ctx):
 	   await ctx.send("her", file=discord.File('neko.jpg'))
	import datetime as dt

	@discord_bot.command(name='arrival')
	async def joined(ctx):

	    dia = dt.datetime.now()
	    stay= (ctx.author.joined_at)
	    duration = str(dia - stay.replace(tzinfo=None))

    	await ctx.send("Joined "+duration+" hours ago.")
	discord_bot.run(TOKEN)	
	```
		
	</p>
	</details>
Learned and familiarized myself with OpenCV and its cv2 functions.
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
- COMING SOON!
##### Piano Covers
- COMING SOON!
##### Original Compositions
- COMING SOON!
	
</p>
</details>
  
</p>
</details>

