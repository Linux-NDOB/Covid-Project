package com.company.project;

import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.plaf.ColorUIResource;


public  class App {
    
    public static void main(String[] args) {
       Covid obj = new Covid();
   
       obj.setDatos();
    

    
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
                    
    
        
    
                        
   
                   
    break;
    
    case 2:
   
    
  
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
     
    }while (Option != 8);
    
    
    System.exit(0);
}         
   
  

