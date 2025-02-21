
package U07_A0X;
public class CuentaCorriente {
    
    public String nombre;
    private double saldo;
    String dni;
    
    CuentaCorriente(String nombre, String dni){
        this.nombre=nombre;
        this.saldo=0.0;
        this.dni=dni;
    }
    CuentaCorriente(String dni, String nombre, double saldoInicial){
        this.dni=dni;
        this.nombre=nombre; 
        this.saldo=saldoInicial;
    }
    CuentaCorriente(String dni,double saldo){
        this(dni,"",saldo);
    }
    
    public boolean sacarDinero(double aSacar){
        boolean saco=false;
        if(this.saldo>aSacar){
            this.saldo=this.saldo-aSacar;
            saco=true;
        }
        return saco;
    }
    
    public void ingreso(double aIngresar){
        this.saldo=this.saldo+aIngresar;
    }
    
    public void muestro(){
        System.out.println("nombre: "+this.nombre);
        System.out.println("dni: "+this.dni);
        System.out.println("saldo: "+this.saldo);
    }
    
}
