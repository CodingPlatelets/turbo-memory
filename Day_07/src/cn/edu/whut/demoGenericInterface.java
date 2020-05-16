package cn.edu.whut;

public class demoGenericInterface {
    public static void main(String[] args) {
        GenericInterface g1 = new GenericInterfaceImp1();
        g1.method01("Hello world!");
        g1.method02("I am Edward!");
        GenericInterfaceImp2<String> g2 = new GenericInterfaceImp2<>();
        g2.method01("Huangwenkan");
        g2.method02("Hello world!");
        GenericInterfaceImp2<Boolean> g3 = new GenericInterfaceImp2<>();
        g3.method02(true);


    }
}
