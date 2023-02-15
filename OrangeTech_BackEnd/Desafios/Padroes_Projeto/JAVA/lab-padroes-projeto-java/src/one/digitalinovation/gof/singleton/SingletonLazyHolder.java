package one.digitalinovation.gof.singleton;

/**
* Singleton "Lazy Holder".
*
* @see <a href="http://stackoverflow.com/a/24018148">Ref</a>
*
* @author Angelo
*/
public class SingletonLazyHolder {
    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }
    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstance(){
        return InstanceHolder.instancia;
    }
}
