package weapon;

/**
 * Created by liuzhe on 2019/3/19.
 */
public class Weapon {
//属性
    private String name;

    private double length;

    double weight;

    private boolean isStretchable;


    private String madein;

    Monkey owner;
//构造方法
    public Weapon(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public boolean isStretchable() {
        return isStretchable;
    }

    public void setStretchable(boolean stretchable) {
        isStretchable = stretchable;
    }

    public String getMadein() {
        return madein;
    }

    public void setMadein(String madein) {
        this.madein = madein;
    }

    public Monkey getOwner() {
        return owner;
    }

    public void setOwner(Monkey owner) {
        this.owner = owner;
    }

//重写
    @Override
    public String toString() {
        return "Weapon{" +
                "name='" + name + '\'' +
                ", length=" + length +
                ", weight=" + weight +
                ", isStretchable=" + isStretchable +
                ", madein='" + madein + '\'' +
                ", owner=" + owner.getName() +
                '}';
    }
//方法
    void print() {

        System.out.println(toString());
//        System.out.printf(this.name);
//        System.out.printf(String.valueOf(this.length));
//
//        System.out.printf(String.valueOf(this.weight));
//
//        System.out.printf(String.valueOf(isStretchable));
//        System.out.printf(this.madein);
//        System.out.printf(owner.getName());


    }


}
