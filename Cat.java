package demo1;

public class Cat {
    private String name;
    private int age;

    public void setName(String n){
        name=n;
    }
    public String getName(){
        return name;
    }
    public void setAge(int a){
        if(a>=1&&a<=15){
            age=a;
        }else{
            System.out.println("error");
        }
    }
    public int getAge(){
        return age;
    }
}
