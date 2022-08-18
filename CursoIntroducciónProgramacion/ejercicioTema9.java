package CursoIntroducciónProgramacion;

/**
 *
 * @author Jarlin Fonseca
 */
public class ejercicioTema9 {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        
        cliente.setEdad(33);
        cliente.setNombre("Camila Rosales");
        cliente.setTelefono("3125457789");
        cliente.setCredito(2550000.7);
        
        System.out.println("La clienta: "+cliente.getNombre()+" tiene "+
                cliente.getEdad()+" años de edad, su número telefonico es: "
                +cliente.getTelefono()+" y pidió un crédito de: "
                +cliente.getCredito()+" al Banco Bancolombia.");
        
        Trabajador trabajador = new Trabajador();
        
        trabajador.setEdad(45);
        trabajador.setNombre("Juan Alberto");
        trabajador.setTelefono("315245658");
        trabajador.setSalario(1950.80);
        
        System.out.println("");
         System.out.println("El trabajador: "+trabajador.getNombre()+" tiene "+
                trabajador.getEdad()+" años de edad, su número telefonico es: "
                +trabajador.getTelefono()+" y gana un salario en dolares: "
                +trabajador.getSalario()+" con la empresa Amazon.");
    } 
}

class Persona{
    private int edad;
    private String nombre,telefono;
    
    public Persona(){
        
    }
    
    public Persona(int edad, String nombre, String telefono){
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public int getEdad(){
        return this.edad;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public String getTelefono(){
        return this.telefono;
    }
    
    public void setTelefono(String telefono){
        this.telefono = telefono;
    }

}

class Cliente extends Persona{
    private double credito;
    
    public double getCredito(){
        return this.credito;
    }
    
    public void setCredito(double credito){
        this.credito = credito;
    }
}

class Trabajador extends Persona{
    private double salario;
    
    public double getSalario(){
        return this.salario;
    }
    
    public void setSalario(double salario){
        this.salario = salario;
    }
}
