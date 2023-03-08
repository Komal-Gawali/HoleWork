package ControlStat;
public class ElseIfProg{
	public static void main(String[] args) {
		int ObtainedMarks = 55 ;
					
				if(ObtainedMarks>=40	&&	ObtainedMarks<60)	
				{	
					System.out.println("Student	is	pass	in	second	class");	
				}	
				else	if(ObtainedMarks>=60	&&	ObtainedMarks<75)	
				{	
					System.out.println("Student	is	pass	in	first	class");	
				}	
				else	if(ObtainedMarks>=75	&&	ObtainedMarks<90)	
				{	
					System.out.println("Student	is	pass	in	Distinction");	
				}	
				else	if(ObtainedMarks>=90	&&	ObtainedMarks<=100)	
				{	
					System.out.println("Student	is	pass	in	Merit");	
				}	
				else	if(ObtainedMarks>100)	
				{	
					System.out.println("Invalid	input");	
				}	
				else	
				{	
					System.out.println("Student	is	fail");	
			
	                          	}	
               }
		
   	}
