package basejava.Java8;

import utils.Sha256;
import utils.UUIDTool;

/**
 * @author lingjun.jlj
 * @create 2017-09-17
 **/
public class Test {

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(new Test().new RunThread(), "线程" + i).start();
        }
    }

    class RunThread implements Runnable {

        // 执行15秒运算
        @Override
        public void run() {
            long time = System.currentTimeMillis();
            String uuid = UUIDTool.getUUID();
            String min = Sha256.getSHA256StrJava(uuid);
            while (true) {
                String str = Sha256.getSHA256StrJava(uuid);
                if (str.compareTo(uuid) < 0) {
                    min = str;
                }
                if ((System.currentTimeMillis() - time) == 15 * 1000) {// 执行15秒
                    System.out.println(Thread.currentThread().getName() + "   " + min);
                    break;
                }
            }

        }
    }
}
