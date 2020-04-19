package demo_01;

public class Students {

    private String name;
    private int id;
    private int age;
    static String room;
    static int idcounter = 0;


    public Students(){
        ++ idcounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
        this.id =  ++ idcounter ;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static void method(){
        System.out.println("This is a static method!");
    }
}
