package quiz_adv;

//import javax.swing.JOptionPane;
//import java.awt.*;
import javax.swing.*;

public class TrueFalseQuestion extends Question{

	
	String ask() {
		while(true) {
			question.setVisible(true);
			return question.answer;
//			String answer = JOptionPane.showInputDialog(null, question);
//			answer = answer.toUpperCase();
//			boolean valid = (answer.equals("TRUE")|| answer.equals("FALSE"));
//			if(valid){
//				return answer;	
//		}
//			else {
//				JOptionPane.showMessageDialog(null, "Invalid Answer. Please enter true or false");
//		}		
		}
	}
	
	void addButton(JPanel buttons, String label) {
		JButton button = new JButton(label);
		button.addActionListener(question);
		buttons.add(button);
		}
	
	TrueFalseQuestion (String question, String answer) {
//		super.question = "True or False:  " + question;
		super(question);
//		this.question = new QuestionDialog();
//		this.question.setLayout(new GridLayout(0,1));
//		this.question.add(new JLabel("   " + question + "   ", JLabel.CENTER));
		
		JPanel buttons = new JPanel();
		
		addButton(buttons, "TRUE");
		addButton(buttons, "FALSE");
		
		this.question.add(buttons);
		
		initQuestionDialog();

		
//		this.question.setModal(true);
//		this.question.pack();
		
//		this.question.setLocationRelativeTo(null);
		
		
		answer = answer.toUpperCase();
		if (answer.equals("T") || answer.equals("Y") || answer.equals("YES")) {
			correctAnswer = "TRUE";
		
		}
		
		if (answer.equals("F") || answer.equals("N") || answer.equals("NO")) {
			correctAnswer = "FALSE";
		
		}
	}
}
