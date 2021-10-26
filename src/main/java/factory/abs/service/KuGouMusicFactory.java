package factory.abs.service;

import factory.abs.service.impl.KuGouMusicMethod;

public class KuGouMusicFactory implements MethodMusicFactory {
    @Override
    public MusicMethod makeMusic() {
        return new KuGouMusicMethod();
    }
}
