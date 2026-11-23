public class Superheroe { 
    private String nombre;
    private String descripcion; 
    private boolean capa; 
    
    public Superheroe(String Nombre) {
        this.nombre = Nombre;
        this.descripcion = ""; 
        this.capa = false;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String Nombre) {
        this.nombre = Nombre; 
    }
    public String getDescripcion(){
        return descripcion;
    }
    public void setDescripcion(String Descripcion) { 
        this.descripcion = Descripcion; 
    }
    public boolean getCapa(){
        return capa; 
    }
    public String toString() {
        return "Nombre: " + nombre + ", Descripcion: " + descripcion + ", Capa: " + capa;
    }
    
}