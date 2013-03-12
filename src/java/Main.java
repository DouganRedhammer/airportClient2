/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dougan
 */
public class Main 
{


            
    public static void main(String[] args)
    {
        System.out.println(Main.getAirportInformationByAirportCode("nrt"));
    }

    private static String getAirportInformationByAirportCode(java.lang.String arg0) {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getAirportInformationByAirportCode(arg0);
    }


    
    
    
}
