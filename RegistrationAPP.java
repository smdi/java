import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;


@SuppressWarnings({"unchecked","deprecated"})
class RegistrationFrame extends JFrame implements ActionListener
{

      JLabel l1,l2,l3,l4,l5,l6,l7;
      JTextField tf;
      JPasswordField pf;
      JCheckBox cb1,cb2,cb3;
      JRadioButton rb1,rb2;
      JList l;
      JComboBox cb;
      JTextArea ta;
      JButton b;
  
      Container c;
  String uname ="" , upwd = "" , uqual = "" , ugen  = "" , utech = "" , uprof= "" , uaddr = "" ;
@SuppressWarnings({"unchecked","deprecated"})
   RegistrationFrame()
   {
       this.setVisible(true);
       this.setSize(500,500);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("REGISTRATION FORM");
       c  = getContentPane();
       c.setBackground(Color.cyan);
       c.setLayout(null);
  
       l1 = new JLabel("User Name");
       l1.setBounds(50,100,100,10);
       
       l2 = new JLabel("Password");
       l2.setBounds(50,150,100,10);

       l3 = new JLabel("Qualification");
       l3.setBounds(50,200,100,10);


       l4 = new JLabel("Gender");
       l4.setBounds(50,250,100,10);



       l5 = new JLabel("Technologies");
       l5.setBounds(50,300,100,10);



       l6 = new JLabel("Profession");
       l6.setBounds(50,350,100,10);


       l7 = new JLabel("Address");
       l7.setBounds(50,400,100,10);

   
       tf = new JTextField(20);
       tf.setBounds(150,90,100,30);
       tf.setToolTipText("enter the name");

       pf = new JPasswordField(20);
       pf.setBounds(150,140,100,30);
       pf.setToolTipText("enter the password");


      cb1 = new JCheckBox("BSC/");
      cb1.setBounds(150,190,60,30);

  
      cb2 = new JCheckBox("MBA/");
      cb2.setBounds(220,190,60,30);



      cb3 = new JCheckBox("MSC");
      cb3.setBounds(290,190,60,30);



      rb1 = new JRadioButton("Male");
      rb1.setBounds(150,240,80,30);

      rb2 = new JRadioButton("FE-Male");
      rb2.setBounds(250,240,80,30);
 
     ButtonGroup bg = new ButtonGroup();     
     bg.add(rb1);
     bg.add(rb2);

     String[] techs = {"C","C++","Java"};
     l = new JList(techs);
     l.setBounds(150,280,60,60);

    String[] prof = {"Student","Teacher","Business"};
     cb = new JComboBox(prof);
     cb.setBounds(150,340,80,30);

    ta = new JTextArea(5,25);
    ta.setBounds(150,380,100,40);

 b = new JButton("Registration");  
b.setBounds(50,450,110,40);
b.addActionListener(this);


c.add(l1);c.add(tf);
c.add(l2);c.add(pf);
c.add(l3);c.add(cb1);c.add(cb2);c.add(cb3);
c.add(l4);c.add(rb1);c.add(rb2);
c.add(l5);c.add(l);
c.add(l6);c.add(cb);
c.add(l7);c.add(ta);
c.add(b);

 }
@SuppressWarnings({"unchecked","deprecated"})
@Override
public void actionPerformed(ActionEvent ae)
{
    uname = tf.getText();
    upwd  = pf.getText();
   if(cb1.isSelected() == true)
   {

     uqual = uqual+cb1.getLabel()+"";

    }

 if(cb2.isSelected() == true)
   {

     uqual = uqual+cb2.getLabel()+"";

    }
 if(cb3.isSelected() == true)
   {

     uqual = uqual+cb3.getLabel()+"";

    }

 if(rb1.isSelected() == true)
   {

     ugen = rb1.getLabel();

    }
 if(cb1.isSelected() == true)
   {

      ugen = rb2.getLabel();

    }

Object[] techs = l.getSelectedValues();
for(int i=0 ; i<techs.length ; i++)
{

  utech = utech +techs[i]+" ";

}

uprof = (String)cb.getSelectedItem();
uaddr = ta.getText();
@SuppressWarnings({"unchecked","deprecated"})
class DisplayFrame extends JFrame
{

  DisplayFrame()
{      this.setVisible(true);
       this.setSize(1600,1600);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setTitle("REGISTRATION FORM");
       c  = getContentPane();
       c.setBackground(Color.cyan);
       c.setLayout(null);
}
@SuppressWarnings({"unchecked","deprecated"})

@Override
public void paint(Graphics g)
{

  Font f = new Font("arial",Font.BOLD,25);
 g.setFont(f);
 g.drawString("-------------------------------------------------",50,180);
 g.drawString("***********Customer Details************",50,200);
 g.drawString("------------------------------------------------",50,220);
 g.drawString("User Name : "+uname,50,250); 
 g.drawString("User Password :"+upwd,50,280); 
 g.drawString("Qualification :"+uqual,50,310); 
 g.drawString("User Gender :"+ugen,50,340); 
 g.drawString("Technologies : "+utech,50,370); 
 g.drawString("Profession : "+uprof,50,400); 
 g.drawString("Adress  : "+uaddr,50,430); 
 g.drawString("A Product of Al-MUNTAQIM",50,460);
 g.drawString("*************************************",50,490);
g.drawString("*************************************",50,520);
 g.drawString("######################################",600,300);
g.drawString("Project done By Using SWING",600,350);
 g.drawString("Project done By Venkat Vatti",600,400);
 g.drawString("Project done By Abdul Rasheed",600,450);
g.drawString("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$",600,500);

}

}
   DisplayFrame df = new DisplayFrame();
   
}

}


class RegistrationAPP extends  AutoGc<Object>
{
  public static void main(String[] args)throws Exception
{

@SuppressWarnings({"unchecked","deprecated","checked"})

 RegistrationFrame rf = new RegistrationFrame();
 AutoGc.getReference(rf) ; 

}

}




 