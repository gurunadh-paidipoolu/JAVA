import java.io.Serializable;
public class SingletonPattern {
private static final long serialVersionUID = -7604766932017737115L;
private static SingletonPattern instance;

private SingletonPattern(){
		if(instance!=null)
        throw new IllegalStateException("Singleton already constructed");

}

private static class SingletonHelper{
    private static final SingletonPattern INSTANCE = new SingletonPattern();
}
public static SingletonPattern getInstance(){
	if(instance==null)
		instance=SingletonHelper.INSTANCE;
	return instance;
}
protected Object readResolve() {
    return getInstance();
}
}
