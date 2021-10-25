package singleton;

/**
 * @description: 双检锁/双重校验锁 double-checked locking
 * @author: yaodong zhang
 * @date: 2021/10/25 15:16
 */
public class DCLSingleton {

    /**
     * 这种方式采用双锁机制，安全且在多线程情况下能保持高性能。
     * getInstance() 的性能对应用程序很关键。
     */
    private static volatile DCLSingleton singleton;

    private DCLSingleton() {
    }

    public static DCLSingleton getSingleton() {
        if (singleton == null) {
            synchronized (DCLSingleton.class) {
                if (singleton == null) {
                    singleton = new DCLSingleton();
                }
            }
        }
        return singleton;
    }
}
