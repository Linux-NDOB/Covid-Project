package com.company.project;

import javax.swing.JOptionPane;

public class Covid {
    

        private int comuna;

        private String sexo;

        private String sintomas;

        private int edad;

        private String resultado;

        private String comorbilidad;

        public Covid() {
            this.comuna = 0;
            this.sexo = "";
            this.sintomas = "";
            this.edad = 0;
            this.resultado = "";
            this.comorbilidad = "";
        }

        public int getComuna() {
            return comuna;
        }
    
        public void setComuna(int comuna) {
            this.comuna = comuna;
        }
    
        public String getSexo() {
            return sexo;
        }
    
        public void setSexo(String sexo) {
            this.sexo = sexo;
        }
    
        public String getSintomas() {
            return sintomas;
        }
    
        public void setSintomas(String sintomas) {
            this.sintomas = sintomas;
        }
    
        public int getEdad() {
            return edad;
        }
    
        public void setEdad(int edad) {
            this.edad = edad;
        }
    
        public String getResultado() {
            return resultado;
        }
    
        public void setResultado(String resultado) {
            this.resultado = resultado;
        }
    
        public String getComorbilidad() {
            return comorbilidad;
        }
    
        public void setComorbilidad(String comorbilidad) {
            this.comorbilidad = comorbilidad;
        }
        
         
        public void setDatos( ){

            int casosPositivos;

            int noPruebas;
             

            
            int dias;

            dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Cuantos dias se trabajaron"));

            for(int j = 0; j<dias; j++){
        
                JOptionPane.showMessageDialog(null, "ingrese los datos para el dia " + j+1);
            
            
            
          

           
            noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "¿Cuantas pruebas fueron realizadas en el dia" + j+1));


            casosPositivos = Integer.parseInt(JOptionPane.showInputDialog(
                            null, "¿Cuantos casos fueron positivos?"));

                            if(casosPositivos>noPruebas){

                                JOptionPane.showMessageDialog(null, "numero de pruebas no pude ser inferior " + "\n" 
                                                            + "a nro de casos positivos");

                            break;
                            }

                            else{

                                 JOptionPane.showMessageDialog(null, "Puede continuar");

                            }

      

            
                           
                    
                    String comuna;

                    //contador de resultados
                    int cP = 0;
                    int cN = 0;




                    //Referenciado de valor de edad
                    

                    int cCatorce = 0;
                    int qTreinta = 0;
                    int tSesenta = 0;
                    int sCien = 0;


      
                    //Contador de comorbilidad
                    int d = 0;
                    int h = 0;
                    int o = 0;
                    int n = 0;

                    //Contadores de Sintomas
                        int cSi1 = 0;
                        int cSi2 = 0;

                    //Contadores de Sexo
                        int cS1 = 0;
                        int cS2 = 0;

                    //Contadores de Comunas
                        int cC1 = 0;
                        int cC2 = 0;
                        int cC3 = 0;
                        int cC4 = 0;
                        int cC5 = 0;
                        int cC6 = 0;
                        int cC7 = 0;
                        int cC8 = 0;
                        int cC9 = 0;

            for (int i= 0; i < noPruebas; i++){

           
                            Object noComuna[] = new Object[]{"Comuna1","Comuna2","Comuna3","Comuna4",
                            "Comuna5","Comuna6","Comuna7","Comuna8","Comuna9"
                                    };

                            Object mostrar = JOptionPane.showInputDialog(null,"Digite su Comuna porfavor",
                                    "Seleccion de Comuna",
                                    JOptionPane.QUESTION_MESSAGE,null,noComuna ,noComuna[0]);

                            comuna = mostrar.toString();

                            if(comuna.equals("Comuna1")){

                             cC1 ++;

                            }
                             if(comuna.equals("Comuna2")){

                                cC2 ++;
   
                               }
                                if(comuna.equals("Comuna3")){

                                cC3 ++;
   
                               }
                               if(comuna.equals("Comuna4")){

                                cC4 ++;
   
                               }
                               if(comuna.equals("Comuna5")){

                                cC5 ++;
   
                               }
                               if(comuna.equals("Comuna6")){

                                cC6 ++;
   
                               }if(comuna.equals("Comuna7")){

                                cC7 ++;
   
                               }
                               if(comuna.equals("Comuna8")){

                                cC8 ++;
   
                               }
                               if(comuna.equals("Comuna9")){

                                cC9 ++;
   
                               }


                               
        
                               Object tSexo[] = new Object[]{"M","F"
                                       };
   
                               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                                       "Seleccion de Sexo",
                                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);
   
                               sexo = mostrar.toString();

                               if(sexo.equals("M")){

                                cS1 ++;
   
                               }else if(comuna.equals("F")){

                                cS2 ++;
   
                               }

                               Object tSintomas[] = new Object[]{"S","A"
                                       };
   
                               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                                       "Seleccion de Sintomas",
                                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);
   
                               sintomas = mostrar.toString();

                               if(sintomas.equals("S")){

                                cSi1 ++;
   
                               }else if(sintomas.equals("A")){

                                cSi2 ++;
   
                               }


                               edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                                      "Prorfavor ingrese la edad"));
                               if(edad <= 14)
                               cCatorce ++;

                               else if(edad >14 && edad <= 30)
                               qTreinta ++;

                               else if(edad >30 && edad <60)
                               tSesenta ++;

                               else if(edad > 60 && edad <=100)
                               sCien ++;



        } 


        Object tResultado[] = new Object[]{"Positivo","Negativo" };

        Object xResultado = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
        "Seleccion de Sintomas",
        JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);

        resultado = xResultado.toString();

        if(resultado.equals("Positivo"))
        cP++;

        else if(resultado.equals("Negativo"))
        cN++;


        Object tComorbilidad[] = new Object[]{"Diabetes","Hipertension" , "Obesidad", "ninguna"};

        Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
        "Seleccion de Sintomas",
        JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);

        comorbilidad = xComorbilidad.toString();

        if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes"))
        d++;

        else if(resultado.equals("Positivo") && comorbilidad.equals("Hipertnesion"))
        h++;

        if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad"))
        o++;

        else if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna"))
        n++;



        
        JOptionPane.showMessageDialog(null, "numero de pruebas " + noPruebas +"\n"
        + "casos positivos " + cP +"\n"
        + " de la comuna1 " + cC1 
        + "\n"
        + " de la comuna2 " + cC2
        + "\n"
        + " de la comuna3 " + cC3
        + "\n"
        + " de la comuna4 " + cC4
        + "\n"
        + " de la comuna5 " + cC5
        + "\n"
        + " de la comuna6 " + cC6
        + "\n"
        + " de la comuna7 " + cC7
        + "\n"
        + " de la comuna8 " + cC8
        + "\n"
        + " de la comuna9 " + cC9
        + "\n"
        + "cantidad de Hombres : " + cS1
        + "\n"
        + "cantidad de mujeres :  " + cS2
        + "\n"
        + "cantidad sintomaticos  " + cSi1
        + "\n"
        + "cantidad asintomaticos  " + cS2
        + "\n"
        + "de 0-14 : " + cCatorce
        + "\n"
        + "de 15-30  " + qTreinta
        + "\n"
        + "de 30-60 : " + tSesenta
        + "\n"
        + "de 60-100  " + sCien);

    }
}

}

    