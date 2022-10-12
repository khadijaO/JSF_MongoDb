/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package Db;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author khadi
 */
@Named(value = "restClient")
@Dependent
public class RestClient {
// private transient Client client;

    public String SERVICE_BASE_URI;

    /**
     * Creates a new instance of RestClient
     */
    public RestClient() {
    }
    
}
