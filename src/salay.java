import BreezySwing.*;
import hsa.*;
public class salay {

    
    public static void main(String[] args) {
        Console c= new Console();
        double pay, raise,incp,npay,opay;
        int year;
        pay=40000;
        c.print(Format.justify('r', "year", 6));
        c.print(Format.justify('r', "Old Salary",20));
        c.print(Format.justify('r', "Raise", 20));
        c.println(Format.justify('r', "New Salary", 20)+"\n");
        for(year=0;year<=10;year++)
        {
        
        c.print(Format.justify('r', year, 6));
        incp=year * .03;
        raise= incp*pay;
        npay= raise +pay;
        opay= npay-2400;
           if(opay<40000)
           {
           c.print(Format.justify('r', 0, 20,0));
           }
           else
               c.print(Format.justify('r', opay, 20,0));
           
           c.print(Format.justify('r', raise, 20,0));
           c.println(Format.justify('r', npay, 20,0));
           
       
        }
        
    }
    
}
