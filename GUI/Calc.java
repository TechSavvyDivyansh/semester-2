import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.JFrame;

class Log extends JFrame implements ActionListener
{
    JTextField text;
    JLabel label;
    JTextField text2;
    JLabel label2;
    JTextArea ar;
    JButton Add;
    JButton Subtract;
     int c=0,d=0,add=0;
    Log()
    {
         text=new JTextField();
         text.setBounds(180,90,200,20);
         label=new JLabel("Number 1:");
         label.setBounds(80,90,80,20);
         label.setForeground(Color.white);
         add(label);
         add(text);
         
         text2=new JTextField();
         text2.setBounds(180,120,200,20);
         label2=new JLabel("Number 2:");
         label2.setBounds(80,120,80,20);
         label2.setForeground(Color.white);
         add(label2);
         add(text2);

        Add=new JButton("Add");
        Add.setBounds(80,170,80,20);
        add(Add);
        Add.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Add.setBackground(Color.gray);
        Add.setForeground(Color.black);
        Add.addActionListener(this);
        
        Subtract=new JButton("Subtract");
        Subtract.setBounds(170,170,120,20);
        add(Subtract);
        Subtract.setBackground(Color.gray);
        Subtract.setForeground(Color.black);
        Subtract.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
        Subtract.addActionListener(this);

        ar=new JTextArea();
        ar.setBounds(80,250,400,200);
        add(ar);
        ar.setVisible(false);

         setTitle("Calculator");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(700,600);
         setLayout(null);
         setVisible(true);
         setResizable(false);
         getContentPane().setBackground(Color.black);
    }

    public void actionPerformed(ActionEvent e)
    { 
           if(e.getSource()==Add)
           {
                
                c=Integer.parseInt(text.getText());
                d=Integer.parseInt(text2.getText());
                add=c+d;
                String result=Integer.toString(add);
                ar.setText("sum: "+result);
                ar.setVisible(true);
                ar.setEditable(false);
           }
           if(e.getSource()==Subtract)
           {
                String result=Integer.toString(Integer.parseInt(text.getText())-Integer.parseInt(text2.getText()));
                ar.setText("difference: "+result);
                ar.setVisible(true);
                ar.setEditable(false);
           }
    }
}

class Calc
{
    public static void main(String args[])
    {
          Log obj=new Log();
    }
}