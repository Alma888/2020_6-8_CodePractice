# 2020_6-8_CodePractice

//《超长正整数相加》

请设计一个算法完成两个超长正整数的加法。
//       【接口说明】：
//       /*
//      请设计一个算法完成两个超长正整数的加法。
//      输入参数：String addend：加数
//                        String augend：被加数
//       返回值：加法结果
//      */
//       public String AddLongInteger(String addend, String augend)
//        {
//                   /*在这里实现功能*/
//                   return null;
//        }

//【输入描述】：输入两个字符串数字

//【输出描述】：输出相加后的结果，string型

//【示例1】:  输入 99999999999999999999999999999999999999999999999999
//                 1
//            输出 100000000000000000000000000000000000000000000000000

//【解题思路】
//Java语言处理该问题，优势比较大，参考BigInteger类就可以处理。核心API考察，
// 如果API限制，可以考虑采用字符串解析处理。


import java.math.BigInteger;
import java.util.Scanner;

public class BigInteger_Add {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            BigInteger num1 = new BigInteger(s1);
            BigInteger num2 = new BigInteger(s2);
            //采用BigInteger可以直接进行大整数进行计算
            //BigInteger的add()方法用于大整数相加
            System.out.println(num1.add(num2));
        }
    }
}
