package demo_02;

public interface myInterface {
    void method();
    public abstract void method2();
    /*public*/ default void mathotd1(){
        System.out.println("no");
    }
}
