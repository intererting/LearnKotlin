package k_1_4;

/**
 * author        yiliyang
 * date          2022-12-26
 * time          上午9:32
 * version       1.0
 * since         1.0
 * <p>
 * jdk 9 以后就不是用StringBuilder了，而是使用invokedynamic
 */
public class Main {
    public static void main(String[] args) {
        String a = "haha";
        String b = "hehe";
        String c = a + b;
        System.out.println(c);
    }
}
