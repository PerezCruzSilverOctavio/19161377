import java.util.*;

public class Posicion {
public String otraposicion(String numero){
    
    int indice;
    System.out.println("Introduce un numero");
    char valor= numero.charAt(indice);
    String ceros= "";
    for (int i=indice;i<numero.length();i++){
    ceros +="0";
    }
    return valor + ceros;
  }
}

