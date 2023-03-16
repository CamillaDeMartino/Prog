public class FactoryPostoAuto extends FactoryPosto
{
    protected Posto creaPosto()
    {
        return new PostoAuto();
    }
}