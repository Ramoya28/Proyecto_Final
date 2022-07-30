package proyecto_final;

import javax.swing.JOptionPane;

public class Reserva_asientos {
    
    public static int asientos [][] = new int [9][10];
    int fila;
    int columna;
    
    public void Reserva_vuelo()
    {
        boolean seguir = true;
        
        while (seguir)
        {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("********* Bienvenido al Sistema de  *********"+ "\n\n" +
                                                                   "Seleccione una opción: " + "\n" +
                                                                   "1. Reservar asientos " + "\n" +
                                                                   "2. Modificar Reserva " + "\n" +
                                                                   "3. Eliminar Reserva " + "\n" +
                                                                   "4. Consultar Reserva " + "\n" +
                                                                   "5. Consultar Disponibilidad " + "\n" +
                                                                   "6. Salir del Programa"));
            switch (opc)
            {
                case 1:
                    Registrar_Asiento();
                    break;
                    
                case 2:
                    Modificar_Reserva();
                    break;
                    
                case 3:
                    Eliminar_Reserva();
                    break;
                    
                case 4:
                    Consultar_Reserva();
                    break;
                    
                case 5:
                    Consultar_Arreglo();
                    break;
                    
                case 6:
                    seguir = false;
                    break;
                
                default:
                    JOptionPane.showMessageDialog(null, "Seleccione una opción del menú (1-6)");
                    break;
            }
        }
    }
    
    public void Registrar_Asiento()
    {
        // < > \
                      
        boolean continuar = true;
    
        while(continuar)
        {
            
            fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese la fila que desea reservar del 1 al 9)"));
            columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Por favor ingrese el asiento que desea del 1 al 10)"));
            
            if (asientos [fila - 1][columna - 1] == 0)
            {
                
                asientos [fila - 1][columna - 1] = 1;
                
                JOptionPane.showMessageDialog(null, "Reserva Exitosa!" + "\n\n" +
                                                    "Asiento: # " + columna + "\n" +
                                                    "Fila: # " + fila);
                
            }
            
            else
            {
                
                JOptionPane.showMessageDialog(null, "El asiento seleccionado esta ocupado, por favor selecionar uno disponible.");
                
            }
            
            int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra reservación ? ");
            
            if (input == 1)
            {
                JOptionPane.showMessageDialog(null, "Muchas Gracias por su reserva!");
                continuar = false;
               
            }
            
        }   
        
    }
    
    public void Modificar_Reserva()
    {
        
    }
    
    public void Eliminar_Reserva()
    {
        
    }
    
    public void Consultar_Reserva()
    {
        
        for (int f = 0; f < 9; f ++)
        {
            
            for (int c = 0; c < 10; c ++)
            {
                
                JOptionPane.showMessageDialog(null, asientos [f][c] + "\t");
                
            }
            
        }
        
    }
    
    public void Consultar_Arreglo()
    {
        
    }
    
    
}

