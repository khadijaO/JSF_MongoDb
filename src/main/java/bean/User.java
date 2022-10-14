/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

package bean;
import Db.Connexion;
import com.mashape.unirest.http.exceptions.UnirestException;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import java.awt.event.ActionEvent;
import java.io.IOException;
import org.bson.conversions.Bson;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import org.bson.Document;
import ws.RestApi;

/**
 *
 * @author khadi
 */
@Named(value = "user")
@SessionScoped
public class User implements Serializable {
private static final long serialVersionUID = 2729758432756108274L; 

 private String firstname;
 private  String lastname;
 private String Email;
 private String phone;
 private String password;
 MongoCollection<Document> collection;

   public void Login(ActionEvent event){
        
                  setLastname("hajar"); 
//return true;
    }
    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
 


    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
 
    /**
     * Creates a new instance of User
     */
    public User() {
        
        Connexion c=new Connexion("users");
        MongoDatabase database=c.getMydatabase();
        this.collection=c.getCollection();
        this.lastname=database.getName();

    }
    public String login() throws IOException{
       


//        Bson filter = and(eq("pwd", this.password), eq("email",this.Email));
//           Document doc = this.collection.find(filter ).first();
//           if(doc==null){
//               System.out.println("--------------");        
////               return "index.xhtml";
//                
//               return "ErrorPage.xhtml";
//
//           }
//           else{
//            try {
//                RestApi r=new RestApi();
//                this.setEmail(r.getData());
//            } catch (UnirestException ex) {
//                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
//            }
//               
//            System.out.println("11111111");        
//
//                   return "home.xhtml";
//           }

      return "home";

//   if(this.getEmail().equals("khadija") && this.getPassword().equals("123"))
//    
//    {
//        	
//        }
        
        


}
    
    
  
//    public void processPreviousAction( ) { 

}
