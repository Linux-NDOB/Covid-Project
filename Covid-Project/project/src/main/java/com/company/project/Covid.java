package com.company.project;

import javax.swing.JOptionPane;

public class Covid {

        //Contadores para las edades de hombres
        private int edad1;
        private int edad2;
        private int edad3;
        private int edad4;

        //... para edades de mujeres

        private int edad5;
        private int edad6;
        private int edad7;
        private int edad8;

        //casos asintomaticos y sintomaicos
        private int cSintomaticos;
        
        private int cAsintomaticos;

        //numero de casos positivos totales de la semana

        private int cPositivos;
        
        //contador casos positivos por  comunas 

        private int comuna1;

        private int comuna2;

        private int comuna3;

        private int comuna4;

        private int comuna5;

        private int comuna6;

        private int comuna7;

        private int comuna8;

        private int comuna9;


        //comorbilidades   
        private int diabetes;

        private int hipertension;

        private int obesidad;
        
        private int ninguna;
        
        //numero de pruebas por dia 
        private int nPdia1;

        private int nPdia2;

        private int nPdia3;

        private int nPdia4;

        private int nPdia5;

        private int nPdia6;

        private int nPdia7;

        //atributos de la clase explicitos
        private int comuna;

        private String sexo;

        private String sintomas;

        private int edad;

        private String resultado;

        private String comorbilidad;

        public Covid() {
            this.edad1 = 0;
            this.edad2 = 0;
            this.edad3 = 0;
            this.edad4 = 0;
            this.edad5 = 0;
            this.edad6 = 0;
            this.edad7 = 0;
            this.edad8 = 0;
            this.cAsintomaticos = 0;
            this.cSintomaticos = 0;
            this.cPositivos = 0;
            this.comuna1 = 0;
            this.comuna2 = 0;
            this.comuna3 = 0;
            this.comuna4 = 0;
            this.comuna5 = 0;
            this.comuna6 = 0;
            this.comuna7 = 0;
            this.comuna8 = 0;
            this.comuna9 = 0;
            this.nPdia1 = 0;
            this.nPdia2 = 0;
            this.nPdia3 = 0;
            this.nPdia4 = 0;
            this.nPdia5 = 0;
            this.nPdia6 = 0;
            this.nPdia7 = 0;
            this.comuna = 0;
            this.sexo = "";
            this.sintomas = "";
            this.edad = 0;
            this.resultado = "";
            this.comorbilidad = "";
            this.diabetes = 0;
            this.hipertension = 0;
            this.obesidad = 0;
            this.ninguna = 0;

        }
        
        public int getEdad1() {
            return edad1;
        }
        
        public void setEdad1(int edad1) {
            this.edad1 = edad1;
        }
        
        public int getEdad2() {
            return edad2;
        }
        
        public void setEdad2(int edad2) {
            this.edad2 = edad2;
        }
        
        public int getEdad3() {
            return edad3;
        }
        
        public void setEdad3(int edad3) {
            this.edad3 = edad3;
        }
        
        public int getEdad4() {
            return edad4;
        }
        
        public void setEdad4(int edad4) {
            this.edad4 = edad4;
        }

        public int getEdad5() {
            return edad5;
        }
        
        public void setEdad5(int edad5) {
            this.edad5 = edad5;
        }
        
        public int getEdad6() {
            return edad6;
        }
        
        public void setEdad6(int edad6) {
            this.edad6 = edad6;
        }
        
        public int getEdad7() {
            return edad7;
        }
        
        public void setEdad7(int edad7) {
            this.edad7 = edad7;
        }
        
        public int getEdad8() {
            return edad8;
        }
        
        public void setEdad8(int edad8) {
            this.edad8 = edad8;
        }

        public int getcSintomaticos() {
            return cSintomaticos;
        }
        
        public void setcSintomaticos(int cSintomaticos) {
            this.cSintomaticos = cSintomaticos;
        }
        
