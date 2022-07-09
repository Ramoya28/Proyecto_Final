package proyecto_final;

import javax.swing.JOptionPane;


public class Clientes 
{
    
    public static String nombre;
    public static String telefono;
    public static String correo;
    public static String cedula;
    
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
