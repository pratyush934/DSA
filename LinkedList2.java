public class LinkedList2 {
    
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    public boolean isIdentical(Node head1, Node head2) {
        /*
         * Given two Singly Linked List of N and M nodes respectively. The task is to check whether two linked lists are identical or not. 
Two Linked Lists are identical when they have same data and with same arrangement too.
         */
        Node temp1 = head1, temp2 = head2;
        int size1 = 0, size2 = 0;
        while(temp1 != null) {
            size1++;
            temp1 = temp1.next;
        }
        while(temp2 != null) {
            size2++;
            temp2 = temp2.next;
        }
        temp1 = head1;
        temp2 = head2;
        if(size1 != size2) {
            return false;
        } else {
            while(temp1 != null) {
                if(temp1.data != temp2.data) {
                    return false;
                }
                temp1 = temp1.next;
                temp2 = temp2.next;
            }
        }
        return true;

    }

    public Node insertMid(Node head, int data) {
        /*
         * Given a linked list of size N and a key. The task is to insert the key in the middle of the linked list.
         */
        int size = 0;
        Node temp = head;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int mid = size / 2;
        temp = head;
        Node newNode = new Node(data);
        int i = 0;
        if(size % 2 == 0) {
            while(i < mid-1) {
                temp = temp.next;
                i++;
            }
        } else {
            while(i < mid) {
                temp = temp.next;
                i++;
            }
        }
        newNode.next = temp.next;
        temp.next = newNode;

        return newNode;
        
    }

    public int returSum(Node head , int k) {
        /*
         * Given a single linked list of size M, 
         * your task is to complete the function sumOfLastN_Nodes(), 
         * which should return the sum of last N nodes of the linked list.
         */

        Node temp = head;
        int size = 0;
        while(temp != null) {
            size++;
            temp = temp.next;
        }
        int index = size - k;
        temp = head;
        int i = 0;
        while(i < index) {
            temp = temp.next;
            i++;
        }
        head = temp;
        Node prev = head;
        int sum = 0;
        while(prev != null) {
            sum += prev.data;
            prev = prev.next;
        }
        return sum;
    }

    public int modularNode(Node head, int k) {
        /*
         * Given a singly linked list and a number k, you are required to complete the function modularNode() 
         * which returns the modular node of the linked list.
A modular node is the last node of the linked list whose Index is divisible by the number k, i.e. i%k==0.
Note: If no such node is available, return -1. We are following 1 indexing.
         */
        int ans = -1;
        Node temp = head;
        int i = 1;
        while(temp != null) {
            if(i % k == 0) {
                ans = temp.data;
            }
            temp = temp.next;
            i++;
        }
        return ans;

    }

    public void delAlternate(Node head) {
        /*
         * Given a Singly Linked List of size N, delete all alternate nodes of the list
         */
        while(head != null && head.next != null) {
            head.next = head.next.next;
            head = head.next;
        }
    }

    public int nkNode(Node head, int k) {
        /*
         * Given a singly linked list and a number k. 
         * Write a function to find the (N/k)th element, 
         * where N is the number of elements in the list. 
         * We need to consider ceil value in case of decimals.
         */

        int length = 0;
        Node temp = head;
        for(length = 0; temp != null; temp = temp.next,length++);
        int nk = length/k;
        temp = head;
        for(int i = 0; i<nk; i++) temp = temp.next;
        return temp.data;
        

    }

    public static void main(String args[]) {

    }
}
