package quiz_adv;

import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public class MultipleChoiceQuestion extends Question{

	

	
	MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer ){
		super(query);
//		question = query + "\n";
//		question += "A. " + a + "\n";
//		question += "B. " + b + "\n";
//		question += "C. " + c + "\n";
//		question += "D. " + d + "\n";
//		question += "E. " + e + "\n";
		addChoice("A", a);
		addChoice("B", b);
		addChoice("C", c);
		addChoice("D", d);
		addChoice("E", e);
		initQuestionDialog();

		correctAnswer = answer.toUpperCase();
	}
	
	void addChoice(String name, String label) {
		JPanel choice = new JPanel(new BorderLayout());
		JButton button = new JButton(name);
		button.addActionListener(question);
		choice.add(button, BorderLayout.WEST);
		choice.add(new JLabel(label + "     ", JLabel.LEFT), BorderLayout.CENTER);
		
		question.add(choice);
	}
	
	String ask() {
		while(true) {
			
			question.setVisible(true);
			return question.answer;
//			String answer = JOptionPane.showInputDialog(null, question);
//			answer = answer.toUpperCase();
//			boolean valid = (answer.equals("A")|| answer.equals("B") || answer.equals("C") || answer.equals("D") || answer.equals("E"));
//			if(valid){
//				return answer;	
//		}
//			else {
//				JOptionPane.showMessageDialog(null, "Invalid Answer. Please enter A, B, C, D or E.");
//		}		
		}
	}
	

	void check() {
		String answer = ask();
		if (answer.equals(correctAnswer)) {
				JOptionPane.showMessageDialog(null,"Nice!");
				nCorrect ++;
		}
		else{
				JOptionPane.showMessageDialog(null,"That's incorrect.");
			}
		nQuestions ++;
		
	}
	
	void showResults() {
		JOptionPane.showMessageDialog(null,"You got " + nCorrect + " correct out of "+ nQuestions + " questions");
	}
}