        public int getcAsintomaticos() {
            return cAsintomaticos;
        }
        
        public void setcAsintomaticos(int cAsintomaticos) {
            this.cAsintomaticos = cAsintomaticos;
        }

        public int getcPositivos() {
            return cPositivos;
        }
        
        public void setcPositivos(int cPositivos) {
            this.cPositivos = cPositivos;
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

        public int getnPdia1() {
            return nPdia1;
        }
        
        public void setnPdia1(int nPdia1) {
            this.nPdia1 = nPdia1;
        }
        
        public int getnPdia2() {
            return nPdia2;
        }
        
        public void setnPdia2(int nPdia2) {
            this.nPdia2 = nPdia2;
        }
        
        public int getnPdia3() {
            return nPdia3;
        }
        
        public void setnPdia3(int nPdia3) {
            this.nPdia3 = nPdia3;
        }
        
        public int getnPdia4() {
            return nPdia4;
        }
        
        public void setnPdia4(int nPdia4) {
            this.nPdia4 = nPdia4;
        }
        
        public int getnPdia5() {
            return nPdia5;
        }
        
        public void setnPdia5(int nPdia5) {
            this.nPdia5 = nPdia5;
        }
        
        public int getnPdia6() {
            return nPdia6;
        }
        
        public void setnPdia6(int nPdia6) {
            this.nPdia6 = nPdia6;
        }
        
        public int getnPdia7() {
            return nPdia7;
        }
        
        public void setnPdia7(int nPdia7) {
            this.nPdia7 = nPdia7;
        }

        public int getDiabetes() {
            return diabetes;
        }
        
        public void setDiabetes(int diabetes) {
            this.diabetes = diabetes;
        }
        
        public int getHipertension() {
            return hipertension;
        }
        
        public void setHipertension(int hipertension) {
            this.hipertension = hipertension;
        }
        
        public int getObesidad() {
            return obesidad;
        }
        
        public void setObesidad(int obesidad) {
            this.obesidad = obesidad;
        }
        
        public int getNinguna() {
            return ninguna;
        }
        
        public void setNinguna(int ninguna) {
            this.ninguna = ninguna;
        }

        public int getComuna1() {
            return comuna1;
        }
        
        public void setComuna1(int comuna1) {
            this.comuna1 = comuna1;
        }
        
        public int getComuna2() {
            return comuna2;
        }
        
        public void setComuna2(int comuna2) {
            this.comuna2 = comuna2;
        }
        
        public int getComuna3() {
            return comuna3;
        }
        
        public void setComuna3(int comuna3) {
            this.comuna3 = comuna3;
        }
        
        public int getComuna4() {
            return comuna4;
        }
        
        public void setComuna4(int comuna4) {
            this.comuna4 = comuna4;
        }
        
        public int getComuna5() {
            return comuna5;
        }
        
        public void setComuna5(int comuna5) {
            this.comuna5 = comuna5;
        }
        
        public int getComuna6() {
            return comuna6;
        }
        
        public void setComuna6(int comuna6) {
            this.comuna6 = comuna6;
        }
        
        public int getComuna7() {
            return comuna7;
        }
        
        public void setComuna7(int comuna7) {
            this.comuna7 = comuna7;
        }
        public int getComuna8() {
            return comuna8;
        }
        
        public void setComuna8(int comuna8) {
            this.comuna8 = comuna8;
        }
        
        public int getComuna9() {
            return comuna9;
        }
        
        public void setComuna9(int comuna9) {
            this.comuna9 = comuna9;
        }
        
        
public void Dia1(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia 1?" ));

    //contador de resultados P/N
    int cP = 0;

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

    String comuna;

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

              
               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,
                       "Elija si es asintomatico o no",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = xSintomas.toString();

               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

               }

               edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                      "Porfavor ingrese la edad"));
               if(edad <= 14)
               cCatorce ++;

               else if(edad >14 && edad <= 30)
               qTreinta ++;

               else if(edad >30 && edad <60)
               tSesenta ++;

               else if(edad > 60 && edad <=100)
               sCien ++;

               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo")){
               cP++;
               cPositivos++;
               
               }
               
               Object tComorbilidad[] = new Object[]{
                   "Diabetes","Hipertension" , "Obesidad", "Ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,
               "Elija su Comobilidad ",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
               diabetes++;
               }else   
                    if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
               h++;
               hipertension++;
               
               }else 
                    if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
               o++;
               obesidad++;
               
                }else 
                    if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
               n++;
               ninguna++;
                }
                if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                    comuna1 ++;
       
                   }
                    if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
       
                       comuna2 ++;
       
                      }
                       if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
       
                       comuna3 ++;
       
                      }
                      if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
       
                       comuna4 ++;
       
                      }
                      if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
       
                       comuna5 ++;
       
                      }
                      if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
       
                       comuna6 ++;
       
                      }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
       
                       comuna7 ++;
       
                      }
                      if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
       
                       comuna8 ++;
       
                      }
                      if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
       
                       comuna9 ++;
       
                      }

                      //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }



               nPdia1 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 1: " + noPruebas +
