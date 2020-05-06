import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
public class login extends JFrame implements ActionListener
{ 
   JFrame frameLOGIN;
   JButton addLog;
   public login()
   {
       setTitle("MEJAS PIZZA <3");
       setSize(800, 600);
       setLocation(150, 250);
       
       Container c1 = getContentPane();
       c1.setLayout(new BorderLayout());
      
       JLabel namelbl = new JLabel("NAME: ");      
       JTextField nametext = new JTextField(30);

       JLabel addlbl = new JLabel("ADDRESS: ");      
       JTextField addtext = new JTextField(50);
       
       JLabel telplbl = new JLabel("TELEPHONE NUMBER: ");      
       JTextField telptext = new JTextField(30);
       
       JLabel usernlbl = new JLabel("USERNAME: ");      
       JTextField userntext = new JTextField(30);
       
       addLog = new JButton("LOGIN");
       
       JPanel info = new JPanel(new GridLayout(5,2));
       TitledBorder info2 = BorderFactory.createTitledBorder("CUSTOMER DETAIL");
       info.setBorder(info2);
       info.add(namelbl);
       info.add(nametext);
       info.add(addlbl);
       info.add(addtext); 
       info.add(telplbl);
       info.add(telptext);       
       info.add(usernlbl);
       info.add(userntext);       
       
        
       
       ButtonGroup tpggrp = new ButtonGroup();
     

       
       c1.add(info, BorderLayout.NORTH);
       /* c1.add(size, BorderLayout.WEST);
       c1.add(qty, BorderLayout.EAST);
       c1.add(tpg, BorderLayout.CENTER); */
       c1.add(addLog, BorderLayout.PAGE_END);
       
       addLog.addActionListener(this);
   }
       
   public void actionPerformed(ActionEvent e)
   { /*  pizza piz = new pizza();
       
       if(e.getSource() == addTC)
       {
           String ntext = name.getText();
           String atext = addtext.getText();
           String phtext = telptext.getText();
           String untext = userntext.getText();
           
           pizza q = new pizza(name, address, phNum, custID);
           //insert into linkList
           custList.insertAtBack(p);
           
           test d = new test();
           d.pack();
           d.setVisible(true);
      */ }
   }






