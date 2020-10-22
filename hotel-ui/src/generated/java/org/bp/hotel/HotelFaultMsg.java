
package org.bp.hotel;

import javax.xml.ws.WebFault;


/**
 * This class was generated by Apache CXF 3.3.2
 * 2020-10-15T17:07:52.679+02:00
 * Generated source version: 3.3.2
 */

@WebFault(name = "hotelFault", targetNamespace = "http://www.bp.org")
public class HotelFaultMsg extends Exception {

    private org.bp.types.Fault hotelFault;

    public HotelFaultMsg() {
        super();
    }

    public HotelFaultMsg(String message) {
        super(message);
    }

    public HotelFaultMsg(String message, java.lang.Throwable cause) {
        super(message, cause);
    }

    public HotelFaultMsg(String message, org.bp.types.Fault hotelFault) {
        super(message);
        this.hotelFault = hotelFault;
    }

    public HotelFaultMsg(String message, org.bp.types.Fault hotelFault, java.lang.Throwable cause) {
        super(message, cause);
        this.hotelFault = hotelFault;
    }

    public org.bp.types.Fault getFaultInfo() {
        return this.hotelFault;
    }
}
