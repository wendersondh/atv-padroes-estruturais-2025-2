package br.edu.ifpb.padroes.atv1.streamflix.auth;

// Subsistema de autenticação
public class AuthenticationService {

    public boolean authenticate(String userId, String token) {
        System.out.println("Authenticating user: " + userId);
        return true;
    }

}
