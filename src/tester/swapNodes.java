package tester;

public class swapNodes {

}



  class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
 
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null)
            return head;
        
        ListNode current =head;
        ListNode nextnode =current.next;
            
        while(nextnode!=null)
        {
            System.out.println(current.val +" "+nextnode.val);
            
            current.val=current.val^nextnode.val;
         //   System.out.println(current.val );
            nextnode.val=current.val^nextnode.val;
          //  System.out.println(nextnode.val );
             current.val=current.val^nextnode.val;
        //    System.out.println(current.val );
            
             System.out.println(current.val +" "+nextnode.val);
            
            if(nextnode.next==null)
                break;
            
            current=nextnode.next;
            nextnode=current.next;
            
           
        }
        
        return head;
        
    }
}