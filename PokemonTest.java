package demo2;
//面向对象综合训练02
import java.util.Scanner;

public class PokemonTest {
    public static void main(String[] args) {
        //创建一个数组用来存放对象
        Pokemon[]arr=new Pokemon[3];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < arr.length; i++) {
            //创建精灵对象
            Pokemon c=new Pokemon();//sc和c不一样!!
            //录入名称
            System.out.println("请输入精灵名称");
            String name=sc.next();
            c.setName(name);
            //录入属性
            System.out.println("请输入精灵属性");
            String attribute=sc.next();
            c.setAttribute(attribute);
            //录入种族值
            System.out.println("请输入精灵种族值");
            int value=sc.nextInt();
            c.setValue(value);
            arr[i]=c;
        }
        //遍历数组
        for (int i = 0; i < arr.length; i++) {
            Pokemon pokemon=arr[i];
            System.out.println(pokemon.getName()+" 属性 "+pokemon.getAttribute()+" 种族值 "+pokemon.getValue());
        }
    }
}
