package demo1;

import java.util.Scanner;

public class ChuShu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入被除数");
        int x=sc.nextInt();
        System.out.println("请输入除数");
        int y=sc.nextInt();
        int n=x;int count=0;
        while(n>=y){
            n=n-y;
            count++;
        }
        System.out.println("商是"+count);
        System.out.println("余数是"+n);
    }
}
