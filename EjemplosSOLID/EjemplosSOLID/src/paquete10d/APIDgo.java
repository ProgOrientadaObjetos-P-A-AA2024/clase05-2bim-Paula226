/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete10d;

/**
 *
 * @author Paula Lopez
 */
public class APIDgo implements APIMovie{
      private String apiKey;
    
    @Override
    public void establecerApiKey(String ak){
        apiKey = ak+123174;
    }
    
    @Override
    public String obtenerApiKey(){
        return apiKey;
    }
    
}

