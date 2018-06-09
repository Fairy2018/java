public class LinkList {
	ListNode head;
	LinkList next;
	LinkList(int x){
		this.head.val=x;
	}
	LinkList(int[] x){
		int i=0;
		int len=x.length;
		if(len!=0) { 
		this.head.val=x[0];
	    for(;i<len;i++) {
			this.next=new LinkList(x[i]);
			head=this.next.head;
		}
	  }
	}
	@Override
	public String toString() {
		ListNode s=this.head;
		StringBuilder str=new StringBuilder("");
		while(s!=null) {
			str.append(s.val+"->");
			s=s.next;
		}
		str.append("null");
		return str.toString();
	}
	class ListNode{
		int val;
	    ListNode next;
	    ListNode(int x){
		val=x; 
		}
	}
}

