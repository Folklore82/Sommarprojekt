import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator {

	public static void main(String[] args) {
		//Hela fönstret
		JFrame window = new JFrame();
		window.setTitle("Calculator");
		window.setSize(new Dimension(600, 300));
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		
		//Inputpanelen där du kan mata in siffror
		JPanel inputPanel = new JPanel();
		inputPanel.setPreferredSize(new Dimension (600, 100));
		final JTextField input1 = new JTextField("0");
		final JTextField input2 = new JTextField("0");
		input1.setPreferredSize(new Dimension(150, 40));
		input2.setPreferredSize(new Dimension (150,40));
		inputPanel.add(input1, BorderLayout.EAST);
		inputPanel.add(input2, BorderLayout.WEST);
		
		//Output, här kommer svaret
		JPanel outputPanel = new JPanel();
		outputPanel.setPreferredSize(new Dimension(400, 150));
		final JLabel output = new JLabel("Result: ");
		output.setPreferredSize(new Dimension (300, 50));
		outputPanel.add(output, BorderLayout.EAST);
		
		// Panelen med knapparna
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(600,50));
		JButton multiplyButton = new JButton("Multiply");
		multiplyButton.setPreferredSize(new Dimension(130, 40));
		JButton addButton = new JButton("Add");
		addButton.setPreferredSize(new Dimension(130, 40));
		JButton cancelButton = new JButton("Cancel");
		cancelButton.setPreferredSize(new Dimension(130, 40));
		buttonPanel.add(multiplyButton, BorderLayout.EAST);
		buttonPanel.add(addButton, BorderLayout.CENTER);
		buttonPanel.add(cancelButton, BorderLayout.WEST);
		
		//Lägger panelerna i fönstret
		window.add(inputPanel, BorderLayout.NORTH);
		window.add(outputPanel, BorderLayout.CENTER);
		window.add(buttonPanel, BorderLayout.SOUTH);
		
		
		
		/*Det här vetefan hur det funkar. det verkar inte kursledaren heller veta det ska i alla fall läggas
		in ett antal bibliotek och nedanstående metoder ska användas*/
		multiplyButton.addActionListener((new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				output.setText("Result:  " + multiply(Integer.valueOf((input1.getText())) , Integer.valueOf(input2.getText())));
			}
		}));
		
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent event) {
				output.setText("Result:  " + add(Integer.valueOf(input1.getText()), Integer.valueOf(input2.getText())));
			}
		});
		
		cancelButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}	
		});
		
		//Gör fönstret synligt. Detta görs i slutet för att programmet inte ska visas fören det är byggt.
		window.setVisible(true);

	}
	
	public static long multiply(int a, int b) {
		return a*b;
	}
	
	public static long add(int a, int b) {
		return a+b;
	}

}
