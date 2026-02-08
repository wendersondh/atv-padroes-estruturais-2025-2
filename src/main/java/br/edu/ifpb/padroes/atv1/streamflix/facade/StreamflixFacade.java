package br.edu.ifpb.padroes.atv1.streamflix.facade;

import br.edu.ifpb.padroes.atv1.streamflix.Video;
import br.edu.ifpb.padroes.atv1.streamflix.auth.AuthenticationService;
import br.edu.ifpb.padroes.atv1.streamflix.converter.VideoConverter;
import br.edu.ifpb.padroes.atv1.streamflix.storage.StorageService;
import br.edu.ifpb.padroes.atv1.streamflix.stream.StreamingService;
import br.edu.ifpb.padroes.atv1.streamflix.subtitle.SubtitleService;

public class StreamflixFacade {

    private AuthenticationService auth = new AuthenticationService();
    private VideoConverter converter = new VideoConverter();
    private SubtitleService subtitles = new SubtitleService();
    private StreamingService streaming = new StreamingService();
    private StorageService storage;

    public StreamflixFacade(StorageService storage) {
        this.storage = storage;
    }

    public void watchVideo(String userId, String token, String location, String videoId) {
        if (auth.authenticate(userId, token)) {
            byte[] rawVideo = storage.download(location, videoId);
            byte[] converted = converter.convert(rawVideo, "MP4");

            subtitles.getSubtitles(videoId, "pt-BR");

            Video video = new Video(videoId, "Movie Title", converted);
            video.play();
            streaming.startStream(converted);
        }
    }
}
