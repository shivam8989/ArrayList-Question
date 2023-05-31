package Arraylist;
import java.util.ArrayList;
public class Swap {
    public static void swap(ArrayList<Integer> list ,int i, int j){
        int temp  = list.get(i);
        list.set(i,list.get(j));
        list.set(j,temp);
        System.out.println(list);
    }
    public static void main(String args []){
        ArrayList<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(5);
        s.add(9);
        s.add(3);
        s.add(6);
        System.out.println(s);
        System.out.println("After swap");
        int idx1=1, idx2 = 3;
        swap(s,1,3);


    }
}
