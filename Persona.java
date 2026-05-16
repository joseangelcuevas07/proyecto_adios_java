public class Persona {
    private String nombre;
    private int edad;
    private String telefono;
    private char genero;
    private String direccion;
    
    // constructor de la clase
    public Persona(String nombre){
       this.nombre = nombre;

}

   // Modificador de nombre 
 public void setNombre(String nombre){
  this.nombre = nombre;
 } 

  // consultor nombre
  public String getNombre(){
    return this.nombre;
  }

   // Modificador de edad
 public void setEdad(int edad){
  this.edad= edad;
 } 

  // consultor edad
  public int getEdad(){
    return this.edad;
  }

   // Modificador de telefono
 public void setTelefono(String telefono){
  this.telefono = telefono;
 } 

  // consultor telefono
  public String getTelefono(){
    return this.telefono;
  }

   // Modificador de genero
 public void setGenero(char genero){
  this.genero = genero;
 } 

  // consultor genero
  public char getGenero(){
    return this.genero;
  }

    // Modificador de direccion
 public void setDireccion(String direccion){
  this.direccion = direccion;
 } 

  // consultor direccion
  public String getDireccion(){
    return this.direccion;
  }
  

   // Metodo toString para mostrar la informacion de la persona
@Override //  Anotacion para indicar una sobreescritura del metodo
public String toString(){
return "- Nombre: " + this.nombre+ "\n" +  "- Edad: " + this.edad+ "\n" + "- Telefono: " + this.telefono+ "\n" + "- Genero: " + this.genero + "\n" + "- Direccion: " + this.direccion;

}
}
