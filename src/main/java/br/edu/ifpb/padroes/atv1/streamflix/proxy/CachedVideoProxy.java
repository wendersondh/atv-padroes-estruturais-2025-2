package br.edu.ifpb.padroes.atv1.streamflix.proxy;

import java.util.HashMap;
import java.util.Map;

public class CachedVideoProxy implements VideoProvider {

    private VideoProvider realProvider;
    private Map<String, byte[]> cache = new HashMap<>();

    public CachedVideoProxy(VideoProvider realProvider) {
        this.realProvider = realProvider;
    }

    @Override
    public byte[] getVideo(String videoId) {
        if (cache.containsKey(videoId)) {
            System.out.println("Retornando vídeo do cache...");
            return cache.get(videoId);
        }

        byte[] video = realProvider.getVideo(videoId);
        cache.put(videoId, video);
        return video;
    }
}
