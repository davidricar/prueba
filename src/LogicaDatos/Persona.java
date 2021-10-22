package LogicaDatos;
/**
 * 
 * 
 * Esta clase modelal una persona
 * @author UX431
 * @version entrega T1
 * @since entrega T1
 * La parte de los @ se le llaman metaanotaciones
 *
 */

public class Persona
{
	/**
	 * Si defino un atributo complejo
	 */
    private String nombre;
    private String apellido1;
    private String apellido2;
    private int edad;
    private int telefono;
    private String direccion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     * Este metodo calcula si una persona es mayor de edad
     * @return tipo primitivo boolean dependiendo si una persona es mayor de edad
     * @throws Exception edad no definida
     */

    public boolean mayorEdad() throws Exception {
        if (this.edad == 0)
            throw new Exception("Edad sin definir");

        return this.edad >= 18;
    }

}