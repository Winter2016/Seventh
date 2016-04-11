package mypckg;

import org.glassfish.jersey.client.ClientConfig;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by Ксения on 4/11/2016.
 */
public class CalculationRestClient {

    public static void main(String[] args) {

        ClientConfig clientConfig = new ClientConfig();
        Client client = ClientBuilder.newClient(clientConfig);
        WebTarget target = client.target("http://localhost:8081/");

        int a = 15;
        int b = 3;
        String addPlainResponse = target.path("rest").path("add").path(a + "/" + b).request().accept(MediaType.TEXT_PLAIN).get(String.class);
        String addXmlResponse = target.path("rest").path("add").path(a + "/" + b).request().accept(MediaType.TEXT_XML).get(String.class);

        String deductPlainResponse = target.path("rest").path("deduct").path(a + "/" + b).request().accept(MediaType.TEXT_PLAIN).get(String.class);
        String deductXmlResponse = target.path("rest").path("deduct").path(a + "/" + b).request().accept(MediaType.TEXT_XML).get(String.class);

        String multiplyPlainResponse = target.path("rest").path("multiply").path(a + "/" + b).request().accept(MediaType.TEXT_PLAIN).get(String.class);
        String multiplyXmlResponse = target.path("rest").path("multiply").path(a + "/" + b).request().accept(MediaType.TEXT_XML).get(String.class);

        String dividePlainResponse = target.path("rest").path("divide").path(a + "/" + b).request().accept(MediaType.TEXT_PLAIN).get(String.class);
        String divideXmlResponse = target.path("rest").path("divide").path(a + "/" + b).request().accept(MediaType.TEXT_XML).get(String.class);

        System.out.println("addtextResponse = " + addPlainResponse);
        System.out.println("addxmlResponse = " + addXmlResponse);

        System.out.println("deducttextResponse = " + deductPlainResponse);
        System.out.println("deductResponse = " + deductXmlResponse);

        System.out.println("multiplytextResponse = " + multiplyPlainResponse);
        System.out.println("multiplyxmlResponse = " + multiplyXmlResponse);

        System.out.println("dividetextResponse = " + dividePlainResponse);
        System.out.println("dividexmlResponse = " + divideXmlResponse);
    }
}