package adapter.service.impl;

import adapter.service.AdvancedMediaPlayer;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/26 9:21
 */
public class VlcPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.err.println("Playing vlc file. Name: "+ fileName);
    }

    @Override
    public void playMp4(String fileName) {
        //do nothing
    }
}
