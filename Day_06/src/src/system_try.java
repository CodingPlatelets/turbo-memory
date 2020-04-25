package src;

import java.util.ArrayList;
import java.util.Arrays;

public class system_try {
    public static void main(String[] args) {
//        demo01();
//        demo02();
        demo03();
    }

    private static void demo03() {
        String s1 = Integer.toString(100);
        System.out.println(s1 + 100);
        Integer i1 = Integer.valueOf(200);
        Integer i2 = Integer.valueOf("100");
        System.out.println(i1 + 100);
        System.out.println(i2 + 100);
        int i3 = 100;
        String s2 = i3 + "";
        System.out.println(s2 + 100);


        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(Integer.valueOf("100"));
        System.out.println(list.get(0) + 2);
        System.out.println(list.get(1) + 100);
        ArrayList<Integer> list1 = new ArrayList<>();
        System.out.println("lis1 is empty ! " + list1.isEmpty());
        list1.add(200);
        list.addAll(list1);
        list.set(0, 2);
        System.out.println(list.toString());
        list.clear();
        System.out.println("lis is empty ! " + list.isEmpty());
    }

    private static void demo02() {
        StringBuilder bu = new StringBuilder("abc");
        System.out.println(bu);
        bu.append("a").append(123).append("huangwenkan").append(true);
        System.out.println(bu);

    }

    private static void demo01() {
        int[] src = {1, 2, 3, 4, 5};
        int[] des = {7, 8, 9, 0, 1};
        System.out.println(Arrays.toString(des));
        System.arraycopy(src, 0, des, 1, 3);
        System.out.println(Arrays.toString(des));
    }

}
