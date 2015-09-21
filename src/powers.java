import hsa.*;
import BreezySwing.Format;
public class powers {

    public static void main(String[] args) {
        Console c = new Console();
       int num,anum,rnum;
       
       anum=2;
       rnum= c.readInt();
       for(int x=0; x<=rnum; x++)
       {
           num=(int)Math.pow(2,x);
       }
       
      
    }
    
}