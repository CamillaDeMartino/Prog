public class ConcreteHandlerThree extends Handler
{
    private DBUsers dbUser = new DBUsers();
    public void handleRequest(Request request)
    {
        if (dbUser.checkEmail(request.getEmail()))
        {

            System.out.println("Credenziali valide");
            //m_successor.handleRequest(request);
        }
        else
        {
            System.out.println("\t Email non valida" );

        }
    }
}
