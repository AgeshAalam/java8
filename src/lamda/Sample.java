package lamda;

public class Sample {
    public static void main(String[] args) {
        Thread th=new Thread(()-> System.out.println("in run"));
        System.out.println("in main");
        th.start();
    }
}
