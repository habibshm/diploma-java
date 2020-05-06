import javax.swing.*;
import javax.swing.border.*;
import javax.swing.event.*;
import java.awt.event.*;
import java.awt.*;
import java.text.*;
public class test extends JFrame implements ActionListener
{ 
   JFrame frameMENU;
   JRadioButton medium, large;
   JRadioButton t1,t2,t3,t4,t5,t6,t7,t8;
   JRadioButton p1,p2,p3;
   JTextField text;
   JLabel lbl;
   JButton addTCal;
   private String name;
   JFrame frameLOGIN;
   JButton addLog;
   
   public test()
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
     

       

       

    /* axes(handles.axes1);
    matlabImage = imread(C:\Desktop\java\chicken.jpeg);
    image(matlabImage);
    axis off;
    axis image; 

       <IMAGE>"chicken.jpg" */
       t1 = new JRadioButton("Beef Pepperoni");
       t2 = new JRadioButton("Hawaian Chicken");
       t3 = new JRadioButton("Vegie Lover");
       t4 = new JRadioButton("Banana Kaya");
       t5 = new JRadioButton("Tuna Temptation");
       
       medium = new JRadioButton("Medium");
       large = new JRadioButton("Large");
       
       p1 = new JRadioButton("Garlic Bread (6 pcs)");
       p2 = new JRadioButton("Honey Wings (6 pcs)");
       p3 = new JRadioButton("Chicken Stick (6 pcs)");
       
       text = new JTextField(5);
       lbl = new JLabel("pizza (s)");
       
       addTCal = new JButton("CALCULATE");
       
       JPanel menu = new JPanel(new GridLayout(5,2));
       TitledBorder menu2 = BorderFactory.createTitledBorder("PIZZA");
       menu.setBorder(menu2);
       menu.add(t1);
       menu.add(t2);
       menu.add(t3);
       menu.add(t4);
       menu.add(t5);
       //menu.add(t6);
       //menu.add(t7);
       //menu.add(t8);
       
       ButtonGroup teagrp = new ButtonGroup();
       teagrp.add(t1);
       teagrp.add(t2);
       teagrp.add(t3);
       teagrp.add(t4);
       teagrp.add(t5);
       //teagrp.add(t6);
       //teagrp.add(t7);
       //teagrp.add(t8);

       ButtonGroup sizegrp = new ButtonGroup();
       sizegrp.add(medium);
       sizegrp.add(large);
       
       JPanel size = new JPanel(new GridLayout(1,2));
       TitledBorder size2 = BorderFactory.createTitledBorder("SIZE");
       size.setBorder(size2);
       size.add(medium);
       size.add(large);
       
       JPanel qty = new JPanel(new FlowLayout());
       TitledBorder qty2 = BorderFactory.createTitledBorder("QUANTITY");
       qty.setBorder(qty2);
       qty.add(text);
       qty.add(lbl);
       
       JPanel tpg = new JPanel(new GridLayout(2,2));
       TitledBorder tpg2 = BorderFactory.createTitledBorder("ADDS-ON");
       tpg.setBorder(tpg2);
       tpg.add(p1);
       tpg.add(p2);
       tpg.add(p3);
       
       ButtonGroup menugrp = new ButtonGroup();
       menugrp.add(p1);
       menugrp.add(p2);
       menugrp.add(p3);
       
       c1.add(menu, BorderLayout.NORTH);
       c1.add(size, BorderLayout.WEST);
       c1.add(qty, BorderLayout.EAST);
       c1.add(tpg, BorderLayout.CENTER);
       c1.add(addTCal, BorderLayout.PAGE_END);
       c1.add(info, BorderLayout.NORTH);
       c1.add(addLog, BorderLayout.PAGE_END);
       
