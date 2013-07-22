
package sumador;


public class Main {


    public static void main(String[] args) 
    {   
        Model model = new Model();
        Menu vistaMenu = new Menu(model);
        ControllerMenu ControladorMenu = new ControllerMenu(model, vistaMenu);
        vistaMenu.setVisible(true);
    }

}
