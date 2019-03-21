package robot;

/**
 * Created by liuzhe on 2019/3/21.
 */
public class Robot {
    public boolean isCheaper(double price1,double price2){
        return price1<price2;


    }

    public double totalAmount(double price,double amount){
        return price*amount;

    }
    public boolean isYear(int year){
        if ((year%4==0)&&(year%100!=0)||(year%400==0)){
            return true;
        }
        else
            return false;

    }

    public int encrypt(int data){
//        %求余数  /求商
// 9876   6  7  8  9

        int data1=data%10;
        int data2=data/10%10;
        int data3=data/100%10;
        int data4=data/1000;

        data1=(data1+5)%10;
        data2=(data1+5)%10;
        data3=(data1+5)%10;
        data4=(data1+5)%10;

        int result = data1*1000+data2*10000+data3*100+data4*10;
        return result;



    }



}
