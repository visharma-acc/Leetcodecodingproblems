import java.util.ArrayList;

class AddSum {
    
       public double formNumber(ArrayList<Integer> l)
        {
            int len=l.size();
            Double s=0.0,n=0.0;
            for(int i=len-1;i>=0;i--)
            {
                double t=l.get(i);
                s=((double) Math.pow(10, len-1))*(t);
                n=n+s;
                len--;
            }
            return n;
        }
    
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
        
        ArrayList<Integer> ls1=new ArrayList<Integer>();
        ArrayList<Integer> ls2=new ArrayList<Integer>();
        
        double n1=0,n2=0;
        int i=0;
        int j=0;
        
        while(l1!= null || l2!= null)
        {
           if(l1!=null)
           { 
             ls1.add(l1.val);    
             l1=l1.next;  
           }
           if(l2!=null)
           {
               ls2.add(l2.val);  
               l2=l2.next;  
           }        
            
        }
        
     
        
        n1=formNumber(ls1);
        n2=formNumber(ls2);
        double n=n1+n2;
       ListNode head = new ListNode((int)n%10);
        n=n/10;
       ListNode header=head; 
        while(n>0)
			{
				
				double r=(n%10);
                header.next = new ListNode((int)r);
                n=n/10; 
                if (n>0)
                header = header.next;
				
			}
        
       // l3.val=n1+n2;
       // l3.val=n1;
        return head;
    }
}