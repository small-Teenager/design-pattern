package proxy.service;

import proxy.Internet;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/11/9 17:54
 */
public class RealInternet implements Internet {
    private String website;

    public RealInternet(String website){
        this.website = website;
    }

    @Override
    public void surfing() {
        System.err.println("surfing " + website);
    }
}
