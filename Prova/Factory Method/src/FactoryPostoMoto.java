public class FactoryPostoMoto extends FactoryPosto{
    public Posto creaPosto(){
        return new PostoMoto();
    }
}
