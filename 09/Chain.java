public class Chain {

    public Handler getHandler(Anfrage anfrage,Handler handler){
        if(handler == null){
            System.err.println("Handler nicht gefunden");
            return null;
        }       
        if(anfrage.handler == handler){
            System.err.println("Bearbeitet, Hander ist " + handler.name);
            return handler;
        } else {
            return getHandler(anfrage, handler.next);
        }
        
    }
    public static void main(String[] args)  {
        Handler prog = new Handler("prog", null);
        Handler abt = new Handler("abt", prog );
        Handler chef = new Handler("chef", abt);

        Anfrage anfrage = new Anfrage(prog);

        Chain chain = new Chain();  
        Handler handler = chain.getHandler(anfrage, chef); 
    }
        
}
