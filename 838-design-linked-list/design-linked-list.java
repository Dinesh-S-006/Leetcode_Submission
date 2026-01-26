class Node{
    
    int data;
    Node next;
     Node(int data){
 
        this.data=data;
        this.next=null;
     }
}

  public  class MyLinkedList {
    Node head;
    int size;
    public MyLinkedList() {
        this.head=null;
        this.size=0;
    }
    
    public int get(int index) {
        if(index<0 || index>=size) return -1;
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp.data;
    }
    
    public void addAtHead(int val) {
        Node newnode=new Node(val);
        newnode.next=head;
        head=newnode;
        size++;  
    }
    
    public void addAtTail(int val){
         Node newnode=new Node(val);
         if(head==null){
            newnode.next = head;
            head=newnode;
            size++;
            return;
        }
            else{
                Node temp=head;
                while(temp.next!=null){
                    temp=temp.next;
                }
                temp.next=newnode;
                size++;
            }
            
         }
    
    
    public void addAtIndex(int index, int val) {
        if(index>size){
             return;
        }
        if(index<=0){
            addAtHead(val);
            return;
        }
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node node=new Node(val);
        node.next=temp.next;
        temp.next=node;
        size++;
    }
    public void deleteAtIndex(int index) {
        if(index<0 || index>=size){  return;}
        if(index==0){head=head.next;size--;}
        // if(head==null){ System.out.print("No possible");return;
        // }
        else{
            Node temp=head;
            for (int i=0;i<index-1;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            size--;
        }
    }
    }

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */