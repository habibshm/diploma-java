
/**
 * Write a description of class LinkList here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LinkList
{
    private Node first;
    private Node last;
    private Node current;
    
    public LinkList()
    {
        first = null;
        last = null;
        current = null;
    }
    
    public boolean isEmpty()
    {   return (first==null);   }
    
    public void insertAtFront(pizza item)
    {
        Node newNode = new Node(item);
        
        if(isEmpty())
        {
            first = newNode;
            last = newNode;
        }
        else
        {
            newNode.next = first;
            first = newNode;
        }
    }
    
    public void insertAtBack(pizza item)
    {
        Node newNode = new Node(item);
        
        if(isEmpty())
        {
            first = newNode;
            last = newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
    }
    
    public pizza removeFromFront()
    {
        pizza removeitem = null;
        
        if(isEmpty())
        {
            return removeitem;
        }
        
        removeitem = first.data;
        
        if(first==last)
        {
            first = null;
            last = null;
        }
        else
            first = first.next;
        
        return removeitem;
    }
    
    public pizza removeFromBack()
    {
        pizza removeitem = null;
        
        if(isEmpty())
        {
            return removeitem;
        }
        
        removeitem = last.data;
        if(first==last)
        {
            first = null;
            last = null;
        }
        else
        {
            current = first;
            
            while(current.next != last)
            {
                current = current.next;
                last = current;
                last.next = null;
            }
        }
        return removeitem;
    }
        
    public pizza getFirst()
    {
        if(isEmpty())
            return null;
        else
        {
            current =first;
            return current.data;
        }
    }
        
    public pizza getNext()
    {
        if(current == last)
            return null;
        else
        {
            current = current.next;
            return current.data;
        }
    }      
}
