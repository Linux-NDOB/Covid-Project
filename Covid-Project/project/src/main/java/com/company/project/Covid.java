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

            casosPositivos = Integer.parseInt(JOptionPane.showInputDialog(
                null, "¿Cuantos casos fueron positivos?"));

            noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
                        null, "¿Cuantas pruebas fueron realizadas ese día?"));

                        String comuna;
                    //Referenciado de valor de edad
                    int años;
      

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
                                       JOptionPane.QUESTION_MESSAGE,null,tSexo ,tSexo[0]);
   
                               sintomas = mostrar.toString();

                               if(sintomas.equals("A")){

                                cSi1 ++;
   
                               }else if(sintomas.equals("A")){

                                cSi2 ++;
   
                               }


                               edad = Integer.parseInt(JOptionPane.showInputDialog(null,
                                      "Prorfavor ingrese la edad"));
                               años = edad;



           
   
        }

        JOptionPane.showMessageDialog(null, "numero de pruebas " + noPruebas +"\n"
                                    + "casos positivos " + casosPositivos +"\n"
                                    + " de la comuna1 " + cC1);

    }
}

    