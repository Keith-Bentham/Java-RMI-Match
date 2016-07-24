
import java.rmi.Naming;
 
 
public class MatchServer {
     
    public static void main(String [] args)
    {
        try
        {
            MatchImpl m = new MatchImpl("Manu","Liverpool");
            //MatchImpl p2 = new MatchImpl("Microwave Oven");
             
            Naming.rebind("match",m);
            //Naming.rebind("microwave",p2);
             
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
 
 
}