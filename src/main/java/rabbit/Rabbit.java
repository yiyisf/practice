package rabbit;

public class Rabbit {

    private int num;

    public int Rabbit(int num) {
        this.num = num;
        if (this.num == 1 || this.num == 2)
        {
            return 1;
        }
        else {
            return Rabbit(num - 1) + Rabbit(num - 2);
        }


    }

//    public void Print(){
//        System.out.printf("第"+this.num+"个月共有"+String.valueOf(Rabbit(this.num))+"只小兔子");
//    }



}