public class Handler {
    public final String name;
    Handler next;

    public Handler(String name, Handler next) {
        this.name = name;
        this.next = next;
    }


}

