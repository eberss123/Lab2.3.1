
package lab;


public class Persona {
     protected String nombre;
     private int edad;
    String estadoCivil;
    String domicilio;
    int estatura;

    public Persona(String nombre, int edad, String estadoCivil, String domicilio, int estatura) {
        setNombre(nombre);
        setEdad(edad);
        setEstadoCivil(estadoCivil);
        setDomicilio(domicilio);
        setEstatura(estatura);
    }
    
    
    
    
    
     protected  void Comer(String comida)
    {
        System.out.println("de acuerdo el dia de hoy estaras comiendo " + comida);
    }
    public void Dormir(int horas)
    {
        System.out.println("Dormiras esta noche : " + horas + " horas");
    }
    private void tomarShower(String jabon, String tempAgua)
    {
       System.out.println("te daras una ducha con el jabon " + jabon + " y con el agua " + tempAgua);
       
    }
    
    public void tomarshowerPublico(String jabon, String tempAgua)
    {
        tomarShower(jabon, tempAgua);
    }
    
    
    
    
    
    
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getEstatura() {
        return estatura;
    }

    public void setEstatura(int estatura) {
        this.estatura = estatura;
    }
    
    
    
}
    

