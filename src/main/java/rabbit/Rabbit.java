package rabbit;

public class Rabbit {
    private int num;


    public int Rabbit(int num) {
        this.num=num;
        if (this.num<=2&&this.num>0)
        {
//           return 1;
           System.out.println(1);
        }
        else {
            System.out.println(Rabbit(num-1)+Rabbit(num-2));


        }

        return num;
    }



}
