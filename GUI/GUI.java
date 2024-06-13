import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


class Reg extends JFrame implements ActionListener
{
    JLabel l1;
    JTextField t1;
    JRadioButton male,female;
    JComboBox<String> hobby;
    JCheckBox agree;
    JButton submit,reset;
    JTextArea ar;
    ButtonGroup grp;

    Reg() 
    {
        l1=new JLabel("Name:");
        t1=new JTextField();
        male=new JRadioButton("Male");
        female=new JRadioButton("Female");
        hobby=new JComboBox<String>();
        agree=new JCheckBox("I agree to terms and conditions");
        submit=new JButton("SUBMIT");
        reset=new JButton("RESET");
        ar=new JTextArea();
        grp=new ButtonGroup();



        l1.setBounds(60, 50, 70, 20);  //
        l1.setForeground(Color.white);

        t1.setBounds(135, 50, 390, 20); //
        t1.setBackground(Color.gray);
        t1.setForeground(Color.black);
        
        t1.setFont(new Font("Arial", Font.BOLD,12));
        male.setBounds(60,90,90,20);//
        male.setBackground(Color.black);
        male.setForeground(Color.white);
        male.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        female.setBounds(200,90,90,20);//
        female.setBackground(Color.black);
        female.setForeground(Color.white);
        female.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        hobby.setBounds(60, 120, 200, 30);//
        hobby.setBackground(Color.gray);
        hobby.setForeground(Color.black);
        hobby.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        agree.setBounds(300, 150, 290, 20);//
        agree.setBackground(Color.black);
        agree.setForeground(Color.white);
        agree.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        submit.setBounds(300,190,90,20);//
        submit.setBackground(Color.red);
        submit.setForeground(Color.black);
        submit.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));

        reset.setBounds(400,190,90,20);//
        reset.setBackground(Color.red);
        reset.setForeground(Color.black);
        reset.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        
        ar.setBounds(60,230,700,300);//
        ar.setBackground(Color.gray);
        ar.setForeground(Color.black);
        ar.setFont(new Font("Arial",Font.BOLD,30));
        ar.setVisible(false);

        
   
        

        
        add(l1);
        add(t1);
        grp.add(male);
        grp.add(female);
        add(male);
        add(female);
        hobby.addItem("Coding");
        hobby.addItem("Car Driving");
        hobby.addItem("Listening music");
        hobby.addItem("Dancing");
        hobby.addItem("Cycling");
        add(hobby);
        add(agree);
        add(submit);
        add(reset);
        add(ar);

       
        submit.addActionListener(this); 
        reset.addActionListener(this);




        setLayout(null);
        setBounds(150, 100, 800, 600);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setBackground(Color.black);
        setTitle("GUI registration form");

        
    }
    public void actionPerformed(ActionEvent e)
    {
         if(e.getSource()==submit)
         {
            ar.setVisible(true);
            ar.setText("Name:"+t1.getText());
            if(female.isSelected()==true)
            {
                ar.setText(ar.getText()+"\nGender:Female");
            }
            else if(male.isSelected()==true)
            {
                ar.setText(ar.getText()+"\nGender:Male");
            }
            else
            {
                ar.setText(ar.getText()+"\nGender:not entered");
            }
            ar.setText(ar.getText()+"\nHobby:"+hobby.getItemAt(hobby.getSelectedIndex())+"\nTerms and Condition:"+(agree.isSelected()==true?"Agreed":"Not agreed"));



         }
         if(e.getSource()==reset)
         {
               ar.setText("");
               ar.setVisible(false);
               t1.setText("");
               agree.setSelected(false);
               male.setSelected(false);
               hobby.setSelectedIndex(0);
         }
    }
}
public class GUI
{
   public static void main(String[] args) throws Exception{
       Reg rg=new Reg();
   } 
}
