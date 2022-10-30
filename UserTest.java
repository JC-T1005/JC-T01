package demo2;

import java.util.ArrayList;
import java.util.Scanner;

//根据id查找用户信息
public class UserTest {
    public static void main(String[] args) {
        //创建集合
        ArrayList<User> user=new ArrayList<>();
        //创建三个用户对象
        User u1=new User("huawei001","kang","123456");
        User u2=new User("huawei002","zhang","123459");
        User u3=new User("huawei003","wang","123458");
        //放入集合
        user.add(u1);
        user.add(u2);
        user.add(u3);
        //键盘录入信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入要查找的id:");
        String id1=sc.next();
        Contain(user,id1);
    }
    public static void Contain(ArrayList<User> user,String id1){
        for (int i = 0; i < user.size(); i++) {
            boolean result = user.get(i).getId().equals(id1);
            if (result) {
                System.out.println(user.get(i).getId()+" "+user.get(i).getUsername()+" "+user.get(i).getPassword());
                break;
            }
            System.out.println("找不到用户信息");
        }
    }
}
