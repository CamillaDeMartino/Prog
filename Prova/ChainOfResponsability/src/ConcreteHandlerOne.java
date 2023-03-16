public class ConcreteHandlerOne extends Handler
{
    private DBUsers dbUser = new DBUsers();
    public void handleRequest(Request request)
    {
        if(dbUser.checkUsername(request.getUsername()))
        {
            m_successor.handleRequest(request);
        }
        else
        {
            System.out.println("\t Username non valido" );
        }
    }
}
