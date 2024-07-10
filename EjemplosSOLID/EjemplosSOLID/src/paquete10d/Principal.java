/*
 * 
 * D - Dependency inversion principle (Principio de inversión de dependencias)
 */
package paquete10d;

public class Principal {
    public static void main(String[] args) {
        APIDisneyPlus dis = new APIDisneyPlus();
        dis.establecerApiKey("124578");
         GeneradorPeliculas gp1 = new GeneradorPeliculas();
        gp1.establecerLlave(dis);
        gp1.establecerUrl("http://dis.movie?api=");
        System.out.println(gp1.obtenerUrl());
        System.out.println("---------------------------");
        
        APIDgo dg = new APIDgo();
        dg.establecerApiKey("1245798");
        GeneradorPeliculas gp = new GeneradorPeliculas();
        gp.establecerLlave(dis);
        gp.establecerUrl("http://dg.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        System.out.println("---------------------------");
        APINetflix api = new APINetflix();
        api.establecerApiKey("123455");
        
        GeneradorPeliculas gp3 = new GeneradorPeliculas();
        gp3.establecerLlave(api);
        gp3.establecerUrl("http://api.movie?api=");
        System.out.println(gp.obtenerUrl());
        
        System.out.println("---------------------------");
        
        APIAmazonMovie api2 = new APIAmazonMovie();
        api2.establecerApiKey("123455");
        
        GeneradorPeliculas gp2 = new GeneradorPeliculas();
        gp2.establecerLlave(api2);
        gp2.establecerUrl("http://api.movie?api=");
        System.out.println(gp2.obtenerUrl());
        
        
    }
}
