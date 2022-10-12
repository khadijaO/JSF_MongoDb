/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Db;
import org.bson.Document;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.conversions.Bson;
import java.util.concurrent.TimeUnit;
import org.bson.Document;
/**
 *
 * @author khadi
 */
public class Connexion {
public  MongoDatabase mydatabase;
 MongoClient mongoClient ;
 MongoCollection<Document> collection;
    public Connexion(String col) {
      this.mongoClient = new MongoClient(
    new MongoClientURI(
        "mongodb://localhost:27017/"
    )
);
this.mydatabase = mongoClient.getDatabase("products");

 this.collection= this.mydatabase.getCollection(col);
    }
    
    

    public MongoDatabase getMydatabase() {
        return mydatabase;
    }

    public void setMydatabase(MongoDatabase mydatabase) {
        this.mydatabase = mydatabase;
    }

    public MongoCollection<Document> getCollection() {
        return collection;
    }

    public void setCollection(MongoCollection<Document> collection) {
        this.collection = collection;
    }

    

}




