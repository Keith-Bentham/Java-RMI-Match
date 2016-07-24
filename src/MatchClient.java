
import java.rmi.Naming;
 
 
public class MatchClient {
     
    public static void main( String args[] ) {
 
        //String url =  "rmi:///";
        try {
                 //  String url= "rmi://172.16.41.112/";      // if object located remotely
        	String url =  "rmi:///";        
        	Match m = ( Match ) Naming.lookup( url + "match" );
                     
              
                    int choice = 1;
 
                    while(choice!=4)
                    {
                     System.out.println();
                     System.out.println("1.Team 1 Score");
                     System.out.println("2.Team 2 Score");
                     System.out.println("3.Print_Score");
                     System.out.println("4.Exit");
 
                     choice = Console.readInt("Please enter a value-->");
                     if(choice==1)
                        {
                            m.team1_goal();
                        }
 
                        else if(choice==2)
                        {
                            m.team2_goal();
 
                        }
 
                        else if(choice==3)
                        {
                            String res=m.read_result();
                            System.out.println(res);
                        }
 
                    }  // end while
 
 
                    //String d = m.getDescription();
                    //System.out.println( "Result: " + d );
               } catch( Exception e ) {
        System.err.println( "Error " + e );}
   }
 
 
}