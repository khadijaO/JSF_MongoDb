/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author khadi
 */
package bean;

import Db.Connexion;
import com.mongodb.DBCursor;
import com.mongodb.DBObject;
import com.mongodb.ExplainVerbosity;
import com.mongodb.client.DistinctIterable;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.bson.Document;
import org.bson.conversions.Bson;
import org.bson.types.ObjectId;

public class ProductManger {
List<Product>pp=new ArrayList<>();
List<String>cc=new ArrayList<>();

private String Prod;
private int c;

    public String getProd() {
        return Prod;
    }

    public void setProd(String Prod) {
        this.Prod = Prod;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public List<Product> getPp() {
        return pp;
    }

    public void setPp(List<Product> pp) {
        this.pp = pp;
    }

    public List<String> getCats() {
        return cc;
    }

    public void setCats(List<String> cats) {
        this.cc = cats;
    }

    
MongoCollection<Document> collection;

    public ProductManger() {
        Connexion c=new Connexion("products");
        MongoDatabase database=c.getMydatabase();
        this.collection=c.getCollection();
//        pp.add(new Product("montre"));
//        pp.add(new Product("montreLuxe"));
//        pp.add(new Product("Xiomi"));


    }
   
    
    public  List<Product>  getAll(){
    List<Product> allProducts=new ArrayList<Product>();
    FindIterable<Document> allProducts_mg =  this.collection.find();
 Iterator it = allProducts_mg.iterator();

        while (it.hasNext()) {
Document nextDocument = (Document) it.next();
Product myProd=new Product(Double.parseDouble(nextDocument.getString("price")), nextDocument.get("_id", ObjectId.class).toString(),nextDocument.getString("sous-category"),nextDocument.getString("url"),nextDocument.getString("title"),nextDocument.getString("site"),nextDocument.getString("category"),nextDocument.getString("description"),nextDocument.getString("img"),4,Double.parseDouble(nextDocument.getString("price")),9);
allProducts.add(myProd);

    } 
        return  allProducts;

}
    public List<String> getCategories(){

    
      DistinctIterable<String> allCats= this.collection.distinct("category",String.class);
      Iterator it = allCats.iterator(); 
      List<String> allcategories=new ArrayList<String>();
allcategories.clear();
        while (it.hasNext()) {
            allcategories.add((String) it.next());
        }
        
        return allcategories;
    }
       public List<String> getSousCategories(){

    
      DistinctIterable<String> allCats= this.collection.distinct("sous-category",String.class);
      Iterator it = allCats.iterator(); 
      List<String> allcategories=new ArrayList<String>();
allcategories.clear();
        while (it.hasNext()) {
//            Bson filter = eq("sous-category", it.next().toString());
//
//           Document coll = this.collection.find(filter).first();
//          String data=coll.getString("img");
          allcategories.add((String) it.next());
        }
        
        return allcategories;
    }
       
       public Product getOneProduct(String id){
           String data=id.toString();
           Product myProd=null;
            FindIterable<Document> allProducts_mg =  this.collection.find(eq("_id", new ObjectId(data)));
//              Document dd=.first();
Iterator it = allProducts_mg.iterator();

        while (it.hasNext()) {
Document nextDocument = (Document) it.next();
 myProd=new Product(Double.parseDouble(nextDocument.getString("price")), nextDocument.get("_id", ObjectId.class).toString(),nextDocument.getString("sous-category"),nextDocument.getString("url"),nextDocument.getString("title"),nextDocument.getString("site"),nextDocument.getString("category"),nextDocument.getString("description"),nextDocument.getString("img"),4,Double.parseDouble(nextDocument.getString("price")),9);
    } 
//            String s= dd.getString("tilte");
//              Product myProd=new Product(Double.parseDouble(dd.getString("price")),dd.get("_id", ObjectId.class).toString(),dd.getString("sous-category"),dd.getString("url"),s,dd.getString("site"),dd.getString("category") ,dd.getString("description"),dd.getString("img"),3,Double.parseDouble(dd.getString("price")),9);
//Product r=myProd;
return myProd;
              
       }
        public List<Product> getallProductsforCat(String cat){
            List<Product> allProducts=new ArrayList<Product>();
    FindIterable<Document> allProducts_mg =  this.collection.find(eq("category", cat));
 Iterator it = allProducts_mg.iterator();

        while (it.hasNext()) {
Document nextDocument = (Document) it.next();
Product myProd=new Product(Double.parseDouble(nextDocument.getString("price")), nextDocument.get("_id", ObjectId.class).toString(),nextDocument.getString("sous-category"),nextDocument.getString("url"),nextDocument.getString("title"),nextDocument.getString("site"),nextDocument.getString("category"),nextDocument.getString("description"),nextDocument.getString("img"),4,Double.parseDouble(nextDocument.getString("price")),9);
allProducts.add(myProd);

    } 
        return  allProducts;
       }
//        public HashMap <String,String> getSousCategoriesImages(){
//
//    HashMap <String,String>cats=new HashMap<String,String>();
//    
//      DistinctIterable<String> allCats= this.collection.distinct("sous-category",String.class);
//      Iterator it = allCats.iterator(); 
//       cats.clear();
//        while (it.hasNext()) {
//            Bson filter = eq("sous-category", it.next().toString());
//
//           Document coll = this.collection.find(filter).first();
//          String data=coll.getString("img");
//            cats.put((String) it.next(), data);
//        }
////        
//        return cats;
//    }
}

    
