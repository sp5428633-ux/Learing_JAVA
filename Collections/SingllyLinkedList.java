public class SingllyLinkedList {

    public static class Node{
     int data;
     Node next;

     Node(int data ){
        this.data=data;
        this.next=null;
     }
    }
    Node head;

    public void insertAtEnd(int data){
       Node newNode=new Node(data);
       if(head==null){
         head=newNode;
         return;
       }
      
       Node temp=head;
       while (temp.next != null) { 
           temp=temp.next;
       }
       temp.next=newNode;

     }

     public void insertAtBegining(int data){
       Node newNode=new Node(data);
       newNode.next=head;
       head=newNode;
     }
// to delete 
     public void delete(int key){
       if(head==null){
         System.out.println("List is empty:");
         return;
       }
       
       if(head.data==key){
         head=head.next;
         return;
       }
       Node temp=head;

       while (temp.next != null && temp.next.data != key) { 
           temp=temp.next;
       }

       if(temp.next==null){
         System.out.println("value Not found");
       }else{
         temp.next=temp.next.next;
       }

      
     }

      // display list
       public void display() {
         Node temp=head;

         while (temp != null) { 
             System.out.println(temp.data + "->");
             temp=temp.next;
         }
       }

       public static void main(String[] args) {
           SingllyLinkedList list = new SingllyLinkedList();

           list.insertAtEnd(10);
           list.insertAtEnd(20);
           list.insertAtEnd(30);
           list.insertAtEnd(40);

           System.out.println("After Inserting data:");
          list.display();

          list.insertAtBegining(5);
          System.out.println("After At Begining Inserting data:");
          list.display();

          list.delete(20);
          System.out.println("After Deleting  data:");
          list.display();
       }

}
