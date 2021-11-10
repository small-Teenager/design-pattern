package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @description:在动态代理中我们不再需要再手动的创建代理类， 我们只需要编写一个动态处理器就可以了。真正的代理对象由JDK再运行时为我们动态的来创建。
 * @author: yaodong zhang
 * @date: 2021/11/9 18:26
 */
public class DynamicProxyHandler implements InvocationHandler {
    private Object object;

    public DynamicProxyHandler(final Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.err.println("冲浪前准备");
        Object result = method.invoke(object, args);
        System.err.println("冲浪后准备");
        return result;
    }
}