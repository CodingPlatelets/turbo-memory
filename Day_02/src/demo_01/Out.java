package demo_01;

public class Out {

    public static void methods(){
        System.out.println("===============");
    }
    public static void main(String[] args) {
        Students one = new Students("郭靖",19);
        Students two = new Students("黄蓉",16);

        Students.room = "Beijing";

        System.out.println("name: " + one.getName() + " age : "+ one.getAge()
                + " room : " + Students.room + "  id : " + one.getId());
        System.out.println("name: " + two.getName() + " age : "+ two.getAge()
                + " room : " + Students.room + "  id : "+ two.getId());

        methods();
        Students.method();

    }

}
