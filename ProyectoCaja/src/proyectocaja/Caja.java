
package proyectocaja;

public class Caja {
    int ancho, alto, profundo;
    
    public int calcularVolumen(int ancho, int alto, int profundo){
        this.ancho = ancho;
        this.alto = alto;
        this.profundo = profundo;
        
        return ancho * alto * profundo;
    }
    
    public Caja(){
        System.out.println("Constructor vacio");
    }
    
    public int volumenSinParams(){
        return ancho * alto * profundo;
    }
}
