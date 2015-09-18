import hsa.*;
public class ded {

   
    public static void main(String[] args) {
        Console c= new Console();
        double num1;
        double num2;
        double nnum;
        double rnum;
        double cnum;
        c.print("plz enter the first number ");
       num1= c.readInt();
       c.print("plz enter the second number ");
       num2= c.readInt();
       if(num1>num2)
        {
        nnum=num1/num2;
        rnum=num1%num2;
        cnum =nnum+rnum;
        c.print("the answer is "+cnum);
       
        }
       else
        {
         nnum=num2/num1;
         rnum=num2%num1;
         cnum=nnum+rnum;
         c.print("the answer is "+cnum);
        }
    }
    
}
