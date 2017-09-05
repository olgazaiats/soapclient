package com.product.client;

import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ProductInterfaceTest {

    private JAXBClient jaxbClient = new JAXBClient();
    private ProductInterface productClient = jaxbClient.client;


    @Test
    public void productInterfaceTest(){
        Product product = productClient.getProduct();
        assertEquals(product.getProductName(),"Sony");
    }
}
