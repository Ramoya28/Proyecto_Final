package proyecto_final;

import javax.swing.JOptionPane;

public class Boletos 
{
    
    public static int selec_vuelo;
    public static String vuelo;
    public static String fecha;
    public static String hora;
    public static int selec_clase;
    public static String clase;
    public static int clase_precio;
    public static int selec_aerolinea;
    public static String aerolinea;
    public static int boletos;
    public static int asientos;
    public static String total;
    
    public static int getSelec_vuelo() {
        return selec_vuelo;
    }

    public static void setSelec_vuelo(int selec_vuelo) {
        Boletos.selec_vuelo = selec_vuelo;
    }

    public static String getVuelo() {
        return vuelo;
    }

    public static void setVuelo(String vuelo) {
        Boletos.vuelo = vuelo;
    }

    public static String getFecha() {
        return fecha;
    }

    public static void setFecha(String fecha) {
        Boletos.fecha = fecha;
    }

    public static String getHora() {
        return hora;
    }

    public static void setHora(String hora) {
        Boletos.hora = hora;
    }

    public static int getSelec_clase() {
        return selec_clase;
    }

    public static void setSelec_clase(int selec_clase) {
        Boletos.selec_clase = selec_clase;
    }

    public static String getClase() {
        return clase;
    }

    public static void setClase(String clase) {
        Boletos.clase = clase;
    }

    public static int getClase_precio() {
        return clase_precio;
    }

    public static void setClase_precio(int clase_precio) {
        Boletos.clase_precio = clase_precio;
    }

    public static int getSelec_aerolinea() {
        return selec_aerolinea;
    }

    public static void setSelec_aerolinea(int selec_aerolinea) {
        Boletos.selec_aerolinea = selec_aerolinea;
    }

    public static String getAerolinea() {
        return aerolinea;
    }

    public static void setAerolinea(String aerolinea) {
        Boletos.aerolinea = aerolinea;
    }

    public static int getBoletos() {
        return boletos;
    }

    public static void setBoletos(int boletos) {
        Boletos.boletos = boletos;
    }

    public static int getAsientos() {
        return asientos;
    }

    public static void setAsientos(int asientos) {
        Boletos.asientos = asientos;
    }

    public static String getTotal() {
        return total;
    }

    public static void setTotal(String total) {
        Boletos.total = total;
    }
    
    
    public void Datos_Boleto () 
    {
        // < > \
        
        boolean continuar = true;
    
        while(continuar)
        {                    
        
            //Mensaje de bienvenida al modulo
            
            JOptionPane.showMessageDialog(null,"********** Bienvenido al modulo de compra de boletos **********" + "\n\n" +
                                               "Por favor complete los datos solicitados a continuación" + "\n" +
                                               "para completar la reserva de los boletos: ");
            
            //Selección de ruta para el vuelo
        
            selec_vuelo = Integer.parseInt(JOptionPane.showInputDialog(null,"***** Selección de vuelos *****" + "\n\n" + 
                                                                     "A continuación se listan los vuelos disponibles:" + "\n" +
                                                                     "1. Costa Rica - Tokyo" + "\n" +
                                                                     "2. Costa Rica - New York" + "\n" +
                                                                     "3. Costa Rica - Barcelona"));
        
            if (selec_vuelo == 1)
            {            
                vuelo = "Costa Rica - Tokyo" ;            
            }
        
            else if (selec_vuelo == 2)
            {            
                vuelo = "Costa Rica - New York" ;            
            }
        
            else if (selec_vuelo == 3)
            {           
                vuelo = "Costa Rica - Barcelona" ;           
            }
            
            
            //Selección de fecha y hora del vuelo
        
            fecha = JOptionPane.showInputDialog(null,"Ingrese la fecha en la que desea hacer su reserva," + "\n" +
                                                     "formato Dia/Mes/Año: ");
            
            hora = JOptionPane.showInputDialog(null,"Digite la hora en la que desea reservar, formato Hora:Minutos: ");
            
            
            //Selección de la clase del vuelo
            
            selec_clase = Integer.parseInt(JOptionPane.showInputDialog(null,"***** Selección de clases *****" + "\n\n" + 
                                                                     "A continuación se listan las clases disponibles:" + "\n" +
                                                                     "1. Primera clase - $800" + "\n" +
                                                                     "2. Clase ejecutiva - $600" + "\n" +
                                                                     "3. Clase económica - $400"));
        
            if (selec_clase == 1)
            {           
                clase = "Primera clase" ;
                clase_precio = 800 ;
            }
        
            else if (selec_clase == 2)
            {            
                clase = "Clase ejecutiva" ; 
                clase_precio = 600 ;
            }
        
            else if (selec_clase == 3)
            {            
                clase = "Clase económica" ;
                clase_precio = 400 ;
            }
            
            //Selección de aerolínea 
            
            selec_aerolinea = Integer.parseInt(JOptionPane.showInputDialog(null,"***** Selección de aerolínea *****" + "\n\n" + 
                                                                     "A continuación se listan las aerolíneas disponibles:" + "\n" +
                                                                     "1. Skyway" + "\n" +
                                                                     "2. Sansa" + "\n" +
                                                                     "3. Aerobell "));
        
            if (selec_aerolinea == 1)
            {           
                aerolinea = "Skyway" ;          
            }
        
            else if (selec_aerolinea == 2)
            {            
                aerolinea = "Sansa" ;           
            }
        
            else if (selec_aerolinea == 3)
            {            
                aerolinea = "Aerobell " ;
            }
            
            //Selección de boletos y asientos
            
            
            boletos = Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad de boletos que desea: "));
            
            //Sistema de selección de asientos pendiente
            
            int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra reservación ? ");
            
            if (input == 1)
            {
               JOptionPane.showMessageDialog(null, "Muchas Gracias por su reserva!");
               continuar = false;
               
            }
        
        }
        
    }
    
}
