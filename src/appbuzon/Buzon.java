package appbuzon;

import java.util.ArrayList;

/**
 *
 * @author Javii
 */
public class Buzon {
     ArrayList<Correo>listaCorreo = new ArrayList<Correo>();
    

    public int numerodeCorreos(){
        int contador=0;
        for(int i=0;i<listaCorreo.size();i++){
            contador++;
        }
        return contador;
    }
    
    public void engade(Correo C){
        listaCorreo.add(C);
    }
    
    public boolean porLer(){
        boolean ler=false;
        for(int i=0;i<listaCorreo.size();i++){
            if(listaCorreo.get(i).isLeido()== false){
              ler = false;  
            }else{
                ler = true;
            }
        }
        return ler;
    }
    
    public String amosarPrimeiroNonLeido(){
        for(int i=0;i<listaCorreo.size();i++){
            if(listaCorreo.get(i).isLeido()== true){
                return listaCorreo.get(i).getListaCorreo();
            }
    }
        return "Todos leidos";
}
    
    public String amosa(int k){
        String amosar="";
        if(listaCorreo.get(k).isLeido() == true){
        amosar="No leido";
        }
        else{
            amosar="Leido";
    }
        return amosar;
    }
    
    public void eliminar(int k){
        listaCorreo.remove(k);
     }
}


