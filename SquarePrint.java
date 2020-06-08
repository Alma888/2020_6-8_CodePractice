# 2020_6-8_CodePractice

//标题：跟奥巴马一起编程
//2014年底，为庆祝“计算机科学教育周”正式启动，奥巴马编写   了很简单的计算机代码：在屏幕上画一个正方形。现在你也跟他一起画吧！
//【输入描述】：输入在一行中给出正方形边长N（3<=N<=20）和组成正方形边
//                         的某种字符C，间隔一个空格。
//【输出描述】：输出由给定字符C画出的正方形。但是注意到行间距比列间距
//                         大，所以为了让结果看上去更像正方形，我们输出的行数实际
//                         上是列数的50%（四舍五入取整）。
//【示例1】:输入 10  a
//                 输出 aaaaaaaaaa
//                      a        a
//                      a        a
//                      a        a
//                      aaaaaaaaaa
//【解题思路】
//整体思路：先接受输入获取到行数，字符；
//         然后第一行输出 ，中间行输出，最后一行输出。
//第一行输出：输出指定列数个的指定字符，比如：3 个 a
//中间行输出：只在第一列和最后一列输出a , 中间行数为列数的50% , 如：1
//最后一行输出：同第一行
//         a a a
//         a   a
//         a a a


import java.util.Scanner;

public class SquarePrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();  //正方形的边长（输出的列数）
        String c = sc.next();  //组成正方形的字母（输出的字符）
        for (int i = 0; i < N; i++) {//输出第一行
            System.out.print(c);
        }
        System.out.println();//第一行换行
        for(int i=1;i<=Math.ceil((double)N/2)-2;i++){//输出中间行
            System.out.print(c);//中间行第一个字符
            for (int j = 1; j < N - 1; j++) {
                System.out.print(" ");//中间行其它字符为空字符串
            }
            System.out.print(c);//中间行最后一个字符
            System.out.println();//中间行换行
        }
        for (int i=0;i<N;i++){//输出最后一行
            System.out.print(c);
        }
    }
}
