public class demension {
    private double alto;
    private double ancho; 
    private double profundidad;

    public demension(){
        this.alto = 0.0; 
        this.ancho = 0.0; 
        this.profundidad = 0.0;
    }

    public demension(double Alto, double Ancho, double Profundidad) {
        this.alto = Alto;
        this.ancho = Ancho; 
        this.profundidad = Profundidad;
    }
    public double getAlto() { 
        return alto;
    }
   public void setAlto(double Alto) {
    this.alto = Alto;
   }
   public double getAncho() {
    return ancho;
   }
   public void  setAncho(double Ancho) {
    this.ancho = Ancho;
   }
   public double getProfundidad() {
    return profundidad;
   }
   public void setProfundidad(double Profundidad) {
    this.profundidad = Profundidad;
   }
}