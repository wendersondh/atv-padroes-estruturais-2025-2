package br.edu.ifpb.padroes.atv1.streamflix;

public class Video {

    private String id;
    private String title;
    private byte[] data;

    public Video(String id, String title, byte[] data) {
        this.id = id;
        this.title = title;
        this.data = data;
    }

    public void play() {
        System.out.println("Playing: " + title);
        // Reproduz o vídeo
    }

    public byte[] getData() {
        return data;
    }

    public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Video{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