"\n"
+ "casos positivos del día 1:" + cP);

}

public void Dia2(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia 2?" ));

    
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


               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = xSintomas.toString();

               
               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo"))
               cPositivos++;
               
               else if(resultado.equals("Negativo"))
               cN++;
               
               
               Object tComorbilidad[] = new Object[]{"Diabetes","Hipertension" , "Obesidad", "ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija sus Comorbilidad",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
                diabetes++;
                }else   
                     if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
                h++;
                hipertension++;
                
                }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
                o++;
                obesidad++;
                
                 }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
                n++;
                ninguna++;
                     }
                     if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                        comuna1 ++;
           
                       }
                        if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
           
                           comuna2 ++;
           
                          }
                           if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
           
                           comuna3 ++;
           
                          }
                          if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
           
                           comuna4 ++;
           
                          }
                          if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
           
                           comuna5 ++;
           
                          }
                          if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
           
                           comuna6 ++;
           
                          }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
           
                           comuna7 ++;
           
                          }
                          if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
           
                           comuna8 ++;
           
                          }
                          if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
           
                           comuna9 ++;
           
                          }

                          //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }

    
                

               nPdia2 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 2: " + noPruebas +
"\n"
+ "casos positivos del día 2:" + cP);

}

public void Dia3(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia 3?" ));

    
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


               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = xSintomas.toString();

               
               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo"))
               cPositivos++;
               
               Object tComorbilidad[] = new Object[]{"Diabetes","Hipertension" , "Obesidad", "Ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija su Comorbilidad",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
                diabetes++;
                }else   
                     if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
                h++;
                hipertension++;
                
                }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
                o++;
                obesidad++;
                
                 }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
                n++;
                ninguna++;
                }

                if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                    comuna1 ++;
       
                   }
                    if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
       
                       comuna2 ++;
       
                      }
                       if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
       
                       comuna3 ++;
       
                      }
                      if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
       
                       comuna4 ++;
       
                      }
                      if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
       
                       comuna5 ++;
       
                      }
                      if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
       
                       comuna6 ++;
       
                      }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
       
                       comuna7 ++;
       
                      }
                      if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
       
                       comuna8 ++;
       
                      }
                      if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
       
                       comuna9 ++;
       
                      }

                //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }


               nPdia3 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 3: " + noPruebas +
"\n"
+ "casos positivos del día 3:" + cP);

}

