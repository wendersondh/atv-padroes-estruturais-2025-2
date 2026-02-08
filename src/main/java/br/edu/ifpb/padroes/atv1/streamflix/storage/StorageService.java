package br.edu.ifpb.padroes.atv1.streamflix.storage;

public interface StorageService {

    byte[] download(String location, String videoId);

    void upload(String location, String videoId, byte[] data);

}
