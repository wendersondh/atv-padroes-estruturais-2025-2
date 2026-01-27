package br.edu.ifpb.padroes.atv1.streamflix.subtitle;

// Subsistema de Legendas
public class SubtitleService {

    public String getSubtitles(String videoId, String language) {
        System.out.println("Fetching subtitles: " + language);
        return "Subtitle content";
    }

}