public void Dia4(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia 4?" ));

    
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


               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = xSintomas.toString();

               
               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo"))
               cPositivos++;
               
               else if(resultado.equals("Negativo"))
               cN++;
               
               
               Object tComorbilidad[] = new Object[]{"Diabetes","Hipertension" , "Obesidad", "ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija su Comorbilidad",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
                diabetes++;
                }else   
                     if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
                h++;
                hipertension++;
                
                }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
                o++;
                obesidad++;
                
                 }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
                n++;
                ninguna++;
                     }
                     if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                        comuna1 ++;
           
                       }
                        if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
           
                           comuna2 ++;
           
                          }
                           if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
           
                           comuna3 ++;
           
                          }
                          if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
           
                           comuna4 ++;
           
                          }
                          if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
           
                           comuna5 ++;
           
                          }
                          if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
           
                           comuna6 ++;
           
                          }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
           
                           comuna7 ++;
           
                          }
                          if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
           
                           comuna8 ++;
           
                          }
                          if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
           
                           comuna9 ++;
           
                          }

                          //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }

    
               
               nPdia4 = noPruebas;

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 4: " + noPruebas +
"\n"
+ "casos positivos del día 4:" + cP);

}

public void Dia5(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia 5?" ));

    
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


               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = xSintomas.toString();

              
               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo"))
               cPositivos++;
               
               Object tComorbilidad[] = new Object[]{"Diabetes","Hipertension" , "Obesidad", "ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija su Comorbilidad",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
                diabetes++;
                }else   
                     if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
                h++;
                hipertension++;
                
                }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
                o++;
                obesidad++;
                
                 }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
                n++;
                ninguna++;
                     }
                     if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                        comuna1 ++;
           
                       }
                        if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
           
                           comuna2 ++;
           
                          }
                           if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
           
                           comuna3 ++;
           
                          }
                          if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
           
                           comuna4 ++;
           
                          }
                          if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
           
                           comuna5 ++;
           
                          }
                          if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
           
                           comuna6 ++;
           
                          }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
           
                           comuna7 ++;
           
                          }
                          if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
           
                           comuna8 ++;
           
                          }
                          if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
           
                           comuna9 ++;
           
                          }

                          //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }

    

               nPdia5 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 5: " + noPruebas +
"\n"
+ "casos positivos del día 5:" + cP);

}

public void Dia6(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia 5?" ));

    
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


               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = xSintomas.toString();

              
               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo"))
               cPositivos++;
               
               Object tComorbilidad[] = new Object[]{"Diabetes","Hipertension" , "Obesidad", "ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija su Comorbilidad",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
                diabetes++;
                }else   
                     if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
                h++;
                hipertension++;
                
                }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
                o++;
                obesidad++;
                
                 }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
                n++;
                ninguna++;
                     }
                     if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                        comuna1 ++;
           
                       }
                        if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
           
                           comuna2 ++;
           
                          }
                           if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
           
                           comuna3 ++;
           
                          }
                          if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
           
                           comuna4 ++;
           
                          }
                          if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
           
                           comuna5 ++;
           
                          }
                          if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
           
                           comuna6 ++;
           
                          }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
           
                           comuna7 ++;
           
                          }
                          if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
           
                           comuna8 ++;
           
                          }
                          if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
           
                           comuna9 ++;
           
                          }

                          //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }

    

               nPdia6 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 6: " + noPruebas +
"\n"
+ "casos positivos del día 6:" + cP);

}

