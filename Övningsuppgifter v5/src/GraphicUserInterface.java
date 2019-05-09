import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

//Skapa ett enkelt GUI. Övningsuppgift 5.1
public class GraphicUserInterface {

	public static void main(String[] args) {
		//Fönstret
		JFrame window = new JFrame();
		window.setTitle("Greeting");
		window.setSize(800, 450);
		window.setLocation(500, 300);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Inmatningspanelen
		JPanel namePanel = new JPanel();
		namePanel.setPreferredSize(new Dimension(800, 150));
		final JTextField input = new JTextField("Name");
		input.setPreferredSize(new Dimension (200, 50));
		namePanel.add(input, BorderLayout.CENTER);
		
		//Svarspanelen
		JPanel responsePanel = new JPanel();
		responsePanel.setPreferredSize(new Dimension(800, 150));
		final JLabel responseLabel = new JLabel();
		responseLabel.setPreferredSize(new Dimension(300, 50));
		responsePanel.add(responseLabel, BorderLayout.CENTER);
		
		//Knapppanelen
		JPanel buttonPanel = new JPanel();
		buttonPanel.setPreferredSize(new Dimension(800, 150));
		JButton greetButton = new JButton("Greet");
		greetButton.setPreferredSize(new Dimension(180, 70));
		buttonPanel.add(greetButton, BorderLayout.CENTER);
		
		//Krånglig metod för att få knappen stt fungera
		greetButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent event) {
				responseLabel.setText("Hello "+ input.getText());
			}
		
		});
		
		
		//LÄgger panelenrna i fönstret 
		window.add(namePanel, BorderLayout.NORTH);
		window.add(responsePanel, BorderLayout.CENTER);
		window.add(buttonPanel, BorderLayout.SOUTH);
		//Visar fönstret. Detta görs SIST!
		window.setVisible(true);

	}

}
