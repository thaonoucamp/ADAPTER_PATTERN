package adapter;

public class Class_2 {
    private int num;

    public Class_2() {
    }

    public Class_2(int num) {
        this.num = num;
        System.out.println("Class_2: max Class_1 is " + num * Math.sqrt(2));
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
