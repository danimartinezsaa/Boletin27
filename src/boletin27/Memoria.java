/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin27;

import java.util.ArrayList;

/**
 *
 * @author dani
 */
public class Memoria{
    static ArrayList<Float> numero=new ArrayList();
    static ArrayList<String> operadores=new ArrayList();
    //1 - resta 2 - suma 3 - multiplicacion 4 - division
    
    public static Float resultado(){

        Float resultado=0.0f;
        int operador=0;
        float num=0;
        String op;
        
        if(numero.isEmpty()||operadores.isEmpty()){
            return 0.0f;
        }else if(numero.size()==1){
            return numero.get(0);         
        }else{
            resultado=numero.get(0);
            for(int i=0;i<numero.size()-1;i++){
                num=numero.get(i+1);
                op=operadores.get(i);
                if(op.equals("+")){
                    resultado=resultado+num;
                }else if(op.equals("-")){
                    resultado=resultado-num;
                }else if(op.equals("*")){
                    resultado=resultado*num;
                }else if(op.equals("/")){
                    resultado=resultado/num;
                }
            }
            return resultado;
            
        }
    }
    
}