       addLog.addActionListener(this);
       addTCal.addActionListener(this);
    }
       public void actionPerformed(ActionEvent e)
       {   
          pizza piz = new pizza();

       
          if(e.getSource() == addLog)
          {
              String ntext = name.getText();
              String atext = addtext.getText();
              String phtext = telptext.getText();
              String untext = userntext.getText();
           
              pizza p = new pizza(name, address, phNum, custID);
              //insert into linkList
              custList.insertAtBack(p);
           
              test d = new test();
              d.pack();
              d.setVisible(true);
               
               if(e.getSource() == addTCal)
               {
                   double priceR, priceL;
                   double pricetpg1,pricetpg2;
                   double totalPrice;
                   String text2 = text.getText();
                   int quantity = Integer.parseInt(text2);
              
                    if(t1.isSelected())
                    {
                        if(medium.isSelected())
                        {
                            if(p1.isSelected() || p2.isSelected())
                            {
                                priceR = (6.00 * quantity) + 0.0;
                                pricetpg1 = priceR + 0.50;
                           
                                System.out.println(" Price : " + pricetpg1);
                            }
                            else if(p3.isSelected())
                            {
                                priceR = (6.00 * quantity) + 0.0;
                                pricetpg2 = priceR;
                           
                                System.out.println(" Price : " + pricetpg2);
                            }
                        }
                        else if(large.isSelected())
                        {
                            if(p1.isSelected() || p2.isSelected())
                            {
                                priceL = (6.00 * quantity) + 1.00;
                                pricetpg1 = priceL + 0.50;
                           
                                System.out.println(" Price : " + pricetpg1);
                            }
                            else if(p3.isSelected())
                            {
                                priceL = (6.00 * quantity) + 1.00;
                                pricetpg2 = priceL;
                           
                                System.out.println(" Price : " + pricetpg2);
                            }
                        }
                    }
                    else if(t2.isSelected())
                    {
                        if(medium.isSelected())
                        {
                            if(p1.isSelected() || p2.isSelected())
                            {
                                priceR = (6.00 * quantity) + 0.0;
                                pricetpg1 = priceR + 0.50;
                           
                                System.out.println(" Price : " + pricetpg1);
                            }
                            else if(p3.isSelected())
                            {
                                priceR = (6.00 * quantity) + 0.0;
                                pricetpg2 = priceR;
                           
                                System.out.println(" Price : " + pricetpg2);
                            }
                        }
                        else if(large.isSelected())
                        {
                            if(p1.isSelected() || p2.isSelected())
                            {
                                priceL = (6.00 * quantity) + 1.00;
                                pricetpg1 = priceL + 0.50;
                           
                                System.out.println(" Price : " + pricetpg1);
                            }
                            else if(p3.isSelected())
                            {
                                priceL = (6.00 * quantity) + 1.00;
                                pricetpg2 = priceL;
                           
                                System.out.println(" Price : " + pricetpg2);
                            }
                        }
                    }
                    else if(t3.isSelected())
                    {
                        if(medium.isSelected())
                        {
                            if(p1.isSelected() || p2.isSelected())
                            {
                                priceR = (8.00 * quantity) + 0.0;
                                pricetpg1 = priceR + 0.50;
                           
                                System.out.println(" Price : " + pricetpg1);
                            }
                            else if(p3.isSelected())
                            {
                                priceR = (8.00 * quantity) + 0.0;
                                pricetpg2 = priceR;
                           
                                System.out.println(" Price : " + pricetpg2);
                            }
                        }
                        else if(large.isSelected())
                        {
                            if(p1.isSelected() || p2.isSelected())
                            {
                                priceL = (8.00 * quantity) + 1.00;
                                pricetpg1 = priceL + 0.50;
                           
                                System.out.println(" Price : " + pricetpg1);
                            }
                            else if(p3.isSelected())
                            {
                                priceL = (8.00 * quantity) + 1.00;
                                pricetpg2 = priceL;
                           
                                System.out.println(" Price : " + pricetpg2);
                            }
                        }
               }
               else if(t4.isSelected())
               {
                   if(medium.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceR = (6.00 * quantity) + 0.0;
                           pricetpg1 = priceR + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceR = (6.00 * quantity) + 0.0;
                           pricetpg2 = priceR;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
                   else if(large.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceL = (6.00 * quantity) + 1.00;
                           pricetpg1 = priceL + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceL = (6.00 * quantity) + 1.00;
                           pricetpg2 = priceL;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
               }
               else if(t5.isSelected())
               {
                   if(medium.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceR = (6.00 * quantity) + 0.0;
                           pricetpg1 = priceR + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceR = (6.00 * quantity) + 0.0;
                           pricetpg2 = priceR;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
                   else if(large.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceL = (6.00 * quantity) + 1.00;
                           pricetpg1 = priceL + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceL = (6.00 * quantity) + 1.00;
                           pricetpg2 = priceL;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
               }
               else if(t6.isSelected())
               {
                   if(medium.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceR = (8.00 * quantity) + 0.0;
                           pricetpg1 = priceR + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceR = (8.00 * quantity) + 0.0;
                           pricetpg2 = priceR;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
                   else if(large.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceL = (8.00 * quantity) + 1.00;
                           pricetpg1 = priceL + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceL = (8.00 * quantity) + 1.00;
                           pricetpg2 = priceL;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
               }
               else if(t7.isSelected())
               {
                   if(medium.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceR = (7.00 * quantity) + 0.0;
                           pricetpg1 = priceR + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceR = (7.00 * quantity) + 0.0;
                           pricetpg2 = priceR;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
                   else if(large.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceL = (7.00 * quantity) + 1.00;
                           pricetpg1 = priceL + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceL = (7.00 * quantity) + 1.00;
                           pricetpg2 = priceL;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
               }
               else if(t8.isSelected())
               {
                   if(medium.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceR = (7.00 * quantity) + 0.0;
                           pricetpg1 = priceR + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceR = (7.00 * quantity) + 0.0;
                           pricetpg2 = priceR;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
                   else if(large.isSelected())
                   {
                       if(p1.isSelected() || p2.isSelected())
                       {
                           priceL = (7.00 * quantity) + 1.00;
                           pricetpg1 = priceL + 0.50;
                           
                           System.out.println(" Price : " + pricetpg1);
                       }
                       else if(p3.isSelected())
                       {
                           priceL = (7.00 * quantity) + 1.00;
                           pricetpg2 = priceL;
                           
                           System.out.println(" Price : " + pricetpg2);
                       }
                   }
                }
             }
            }
      
    }
}


