package quiz_adv;

import javax.swing.JOptionPane;
import java.awt.*;
import javax.swing.*;

public abstract class Question {

	/* 
	 * these variables are static, so are class variables
	 * There is only one copy of them (so every object does NOT its own variables)
	*/
	static int nQuestions=0; 
	static int nCorrect=0;
	
	
	
	/*These variables are not static. They are instance variables, so each object has their own copy of these variables. 
	 */
	
	QuestionDialog question;
	String correctAnswer;
	
	abstract String ask();
	
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
	
	void initQuestionDialog() {
		this.question.setModal(true);
		this.question.pack();
		this.question.setLocationRelativeTo(null);
	}
	
	void showResults() {
		JOptionPane.showMessageDialog(null,"You got " + nCorrect + " correct out of "+ nQuestions + " questions");
	}
	
	Question(String question) {
		this.question = new QuestionDialog();
		this.question.setLayout(new GridLayout(0,1));
		this.question.add(new JLabel(" "+question+"   ",JLabel.CENTER));
	
}
}
