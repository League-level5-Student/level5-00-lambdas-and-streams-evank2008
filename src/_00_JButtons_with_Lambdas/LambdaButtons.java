package _00_JButtons_with_Lambdas;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class LambdaButtons{
	private JFrame window = new JFrame();
	private JButton addNumbers = new JButton("ADD 2 Numbers");
	private JButton randNumber = new JButton("RANDOM NUMBER");
	private JButton tellAJoke = new JButton("TELL A JOKE");
	Random ran = new Random();
	
	public LambdaButtons() {
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLayout(new FlowLayout());
		addNumbers.addActionListener((e)->{
			int r=ran.nextInt(21);
			int t=ran.nextInt(21);
			JOptionPane.showMessageDialog(null, r+" + "+t+" = "+(int)(r+t));
		});
		randNumber.addActionListener((e)->{
			int r=ran.nextInt();
			JOptionPane.showMessageDialog(null, r);

		});
		tellAJoke.addActionListener((e)->{
			JOptionPane.showMessageDialog(null, "Bazinga");
		});
		window.add(addNumbers);
		window.add(randNumber);
		window.add(tellAJoke);
		
		//1. Call the addActionListener methods for each button. Use lambdas
		//   to define to functionality of the buttons.
		
		window.setVisible(true);
		window.pack();
	}
	
	public static void main(String[] args) {
		new LambdaButtons();
	}

	
	
}
