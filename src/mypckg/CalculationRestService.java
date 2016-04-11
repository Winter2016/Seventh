package mypckg;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * Created by Ксения on 4/11/2016.
 */
@Path("/")
public class CalculationRestService {
    @GET
    @Path("add/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String sumPlain(@PathParam("a") int a, @PathParam("b") int b) {
        double sum = a + b;
        return String.valueOf(sum);
    }

    @GET
    @Path("add/{a}/{b}")
    @Produces(MediaType.TEXT_XML)
    public String sumXML(@PathParam("a") int a, @PathParam("b") int b) {
        double sum = a + b;
        return "<?xml version=\"1.0\"?>" + "<sum>" + sum + "</sum>";
    }

    @GET
    @Path("add/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String sumHtml(@PathParam("a") int a, @PathParam("b") int b) {
         double sum = a + b;
         return "<html> " + "<title>" + "Add" + "</title>"
                    + "<body><h1>" + sum + "</body></h1>" + "</html> ";
        }

    @GET
    @Path("deduct/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String deductPlain(@PathParam("a") int a, @PathParam("b") int b) {
        double difference = a - b;
        return String.valueOf(difference);
    }

    @GET
    @Path("deduct/{a}/{b}")
    @Produces(MediaType.TEXT_XML)
    public String deductXML(@PathParam("a") int a, @PathParam("b") int b) {
        double difference = a - b;
        return "<?xml version=\"1.0\"?>" + "<sum>" + difference + "</sum>";
    }

    @GET
    @Path("deduct/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String deductHtml(@PathParam("a") int a, @PathParam("b") int b) {
        double difference = a - b;
        return "<html> " + "<title>" + "Add" + "</title>"
                + "<body><h1>" + difference + "</body></h1>" + "</html> ";
        }

    @GET
    @Path("multiply/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String multiplyPlain(@PathParam("a") int a, @PathParam("b") int b) {
        double product = a*b;
        return String.valueOf(product);
    }

    @GET
    @Path("multiply/{a}/{b}")
    @Produces(MediaType.TEXT_XML)
    public String multiplyXML(@PathParam("a") int a, @PathParam("b") int b) {
        double product = a*b;
        return "<?xml version=\"1.0\"?>" + "<sum>" + product + "</sum>";
    }

    @GET
    @Path("multiply/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String multiplyHtml(@PathParam("a") int a, @PathParam("b") int b) {
        double product = a*b;
        return "<html> " + "<title>" + "Add" + "</title>"
                + "<body><h1>" + product + "</body></h1>" + "</html> ";
        }

    @GET
    @Path("divide/{a}/{b}")
    @Produces(MediaType.TEXT_PLAIN)
    public String dividePlain(@PathParam("a") int a, @PathParam("b") int b) {
        double quotient = a/b;
        return String.valueOf(quotient);
    }

    @GET
    @Path("divide/{a}/{b}")
    @Produces(MediaType.TEXT_XML)
    public String divideXML(@PathParam("a") int a, @PathParam("b") int b) {
        double quotient = a/b;
        return "<?xml version=\"1.0\"?>" + "<sum>" + quotient + "</sum>";
    }

    @GET
    @Path("divide/{a}/{b}")
    @Produces(MediaType.TEXT_HTML)
    public String divideHtml(@PathParam("a") int a, @PathParam("b") int b) {
        double quotient = a/b;
        return "<html> " + "<title>" + "Add" + "</title>"
                + "<body><h1>" + quotient + "</body></h1>" + "</html> ";
        }
    }
