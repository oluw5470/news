import hsa.*;
public class employ {

   
    public static void main(String[] args) {
        Console c = new  Console();
        int pay= 15;
        double ohour = 22.5;
        double ttime1=0;
        double ttime2=0;
        double ttime3=0;
        double ttime4=0;
        double ttime5=0;
        int time1;
        int time2;
        int time3;
        int time4;
        int time5;
        
        c.print("please enter the first person's hours ");
        time1 = c.readInt();
        c.print("please enter the second person's hours ");
        time2 =c.readInt();
        c.print("please enter the third person's hours ");
        time3 =c. readInt();
        c.print("please enter the fourth person's hours ");
        time4 = c.readInt();
        c.print("please enter the fifth person's hours ");
        time5 =c.readInt();
        
            while (true)
             {
                
                if (time1<1 || time1 >70 || time2<1 || time2 >70 || time3<1 || time3 >70 || time4<1 || time4 >70 || time5<1 || time5 >70 )
                {
                    c.close();
                }
               
                 
                 break;
             }
             if(time1>40 )
                {
                    ttime1 = ((double)time1-40)*22.5;  
                   
                }
                if(time2>40)
                {
                    ttime2= ((double) time2-40)*22.5;
                    
                }
                if(time3>40)
                {
                    ttime3 = ((double)time3-40)*22.5;
                }
                if(time4> 40)
                {
                    ttime4 = ((double)time4-40)*22.5;
                }
                if(time5> 40)
                {
                    
                    ttime5=((double)time5-40)*22.5;
                    
                } 
                 double tttot=ttime1+ttime2+ttime3+ttime4+ttime5;
                    double ttot=(time1*15)+(time2*15)+(time3*15)+(time4*15)+(time5*15);
                    double tot = tttot+ ttot;
                    c.println("Over time hours: "+tttot);
                    c.println("Hours: " +ttot);
                    c.print("Total hours: "+tot);
      
    }
}