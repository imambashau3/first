
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Method {

    public int add(int a,int b){
        return a+b;
    }
    public static int mul(int a,int b){
        return a*b;
    }
    public void add(int... a){
        System.out.println(" var-Argument method");
    }
    public static void main(String[] args) {
Method obj=new Method();

int a=obj.add(1,99);
        System.out.println("the addition of two integers :"+a);
int j=mul(10,10);
        System.out.println("the addition of two integers :"+j);
obj.add(1);
obj.add(1,2,3);
int z=Method.mul(9,9);
        System.out.println("the multipilcation of two integers is :"+z);
    }
}