package mediator;

public abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator med, String name){
        this.mediator=med;
        this.name=name;
        mediator.addUser(this);
    }

    public abstract void send(String msg);

    public abstract void receive(String msg);
}
