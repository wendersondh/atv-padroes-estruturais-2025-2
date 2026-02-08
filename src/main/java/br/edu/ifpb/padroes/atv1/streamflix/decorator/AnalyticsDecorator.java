package br.edu.ifpb.padroes.atv1.streamflix.decorator;

import br.edu.ifpb.padroes.atv1.streamflix.video.VideoComponent;

public class AnalyticsDecorator implements VideoComponent {

    private VideoComponent video;

    public AnalyticsDecorator(VideoComponent video) {
        this.video = video;
    }

    @Override
    public void play() {
        System.out.println("Coletando estatísticas de visualização...");
        video.play();
    }
}
