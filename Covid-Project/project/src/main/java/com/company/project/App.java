package com.company.project;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public  class App {
    
    public static void main(String[] args) {

       Covid obj = new Covid();
   
    int Option,Exit;
        
  
    
    do { 
        
    UIManager.put("OptionPane.messageFont", new Font("Montserrat", Font.BOLD, 14));
    UIManager.put("OptionPane.buttonFont", new Font("Montserrat", Font.PLAIN, 12));  
    //rgb(0,150,136)
    //rgb(120,144,156)
    UIManager UI=new UIManager();
    UIManager.put("OptionPane.background",new ColorUIResource(0,150,136));
    UIManager.put("Panel.background",new ColorUIResource(120,144,156));
    
       
     
    Option=Integer.parseInt(JOptionPane.showInputDialog(
        
    "    ----------------Menu Principal----------------\n"+"\n"+
                    
    "1. Ingresar datos para día 1-7" + "\n"+ 
     "y mostrar cantidad de muestras tomadas y" + "\n" +
      "de casos positivos en cada dia  \n" + "\n"+
                    
    "2. Porcentaje de casos positivos en cada"+"\n" 
      +"comorbilidad respecto al total de muestras \n"+"\n"+
                    
    "3.Cantidad de muestras tomadas y casos positivos"+"\n"+ 
       "acumulados por comunas , incluyendo los casos de los dias" + "\n"
       + "anteriores  .  \n"+"\n"+
            
    "4. Total de muestras tomadas y cantidad de casos" + "\n" +
     "positivos registrados en la semana .  \n"+"\n"+
                    
    "5. porcentaje de casos positivos en cada comuna \n"+"\n"+
                    
    "6. Porcentaje de casos sintomaticos y asintomaticos \n"+"\n"+

    "7. Distribucion de cantidad de casos por grupo de edades y sexo.\n"+"\n"+
                    
    "8. Salir.\n"+"\n"+
            
    " Ingrese una opción : "));
            
                
    switch(Option){
    case 1:
    String seleccion;               
    Object tDia[] = new Object[]{"Dia1","Dia2","Dia3","Dia4","Dia5","Dia6","Dia7",
                                       };
   
    Object xDia = JOptionPane.showInputDialog(null,"Elija el día en que se tomaron pruebas",
                                       "Seleccion de día hábil",
                JOptionPane.QUESTION_MESSAGE,null,tDia ,tDia[0]);
   
    seleccion = xDia.toString();
        
    if(seleccion.equals("Dia1")){

        obj.Dia1();

    }
    if(seleccion.equals("Dia2")){
        obj.Dia2();

    }
    if(seleccion.equals("Dia3")){
        obj.Dia3();

    }
    if(seleccion.equals("Dia4")){
        obj.Dia4();

    }
    if(seleccion.equals("Dia5")){
        obj.Dia5();

    }
    if(seleccion.equals("Dia6")){
        obj.Dia6();

    }
    if(seleccion.equals("Dia7")){
        obj.Dia7();

    }
                  
    break;
    
    case 2:
   
   obj.puntoDos(); 
  
    break;
    case 3:
  
    break;
    case 4:
    
    break;
    
    case 5:
    
    break;
    
    case 6:
   
    break;

    case 7:
   
    break;
               
    case 8:
    Exit=JOptionPane.showConfirmDialog(null, "¿Do you want to exit from the Menu?");
    if (Exit==0) {
       
     
    break;
                    }
    default:
                 
    JOptionPane.showMessageDialog(null, "Non valid option ");
                     
    break;
                }
     
    }while (Option != 8);
    
    
    System.exit(0);
}         
} 
  

