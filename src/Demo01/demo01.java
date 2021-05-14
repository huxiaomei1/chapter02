package Demo01;

/**
 * @author huxiaomei
 * @date 2021/4/22 8:36
 */
public class demo01 {
    public static void main(String[] args) {
        /*Phone iphoneSE3 = new Phone();
        iphoneSE3.width = 25;
        iphoneSE3.high = 55;
        iphoneSE3.weight = 155;
        iphoneSE3.color = "玫瑰金";*/

        Phone onePlue = new Phone(26, 56, 156, "琥珀蓝");

    }public boolean equals(Object obj){
        return (this==obj);
    }
    public String toString(){
        return getClass().getName()+"@"+Integer.toHexString(hashCode());
    }
}
