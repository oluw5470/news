import hsa.*;
import BreezySwing.Format;
public class powers {

    public static void main(String[] args) {
        Console c = new Console();
       int num,anum,rnum;
       c.print("plz enter the first number ");
      
       rnum= c.readInt();
       for(int x=1; x<=rnum; x++)
       {
           num=(int)Math.pow(2,x);
           c.println(x+"\t"+num);
                   
       }
       
      
    }
    
}