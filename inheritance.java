class calc
{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class Advcalc extends calc{
    public int multi(int a,int b){
        return a*b;
    }
    public int div(int a,int b){
        return a/b;
    }
}
public class Main{
public static void main(String[] args){
        Advcalc obj =new Advcalc();
        int result1=obj.add(10,20);
        int result2=obj.sub(20,10);
        int result3=obj.multi(5,5);
        int result4=obj.div(10,2);
        System.out.println(result1+""+result2+""+result3+""+result4);
    }
}