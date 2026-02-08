package br.edu.ifpb.padroes.atv1.streamflix.proxy;

import br.edu.ifpb.padroes.atv1.streamflix.services.AWSS3Service;

public class RealVideoProvider implements VideoProvider {

    private AWSS3Service s3 = new AWSS3Service();

    @Override
    public byte[] getVideo(String videoId) {
        System.out.println("Buscando vídeo no serviço externo...");
        return s3.downloadFromS3("videos-bucket", videoId);
    }
}
