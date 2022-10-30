package demo1;

public class RoleTest {
    public static void main(String[] args) {
        Role r1=new Role("盖欧卡",100);
        Role r2=new Role("固拉多",100);
        while(true){
            //r1开始攻击r2
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"K.O.了"+r2.getName());
                break;
            }
            //r2开始攻击r1
            r2.attack(r1);
            if(r1.getBlood()==0){
                System.out.println(r2.getName()+"K.O.了"+r1.getName());
                break;
            }
        }
    }
}
