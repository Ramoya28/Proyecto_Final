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
        
        switch (opcion)
        {
            case 1:
                
                Clientes clase2 = new Clientes () ;
                
                clase2.Datos_Clientes () ; 
                
                break;

            case 2:
            
                Boletos clase3 = new Boletos () ;
            
                clase3.Registro_Boletos ();
          
                break;
        
            case 3:
            
                Reserva_asientos clase4 = new Reserva_asientos () ;               
        
                clase4.Reserva_vuelo () ;
            
                break;
                
            case 4:
            
                Facturacion  clase5 = new Facturacion () ;
        
                clase5.Impresion_Factura () ; 
            
                break;
                
            case 5:
                
                JOptionPane.showMessageDialog(null, "Muchas Gracias por su visita!");
                
                continuar = false;
                
                break;
            
            default:
                
                JOptionPane.showMessageDialog(null, "La opción seleccionada no es válida");
                
                break;
            
        }
        
        }
        
    }
                          
}
