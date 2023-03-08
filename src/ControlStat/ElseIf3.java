package ControlStat;

public class ElseIf3 {

	public static void main(String[] args) {
		int age = 29, weight = 25;
		if (age >= 21 ) {
			System.out.println("Candidate is able to donates the blood.");
			if (weight>= 45) { System.out.println("candidate should  donate blood");
			}
			else {System.out.println(" But weight is not in  requirement so, Candidate could't donate blood");
			} 
		}else { System.out.println("Candidate could't donate blood ");
			
			}
		}
	}


