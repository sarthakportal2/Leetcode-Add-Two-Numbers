class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode tmp =new ListNode(0);//dynamically allocating the linked list node into heap's memory 
        ListNode p=l1,q=l2,curr=tmp;//nodes variables  declare
        int c=0;//carry initialization
        while(p!=null || q!=null){//iterating both non nullable linked list 
            int x=p!=null?p.val:0;//declare not nullable l1 linked list cond
            int y=q!=null?q.val:0;//declare not nullable l1 linked list cond
            int s=x+y+c;//Total Sum calculation of LL
            c=s/10;//Sum's carry's Division by 10
            curr.next=new ListNode(s%10);//Current's Node 's Remainder by 10
            curr=curr.next;//current's Next Node Declaration
            if(p!=null)p=p.next;if(q!=null)q=q.next;//Allocating both linked lists node's next to each other
        }if(c>0)curr.next=new ListNode(c);//current's Node>0 
        return tmp.next;//printing temp next pointer 
    }
}
