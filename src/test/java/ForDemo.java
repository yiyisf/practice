import org.junit.Test;

public class ForDemo {

    @Test
    public void fun1(){
        for (int i=0;i<10;i++){
            System.out.println(i);}
    }

    //while (i<10){
    // System.out.println(i);
    // i++;}

    @Test
    public void fun2(){
        int i = 0;
        while (i<10){
            System.out.println(i);
            i++;
        }

    }
//    do{
//        System.out.println(i);
//        i++;
//    }while (i<10);
    @Test
    public void fun3(){
        int i = 0;
        do{
            System.out.println(i);
            i++;
        }while (i<10);
    }
    @Test
//    continue:中断后，下次继续；break：中断后，没有下次了；return：也是中断后返回值
    public void fun6(){
        for (int i=0;i<10;i++){
            if(i>5){
//                continue;
//                break;
                return;
            }
            System.out.println(i);

        }

        }

//        try {
//
//        }catch (){
//        }
//        finally {
//
//        }
    @Test
    public void fun7(){
        try{
            System.out.println(10/0);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("我是finally");

        }
    }

    @Test
//    增强for循环
    public void fun8(){
        String [] strArr={"a","b","c","d"};
//        for(int i=0;i<str.length;i++){
//            System.out.println(str[i]);
//        }
        for(String str :strArr)
        {
            System.out.println(str);
        }
    }

    @Test
//    非增强for循环
    public void fun9(){
        int [] intArr={1,2,3,4};
        int s=0;
        for(int i=0;i<intArr.length;i++){
            s=s+intArr[i];
            System.out.println(s);
        }

    }

    @Test
//    增强for循环
    public void fun10(){
        int [] intArr={1,2,3,4};
        int s=0;
        for(int i :intArr)
        {
            s=s+i;
            System.out.println(s);
        }

    }



}
