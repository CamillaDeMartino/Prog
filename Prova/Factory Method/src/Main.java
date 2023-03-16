
//n.b il nostro main è il client
public class Main
{
    public static void main( String arg[] )
    {
        FactoryPosto factoryAuto = new FactoryPostoAuto();
        Posto auto = factoryAuto.getPosto();

        FactoryPosto factoryMoto = new FactoryPostoMoto();
        Posto moto = factoryMoto.getPosto();

        FactoryPosto factoryFurgone = new FactoryPostoFurgone();
        Posto furgone = factoryFurgone.getPosto();
    }
}