public void Dia7(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(null, 
    "¿Cuantas pruebas fueron realizadas en el dia 7?" ));

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

    String comuna;


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


               Object tSexo[] = new Object[]{"M","F"};

               Object xSexo = JOptionPane.showInputDialog(null,"Elija su sexo porfavor",
                       "Seleccion de Sexo",
                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);

               sexo = xSexo.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,"Elija sus Sintomas porfavor",
                       "Seleccion de Sintomas",
                       JOptionPane.QUESTION_MESSAGE,null,tSintomas ,tSintomas[0]);

               sintomas = mostrar.toString();

               
               if(sintomas.equals("S")){

                cSintomaticos ++;

               }else if(sintomas.equals("A")){

                cAsintomaticos ++;

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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
               JOptionPane.QUESTION_MESSAGE,null,tResultado ,tResultado[0]);
               
               resultado = xResultado.toString();
               
               if(resultado.equals("Positivo"))
               cPositivos++;
               
               Object tComorbilidad[] = new Object[]{"Diabetes" , "Hipertension" , "Obesidad", "Ninguna"};
               
               Object xComorbilidad = JOptionPane.showInputDialog(null,"Elija su Comorbilidad",
               "Seleccion de Comorbilidad",
               JOptionPane.QUESTION_MESSAGE,null,tComorbilidad ,tComorbilidad[0]);
               
               comorbilidad = xComorbilidad.toString();
               
               if(resultado.equals("Positivo") && comorbilidad.equals("Diabetes")){
            
                diabetes++;
                }else   
                     if(resultado.equals("Positivo") && comorbilidad.equals("Hipertension")){
                h++;
                hipertension++;
                
                }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Obesidad")){
                o++;
                obesidad++;
                
                 }else 
                     if(resultado.equals("Positivo") && comorbilidad.equals("Ninguna")){
                n++;
                ninguna++;
                     }
                     if(comuna.equals("Comuna1") && resultado.equals("Positivo")){

                        comuna1 ++;
           
                       }
                        if(comuna.equals("Comuna2") && resultado.equals("Positivo")){
           
                           comuna2 ++;
           
                          }
                           if(comuna.equals("Comuna3") && resultado.equals("Positivo")){
           
                           comuna3 ++;
           
                          }
                          if(comuna.equals("Comuna4") && resultado.equals("Positivo")){
           
                           comuna4 ++;
           
                          }
                          if(comuna.equals("Comuna5") && resultado.equals("Positivo")){
           
                           comuna5 ++;
           
                          }
                          if(comuna.equals("Comuna6") && resultado.equals("Positivo")){
           
                           comuna6 ++;
           
                          }if(comuna.equals("Comuna7") && resultado.equals("Positivo")){
           
                           comuna7 ++;
           
                          }
                          if(comuna.equals("Comuna8") && resultado.equals("Positivo")){
           
                           comuna8 ++;
           
                          }
                          if(comuna.equals("Comuna9") && resultado.equals("Positivo")){
           
                           comuna9 ++;
           
                          }

                          //condicionales para casos positivos
                      //para grupo de edades y sexo

                      //para hombres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >0 && edad<= 14 ){

                        edad1++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >14 && edad<= 30 ){

                        edad2++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >30 && edad<= 60 ){

                        edad3++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("M") && edad >60 && edad<= 100 ){

                        edad4++;
                      }

                      //para mujeres entre las edades descritas

                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >0 && edad<= 14 ){

                        edad5++;
                      } else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >14 && edad<= 30 ){

                        edad6++;

                      }else
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >30 && edad<= 60 ){

                        edad7++;
                      }else 
                      if(resultado.equals("Positivo") && sexo.equals("F") && edad >60 && edad<= 100 ){

                        edad8++;
                      }

    

               nPdia7 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día 7 : " + noPruebas +
"\n"
+ "casos positivos del día 7 :" + cP);

}

public void puntoDos(){

    int nTotaldePruebas;
    nTotaldePruebas = nPdia1+nPdia2+nPdia3+nPdia4+nPdia5+nPdia6+nPdia7;
    JOptionPane.showMessageDialog(null,"Numero total de pruebas :" +nTotaldePruebas+ "\n"
                                  +"Porcentaje casos positivos con diabetes : " + ((diabetes*100)/nTotaldePruebas) +"%" +  "\n"
                                  +"Prcentaje casos positivos con hipertension : " + ((hipertension*100)/nTotaldePruebas)+"%"+"\n"
                                  +"Porcentaje casos positivos con obesidad : " + ((obesidad*100)/nTotaldePruebas) +"%");


}

