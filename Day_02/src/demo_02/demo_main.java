package demo_02;

public class demo_main {

    public static void main(String[] args) {
//        fu f = new zi();
//        f.method();
//        fu f1 = new fu();
//        f1.method();
//        final_demo fina = new final_demo("we");
//        fina.method();
//        final_demo fina1 = new final_demo();
//        fina1.method();
//        myInterface my = new myinterfaceImpl1();
//        my.method();
//        my.method2();
//        my.mathotd1();
        myInterface m = new myInterface() {
            @Override
            public void method() {
                System.out.println("匿名内部类1");
            }

            @Override
            public void method2() {
                System.out.println("匿名内部类2");
            }
        };
       her h = new her(m);
       her hh = new her(new myInterfaceimpls());
       h.met();
       hh.met();
    }
}
