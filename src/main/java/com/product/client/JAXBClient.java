package com.product.client;

import com.utils.JaxWsHandlerResolver;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;

public class JAXBClient {

    public ProductInterface client;

    public JAXBClient() {
        try {

            URL url = new URL("http://localhost:9999/ws/product?wsdl");

            //1st argument service URI, refer to wsdl document above
            //2nd argument is service name, refer to wsdl document above
            QName qname = new QName("http://jaxb.soap.com/", "ProductService");

            Service service = Service.create(url, qname);

            service.setHandlerResolver(new JaxWsHandlerResolver());

            client = service.getPort(ProductInterface.class);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
