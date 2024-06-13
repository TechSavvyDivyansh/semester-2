import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

class Form extends JFrame implements ActionListener
{

	
	 JLabel name,gen,interest,place,details;
	 
	 JTextField tname;
 	 JRadioButton male, female;
	 JComboBox cplace;
	 JButton submit,exit;
	  JTextArea tadd;
	  JCheckBox music,swim;
ButtonGroup gengp;


	public Form()
	{

		setTitle("Form");
		setBounds(200, 80, 800, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setResizable(false);

		
		
		setLayout(null);

		name = new JLabel("Name");
		name.setFont(new Font("Arial", Font.PLAIN, 15));
		name.setSize(100, 20);
		name.setLocation(100, 100);
		add(name);

		tname = new JTextField();
		tname.setFont(new Font("Arial", Font.PLAIN, 15));
		tname.setSize(190, 20);
		tname.setLocation(200, 100);
		add(tname);

		gen = new JLabel("Gender");
		gen.setFont(new Font("Arial", Font.PLAIN, 15));
		gen.setSize(100, 20);
		gen.setLocation(100, 150);
		add(gen);

		  male = new JRadioButton("Male");
     		  male.setFont(new Font("Arial", Font.PLAIN, 15));
       		 male.setSelected(true);
		male.setSize(80, 20);
		male.setLocation(200, 150);
		add(male);

		female = new JRadioButton("Female");
     		  female.setFont(new Font("Arial", Font.PLAIN, 15));
       		 
		female.setSize(80, 20);
		female.setLocation(350, 150);
		add(female);

		 gengp = new ButtonGroup();
       		 gengp.add(male);
       		 gengp.add(female);

		interest = new JLabel("Interest");
		interest.setFont(new Font("Arial", Font.PLAIN, 15));
		interest.setSize(100, 20);
		interest.setLocation(100, 200);
		add(interest);
		
		music = new JCheckBox("Music");
       		 music.setFont(new Font("Arial", Font.PLAIN, 15));
       		 music.setSize(100, 20);
       		 music.setLocation(200, 200);
       		 add(music);

		swim = new JCheckBox("Swim");
       		 swim.setFont(new Font("Arial", Font.PLAIN, 15));
       		 swim.setSize(100, 20);
       		 swim.setLocation(350, 200);
       		 add(swim);


		place = new JLabel("Fav Place");
		place.setFont(new Font("Arial", Font.PLAIN, 15));
		place.setSize(100, 20);
		place.setLocation(100, 250);
		add(place);


		 cplace = new JComboBox();
     		    cplace.setFont(new Font("Arial", Font.PLAIN, 15));
       		 cplace.setSize(150, 20);
       			 cplace.setLocation(200, 250);
      		add( cplace);
		

		cplace.addItem("India");
   		cplace.addItem("USA");
        	cplace.addItem("Bhutan");
        	cplace.addItem("Srilanka");
        	cplace.addItem("Maldives");
        	
		details = new JLabel("Details");
		details.setFont(new Font("Arial", Font.PLAIN, 15));
		details.setSize(100, 20);
		details.setLocation(100, 300);
		add(details);


		tadd = new JTextArea();
       		tadd.setFont(new Font("Arial", Font.PLAIN, 15));
        	tadd.setSize(200, 200);
       		 tadd.setLocation(200, 300);
        	tadd.setLineWrap(true);
        	tadd.setEditable(false);
        	add(tadd);


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
				String data = "Name : " + tname.getText() + "\n" + 
				" Gender : " +(male.isSelected()==true?"Male":"Female") + "\n" +
				" Interests : "+ (music.isSelected()==true?"Music ":"")+
				(swim.isSelected()==true?"Swimming":"") +"\n" +
				" Favorite Place : " + cplace.getItemAt(cplace.getSelectedIndex());  
				
				tadd.setVisible(true);
				tadd.setText(data);
				tadd.setEditable(false);
				}
	
		else if(e.getSource() == exit) 
			{
			tadd.setText("");
			}
}	
			
	

}


class Forms {

	public static void main(String[] args) throws Exception
	{
		Form f = new Form();
	}
}
