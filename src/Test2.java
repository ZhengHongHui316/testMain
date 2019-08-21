import java.math.BigDecimal;

/**
 * <p>Title: Test2</p>
 * <p>Description: TODO</p>
 * <p>Copyright: Copyright (c) 2019 佛山市网景科技有限公司</p>
 *
 * @author zhh
 * @version 1.0
 * @date 2019/8/19 16:51
 */
public class Test2 {


    public static void main(String[] args) {
        BigDecimal sum = new BigDecimal(5);//奖品总数
        BigDecimal sum1 = new BigDecimal(0);//一等奖
        BigDecimal sum2 = new BigDecimal(5);//二等奖
//        BigDecimal sum3 = new BigDecimal(50);//三等奖
        BigDecimal pro = new BigDecimal(0.8);//概率
        System.out.println(Test2.get(pro,sum));//400   0.8 - 100
//        BigDecimal bd =Test2.get(pro,sum);
//        System.out.println(bd);
//        BigDecimal qz = Test2.get1(bd,sum,sum1);
//        System.out.println(qz);
//        qz = Test2.get1(bd,sum,sum2);
//        System.out.println(qz);
//       qz = Test2.get1(bd,sum,sum3);
//        System.out.println(qz);

    }
    //得到伪奖品权重
    public static BigDecimal get(BigDecimal pro,BigDecimal sum){
        BigDecimal result = new BigDecimal(1);
        BigDecimal zj = result.subtract(pro);

        BigDecimal bd = (pro.multiply(sum)).divide(zj,2,BigDecimal.ROUND_DOWN);
        return bd;
    }
    //
//    public static BigDecimal get1(BigDecimal bd,BigDecimal sum,BigDecimal sum1){
//        //BigDecimal bd1 = sum.subtract(bd);
////        BigDecimal bd2  = sum1.divide(sum,2,BigDecimal.ROUND_HALF_UP);//四舍五入
////        BigDecimal qz = sum.multiply(bd2);
//            BigDecimal add = bd.add(sum);
//        BigDecimal multiply = add.multiply(sum1);
//        BigDecimal qz = multiply.divide(sum,2,BigDecimal.ROUND_HALF_UP);
//        return qz;
//    }

}
