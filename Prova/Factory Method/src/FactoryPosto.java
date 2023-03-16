public abstract class FactoryPosto
{
    public Posto getPosto()
    {
        Posto posto = creaPosto();
        posto.parcheggia();
        return posto;
    }

    protected abstract Posto creaPosto();
}