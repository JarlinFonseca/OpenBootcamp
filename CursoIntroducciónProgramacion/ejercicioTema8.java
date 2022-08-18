
package CursoIntroducciónProgramacion;

/**
 *
 * @author Jarlin Fonseca
 */
public class ejercicioTema8 {
    
    public static void main(String[] args) {
        
        Persona persona = new Persona();
        persona.setEdad(21);
        persona.setNombre("Jarlin Andres");
        persona.setTelefono("3238103360");
        
        System.out.println("El nombre de la persona es: "+persona.getNombre());
        System.out.println("Tiene "+persona.getEdad()+" años de edad");
        System.out.println("Y su número de telefono es el siguiente: "+persona.getTelefono());
        
        
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
