package proyecto_final;

import javax.swing.JOptionPane;

public class Boletos {

    // Atributos
    private int selec_vuelo;
    private String vuelo;
    private String fecha;
    private String hora;
    private int selec_clase;
    private String clase;
    private int clase_precio;
    private int selec_aerolinea;
    private String aerolinea;
    private int boletos;
    private int asientos;
    private String total;

    // Metodos Set y Get
    public int getSelec_vuelo() {
        return selec_vuelo;
    }

    public void setSelec_vuelo(int selec_vuelo) {
        this.selec_vuelo = selec_vuelo;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public int getSelec_clase() {
        return selec_clase;
    }

    public void setSelec_clase(int selec_clase) {
        this.selec_clase = selec_clase;
    }

    public String getClase() {
        return clase;
    }

    public void setClase(String clase) {
        this.clase = clase;
    }

    public int getClase_precio() {
        return clase_precio;
    }

    public void setClase_precio(int clase_precio) {
        this.clase_precio = clase_precio;
    }

    public int getSelec_aerolinea() {
        return selec_aerolinea;
    }

    public void setSelec_aerolinea(int selec_aerolinea) {
        this.selec_aerolinea = selec_aerolinea;
    }

    public String getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.aerolinea = aerolinea;
    }

    public int getBoletos() {
        return boletos;
    }

    public void setBoletos(int boletos) {
        this.boletos = boletos;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void registro_Boletos() {
        JOptionPane.showMessageDialog(null, "********** Bienvenido al registro de boletos **********" + "\n\n"
                + "Por favor complete los datos solicitados a continuación" + "\n");

        vuelo = JOptionPane.showInputDialog(null, "Costa Rica - Tokyo" + "\n" + 
                                                  "Costa Rica - New York" + "\n" +
                                                  "Costa Rica - Barcelona");
        fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha en la que desea hacer su reserva," + "\n" +
                                                     "formato Dia/Mes/Año: ");
        hora = JOptionPane.showInputDialog(null, "Digite la hora en la que desea reservar, formato Hora:Minutos: ");
        clase = JOptionPane.showInputDialog(null, "Primera Clase" + "\n" + 
                                                  "Clase Ejecutiva" + "\n" +
                                                  "Clase Economica");
        aerolinea = JOptionPane.showInputDialog(null, "Skywell" + "\n" + 
                                                      "Sansa" + "\n" +
                                                      "Aerobell");
        boletos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de boletos que desea: "));
        asientos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de asientos que desea: "));
    }

    public void datos_Boletos() {
        JOptionPane.showMessageDialog(null, "Los datos del Boleto son: \n"
                + "Vuelo: " + getVuelo() + "\n"
                + "Fecha: " + getFecha() + "\n"
                + "Hora: " + getHora() + "\n"
                + "Clase: " + getClase() + "\n"
                + "Aerolinea: " + getAerolinea() + "\n"
                + "Boletos: " + getBoletos() + "\n"
                + "Asientos: " + getAsientos());
    }
}
    
    
    /*
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
        
        }*/
    
