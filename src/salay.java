import BreezySwing.*;
import hsa.*;
public class salay {

    
    public static void main(String[] args) {
        Console c= new Console();
        double pay, raise,incp,npay,opay;
        double year=0;
        pay=40000;
        
        for(int x=0;x<=10;x++)
        {
        year++;
        incp=year * .03;
        raise= incp*pay;
        npay= raise +pay;
        opay= npay-1200;
        c.print(opay);
        }
        
    }
    
}
