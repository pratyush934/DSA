import java.nio.file.FileSystemLoopException;
import java.nio.file.attribute.FileStoreAttributeView;
import java.nio.file.FileSystemLoopException;
import java.util.*;


public class Basics {

    public static int isCredit() {
        
        String str = "4567123456789129";
        
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=str.length()-2; i>=0; i -= 2) {
            list.add((str.charAt(i)-'0')*2);
        }
        System.out.println(list);
        for(int i=0; i<list.size(); i++) {
            if(list.get(i) >= 10) {
                list.set(i, (list.get(i))-9);
            }
        }
        System.out.println(list);
        int sum = 0;
        for(int i=0; i<list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
        int sum1 = 0;
        for(int i=str.length()-1; i>=0; i -= 2) {
            sum1 += str.charAt(i)-'0';
        }
        System.out.println(sum1);
        int target = (sum+sum1) % 10;
        return target == 0 ? 1 : 0;
    }

    
    public static void main(String args[]) {

        System.out.println(isCredit());
    }
    
}
