import java.util.*;

public class Stacks {

    static class StackA {
        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }
        public static void push(int data) {
            list.add(data);
        }
        public static int pop() {
            if(isEmpty()) {
                return -1; 
            }
            int top = (list.get(list.size()-1));
            list.remove(list.size()-1);
            return top;
        }
        public static int peek() {
            if(isEmpty()) {
                return -1; 
            }
            return list.get(list.size()-1);
        }
    }
        
        /* Implentation through LL */

        static class Node {
            int data;
            Node next;
            
            Node(int data) {
                this.data = data;
                this.next = null;
            }
        }
        static class StackL {
            static Node head = null;

            public static boolean isEmpty() {
                return head == null;
            }
            public static void push(int data) {
                Node newNode = new Node(data);
                if(isEmpty()) {
                    head = newNode;
                    return;
                }
                newNode.next = head;
                head = newNode;
            }
            public static int pop() {
                if(isEmpty()) {
                    return -1;
                }
                int top = head.data;
                head = head.next;
                return top;
            }
            public static int peek() {
                if(isEmpty()) {
                    return -1;
                }
                return head.data;
            }
        }


    public static void pushAtBottom(Stack<Integer> s, int data) {
       
        if(s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    } 
    
    public static void main1() {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 4);
        while(!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static String reverseString(String str) {
        Stack<Character> s = new Stack<>();
        int idx = 0;
        while(idx < str.length()) {
            s.push(str.charAt(idx));
            idx++;
        }
        StringBuilder result = new StringBuilder("");
        while(!s.isEmpty()) {
            result.append(s.pop());
        }
        return result.toString();
    }
    public static void main2() {
        System.out.println(reverseString("abc"));
    }

    
    
    public static void main(String args[]) {

        main2();
        
    }
    
}
