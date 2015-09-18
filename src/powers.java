import hsa.*;
import BreezySwing.Format;
public class powers {

    public static void main(String[] args) {
        Console c = new Console();
       int num,anum,rnum;
       num=2;
       anum=2;
       rnum= c.readInt();
       for(int x=0;x>10;x++)
       {
           num=num+2
       
       }
               
       
       
       pop=140000;
       c.print(Format.justify('r', "year", 6));
       c.print(Format.justify('r', "population",20));
       c.print(Format.justify('r', "growth", 20));
       c.println(Format.justify('r', "new population", 20)+"\n");
       for (year=2015;year<=2115;year+=10)
       {
           c.print(Format.justify('r', year, 6));
           c.print(Format.justify('r', pop, 20,0));
           growth = pop * 0.03;
           newpop+=growth;
           c.print(Format.justify('r', growth, 20,0));
           c.println(Format.justify('r', newpop, 20,0));
           pop=newpop;
           
                   
       }
    }
    
}