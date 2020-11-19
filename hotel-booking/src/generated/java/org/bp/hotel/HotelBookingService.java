package org.bp.hotel;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-11-12T11:40:18.195+01:00
 * Generated source version: 3.3.2
 *
 */
@WebServiceClient(name = "HotelBookingService",
                  wsdlLocation = "file:/C:/Users/Juliusz/aznu/AZNU/hotel-booking/src/main/resources/hotel.wsdl",
                  targetNamespace = "http://www.bp.org/hotel/")
public class HotelBookingService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://www.bp.org/hotel/", "HotelBookingService");
    public final static QName HotelBookingPort = new QName("http://www.bp.org/hotel/", "HotelBookingPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/C:/Users/Juliusz/aznu/AZNU/hotel-booking/src/main/resources/hotel.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(HotelBookingService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "file:/C:/Users/Juliusz/aznu/AZNU/hotel-booking/src/main/resources/hotel.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public HotelBookingService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public HotelBookingService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public HotelBookingService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public HotelBookingService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public HotelBookingService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public HotelBookingService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns HotelBooking
     */
    @WebEndpoint(name = "HotelBookingPort")
    public HotelBooking getHotelBookingPort() {
        return super.getPort(HotelBookingPort, HotelBooking.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns HotelBooking
     */
    @WebEndpoint(name = "HotelBookingPort")
    public HotelBooking getHotelBookingPort(WebServiceFeature... features) {
        return super.getPort(HotelBookingPort, HotelBooking.class, features);
    }

}
