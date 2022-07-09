package proyecto_final;

import javax.swing.JOptionPane;


public class Clientes 
{
    
    public static String nombre;
    public static String telefono;
    public static String correo;
    public static String cedula;
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    public void Datos_Clientes () 
    {
           
        // < > \
        
        boolean continuar = true;
    
        while(continuar)
        { 
            
            //Mensaje de bienvenida al modulo
            
            JOptionPane.showMessageDialog(null,"********** Bienvenido al modulo de registro de clientes **********" + "\n\n" +
                                               "Por favor complete los datos solicitados a continuación" + "\n" +
                                               "para completar el registro del cliente: ");
            
            
            //Registro del nombre
            
            nombre = JOptionPane.showInputDialog(null,"Ingrese su nombre completo: ");
            
            //Registro del telefono
            
            telefono = JOptionPane.showInputDialog(null,"Digite su número de teléfono: : ");
            
            //Registro del correo
            
            correo = JOptionPane.showInputDialog(null,"Ingrese su correo electronico: ");
            
            //Registro de la cedula
            
            cedula = JOptionPane.showInputDialog(null,"Digite su número de cédula: ");
            
            int input = JOptionPane.showConfirmDialog(null, "Desea registrar otro usuario ? ");
            
            if (input == 1)
            {
               JOptionPane.showMessageDialog(null, "Muchas Gracias por su registro!");
               continuar = false;
               
            }
            
        } 
                       
    }
    
}
