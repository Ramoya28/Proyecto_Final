package proyecto_final;

import javax.swing.JOptionPane;

public class Reserva_asientos {
    
    public static String asientos [][] = new String [9][10];
    private static String asientos_fact ;
    Clientes cliente = new Clientes () ;
    
    public String getasientos_fact() {
        return asientos_fact;
    }

    public void setasientos_fact(String asientos_fact) {
        this.asientos_fact = asientos_fact;
    }
    
    public void Rellenar_Arreglo ()
    {
        
        for (int f=0; f<asientos.length; f++)
        {
            
            for (int c=0; c<asientos[0].length; c++)
            {
                
                asientos [f][c] = "Disponible";
                
            }
            
        }
        
    }
    
    public void Reserva_vuelo()
    {       
        boolean seguir = true; 
        
        Rellenar_Arreglo ();
        
        while (seguir)
        {
            int opc = Integer.parseInt(JOptionPane.showInputDialog("********* Bienvenido al Sistema de Reserva de Asientos *********"+ "\n\n" +
                                                                   "Seleccione la opción que desea realizar: " + "\n" +
                                                                   "1. Reservar asientos " + "\n" +
                                                                   "2. Modificar Reservas " + "\n" +
                                                                   "3. Eliminar Reservas " + "\n" +
                                                                   "4. Consultar Reservas " + "\n" +
                                                                   "5. Consultar Disponibilidad " + "\n" +
                                                                   "6. Salir al menú princial"));
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
                    JOptionPane.showMessageDialog(null, "La opción seleccionada no es válida");
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
            String cedula2 = JOptionPane.showInputDialog("Indique su número de cédula: ");
            int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de fila que desea reservar (1-9): "));
            int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de asiento que desea reservar (1-10): "));
            
            -- fila;
            -- columna; 
            
            if (asientos [fila][columna].equals("Disponible"))
            {
                
                asientos [fila][columna] = cedula2;
                
                JOptionPane.showMessageDialog(null, "Reserva Exitosa!" + "\n\n");
                
            }
            
            else
            {
                
                JOptionPane.showMessageDialog(null, "Campo Ocupado!");
                
            }
                        
            int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra reservación ? ");
            
            if (input == 1)
            {
                continuar = false;
               
            } 
            
        }
        
        for (int f=0; f<asientos.length; f++)
            {
                
                for (int c=0; c<asientos[0].length; c++)
                {
                    
                    if (asientos[f][c].equals(cliente.getCedula()))
                    {                                                                     
                        asientos_fact += " Fila: " + (f+1) + " | " + " Asiento: " + (c+1) + "\n" ;
                                       
                    }
                }
            }    
                    
    }
    
    public void Modificar_Reserva()
    {
        
        boolean continuar = true;
        boolean seguir = true;
    
        while(continuar)
        {
            String cedula2 = JOptionPane.showInputDialog("Indique el número de cédula de la reserva a modificar: ");
            int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de fila que tiene reservado (1-9): "));
            int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de asiento que tiene reservado (1-10): "));
            
            -- fila;
            -- columna;
            
            if (asientos [fila][columna].equals(cedula2))
            {
                
                while (seguir)
                {
                    
                    JOptionPane.showMessageDialog(null, "Indique los campos en los que desea cambiar la reservación: ");
                    
                    int filaN = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de fila a cambiar (1-9): "));
                    int columnaN = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de asiento a cambiar (1-10): "));
                    
                    -- filaN;
                    -- columnaN;
                    
                    if (asientos [filaN][columnaN].equals("Disponible"))
                    {
                        
                        asientos [filaN][columnaN] = cedula2;
                        asientos [fila][columna] = "Disponbile";
                        
                        JOptionPane.showMessageDialog(null, "Reserva modificada exitosamente!");
                        
                        seguir = false;
                        
                    }
                    
                    else
                    {
                        
                        JOptionPane.showMessageDialog(null, "Campo Ocupado!");
                        
                        int input2 = JOptionPane.showConfirmDialog(null, "Desea intentar con otro campo ? ");
            
                        if (input2 == 1)
                        {
                            
                            seguir = false;
               
                        }
                        
                    }
                    
                }
                
            }
            
            else
            {
                
               JOptionPane.showMessageDialog(null, "Los campos o cédula ingresados no pertenecen a una reserva."); 
                
            }
            
            int input3 = JOptionPane.showConfirmDialog(null, "Desea modificar otra reserva ? ");
            
                        if (input3 == 1)
                        {
                            
                            continuar = false;
               
                        }
        }
        
        
        
    }
    
    public void Eliminar_Reserva()
    {
       
      boolean continuar = true;
      
      while (continuar)
      { 
          
        String cedula2 = JOptionPane.showInputDialog("Indique el número de cédula de la reserva a eliminar: ");
        int fila = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de fila que tiene reservado (1-9): "));
        int columna = Integer.parseInt(JOptionPane.showInputDialog(null, "Indique el número de asiento que tiene reservado (1-10): "));  
        
        -- fila;
        -- columna;
        
        if (asientos [fila][columna].equals(cedula2))
        {
            
            asientos[fila][columna] = "Disponible";
            JOptionPane.showMessageDialog(null, "Reserva eliminada exitosamente!");
            
        }
        
        else
        {
            
            JOptionPane.showMessageDialog(null, "Los campos o cédula ingresados no pertencen a una reserva");
            
        }
        
        int input4 = JOptionPane.showConfirmDialog(null, "Desea eliminar otra reserva ? ");
            
            if (input4 == 1)
            {
                            
                continuar = false;
               
            }
        
      }
      
    }
    
    public void Consultar_Reserva()
    {
        
        boolean continuar = true;
      
        while (continuar)
        { 
            int contador = 0;
            String cedula2 = JOptionPane.showInputDialog("Indique el número de cédula que desea consultar: ");
            
            for (int f=0; f<asientos.length; f++)
            {
                
                for (int c=0; c<asientos[0].length; c++)
                {
                    
                    if (asientos[f][c].equals(cedula2))
                    {
                        
                        JOptionPane.showMessageDialog(null, "La cédula # " + cedula2 + "tiene el campo reservado: " + "\n\n" +
                                                            "Fila: " + (f+1) + "\n" +
                                                            "Asiento: " + (c+1) );
                        
                        
                        asientos_fact += " Fila: " + (f+1) + " | " + " Asiento: " + (c+1) + "\n" ;
               
                        
                    }
                    
                    else
                    {
                        contador ++;
                        
                    }
                    
                }
                
            }
            
            if (contador == 90)
            {
                
                JOptionPane.showMessageDialog(null, "La cédula consultada no tiene ninguna reserva");
                
            }
                                   
            int input5 = JOptionPane.showConfirmDialog(null, "Desea consultar otra reserva ? ");
            
                if (input5 == 1)
                {
                            
                    continuar = false;
               
                }
        
        }
             
    }
    
    public void Consultar_Arreglo()
    {
        String cadena = "";           
            
        for (int f=0; f<asientos.length; f++)
        {
                
            for (int c=0; c<asientos[0].length; c++)
            {
                    
                cadena += " | " + asientos [f][c] + " | ";
                    
            }
                
            cadena += "\n";
        }
                                                        
        JOptionPane.showMessageDialog(null, cadena);
    
    }

    
}

