package demo_02;

/*
* == 是比较对象
*
* 方法1：
* public boolean equals(Object O) 只能用来比较字符串的内容
* 注意：具有对称性
* 方法2：
* public boolean equalsIgnoreCase(String str)
* 忽略大小写
*/
public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hel";
        char[] str = {'H','e','l'};
        String str2 = new String(str);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals("Hel"));//  不推荐
        System.out.println("Hel".equals(str1));// 推荐
//        for (int i = 0; i < str.length; i++) {
//
//        }
//        str.fori就行了

    }
}
