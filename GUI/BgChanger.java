import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class Bg extends JFrame implements ActionListener
{
    
   JRadioButton red, black;
	 JButton submit,exit;
    ButtonGroup gengp;


	public Bg()
	{

		setTitle("Form");
		setBounds(200, 80, 800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		
		
		setLayout(null);

		

		red = new JRadioButton("red");
     	red.setFont(new Font("Arial", Font.PLAIN, 15));
      red.setSelected(true);
		red.setSize(80, 20);
		red.setLocation(200, 150);
		add(red);

		black = new JRadioButton("black");
     		  black.setFont(new Font("Arial", Font.PLAIN, 15));
       		 
		black.setSize(80, 20);
		black.setLocation(350, 150);
		add(black);

		 gengp = new ButtonGroup();
       		 gengp.add(red);
       		 gengp.add(black);

		

		submit = new JButton("Submit");
		submit.setFont(new Font("Arial", Font.PLAIN, 15));
		submit.setSize(100, 20);
		submit.setLocation(150, 550);
		submit.addActionListener(this);
		add(submit);

		exit = new JButton("Reset");
		exit.setFont(new Font("Arial", Font.PLAIN, 15));
		exit.setSize(100, 20);
		exit.setLocation(270, 550);
		exit.addActionListener(this);
		add(exit);

		
		

		setVisible(true);
	}

	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource() == submit) 
				{
				    if(red.isSelected()==true)
                {
                    getContentPane().setBackground(Color.red);
                    red.setBackground(Color.red);
                    black.setBackground(Color.red);
                }
                if(black.isSelected()==true)
                {
                    getContentPane().setBackground(Color.black);
                    red.setBackground(Color.black);
                    black.setBackground(Color.black);
                }
                
				}
      if(e.getSource() == exit)
      {
          getContentPane().setBackground(Color.white);
          red.setBackground(Color.white);
          black.setBackground(Color.white);
;
      } 
	
}	
			
	

}


class BgChanger {

	public static void main(String[] args) throws Exception
	{
		Bg h=new Bg();
	}
}
