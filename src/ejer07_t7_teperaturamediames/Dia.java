
package ejer07_t7_teperaturamediames;

/**
 *
 * @author IsmA
 */
public class Dia {
    
    private String nombreDia;
    private int temperatura;

    public Dia() {
    }

    public Dia(String nombreDia, int temperatura) {
        this.nombreDia = nombreDia;
        this.temperatura = temperatura;
    }    
   
    public void setNombreDia(String nombreDia) {
        this.nombreDia = nombreDia;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public String getNombreDia() {
        return nombreDia;
    }

    public int getTemperatura() {
        return temperatura;
    }
    
    
    
    
}
