package com.geoipservice.client;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GeoIpServiceSoapTest {
    private JAXBClient jaxbClient = new JAXBClient();
    private GeoIPServiceSoap geoIpService = jaxbClient.client;

    @Test
    public void getGeoIpTest(){
        GeoIP geoIP = geoIpService.getGeoIP("8.8.8.8");
        Assert.assertEquals(geoIP.getCountryName(), "United States");
    }
}
