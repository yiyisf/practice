public class CustomerExtendsTest extends CustomerDemo{

    public static void main(String[] args){
        CustomerExtendsTest c = new CustomerExtendsTest();
        c.name="zhang";
        int age = c.getAge();
        System.out.println(c.name);
        System.out.println(age);

    }
}
