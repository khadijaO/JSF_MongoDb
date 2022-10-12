/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import bean.*;
import java.util.List;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;


/**
 *
 * @author khadi
 */
@Path("/products")
@ApplicationPath("/ws")
//http://localhost:8080/test/ws/products
public class ProductsWs extends  Application{
   ProductManger pm=new ProductManger();
//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String sayHello()
//   {
//       return "hi";
//   }
    @GET
    @Produces(MediaType.APPLICATION_JSON)

    public List<Product>getAll(){
return  null;}
}
