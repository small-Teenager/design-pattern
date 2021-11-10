package proxy;

import proxy.service.ProxyInternetVPN;
import proxy.service.RealInternet;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/9 17:57
 */
public class ProxyPatternDemo {

    /**
     * 为其他对象提供一种代理以控制对这个对象的访问。
     * <p>
     * 主要解决：在直接访问对象时带来的问题，
     * 比如说：要访问的对象在远程的机器上。
     * 在面向对象系统中，有些对象由于某些原因
     * （比如对象创建开销很大，或者某些操作需要安全控制，或者需要进程外的访问），
     * 直接访问会给使用者或者系统结构带来很多麻烦，
     * 我们可以在访问此对象时加上一个对此对象的访问层。
     *
     * @param args
     */

    /**
     * 静态代理
     * 优点：可以做到在符合开闭原则的情况下对目标对象进行功能扩展。
     *
     * 缺点：我们得为每一个服务都得创建代理类，工作量太大，不易管理。同时接口一旦发生改变，代理类也得相应修改。
     * @param args
     */
    public static void main(String[] args) {

        Internet internet = new RealInternet("https://google.com");
        internet.surfing();
        Internet vpn = new ProxyInternetVPN(internet);
        vpn.surfing();

    }
}
