package com.geoipservice.client;

import com.utils.JaxWsHandlerResolver;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import java.net.URL;

public class JAXBClient {
    public GeoIPServiceSoap client;

    public JAXBClient(){
        try {

            URL url = new URL("http://www.webservicex.net/geoipservice.asmx?wsdl");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://www.webservicex.net/", "GeoIPService");

            Service service = Service.create(url, qname);

            service.setHandlerResolver(new JaxWsHandlerResolver());

            client = service.getPort(GeoIPServiceSoap.class);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
