package quiz_adv;

public class quiz_adv {

	
	public static void main(String[] args) {
		
		//this object is called an "instance" of the MultipleChoiceQuestion class
		//question1 is a variable, but it doesnt hold the object. It holds a reference to the object. 
		
		
		
		MultipleChoiceQuestion question1 = new MultipleChoiceQuestion("What was the year of the French Revolution?", "1821","1654", "1789", "What is the French Revolution", "1902", "C");
		
		question1.check();
//		question1.showResults();

		MultipleChoiceQuestion question2 = new MultipleChoiceQuestion("When was the first airplane invented?", "1871", "1952", "1903", "1896", "1924", "C");
		
		question2.check();
//		question2.showResults();
		
		MultipleChoiceQuestion question3 = new MultipleChoiceQuestion("Which country is the smallest?", "Greece", "San Marino", "Iran", "Tuvalu", "Chile", "D");
		
		question3.check();
//		question3.showResults();
		
		TrueFalseQuestion question4 = new TrueFalseQuestion("Is Malta an island?", "Y");
		question4.check();
//		question4.showResults();
		
		
		
		TrueFalseQuestion question5 = new TrueFalseQuestion("The capital of Japan is Hong Kong", "N");
		question5.check();
		question5.showResults();
	}
	}
