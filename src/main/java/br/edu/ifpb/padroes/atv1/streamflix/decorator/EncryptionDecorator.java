package br.edu.ifpb.padroes.atv1.streamflix.decorator;


import br.edu.ifpb.padroes.atv1.streamflix.video.VideoComponent;

public class EncryptionDecorator implements VideoComponent {

    private VideoComponent video;

    public EncryptionDecorator(VideoComponent video) {
        this.video = video;
    }

    @Override
    public void play() {
        System.out.println("Aplicando criptografia...");
        video.play();
    }
}
