
package paquete05l;

/**
 *
 * @author reroes
 */
public class MenorEdad extends Persona{
    
    public MenorEdad(String n){
        super(n, null);
    }
    
    @Override
    public String obtenerTarjeta(){
        throw new RuntimeException("un niño no tiene tarjeta");
    }
    
    
}
