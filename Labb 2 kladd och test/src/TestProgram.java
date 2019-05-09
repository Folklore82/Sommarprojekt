import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TestProgram {

	public static void main(String[] args) {
		
		//Fönstret
		JFrame window = new JFrame();
		window.setSize(600, 300);
		window.setResizable(false);
		window.setTitle("Cache memory - 2^n");
		window.setLocationRelativeTo(null);
		window.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
		
		//Inmatningspanelen
		JPanel inputPanel = new JPanel();
		inputPanel.setPreferredSize(new Dimension(600, 100));
		final JTextField inputField= new JTextField("0");
		inputField.setPreferredSize(new Dimension(100, 40));
		inputPanel.add(inputField, BorderLayout.CENTER);
		
		//Resultatpanelen
		JPanel resultPanel = new JPanel();
		resultPanel.setPreferredSize(new Dimension (600, 100));
		final JLabel resultField = new JLabel("Result");
		resultField.setPreferredSize(new Dimension(200, 40));
		resultPanel.add(resultField, BorderLayout.CENTER);
		
		//Knappanelen
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(600, 100));
		final JButton compute = new JButton("Compute 2^n");
		final JButton clear = new JButton("Clear memory");
		final JButton quit = new JButton("Quit");
		compute.setPreferredSize(new Dimension(150, 50));
		clear.setPreferredSize(new Dimension (150, 50));
		quit.setPreferredSize(new Dimension(150, 50));
		buttonPanel.add(compute,BorderLayout.WEST);
		buttonPanel.add(clear, BorderLayout.CENTER);
		buttonPanel.add(quit, BorderLayout.EAST);
		
		//Ger mig en länk till TestMOdel via instansen folklore
		TestModel folklore = new TestModel();
		
		//Gör beräkningen och kollar/lagrar i minnet
		compute.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				try {
					resultField.setText("Result: " + folklore.compute2Power(Integer.valueOf(inputField.getText())));
				}
				catch(IllegalArgumentException e){
					resultField.setText("Input a positive number Please!");
				}
			}
		});
		
		//Tömmer minnet via clearknappen
		clear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				folklore.clearMemory();
			}
		});
		
		//Stänger programmet vid tryck på "Quit".
		quit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				System.exit(0);
			}
		});
		
		
		
		//Lägger panelerna i fönstret och gör fönstret synligt
		window.add(buttonPanel, BorderLayout.SOUTH);
		window.add(resultPanel, BorderLayout.CENTER);
		window.add(inputPanel, BorderLayout.NORTH);
		window.setVisible(true);
		
		
		
		
			
	}
	
}
