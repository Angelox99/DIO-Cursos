package one.digitalinovation.gof.singleton;

/**
* Singleton "Apressado".
* @author Angelo
*/
public class SingletonEager {
    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstance(){
        return instancia;
    }
}
