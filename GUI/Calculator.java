import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


class Calci extends JFrame implements ActionListener
{
     JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,beq,bclear,be;
     JTextField screen;
     double a=0,b=0,result=0.0;
     int operator=0;
     Calci()
     { 
        JPanel p=new JPanel();


        //   number buttons
          b0=new JButton("0");       
          b1=new JButton("1");
          b2=new JButton("2");
          b3=new JButton("3");
          b4=new JButton("4");
          b5=new JButton("5");
          b6=new JButton("6");
          b7=new JButton("7");
          b8=new JButton("8");
          b9=new JButton("9");
          b0=new JButton("0");

        //   Operator buttons
          ba=new JButton("+");
          bs=new JButton("-");
          bm=new JButton("*");
          bd=new JButton("/");
          beq=new JButton("=");
          bclear=new JButton("c");
          be=new JButton(".");

        //   other creation
        screen=new JTextField(18);



        // adding components to panel

        p.add(screen);        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(ba);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(bs);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(bm);
        p.add(b0);
        p.add(be);
        p.add(bclear);
        p.add(bd);
        p.add(beq);

         
        add(p);


        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        ba.addActionListener(this);
        bs.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        be.addActionListener(this);
        beq.addActionListener(this);
        bclear.addActionListener(this);
        
     

         p.setBackground(Color.black);
         setBounds(300,200,225,230);
         setVisible(true);
         setResizable(false);
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         
     }
     public void actionPerformed(ActionEvent e)
     {
            if(e.getSource()==b1)
                 screen.setText(screen.getText()+"1");
            if(e.getSource()==b2)
                 screen.setText(screen.getText().concat("2"));
            if(e.getSource()==b3)
                 screen.setText(screen.getText().concat("3"));
            if(e.getSource()==b4)
                 screen.setText(screen.getText().concat("4"));
            if(e.getSource()==b5)
                 screen.setText(screen.getText().concat("5"));
            if(e.getSource()==b6)
                 screen.setText(screen.getText().concat("6"));
            if(e.getSource()==b7)
                 screen.setText(screen.getText().concat("7"));
            if(e.getSource()==b8)
                 screen.setText(screen.getText().concat("8"));
            if(e.getSource()==b9)
                 screen.setText(screen.getText().concat("9"));
            if(e.getSource()==b0)
                 screen.setText(screen.getText().concat("0"));
            if(e.getSource()==be)
                 screen.setText(screen.getText().concat("."));
            if(e.getSource()==bclear)
                  screen.setText("");
            if(e.getSource()==ba)
            {
                a=Double.parseDouble(screen.getText());
                operator=1;
                screen.setText("");
            }
            if(e.getSource()==bs)
            {
                a=Double.parseDouble(screen.getText());
                operator=2;
                screen.setText("");
            }
            if(e.getSource()==bm)
            {
                a=Double.parseDouble(screen.getText());
                operator=3;
                screen.setText("");
            }
            if(e.getSource()==bd)
            {
                a=Double.parseDouble(screen.getText());
                operator=4;
                screen.setText("");
            }
            if(e.getSource()==beq)
            {
                b=Double.parseDouble(screen.getText());
                switch(operator)
                {
                   case 1:
                   {
                       result=a+b;
                       break;
                   }
                   case 2:
                   {
                       result=a-b;
                       break;
                   }
                   case 3:
                   {
                       result=a*b;
                       break;
                   }
                   case 4:
                   {
                       result=a/b;
                       break;
                   }
                }
                screen.setText(""+result);
            }
            
                 


     }
}


public class Calculator 
{
    public static void main(String[] args) 
    {
        Calci c=new Calci();
    }
}
