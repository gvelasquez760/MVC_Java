// Controlador

package sumador;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Controller 
{
    Model m_modelo;
    View2 m_vista;
    SumadorBasico sB;
    Sumador sumador;
    boolean bool = false;
    
    public Controller(Model modelo, View2 vista)
    {
        
        m_modelo = modelo;
        m_vista = vista;
       m_vista.addNumero(new sendNumero());
       m_vista.addsumar(new addPlus());
    }
    public Controller(Model modelo, SumadorBasico sumadorBasico)
    {
        m_modelo = modelo;
        sB = sumadorBasico;
        sB.sumar(m_modelo.getSuma(m_modelo.getNumeroTeclado1(), m_modelo.getNumeroTeclado2()));
    }
    class addPlus implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            m_modelo.setValor1("");
            bool = true;
        }
    }
    
    public Controller(Model modelo, Sumador sumador)
    {
        m_modelo = modelo;
        this.sumador = sumador;
        sumador.addSumar(new Sumator());
    }
    class Sumator implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            sumador.sumar();
        }
    }
            
    class sendNumero implements ActionListener
    {
        
        public void actionPerformed(ActionEvent e)
        {
           
          // System.out.println(e.getActionCommand());
          
            if(e.getActionCommand().toString().equals("1"))
            {
                m_modelo.setValor1("1");
                if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
               
            }
            else if(e.getActionCommand().toString().equals("2"))
            {
                m_modelo.setValor1("2");
                if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("3"))
            {
                m_modelo.setValor1("3");
                if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("4"))
            {
                m_modelo.setValor1("4");
                  if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("5"))
            {
                m_modelo.setValor1("5");
                 if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("6"))
            {
                m_modelo.setValor1("6");
                 if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("7"))
            {
                m_modelo.setValor1("7");
                 if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("8"))
            {
                m_modelo.setValor1("8");
                 if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("9"))
            {
                m_modelo.setValor1("9");
                 if(bool==false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }
            else if(e.getActionCommand().toString().equals("0"))
            {
                m_modelo.setValor1("0");
                 if(bool == false)
                {
                m_vista.mostrar(m_modelo.getValor1());
                }
                else
                     m_vista.mostrar2(m_modelo.getValor1());
            }  
             bool = false;
        }
    }

    
  
    
}
