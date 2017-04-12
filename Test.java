import java.lang.reflect.Constructor;

public class Test {
	public static void main(String args[])
    {
		/***Singleton pattern starts****/
		
		
		SingletonPattern instanceOne = SingletonPattern.getInstance();
		SingletonPattern instanceTwo = SingletonPattern.getInstance();
        
        System.out.println(instanceOne.hashCode());
        System.out.println(instanceTwo.hashCode());
		/***Singleton pattern ends****/	
    }
}
