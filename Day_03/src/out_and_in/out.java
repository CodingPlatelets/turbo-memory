package out_and_in;

public class out { //外部类
    public int num = 30;

    public class in { //成员内部类
        public int num = 20;

        public void method() {
            class in_in{ //局部内部类
                int num = 40;
                public void in_in_nethod(){
                    System.out.println(num);
                }
            }
            int num = 10;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(out.this.num);
            in_in inn = new in_in();
            inn.in_in_nethod();
        }
    }
}
