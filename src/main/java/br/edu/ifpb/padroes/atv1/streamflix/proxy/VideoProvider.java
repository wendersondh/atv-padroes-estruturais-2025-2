package br.edu.ifpb.padroes.atv1.streamflix.proxy;

public interface VideoProvider {
    byte[] getVideo(String videoId);
}
