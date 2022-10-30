package demo1;

import java.util.Random;

public class Role {
    private String name;
    private int blood;
    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    //方法调用者攻击参数
    public void attack(Role role){
        //计算造成的伤害1~20
        Random r=new Random();
        int hurt=r.nextInt(20)+1;
        //剩余血量
        int remainblood=role.getBlood()-hurt;
        //对剩余血量做验证,如果为负数就修改为0
        remainblood=remainblood<0?0:remainblood;
        //修改被打人的剩余血量
        role.setBlood(remainblood);
        //this表示方法的调用者
        System.out.println(this.getName()+"使用了[断崖之剑],攻击了"+role.getName()+"一下,"
        +"造成了"+hurt+"点伤害,"+role.getName()+"还剩"+remainblood+"点血");
    }
}
