package Git;

public class Demo1 {
    private int a;
    private String b;

    public Demo1(int a, String b) {
        this.a = a;
        this.b = b;
        System.out.println("111");
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public String getB() {
        return b;
    }

    public String setB(String b) {
        this.b = b;
        return this.b;
    }

    public static void main(String[] args) {
//        System.out.println("11");

        /*
          红色代表没有被追踪过
          绿色代表存储在暂存区当中
          蓝色代表以提交之后，修改过
        * */
        Demo1 Demo = new Demo1(1,"22");
        System.out.println(Demo.setB("wangjn"));
        System.out.println("出自我手啊就将计就计");
        System.out.println("third commit");
        System.out.println("hot-fix test");
    }
}
