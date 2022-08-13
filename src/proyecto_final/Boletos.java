package proyecto_final;

import javax.swing.JOptionPane;

public class Boletos {

    // Atributos
    private static int Selec_vuelo;
    private static String Vuelo;
    private static int Vuelo_Precio;
    private static String Fecha;
    private static String Hora;
    private static int Selec_clase;
    private static String Clase;
    private static int Clase_precio;
    private static int Selec_aerolinea;
    private static String Aerolinea;
    private static int Boletos;
    private static int Total;

    // Metodos Set y Get
    public int getSelec_vuelo() {
        return Selec_vuelo;
    }

    public void setSelec_vuelo(int selec_vuelo) {
        this.Selec_vuelo = Selec_vuelo;
    }

    public String getVuelo() {
        return Vuelo;
    }

    public void setVuelo(String Vuelo) {
        this.Vuelo = Vuelo;
    }
    
    public int getVuelo_Precio() {
        return Vuelo_Precio;
    }

    public void setVuelo_Precio(int Vuelo_Precio) {
        this.Vuelo_Precio = Vuelo_Precio;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public String getHora() {
        return Hora;
    }

    public void setHora(String Hora) {
        this.Hora = Hora;
    }

    public int getSelec_clase() {
        return Selec_clase;
    }

    public void setSelec_clase(int Selec_clase) {
        this.Selec_clase = Selec_clase;
    }

    public String getClase() {
        return Clase;
    }

    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    public int getClase_precio() {
        return Clase_precio;
    }

    public void setClase_precio(int Clase_precio) {
        this.Clase_precio = Clase_precio;
    }

    public int getSelec_aerolinea() {
        return Selec_aerolinea;
    }

    public void setSelec_aerolinea(int Selec_aerolinea) {
        this.Selec_aerolinea = Selec_aerolinea;
    }

    public String getAerolinea() {
        return Aerolinea;
    }

    public void setAerolinea(String aerolinea) {
        this.Aerolinea = Aerolinea;
    }

    public int getBoletos() {
        return Boletos;
    }

    public void setBoletos(int Boletos) {
        this.Boletos = Boletos;
    }

    public int getTotal() {
        return Total;
    }

    public void setTotal(int Total) {
        this.Total = Total;
    }

    public void Registro_Boletos() {
        
        JOptionPane.showMessageDialog(null,"********** Bienvenido al modulo de selección de vuelos **********" + "\n\n" +
                                           "Por favor complete los datos solicitados a continuación" + "\n" +
                                           "para el registro del cliente: ");        

        boolean continuar = true;
    
        while(continuar)
        {
            //Selección de ruta para el vuelo
        Selec_vuelo = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione la ruta que desea:" + "\n" +
                                                                        "1. Costa Rica - Tokyo - $5000" + "\n" +
                                                                        "2. Costa Rica - New York - $2000" + "\n" +
                                                                        "3. Costa Rica - Barcelona - $3500"));
        switch (Selec_vuelo) {
            case 1:
                Vuelo = "Costa Rica - Tokyo" ;
                Vuelo_Precio = 5000 ;
                break;
            case 2:
                Vuelo = "Costa Rica - New York" ;
                Vuelo_Precio = 2000 ;
                break;
            case 3:
                Vuelo = "Costa Rica - Barcelona" ;
                Vuelo_Precio = 3500 ;
                break;
            default:
                break;
        }
        //Selección de fecha y hora
        
        Fecha = JOptionPane.showInputDialog(null, "Ingrese la fecha en la que desea hacer su reserva: " + "\n" +
                                                     " * Formato: Dia/Mes/Año * ");
        Hora = JOptionPane.showInputDialog(null, "Digite la hora en la que desea reservar: " + "\n" +
                                                     " * Formato: Hora:Minutos * ");
        
        //Selección de clase
        
        Selec_clase = Integer.parseInt(JOptionPane.showInputDialog(null,"Seleccione cual clase desea:" + "\n" +
                                                                        "1. Primera clase - $2000" + "\n" +
                                                                        "2. Clase ejecutiva - $1000" + "\n" +
                                                                        "3. Clase económica - $500"));
        
        switch (Selec_clase) {
            case 1:           
                Clase = "Primera clase" ;
                Clase_precio = 2000 ;
                break;
            case 2:
                Clase = "Clase ejecutiva" ; 
                Clase_precio = 1000 ;
                break;
            case 3:            
                Clase = "Clase económica" ;
                Clase_precio = 500 ;
                break;
            default:
                break;
        }
        
        //Selección de ruta de la aerolinea
        
        Selec_aerolinea = Integer.parseInt(JOptionPane.showInputDialog(null,"Aerolíneas disponibles:" + "\n" +
                                                                            "1. Skyway" + "\n" +
                                                                            "2. Sansa" + "\n" +
                                                                            "3. Aerobell "));
        
        switch (Selec_aerolinea) {
            case 1:
                Aerolinea = "Skyway" ;
                break;
            case 2:
                Aerolinea = "Sansa" ;
                break;
            case 3:            
                Aerolinea = "Aerobell" ;
                break;
            default:
                break;
        }
            
        
        //Selección de boletos
        
        Boletos = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de boletos que desea: "));
    
        Total = Vuelo_Precio + Clase_precio ;

    
        /*JOptionPane.showMessageDialog(null, "Los datos de su reserva son: \n"
                                          + "Ruta: " + Vuelo + "\n"
                                          + "Fecha: " + Fecha + "\n"
                                          + "Hora: " + Hora + "\n"
                                          + "Clase: " + Clase + "\n"
                                          + "Aerolinea: " + Aerolinea + "\n"
                                          + "Cantidad de boletos: " + Boletos + "\n"
                                          + "Total: " + Total);*/
      
            
            int input = JOptionPane.showConfirmDialog(null, "Desea realizar otra reservación ? ","",JOptionPane.YES_NO_OPTION,-1);
            
            if (input == 1)
            {
               continuar = false;
               
            }
        }
    }   
}
