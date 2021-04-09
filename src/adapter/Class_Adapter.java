package adapter;

public class Class_Adapter {
    private final Class_1 class1;

    public Class_Adapter(Class_1 class1) {
        this.class1 = class1;
    }

    public Class_Adapter(int change) {
        this.class1 = new Class_1(change);
    }

    public void makeFit(Class_2 class2){
        int mod = (int) (class1.getNumber()-class2.getNum()*Math.sqrt(2));
        System.out.println("reducing Class_1 " + class1.getNumber() + " by " + ((mod < 0) ? 0 : mod) + " mod");
        if (mod > 0) {
            class1.setNumber(class1.getNumber() - mod);
            System.out.println("number is now " + class1.getNumber());
        }
    }
}
