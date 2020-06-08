public class Test {
    public static void main(String args[]) {
        Thread t=new Thread(){
            public void run(){
                dianping();
            }
        };
        t.run();
        System.out.print("dazhong");
    }
    static void dianping(){
        System.out.print("dianping");
    }
}

//最终输出  dianpingdazhong