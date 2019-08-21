import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>Title: Test</p>
 * <p>Description: TODO</p>
 * <p>Copyright: Copyright (c) 2019 佛山市网景科技有限公司</p>
 *
 * @author zhh
 * @version 1.0
 * @date 2019/8/19 14:48
 */
public class Test {
    public static void main(String[] args) {


        int i = 0;
        PrizeMathRandom a = new PrizeMathRandom();
        int[] result=new int[4];
        List<Prize> prizes = new ArrayList<Prize>();

        Prize p1 = new Prize();
        p1.setPrize_name("一等奖");
        p1.setPrize_weight(4);//奖品的权重设置成1
        prizes.add(p1);

        Prize p2 = new Prize();
        p2.setPrize_name("二等奖");
        p2.setPrize_weight(5);//奖品的权重设置成2
        prizes.add(p2);

//        Prize p3 = new Prize();
//        p3.setPrize_name("三等奖");
//        p3.setPrize_weight(100);//奖品的权重设置成3
//        prizes.add(p3);

        Prize p4 = new Prize();
        p4.setPrize_name("无中奖");
        p4.setPrize_weight(36);//奖品的权重设置成4
        prizes.add(p4);

        System.out.println("抽奖开始");
        for (i = 0; i < 10000000; i++)// 打印100个测试概率的准确性
        {
            int selected=a.getPrizeIndex(prizes);
           // System.out.println("第"+i+"次抽中的奖品为："+prizes.get(selected).getPrize_name());
            result[selected]++;
            //System.out.println("--------------------------------");
        }
        System.out.println("抽奖结束");
        System.out.println("每种奖品抽到的数量为：");
        System.out.println("一等奖："+result[0]);
        System.out.println("二等奖："+result[1]);
       // System.out.println("三等奖："+result[2]);
        System.out.println("无中奖："+result[2]);


    }
}
