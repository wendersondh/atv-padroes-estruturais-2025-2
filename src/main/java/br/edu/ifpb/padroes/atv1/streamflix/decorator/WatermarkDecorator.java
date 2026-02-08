package br.edu.ifpb.padroes.atv1.streamflix.decorator;

import br.edu.ifpb.padroes.atv1.streamflix.video.VideoComponent;

public class WatermarkDecorator implements VideoComponent {

    private VideoComponent video;

    public WatermarkDecorator(VideoComponent video) {
        this.video = video;
    }

    @Override
    public void play() {
        System.out.println("Aplicando marca d'água...");
        video.play();
    }
}
