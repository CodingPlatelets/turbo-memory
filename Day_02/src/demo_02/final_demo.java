package demo_02;

public class final_demo {
    private final String name;

    public final_demo() {
        name = "Edward";
    }

    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public final_demo(String name) {
        this.name = name;
    }
    public void method(){
        System.out.println(name);
    }


}
