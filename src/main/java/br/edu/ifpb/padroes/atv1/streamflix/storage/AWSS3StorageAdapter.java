package br.edu.ifpb.padroes.atv1.streamflix.storage;

import br.edu.ifpb.padroes.atv1.streamflix.services.AWSS3Service;

public class AWSS3StorageAdapter implements StorageService{

    private AWSS3Service s3 = new AWSS3Service();

    @Override
    public byte[] download(String bucket, String videoId) {
        return s3.downloadFromS3(bucket, videoId);
    }

    @Override
    public void upload(String bucket, String videoId, byte[] data) {
        s3.uploadToS3(bucket, videoId, data);
    }
}
