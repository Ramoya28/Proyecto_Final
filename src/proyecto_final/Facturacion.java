package proyecto_final;

import javax.swing.JOptionPane;

public class Facturacion 
{
    //public Boletos boleto;
    //public Clientes cliente;
    
    Clientes cliente = new Clientes () ;
    
    Boletos boleto = new Boletos ();
    
    Reserva_asientos reserva = new Reserva_asientos ();
        
    public void Impresion_Factura () 
    {
        // < > \
        
        JOptionPane.showMessageDialog(null, "********* Factura de compra *********" + "\n\n" +
                                            "********* Datos del cliente *********" + "\n\n" +
                                            "Nombre: " + cliente.getNombre() + "\n" +
                                            "Correo: " + cliente.getCorreo() + "\n" +
                                            "Teléfono: " + cliente.getTelefono() + "\n" +
                                            "Cédula: " + cliente.getCedula() + "\n\n" +
                                            "********* Datos del viaje *********"+ "\n\n" +
                                            "Ruta: " + boleto.getVuelo() + "\n" +
                                            "Precio de ruta: " + boleto.getVuelo_Precio() + "\n" +        
                                            "Fecha: " + boleto.getFecha()+ "\n" +
                                            "Hora: " + boleto.getHora()+ "\n" +
                                            "Clase: " + boleto.getClase()+ "\n" +
                                            "Precio de clase: " + boleto.getClase_precio()+ "\n" +        
                                            "Aerolínea: " + boleto.getAerolinea()+ "\n" +
                                            "Cantidad de boletos: " + boleto.getBoletos()+ "\n" +
                                            "Asientos: "+ reserva.getasientos_fact() + "\n\n" +
                                            "Total: " + boleto.getTotal());
        
    }
    
}
