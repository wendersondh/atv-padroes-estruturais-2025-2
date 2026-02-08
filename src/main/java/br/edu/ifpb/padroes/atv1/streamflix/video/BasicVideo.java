package br.edu.ifpb.padroes.atv1.streamflix.video;

import br.edu.ifpb.padroes.atv1.streamflix.Video;

public class BasicVideo implements VideoComponent{
    private Video video;

    public BasicVideo(Video video) {
        this.video = video;
    }

    @Override
    public void play() {
        video.play();
    }
}
