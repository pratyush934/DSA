import java.util.*;

public class QueueB {

    /* 
    static class Queue {
       static int arr[];
       static int size;
       static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty() {
            return rear == -1;
        }

        //add
        public static void add(int data) {
            if(rear == size -1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        //remove
        public static int remove() {
             if(isEmpty()) {
                System.out.println("Empty queue");
                return -1;
            }

            int front = arr[0];
            for(int i=0; i<rear; i++) {
                arr[i] = arr[i+1];
            }
            rear = rear - 1;
            return front;
        }

        //peek
        public static int peek() {
            if(isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }

            return arr[0];
        }
    }
    */

    /* 
    static class Queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;
 
         Queue(int n) {
             arr = new int[n];
             size = n;
             rear = -1;
             front = -1;
         }
 
         public static boolean isEmpty() {
             return rear == -1 && front == -1;
         }

         public static boolean isFull() {
            return (rear+1) % size == front;
         }
 
         //add
         public static void add(int data) {
             if(isFull()) {
                 System.out.println("Queue is full");
                 return;
             }
             //add 1st element
             if(front == -1) {
                front = 0;
             }
             rear = (rear + 1) % size;
             arr[rear] = data;
         }
 
         //remove
         public static int remove() {
              if(isEmpty()) {
                 System.out.println("Empty queue");
                 return -1;
             }
 
             int result = arr[front];
            
             //last el delete
             if(rear == front) {
                rear = front = -1;

             } else {
                front = (front +1)%size;
             }
             return result;
         }
 
         //peek
         public static int peek() {
             if(isEmpty()) {
                 System.out.println("Empty Queue");
                 return -1;
             }
 
             return arr[front];
         }
        }

        */

        /* 
        static class Node {
            int data;
            Node next;

            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }


//QUESTION 2
        static class Queue {
            static Node head = null;
            static Node tail = null;

            public static boolean isEmpty() {
                return head == null && tail == null;
            }

            //add
            public static void add(int data) {
               Node newNode = new Node(data);
               if(head == null) {
                head = tail = newNode;
                return;
               }
               tail.next = newNode;
               tail = newNode;
            }

            //remove
            public static int remove() {
                if(isEmpty()) {
                    System.out.println("Empty queue");
                    return -1;
                }

                int front = head.data;
                //single element
                if(tail == head) {
                    tail = head = null;
                } else {
                    head = head.next;
                }
              return front;
            }

            //peek
            public static int peek() {
                if(isEmpty()) {
                    System.out.println("Empty queue");
                    return -1;
                }

                return head.data;
            }
        }

        */

        /* 
        static class Queue {
            static Stack<Integer> s1 = new Stack<>();
            static Stack<Integer> s2 = new Stack<>();

            public static boolean isEmpty() {
                return s1.isEmpty();
            }

            //add
            public static void add(int data) {
                while(!s1.isEmpty()) {
                    s2.push(s1.pop());
                }

                s1.push(data);

                while(!s2.isEmpty()) {
                    s1.push(s2.pop());
                }
            } 

            //remove
            public static int remove() {
                if(isEmpty()) {
                    System.out.println("Queue emPty");
                    return -1;
                }

                return s1.pop();
            }

            //peek
            public static int peek() {
                if(isEmpty()) {
                    System.out.println("Queue emPty");
                    return -1;
                }

                return s1.peek();
            }
        }
*/
// QUESTION NO. 3
/*
        static class Stack {
            static Queue<Integer> q1 = new LinkedList<>();
            static Queue<Integer> q2 = new LinkedList<>();

            public static boolean isEmpty() {
                return q1.isEmpty() && q2.isEmpty();

            }

            public static void push(int data) {
                if(!q1.isEmpty()) {
                    q1.add(data);
                } else {
                    q2.add(data);
                }
            }

            public static int pop() {
                if(isEmpty()) {
                    System.out.println("Empty Stack");
                    return -1;
                }
                int top = -1;

                //case 1
                if(!q1.isEmpty()) {
                    while(!q1.isEmpty()) {
                        top = q1.remove();
                        if(q1.isEmpty()) {
                            break;
                        }
                        q2.add(top);
                    }
                } else { //case 2
                    while(!q2.isEmpty()) {
                        top = q2.remove();
                        if(q2.isEmpty()) {
                            break;
                        }
                        q1.add(top);
                    }

                }
                return top;
            }

            public static int peek() {
                if(isEmpty()) {
                    System.out.println("Empty Stack");
                    return -1;
                }
                int top = -1;

                //case 1
                if(!q1.isEmpty()) {
                    while(!q1.isEmpty()) {
                        top = q1.remove();
                        q2.add(top);
                    }
                } else { //case 2
                    while(!q2.isEmpty()) {
                        top = q2.remove();
                        q1.add(top);
                    }

                }
                return top;
            }
        }

        */

// QUESTION 4
/* 
    public static void printNonRepeating() {
        String str = "aabccxb";

        int freq[] = new int [26];
        Queue<Character> q = new LinkedList<>();

        for(int i=0; i<str.length(); i++) {
            char ch = str.charAt(i);
            q.add(ch);
            freq[ch-'a']++;

            while(!q.isEmpty() && freq[q.peek()-'a'] > 1) {
                q.remove();
            }

            if(q.isEmpty()) {
                System.out.print(-1+" ");
            } else {
                System.out.print(q.peek()+" ");
            }
        }
        System.out.println();
    }
*/ /* 
    public static void interLeave() {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        q.add(9);
        q.add(10);

        Queue<Integer> firstHalf = new LinkedList<>();
        int size = q.size();
        //size calculate kare warna remove ke waqt size kam ho zayega
        for(int i=0; i<size/2; i++) {
            firstHalf.add(q.remove());

        }
        while(!firstHalf.isEmpty()) {
            q.add(firstHalf.remove());
            q.add(q.remove());
        }

        while(!q.isEmpty()) {
            System.out.print(q.remove()+ " ");
        }
        System.out.println();
        
        
    }
    */
 /* 
    public static Queue revesQueue() {
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        Stack<Integer> s = new Stack<>();
        while(!q.isEmpty()){
            s.push(q.remove());
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
        return q;
    }
    */
/* 
    public static Deque deQue() {

        Deque<Integer> deque = new LinkedList<>();
        deque.addFirst(1);
        deque.addFirst(2);
        deque.addFirst(3);
        deque.addFirst(4);
        deque.addLast(5);
        deque.addLast(6);
        deque.removeLast();
        System.out.println(deque);

        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());

        return deque;
    }
    */

    static class Stack {
        Deque<Integer> deque = new LinkedList<>();

        public void push(int data) {
            deque.addLast(data);
        }

        public int pop() {
            return deque.removeLast();
        }

        public int peek() {
            return deque.getLast();
        }
    }

    public static void newStackDeque() {
        Stack s1 = new Stack();
        s1.push(1);
        s1.push(2);
        s1.push(3);

        System.out.println("peek = "+ s1.peek());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
        System.out.println(s1.pop());
    

        }

    static class Queue {
        Deque<Integer> deque = new LinkedList<>();

        public void add(int data) {
            deque.addLast(data);
        }

        public int remove() {
            return deque.removeFirst();
        }

        public int peek() {
            return deque.getFirst();
        }
    }

    public static void newQueue() {
        Queue q1 = new Queue();

        q1.add(1);
        q1.add(2);
        q1.add(3);

        System.out.println("peek : "+ q1.peek());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
        System.out.println(q1.remove());
    }

    
    public static void main(String args[]) {
     
        /* 
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
        */
        /* 
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        s.push(3);

        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        */

   
       newQueue();
       
       
        
    }
}