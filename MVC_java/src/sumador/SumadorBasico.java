package sumador;

public class SumadorBasico 
{
    Model m_modelo;
    public SumadorBasico(Model modelo)
    {
        m_modelo = modelo;
    }
    public void sumar(int suma)
    {
        System.out.println("El resultado de la suma es: "+suma);
    }
   
}
