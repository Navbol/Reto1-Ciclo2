
package com.mycompany.retocalculadorabasica;

import javax.swing.JOptionPane;
        

/**
 *
 * @author ferna
 */
public class ClsCalculadora {

    public ClsCalculadora() {
    }
    
    public void IniciarPrograma() {
        
       String menu_principal = """
                      
                      Seleccione una opción: 
                      
                      1. Realizar una operación
                      2. Salir
                      
                      
                      """;
        ///String opcion1 = "";
       // do {

            String opcion1 = JOptionPane.showInputDialog(null, menu_principal, "Menu Principal", JOptionPane.INFORMATION_MESSAGE);
            
            System.out.println(opcion1);
                    

            if (opcion1.equals("1")){
                
              //  System.out.println("hola");
                
            String menu_secundario = """
                                     
                                     Seleccione una operacion:
                                     1.Suma
                                     2.Resta
                                     3.Multiplicacion
                                     4.Division
                                     5.Potencia
                                     6.Raiz cuadrada
                                     7.Salir
                                     
                                 """;
            
            //String opcion2 = "";
            
    
            
          String opcion2 = JOptionPane.showInputDialog(null, menu_secundario, "Menu operacion", JOptionPane.INFORMATION_MESSAGE);
          
          
         // Switch
         
                String num_1 = JOptionPane.showInputDialog("Ingresa el primer numero");
                String num_2 = JOptionPane.showInputDialog("Ingresa el segundo numero");
                

     
                double numero1 = Double.parseDouble(num_1);
                double numero2 = Double.parseDouble(num_2);
                
                switch (opcion2) {
                    case "1":
                        double resultado_suma = numero1 + numero2;
                        JOptionPane.showMessageDialog(null, resultado_suma);
                        break;
                        
                    case "2":
                        double resultado_resta = numero1 - numero2;
                        JOptionPane.showMessageDialog(null, resultado_resta);
                        break;
                        
                    case "3":
                        double resultado_multiplicacion = numero1 * numero2;
                        JOptionPane.showMessageDialog(null, resultado_multiplicacion);
                        break;   
                        
                    case "4":
                        double resultado_division = numero1 * numero2;
                        JOptionPane.showMessageDialog(null, resultado_division);
                        break;    
                        
                        
                        
                        
                    default:
                    

                   
           }
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               
               


        
         
         
         
         
         
         
         
         
         
         
         
          
            } 
           
          
               

           // } while (!opcion1.equals("2"));
        }

    }

           

        
        
  

