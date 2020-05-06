
/**
 * Write a description of class test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public class pizza
{
   public String name;
   public String address;
   public String phNum;
   public String custID;
   public double tprice;
   public int quantity;
   public double price;
   
   public pizza()
   {}
   
   public pizza (String n, String a, String p, String c)
   {
       name = n;
       address = a;
       phNum = p;
       custID = c;
   }
   
   public void setPizza (String n, String a, String p, String c)
   {
       name = n;
       address = a;
       phNum = p;
       custID = c;
   }
   
   public String getname()
   { return name; }
   public String getaddress()
   { return address; }
   public String getphNum()
   { return phNum; }
   public String getcustID()
   { return custID; }
   
   public double calcprice()
   {
       tprice = quantity * price;
    
       return tprice;
   }
   
   /*public String greeting()
   {
       return "HIII! WELCOME TO MEJAS PIZZA <3 \n 'your one stop pizza heaven' \nCOME REGSTER WITH US TO HAVE OUR GREAT DEALS";
   }*/
   
   public String pizzaMenu()
   {
       return "\t\tPIZZA MENU \n\n\t 1. Hawaian Chicken \n\t 2. Papperoni (Beef/Chicken) \n\t 3. Vegie Lover";
   }
}
        
        
    
