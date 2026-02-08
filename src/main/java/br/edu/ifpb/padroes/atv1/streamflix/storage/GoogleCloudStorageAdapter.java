package br.edu.ifpb.padroes.atv1.streamflix.storage;

import br.edu.ifpb.padroes.atv1.streamflix.services.GoogleCloudStorage;

public class GoogleCloudStorageAdapter implements StorageService{

    private GoogleCloudStorage gcs = new GoogleCloudStorage();

    @Override
    public byte[] download(String projectId, String videoId) {
        return gcs.retrieveFile(projectId, videoId);
    }

    @Override
    public void upload(String projectId, String videoId, byte[] data) {
        gcs.storeFile(projectId, videoId, data);
    }
}
