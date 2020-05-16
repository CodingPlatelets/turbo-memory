package cn.edu.whut;

public class GenericInterfaceImp1 implements GenericInterface<String> {

    @Override
    public void method01(String s) {
        System.out.println(s);
    }

    @Override
    public void method02(String s){
        System.out.println(s);
    }
}
