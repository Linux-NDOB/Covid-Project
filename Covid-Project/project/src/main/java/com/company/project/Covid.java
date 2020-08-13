package com.company.project;

import javax.swing.JOptionPane;

public class Covid {
        

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
        
        
        
        



public void Dia1(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

               if(sexo.equals("M")){

                cS1 ++;

               }else if(comuna.equals("F")){

                cS2 ++;

               }

               Object tSintomas[] = new Object[]{"S","A"};

               Object xSintomas = JOptionPane.showInputDialog(null,
                       "Elija si es asíntomativo o no",
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


               Object tResultado[] = new Object[]{"Positivo","Negativo" };

               Object xResultado = JOptionPane.showInputDialog(null,"Elija su resultado  porfavor",
               "Seleccion de resultados",
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

               nPdia1 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void Dia2(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

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

               nPdia2 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void Dia3(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

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

               nPdia3 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void Dia4(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

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
               
               nPdia4 = noPruebas;

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void Dia5(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

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

               nPdia5 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void Dia6(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

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

               nPdia6 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void Dia7(){
    int noPruebas;

    noPruebas = Integer.parseInt(JOptionPane.showInputDialog(
        null, "¿Cuantas pruebas fueron realizadas en el dia" ));

    
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

               sexo = mostrar.toString();

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

               nPdia7 = noPruebas;
               

} 

JOptionPane.showMessageDialog(null,
"Total muestras tomadas en el día: " + noPruebas +
"\n"
+ "casos positivos del día:" + cP);

}

public void puntoDos(){

    int nTotaldePruebas;
    nTotaldePruebas = nPdia1+nPdia2+nPdia3+nPdia4+nPdia5+nPdia6+nPdia7;
    JOptionPane.showMessageDialog(null, "Numero total de pruebas :" +nTotaldePruebas+ "\n"
                                  + "" + " " + "");
}


}


    