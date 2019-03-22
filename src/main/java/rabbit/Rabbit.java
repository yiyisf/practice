package rabbit;

public class Rabbit {

    private int num;

    public int Rabbit(int num) {
        this.num = num;
        if (this.num == 2 || this.num == 1)
        {
            return 1;
        }
        else {
            return Rabbit(num - 1) + Rabbit(num - 2);

        }


    }


}