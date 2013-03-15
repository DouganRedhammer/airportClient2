
import org.my.ns.IOException_Exception;
import org.my.ns.JAXBException_Exception;
import org.my.ns.MalformedURLException_Exception;
import java.util.ArrayList;
/*
 * @author Daniel Franklin, Akash Nadha, Pardeep Bajwa
 * @group  Khalsa
*/
public class Main 
{

    public static void main(String[] args) throws MalformedURLException_Exception, IOException_Exception, JAXBException_Exception
    {
        System.out.println("The airport code NRT belongs to: "+Main.getAirportInformationByAirportCode("nrt") + " airport.");
        System.out.println("The driving distance from Paso Robles to San Jose is: "
                +Main.getDrivingDistance("Paso+Robles", "San+Jose"));
        System.out.println("It will take about " + Main.getDrivingTime("Paso+Robles", "San+Jose") + " to drive there.");
        System.out.println("The current tempature in Paso Robles is " + Main.getTempatureOfCity("Paso Robles", "United States"));
         System.out.println("The current tempature in Tokyo is " + Main.getTempatureOfCity("Tokyo", "Japan"));
         
        String detailedWeather = Main.getWeatherOfCity("Paso Robles", "United States");
         System.out.println(detailedWeather);
         
         System.out.println(Main.getAirportInformationByCityOrAirportName("Paso Robles"));
    }

    
    private static String getAirportInformationByAirportCode(java.lang.String arg0) {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getAirportInformationByAirportCode(arg0);
    }

    private static String getDrivingDistance(java.lang.String arg0, java.lang.String arg1) throws MalformedURLException_Exception, IOException_Exception, JAXBException_Exception {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getDrivingDistance(arg0, arg1);
    }

    private static String getTempatureOfCity(java.lang.String arg0, java.lang.String arg1) {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getTempatureOfCity(arg0, arg1);
    }

    private static String getWeatherOfCity(java.lang.String arg0, java.lang.String arg1) {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getWeatherOfCity(arg0, arg1);
    }

    private static String getAirportInformationByCityOrAirportName(java.lang.String arg0) {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getAirportInformationByCityOrAirportName(arg0);
    }

    private static String getDrivingTime(java.lang.String arg0, java.lang.String arg1) throws IOException_Exception, MalformedURLException_Exception, JAXBException_Exception {
        org.my.ns.ServerImpService service = new org.my.ns.ServerImpService();
        org.my.ns.Server port = service.getServerImpPort();
        return port.getDrivingTime(arg0, arg1);
    }    
    
}
