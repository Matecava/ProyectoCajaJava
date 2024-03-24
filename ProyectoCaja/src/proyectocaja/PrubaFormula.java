
package proyectocaja;


public class PrubaFormula {
    public static void main(String[] args) {
        int ancho1 = 2;
        int altura1 = 4;
        int profundo1 = 6;
        
        Caja formula = new Caja();
        
        int formula1;
        formula1 = formula.calcularVolumen(3, 2, 6);
        
        System.out.println("Volumen caja 1 = " + formula1);
        
        Caja formula2 = new Caja();
        
        
        formula2.alto = altura1;
        formula2.ancho = ancho1;
        formula2.profundo = profundo1;
         
        int resultado  =formula2.volumenSinParams();
        System.out.println("Volumen caja 2 = " + resultado);
    }
}
