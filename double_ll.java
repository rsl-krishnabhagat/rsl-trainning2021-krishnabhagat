class double_ll {  
    class Node{  
        int item;  
        Node previous;  
        Node next;  
   
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    Node head, tail = null;  
   
    public void addNode(int item) {  
        Node newNode = new Node(item);  
   
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {  
            
            tail.next = newNode;  
            
            newNode.previous = tail;  
            
            tail = newNode;  
            
            tail.next = null;  
        }  
    }  
   

    public void printNodes() {  
        
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
           
            System.out.print(current.item + " ");  
            current = current.next;  
        }  
    } 
    public void contains(int data)
    {
        boolean find = false;
        Node current = head;
        while(current != null)
        {
            if(current.item == data)
            find = true;
            current = current.next;
        }
        System.out.println(find);
    } 
}
class Main{
    public static void main(String[] args) {  
        
        double_ll dl_List = new double_ll();  
        
        dl_List.addNode(10);  
        dl_List.addNode(20);  
        dl_List.addNode(30);  
        dl_List.addNode(40);  
        dl_List.addNode(50);  
        dl_List.contains(30);
       
        dl_List.printNodes();  
    }  
}  

