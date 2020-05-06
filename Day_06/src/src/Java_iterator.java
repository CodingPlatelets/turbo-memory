package src;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Java_iterator {
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int ans = 0;
        for (int i = 0; i < n; i++)
            for (int j = i + 1; j <= n; j++)
                if (allUnique(s, i, j)) ans = Math.max(ans, j - i);
        return ans;
    }

    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i < end; i++) {
            Character ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
//        System.out.println(list);
//
//        Iterator<String> it = list.iterator();
//        System.out.println(it.hasNext());
//        while(it.hasNext()){
//            System.out.println(it.next());
//            it.remove();                //删除当前迭代的成员
//        }
//        System.out.println(list);

//        ArrayList<Integer> i = new ArrayList<>();
//        i.add(1);
//        i.add(2);
//        i.add(3);
//
//        int []in = new int[10];
//        in[0] =1;
//        System.out.println(in.length);
//        int j = 0;
//        for (int n : in) {
//            n = j;
//            j++;
//        }
//        for(int q = 0; q<10 ;q++){
//            System.out.print(in[q]);
//        }
//        System.out.println();
//        //foreach的本质也是iterator
//        for (String s : list) {
//            System.out.println(s);
//        }
//        System.out.println(list);
//
//        for (Integer im : i ){
//            im = 0;
//        }
//        System.out.println(i);
//        int a = 1;
//        int b = 2;
//        if(a==1 || b==2){
//            System.out.println("abc");
//        }
//        int a = lengthOfLongestSubstring("abcabcbb");
//        System.out.println(a);
//        String st = "a.b.c.d";
//        StringBuilder s = new StringBuilder();
//        int cnt = 0;
//        char [] c = st.toCharArray();
//        while(cnt < st.length()){
//            if(c[cnt] == '.'){
//                s.append("[.]");
//            }else{
//                s.append(c[cnt]);
//            }
//            cnt++;
//        }
//        s.toString();
        int x = 10;
        System.out.println(Integer.MAX_VALUE);


    }

}
