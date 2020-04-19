package demo_02;

public class her {

    private myInterface in;

    public her() {
    }

    public her(myInterface in) {
        this.in = in;
    }

    public myInterface getIn() {
        return in;
    }

    public void setIn(myInterface in) {
        this.in = in;
    }


    public void met() {
        in.method();
        in.mathotd1();
    }
}
