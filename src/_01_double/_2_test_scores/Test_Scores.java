package _01_double._2_test_scores;

import javax.swing.JOptionPane;

public class Test_Scores {
	public static void main(String[]args) {
 		String result = JOptionPane.showInputDialog("What is your test score?");
 		double score = Double.parseDouble(result);
 		if(score>90) {
 			JOptionPane.showMessageDialog(null, "Excellent!");
 		}
 		else if(score>80) {
 			JOptionPane.showMessageDialog(null, "Great Job!");
 		}
 		else if(score>70) {
 			JOptionPane.showMessageDialog(null, "Barely Passed!");
 		}
 		else if(score>60) {
 			JOptionPane.showMessageDialog(null, "Try Harder Next Time!");
 		}
 		else {
 			JOptionPane.showMessageDialog(null, "FAILED!");
 		}
	}
}
