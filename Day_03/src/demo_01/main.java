package demo_01;

public class main {
    public static void main(String[] args) {
        Weapon weapon = new Weapon("111");
        Hero hero1 = new Hero("Edward",19, new Weapon("sore"));
        Hero hero2 = new Hero("Edward",19, /*new Weapon("sore")*/weapon);
        hero1.attack();
        hero2.attack();
    }

}
