package cn.edu.whut;

import java.util.ArrayList;
import java.util.Iterator;

public class GenericList {

    public static void main(String[] args) {
        ArrayList<String> list01 = new ArrayList<>();
        ArrayList<Integer> list02 = new ArrayList<>();
        list01.add("a");
        list01.add("b");
        list02.add(1);
        list02.add(2);
        list02.add(3);
        printArray(list01);
        printArray(list02);

    }
    public static void printArray(ArrayList<?> list){
        Iterator<?> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }

}
