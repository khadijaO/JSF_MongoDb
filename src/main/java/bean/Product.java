/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */

package bean;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
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
List<Product>productsForcat=new ArrayList<>();

List<String>categories=new ArrayList<>();
List<String>sous_categories=new ArrayList<>();
Product selectedProduct;
HashMap <String,String>sous_categories_images;
    public List<Product> getPp() {
        return pp;
    }

    public void setPp(List<Product> pp) {
        this.pp = pp;
    }
    private String id;
    private double oldprice;
private String title;
private  String webSite;
private String category;
private String description;
private String image;
private String source;
private int rate;
private double price;
private double reduction;
private String sous_category;
    /**
     * Creates a new instance of Product
     */
   

    public Product(){
//      this.setTitle("kh");
        ProductManger pm=new ProductManger();
this.pp=pm.getAll();
this.categories=pm.getCategories();
this.sous_categories=pm.getSousCategories();
//this.sous_categories_images=pm.getSousCategoriesImages();

    }

    public Product getSelectedProduct() {
        return selectedProduct;
    }

    public void setSelectedProduct(Product selectedProduct) {
        this.selectedProduct = selectedProduct;
    }
    
    public String redirProd(String id){
                ProductManger pm=new ProductManger();
//
        this.selectedProduct=new Product();
        this.selectedProduct=pm.getOneProduct(id);
        return "ProductDetails.xhtml";
    }
      public String redircat(String cat){
                ProductManger pm=new ProductManger();

        this.productsForcat=pm.getallProductsforCat(cat);
        return "CategoryDetails.xhtml?faces-redirect=true";
    }
    
    

    public Product(String title) {
        this.title = title;
    }

    public Product(double oldprice,String id,String sous_category,String source,String title, String webSite, String category, String description, String image, int rate, double price, double reduction) {
        this.title = title;
        this.id=id;
        this.oldprice=oldprice;
        this.webSite = webSite;
        this.category = category;
        this.description = description;
//        this.source=source;
        this.sous_category=sous_category;
        if(source==null){
            this.source="#";
        }
        else
            this.source=source;
        
        if(image==null){
            this.image="https://stores.lifestylestores.com/VendorpageTheme/Enterprise/EThemeForLifestyleUpdated/images/product-not-found.jpg";
        }
        else {
                    this.image = image;

        }
        this.rate = rate;
        this.price = price;
        this.reduction = reduction;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public List<String> getCategories() {
        return categories;
    }

    public void setCategories(List<String> categories) {
        this.categories = categories;
    }

    public String getSous_category() {
        return sous_category;
    }

    public void setSous_category(String sous_category) {
        this.sous_category = sous_category;
    }

    public List<String> getSous_categories() {
        return sous_categories;
    }

    public void setSous_categories(List<String> sous_categories) {
        this.sous_categories = sous_categories;
    }

    public HashMap <String,String>getSous_categories_images() {
        return sous_categories_images;
    }

    public void setSous_categories_images(HashMap <String,String> sous_categories_images) {
        this.sous_categories_images = sous_categories_images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public List<Product> getProductsForcat() {
        return productsForcat;
    }

    public void setProductsForcat(List<Product> productsForcat) {
        this.productsForcat = productsForcat;
    }

    public double getOldprice() {
        return oldprice;
    }

    public void setOldprice(double oldprice) {
        this.oldprice = oldprice;
    }
    

 
   
    
}
