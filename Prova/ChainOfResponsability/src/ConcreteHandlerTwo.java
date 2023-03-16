public class ConcreteHandlerTwo extends Handler
{
    private DBUsers dbUser = new DBUsers();
    public void handleRequest(Request request)
    {
        if (dbUser.checkPassword(request.getPassword()))
        {
            m_successor.handleRequest(request);
        }
        else
        {
            System.out.println("\t Password non valida" );

        }


    }
}