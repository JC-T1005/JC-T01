package demo1;

import java.util.Scanner;

public class HuiWenShu {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入一个数");
        int x=sc.nextInt();
        int z=x;
        int ge=0;int y=0;
        while(z!=0){
            ge=z%10;
            z=z/10;
            y=y*10+ge;
        }
        if(y==x){
            System.out.println("是回文数");
        }
        else{
            System.out.println("不是回文数");
        }
    }
}
