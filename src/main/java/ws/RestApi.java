/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ws;

import com.mashape.unirest.http.HttpResponse;
import com.mashape.unirest.http.Unirest;
import com.mashape.unirest.http.exceptions.UnirestException;
///**
// *
// * @author khadi
// */
public class RestApi {
   HttpResponse<String> response;

    public RestApi() throws UnirestException {
        this.response = Unirest.post("http://127.0.0.1:5000/search")
                .header("accept", "application/json")
                .asString();
    }
    public String getData(){
        return  this.getResponse().getBody();
    }

    public HttpResponse<String> getResponse() {
        return response;
    }

    public void setResponse(HttpResponse<String> response) {
        this.response = response;
    }
    
    
    
    
}