public void puntoTres(){

    int nTotaldePruebas;
    nTotaldePruebas = nPdia1+nPdia2+nPdia3+nPdia4+nPdia5+nPdia6+nPdia7;

    JOptionPane.showMessageDialog(null, "Numero total de pruebas : " + nTotaldePruebas + "\n"+
                                  "Casos positivos en comuna1 : " +comuna1 + "\n" + 
                                  "Casos positivos en comuna2 : " +comuna2 + "\n" + 
                                  "Casos positivos en comuna3 : " +comuna3 + "\n" + 
                                  "Casos positivos en comuna4 : " +comuna4 + "\n" + 
                                  "Casos positivos en comuna5 : " +comuna5 + "\n" + 
                                  "Casos positivos en comuna6 : " +comuna6 + "\n" + 
                                  "Casos positivos en comuna7 : " +comuna7 + "\n" + 
                                  "Casos positivos en comuna8 : " +comuna8 + "\n" + 
                                  "Casos positivos en comuna9 : " +comuna9 + "\n" );
}

public void puntCuatro(){

    int nTotaldePruebas;
    nTotaldePruebas = nPdia1+nPdia2+nPdia3+nPdia4+nPdia5+nPdia6+nPdia7;

    JOptionPane.showMessageDialog(null, "Total de muestras tomadas: " + nTotaldePruebas + "\n"+ 
                                        "Cantidad de casos positivos: " + cPositivos);


}

public void puntCinco(){

    int nTotaldePruebas;
    nTotaldePruebas = nPdia1+nPdia2+nPdia3+nPdia4+nPdia5+nPdia6+nPdia7;
    JOptionPane.showMessageDialog(null,"Numero total de pruebas :" +nTotaldePruebas+ "\n"
                                  +"porcentaje casos positivos comuna1 : " + ((comuna1*100)/nTotaldePruebas) +"%" +  "\n"
                                  +"porcentaje casos positivos comuna2: " + ((comuna2*100)/nTotaldePruebas)+"%"+"\n"
                                  +"porcentaje casos positivos comuna3 : " + ((comuna3*100)/nTotaldePruebas) +"%"+"\n"
                                  +"porcentaje casos positivos comuna4 : " + ((comuna4*100)/nTotaldePruebas) +"%" +  "\n"
                                  +"porcentaje casos positivos comuna5: " + ((comuna5*100)/nTotaldePruebas)+"%"+"\n"
                                  +"porcentaje casos positivos comuna6 : " + ((comuna6*100)/nTotaldePruebas) +"%"+"\n"
                                  +"porcentaje casos positivos comuna7 : " + ((comuna7*100)/nTotaldePruebas) +"%" +  "\n"
                                  +"porcentaje casos positivos comuna8: " + ((comuna8*100)/nTotaldePruebas)+"%"+"\n"
                                  +"porcentaje casos positivos comuna9 : " + ((comuna9*100)/nTotaldePruebas) +"%");


}

public void puntSeis(){

    int nTotaldePruebas;
    nTotaldePruebas = nPdia1+nPdia2+nPdia3+nPdia4+nPdia5+nPdia6+nPdia7;
    JOptionPane.showMessageDialog(null,"Numero total de pruebas :" +nTotaldePruebas+ "\n"
                                  +"porcentaje asintomaticos : " + ((cAsintomaticos*100)/nTotaldePruebas) +"%" +  "\n"
                                  +"porcentaje sintomaticos: " + ((cSintomaticos*100)/nTotaldePruebas)+"%");


}

public void puntSiete(){


JOptionPane.showMessageDialog(null,"De 0 a 14 años : " + "\n" + 
                              "Mujeres :" +edad5+ "\n" +
                              "Hombres :" + edad1+"\n" +
                              "De 15 a 30 años : "+ "\n" +
                              "Hombres : "+ edad2 + "\n"  +
                              "Mujeres : "+ edad6+"\n" +
                              "De 31 a 60 años : "+ "\n" +
                              "Hombres : "+ edad3+"\n" +
                              "Mujeres : "+ edad7+"\n" +
                              "De 61 a 100 años"+ "\n" +
                              "Hombres : "+ edad4+"\n" + 
                              "Mujeres : " + edad8 );

}

}


    