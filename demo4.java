package demo1;
import java.util.Random;
//数组乱序
public class demo4 {
    public static void main(String[] args) {
        int[]arr={1,2,3,4,5};
        Random r=new Random();
        for (int i = 0; i < arr.length; i++) {
            int randomIndex=r.nextInt(arr.length);//获取随机索引
            //拿i跟索引randomIndex的值互换
            int temp=arr[i];
            arr[i]=arr[randomIndex];
            arr[randomIndex]=temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
