
/**
 * Write a description of class testapp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import javax.swing.*;
public class pizzaApp
{
    public static void main (String [] args)
    {
        LinkList custList = new LinkList();
        pizza p = new pizza();
        char option = 'y';
   
        JOptionPane.showMessageDialog(null, "HIII! WELCOME TO MEJAS PIZZA <3 \n 'your one stop pizza heaven' \nCOME REGSTER WITH US TO HAVE OUR GREAT DEALS");
        while (option == 'y' || option =='Y')
        {
            String name = JOptionPane.showInputDialog("Enter name: ");
            String address = JOptionPane.showInputDialog("Enter addess: ");
            String phNum = JOptionPane.showInputDialog("Enter phone number: ");
            String custEmail = JOptionPane.showInputDialog("Enter email: ");
            JOptionPane.showMessageDialog(null, "your customer ID is:\n"+custEmail);
            String custID = custEmail;
            
            pizza q = new pizza(name, address, phNum, custID);
            //insert into linkList
            custList.insertAtBack(p);
            

            String opt = JOptionPane.showInputDialog("Y to continue or N to exit");
            option = opt.charAt(0);
            if (option == 'n' || option == 'N')
            {
                System.out.println(p.pizzaMenu());
                String pCode = JOptionPane.showInputDialog("Enter pizza code: ");
                int pcode = Integer.parseInt(pCode);
                String pQuan = JOptionPane.showInputDialog("Quantity of pizza: ");
                int pquan = Integer.parseInt(pQuan);
                

                
                
                System.exit(-1);
            }
        }
        
        
        
    }

}
