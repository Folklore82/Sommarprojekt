import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GraphicUserInterface2 {

	public static void main(String[] args) {
		//Fönstret
		JFrame window = new JFrame();
		window.setSize(new Dimension(800, 450));
		window.setTitle("Check even number");
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Inmatningsrutan
		JPanel inPanel = new JPanel();
		inPanel.setPreferredSize(new Dimension (400, 150));
		final JTextField input = new JTextField("0");
		input.setPreferredSize(new Dimension(150, 40));
		inPanel.add(input, BorderLayout.CENTER);
		
		//Svarspanelen
		JPanel answerPanel = new JPanel();
		answerPanel.setPreferredSize(new Dimension(400, 150));
		final JLabel answer = new JLabel("This is an even number");
		answer.setPreferredSize(new Dimension (200, 40));
		answerPanel.add(answer, BorderLayout.CENTER);
		
		//Knapppanelen
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension (800, 300));
		final JButton check = new JButton("Check");
		check.setPreferredSize(new Dimension(280, 200));
		final JButton quit = new JButton("Quit");
		quit.setPreferredSize(new Dimension (280, 200));
		buttonPanel.add(check, BorderLayout.WEST);
		buttonPanel.add(quit, BorderLayout.EAST);
		
		//Och här kommer de knepiga knapparna, en för att köra funktionen nedan och en för att stänga av
		check.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				answer.setText("This is an even number:  "+ checkNumber(Integer.valueOf(input.getText())));
			}
		});
		//Stänga av
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		window.add(inPanel, BorderLayout.WEST);
		window.add(answerPanel, BorderLayout.EAST);
		window.add(buttonPanel, BorderLayout.SOUTH);
		window.setVisible(true);

	}
	
	public static boolean checkNumber(int x) {
		if(x % 2 == 0) {
			return true;
		}
		else {
			return false;
		}
	}

}
