
package carroatividade2;


public class classe1carro {
    
   
   
   
    String marca;
    String modelo;
    boolean ligado;

   
   
   
   
    public void imprimir(){
       
        System.out.println("qual a marca do carro? " + marca);
        System.out.println("qual é o modelo do carro? " + modelo );
       
       
       
    }
   
   
   
   
   
    public void status (){
        System.out.println("O carro está ligado? " + ligado);
       
       
       
       
    }
   
   
   
   
   
 public void Ligar(){
     ligado = true;
             if (ligado == true){
            System.out.println("O carro esta ligado");
           
           
   

    }
}
 
 public void Desligar(){
     
      ligado = false;
             if (ligado == false){
            System.out.println("O carro esta desligado");
           
           
           
           
           
           
 }
}
}
    

