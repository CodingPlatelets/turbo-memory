package cn.edu.whut;

public class GenericInterfaceImp2<E> implements GenericInterface<E> {

    @Override
    public void method01(E e) {
        System.out.println(e);
    }

    @Override
    public void method02(E e) {
        System.out.println(e);
    }
}
