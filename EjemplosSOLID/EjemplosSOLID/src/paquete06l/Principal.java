/*
 * L — Liskov substitution principle (Principio de sustitución de Liskov) 
 */
package paquete06l;

/**
 *
 * @author reroes
 */
public class Principal {
    public static void main(String[] args) {
      //  TarjetaCredito t1 = new TarjetaCredito("Visa, 110011001")
        Banco ban = new Banco();
       TarjetaCredito t1 = new TarjetaCredito();
       t1.establecerNombre("Visa");
       t1.establecerNumero("11001101");
     
     
        
        MayorEdad representante = new MayorEdad("José", t1);
        
        MenorEdad menor = new MenorEdad("Felipe", representante);
        ban.establecerNombre("Loja");
        
        
        System.out.printf("Nombre:%s - Tarjeta:%s\n",
                menor.obtenerNombre(), 
                menor.obtenerRepresentante().obtenerTarjeta().obtenerNumero());
                ban.obtenerNombre();
    }
}
