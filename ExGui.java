
/**
 * Write a description of class ExGui here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.*;
public class ExGui
{
    private Frame f;
    private Button b1;
    private Button b2;
    
    public void go()
    {
        f = new Frame("MEJAS PIZZA");
        f.setLayout(new FlowLayout());
        b1 = new Button ("YES");
        b2 = new Button ("NO");
        f.add(b1);
        f.add(b2);
        f.pack();
        f.setVisible(true);
    }
    
    public static void main (String [] args)
    {
        ExGui guiWindow = new ExGui();
        guiWindow.go();
        
        
        LinkList custList = new LinkList();
        pizza p = new pizza();
        char option = 'y';
   
        System.out.println("HIII! WELCOME TO MEJAS PIZZA <3 \n 'your one stop pizza heaven' \nCOME REGSTER WITH US TO HAVE OUR GREAT DEALS");
        while (option == 'y' || option =='Y')
        {
            String name = System.out.println("Enter name: ");
            String address = System.out.println("Enter addess: ");
            String phNum = JOptionPane.showInputDialog("Enter phone number: ");
            String custEmail = JOptionPane.showInputDialog("Enter email: ");
            JOptionPane.showMessageDialog(null, "your customer ID is:\n"+custEmail);
            String custID = custEmail;
            
            pizza q = new pizza(name, address, phNum, custID);
            //insert into linkList
            custList.insertAtBack(p);
            

            String opt = JOptionPane.showInputDialog("Y to continue or N to exit");
            option = opt.charAt(0);
            if (b1)
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
