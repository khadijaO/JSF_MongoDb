/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

package bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.enterprise.context.Dependent;
import javax.enterprise.context.SessionScoped;
import javax.xml.bind.annotation.XmlRootElement;
import jdk.nashorn.internal.objects.annotations.Getter;

/**
 *
 * @author khadi
 */
@Named(value = "product")
@SessionScoped

public class Product  implements Serializable {
List<Product>pp=new ArrayList<>();

    public List<Product> getPp() {
        return pp;
    }

    public void setPp(List<Product> pp) {
        this.pp = pp;
    }
private String title;
private  String webSite;
private String category;
private String description;
private String image;
private int rate;
private double price;
private double reduction;
    /**
     * Creates a new instance of Product
     */
   

    public Product(){
//      this.setTitle("kh");
        ProductManger pm=new ProductManger();
this.pp=pm.getAll();
    }

    public Product(String title) {
        this.title = title;
    }

    public Product(String title, String webSite, String category, String description, String image, int rate, double price, double reduction) {
        this.title = title;
        this.webSite = webSite;
        this.category = category;
        this.description = description;
        this.image = image;
        this.rate = rate;
        this.price = price;
        this.reduction = reduction;
    }

    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getReduction() {
        return reduction;
    }

    public void setReduction(double reduction) {
        this.reduction = reduction;
    }

 
   
    
}
