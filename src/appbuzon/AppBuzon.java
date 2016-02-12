package appbuzon;

import javax.swing.JOptionPane;

/**
 *
 * @author Javii
 */
public class AppBuzon {

   
    public static void main(String[] args) {
        Buzon obx = new Buzon();
        String repetir;
        do{
        switch(Integer.parseInt(JOptionPane.showInputDialog("Seleccione una opción: \n1. Engadir. \n2. Faltan mensajes por leer? \n3. Ultimo mensaje no leido. \n4. Mensaje que desea visualizar.  \n5. Elimiar. "))){
            case 1:
                int numero=Integer.parseInt(JOptionPane.showInputDialog("Esta seguro de realizar esta operación? \n1. Si. \n2. No."));
                    if(numero==1){
                        Correo C = new Correo("****");
                        obx.engade(C);
                    }
                    else if(numero==2){
                        break;
            }
        case 2:JOptionPane.showMessageDialog(null,"Numero de correos: "+obx.numerodeCorreos());
            break;
        case 3 :if(obx.porLer()==true)
            JOptionPane.showMessageDialog(null,"Quedan mensajes por leer");
            else
            JOptionPane.showMessageDialog(null,"No quedan mensajes por leer");
            break;
        case 4:JOptionPane.showMessageDialog(null,obx.amosarPrimeiroNonLeido());
            break;
        case 5:obx.amosa(Integer.parseInt(JOptionPane.showInputDialog("Elige la posición:")));
            break;
        case 6:
            obx.eliminar(Integer.parseInt(JOptionPane.showInputDialog("Elige la posición:")));
            JOptionPane.showMessageDialog(null,"Borrado!");
            break;
    } 
    repetir = JOptionPane.showInputDialog("¿Quieres hacer otra operación?");
    }while(repetir.equalsIgnoreCase("si"));
    }
    
}
      
   