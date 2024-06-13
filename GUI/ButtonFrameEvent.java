import javax.swing.*;
import javax.swing.JFrame;
import java.awt.event.*;


public class ButtonFrameEvent extends JFrame implements ActionListener 
{
			JTextField text;
			ButtonFrameEvent()
			{
				JButton button = new JButton("Click Me!");
					button.setBounds(130,100,100, 40);

				text = new JTextField(20);
				text.setBounds(130,150,100,40);
				button.addActionListener(this);
					add(button);
					add(text);
					setSize(800, 800);
				setLayout(null);
				text.setVisible(false);
					setVisible(true);
				
				
			}
			public void actionPerformed(ActionEvent e)
			{  
				text.setVisible(true);
					text.setText("Welcome...");  
				
			}  


			public static void main(String[] args) 
			{
					ButtonFrameEvent b1=new ButtonFrameEvent();
				
			}
}



