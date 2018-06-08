public class SinglyLinkedList{
  public Node head;
  public SinglyLinkedList() {
    this.head = null;
  }
  // SLL methods go here. As a starter, we will show you how to add a node to the list.
  public void add(int value) {
     Node newNode = new Node(value);
     if(head == null) {
         head = newNode;
     } else {
         Node runner = head;
         while(runner.next != null) {
             runner = runner.next;
         }
         runner.next = newNode;
     }
  }
  // Goes until the penultimate node and then changes its .next
    // property to null, getting rid of the final node
    public void remove(){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next.next != null){
                pointer = pointer.next;
            }
            pointer.next = null;
        }
    }
    // Prints each value in the singly linked list
    public void printValues(){
        if(this.head != null){
            Node pointer = this.head;
            while(pointer.next != null){
                System.out.println(pointer.value);
                pointer = pointer.next;
            }
        }
    }
}
