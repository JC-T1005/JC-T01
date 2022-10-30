package demo2;
//定义数组储存三只精灵对象
//精灵名称,属性,种族值  创建三个对象
public class Pokemon {
    private String name;
    private String attribute;
    private int Value;

    public Pokemon() {
    }

    public Pokemon(String name, String attribute, int Value) {
        this.name = name;
        this.attribute = attribute;
        this.Value = Value;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAttribute() {
        return attribute;
    }
    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }
    public int getValue() {
        return Value;
    }
    public void setValue(int Value) {
        this.Value = Value;
    }
    public String toString() {
        return "Pokemon{name = " + name + ", attribute = " + attribute + ", Value = " + Value + "}";
    }
}
