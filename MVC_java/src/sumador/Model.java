// Modelo

package sumador;
import java.lang.*;
import java.io.*;
import java.util.*;
import java.net.*;
import java.sql.*;
import javax.swing.*;

public class Model 
{
    int num1, num2, sum;
    String valor1 = "";
    String valor2 = "";
    
    
    void setnum1(int numero1)
    {
        num1 = numero1;
        
    }
    int getnum1()
    {
        return num1;
    }
    void setnum2(int numero2)
    {
        num2 = numero2;
    }
    int getnum2()
    {
        return num2;
    }
    
    
    int getSuma(int num1, int num2)
    {
        //System.out.println(num1 +" "+ num2);
        return num1+num2;
    }
    
    void setValor1(String valor)
    {
        valor1 += valor;
    }
    String getValor1()
    {
        return valor1;
    }
   int getNumeroTeclado1()
   {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
       try
       {
       System.out.print("Ingrese Primer Numero: ");
       num1 = Integer.parseInt(br.readLine());
       }catch(Exception exc){System.out.println("Error de Ingreso");}
       return num1;
   }
   int getNumeroTeclado2()
   {
       InputStreamReader isr = new InputStreamReader(System.in);
       BufferedReader br = new BufferedReader(isr);
       
       try
       {
       System.out.print("Ingrese Segundo Numero: ");
       num2 = Integer.parseInt(br.readLine());
       }catch(Exception exc){System.out.println("Error de Ingreso");}
       return num2;
   }

}
