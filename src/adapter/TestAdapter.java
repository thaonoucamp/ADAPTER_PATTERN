package adapter;

public class TestAdapter {
    public static void main(String[] args) {
        Class_2 class_2 = new Class_2(6);
        Class_Adapter classAdapter;
        for (int i = 6; i < 10; i++) {
            classAdapter = new Class_Adapter(i);
            classAdapter.makeFit(class_2);
        }
    }
}
