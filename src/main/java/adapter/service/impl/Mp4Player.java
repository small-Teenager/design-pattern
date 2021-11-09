package adapter.service.impl;

import adapter.service.AdvancedMediaPlayer;

/**
 * @description:
 * @author: yaodong zhang
 * @date: 2021/10/26 9:22
 */
public class Mp4Player implements AdvancedMediaPlayer {

    @Override
    public void playVlc(String fileName) {
        //do nothing
    }

    @Override
    public void playMp4(String fileName) {
        System.err.println("Playing mp4 file. Name: " + fileName);
    }
}