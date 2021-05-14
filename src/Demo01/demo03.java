package Demo01;

/**
 * @author huxiaomei
 * @date 2021/4/22 11:00
 */
public class demo03 {
    String name;
    int age;

    public void fun(){
        System.out.println("普通成员方法");
    }

    class Inner{
        int sex;
        double high;

        public void fun01(){
            System.out.println("内部类中的普通方法");
        }
    }
}
