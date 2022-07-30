package proyecto_final;

import javax.swing.JOptionPane;

public class Menu 
{
    public static int opcion;
    
    public void Imprimir_Menu () 
    {
        // < > \
        
        boolean continuar = true;
    
        while(continuar)
        {
                            
        opcion = Integer.parseInt (JOptionPane.showInputDialog(null,"********** Bienvenido al Aeropuerto Vuelos Veloces **********" + "\n\n" +
                                           "Por favor selecciona la accion que desea realizar:" + "\n" +
                                           "            1. Registro de clientes" + "\n" +
                                           "            2. Selección de vuelos" + "\n" +
                                           "            3. Reservación de asientos" + "\n" +
                                           "            4. Impresión de factura" + "\n" +
                                           "            5. Salir"));
        
        
        if (opcion == 1)
        {
            
            Clientes clase2 = new Clientes () ;
        
            clase2.Datos_Clientes () ;               
            
        }
        
        else if (opcion == 2)
        {
            
            Boletos clase3 = new Boletos () ;
            
            clase3.registro_Boletos ();
        
            clase3.datos_Boletos () ; 
            
        }
        
        else if (opcion == 3)
        {
            
            Reserva_asientos clase4 = new Reserva_asientos () ;
        
            clase4.Reserva_vuelo () ;
            
        }
        
        else if (opcion == 4)
        {
            
            Facturacion  clase5 = new Facturacion () ;
        
            clase5.Impresion_Factura () ; 
            
        }
        
        else if (opcion == 5)
        {
            JOptionPane.showMessageDialog(null, "Muchas Gracias por su visita!");
            continuar = false; 
            
        }
        
        int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra reservación ? ");
            
        if (input == 1)
        {
            JOptionPane.showMessageDialog(null, "Muchas Gracias por su reserva!");
            continuar = false;
               
        }
        
        }
        
    }
                          
}
