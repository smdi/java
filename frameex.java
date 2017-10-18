
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;


class MyFrame extends Frame implements ActionListener
{
   Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;   

    MyFrame()
   {
    this.setVisible(true);
    this.setSize(500,500);
    this.setTitle("Learn Colors");
    this.setBackground(Color.black);
    this.setLayout(new FlowLayout());  
 
  

  b1=new Button("Red");
  b2=new Button("Blue");
  b3=new Button("Green");
  b4=new Button("Black");
  b5=new Button("cyan");
  b6=new Button("darkGray");
  b7=new Button("white");
  b8=new Button("yellow");
  b9=new Button("orange");
  b10=new Button("magenta");
  b11=new Button("pink");
  b12=new Button("Exit");
 

  b1.addActionListener(this);
  b2.addActionListener(this);
  b3.addActionListener(this);
  b4.addActionListener(this);
  b5.addActionListener(this);
  b6.addActionListener(this);
  b7.addActionListener(this); 
  b8.addActionListener(this);
  b9.addActionListener(this);
  b10.addActionListener(this);
  b11.addActionListener(this);
  b12.addActionListener(this);


 
 b1.setBackground(Color.red);
 b2.setBackground(Color.blue);
 b3.setBackground(Color.green); 
// b4.setBackground(Color.black);
 b5.setBackground(Color.cyan);
 b6.setBackground(Color.darkGray); 
 b7.setBackground(Color.white); 
  b8.setBackground(Color.yellow);
 b9.setBackground(Color.orange);
 b10.setBackground(Color.magenta); 
 b11.setBackground(Color.pink);
 b12.setBackground(Color.red);

  this.add(b1);
  this.add(b2);
  this.add(b3);
//   this.add(b4);
  this.add(b5);
  this.add(b6);
   this.add(b7);
   this.add(b8);
  this.add(b9);
  this.add(b10);
   this.add(b11);
  this.add(b12);

}
 public void actionPerformed(ActionEvent ae)
{
                              
    String label=ae.getActionCommand();
if(label.equals("Red"))
{
  this.setBackground(Color.red);

}
 if(label.equals("Blue"))
{
this.setBackground(Color.blue);
}

 if(label.equals("Green"))
{
this.setBackground(Color.green);
}
if(label.equals("Black"))
{
this.setBackground(Color.black);
}
if(label.equals("cyan"))
{
this.setBackground(Color.cyan);
}

if(label.equals("darkGray"))
{
this.setBackground(Color.darkGray);
}

if(label.equals("Exit"))
{
  System.exit(0);

}
if(label.equals("yellow"))
{
this.setBackground(Color.yellow);




}
if(label.equals("orange"))
{
this.setBackground(Color.orange);
}
if(label.equals("magenta"))
{
this.setBackground(Color.magenta);
}
if(label.equals("pink"))
{
 this.setBackground(Color.pink);
}
if(label.equals("white"))
{
this.setBackground(Color.white);
}


}
@Override
public void paint(Graphics g)
{
  Font f = new Font("Helvetica", Font.BOLD,30);
   g.setFont(f);
   this.setForeground(Color.black);
 g.drawString("\nA product of Al-MUNTAQIM from Crescent", 70, 350);	  
 g.drawString("\nLearn Colors By Touch \n Learning Made Fun",70, 450);	  
 g.drawString("project made by Fayaz and Venkat ", 70, 550);	   
}

}
public class frameex extends AutoGc<Object>
{
public static void main(String[] args)throws Exception
{
   MyFrame f=new MyFrame();
  AutoGc.getReference(f);

}

}