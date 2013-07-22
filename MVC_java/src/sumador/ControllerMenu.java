package sumador;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class ControllerMenu 
{
    Model modelo;
    Menu menu;
    public ControllerMenu(Model modelo, Menu menu)
    {
        this.modelo = modelo;
        this.menu = menu;
        menu.addEleccion(new MakeElection());
    }
    class MakeElection implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            if(e.getActionCommand().toString().equals("Desde Teclado"))
            {
                menu.dispose();
                SumadorBasico sB = new SumadorBasico(modelo);
                Controller controlador = new Controller(modelo, sB);
            }
            else if(e.getActionCommand().toString().equals("Interfaz Basica"))
            {
                menu.dispose();
                Sumador view = new Sumador(modelo);
                Controller controlador = new Controller(modelo, view);
                view.setVisible(true);
            }
            else if(e.getActionCommand().toString().equals("Interfaz Teclado Numerico"))
            {
                menu.dispose();
                View2 vista2 = new View2(modelo);
                Controller controlador = new Controller(modelo, vista2);
                vista2.setVisible(true);
            }
        }
    }
    

}
