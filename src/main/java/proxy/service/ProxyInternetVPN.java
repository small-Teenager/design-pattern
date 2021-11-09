package proxy.service;

import proxy.Internet;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/9 17:55
 */
public class ProxyInternetVPN implements Internet {

    private Internet internet;


    public ProxyInternetVPN(Internet internet){
        this.internet = internet;
    }


    @Override
    public void surfing() {
        System.err.println("冲浪前准备");
        internet.surfing();
        System.err.println("冲浪后准备");
    }
}
