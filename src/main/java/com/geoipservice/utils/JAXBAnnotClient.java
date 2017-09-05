package com.geoipservice.utils;

import com.geoipservice.client.GeoIPServiceSoap;

import javax.xml.ws.WebServiceRef;

public class JAXBAnnotClient {

    @WebServiceRef(wsdlLocation =
            "http://www.webservicex.net/geoipservice.asmx?wsdl")
    private static GeoIPServiceSoap geoIPServiceSoap;

  public static void main(String[] args) {
      String ip = null;
      System.out.println(geoIPServiceSoap.getGeoIP(ip));
  }
}
