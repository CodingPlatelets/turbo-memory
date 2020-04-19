package demo_01;

public class StringPool {
//    对于基本类型 == 比较数值
//    对于引用类型 == 比较地址


    public static void main(String[] args) {
        //在常量池中
        String str1 = "abc";
        String str2 = "abc";
        //不在常量池
        char [] Arrc = {'a','b','c'};
        String str3 = new String(Arrc);

        System.out.println(str1 == str2);//ture
        System.out.println(str1 == str3);//false
        System.out.println(str2 == str3);//false


    }
}
