package objectandclass;

public class Demo1 {
    public static void main(String[] args) {
        SimpleCircle si = new SimpleCircle(30);
        System.out.println(si.radius);

        System.out.println(new SimpleCircle().radius);//匿名实例
    }
}
