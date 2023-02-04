package project.SpotifyApi;

import se.michaelthelin.spotify.IHttpManager;

import java.net.URI;

public class Builder {
    private IHttpManager httpManager;
    private String scheme;
    private String host;
    private Integer port;
    private String proxyUrl;
    private Integer proxyPort;
    private Integer proxyUsername;
    private Integer proxyPassword;
    private String clientId;
    private String clientSecret;
    private URI redirectUri;
    private String accessToken;
    private String refreshToken;

    //Constructor
    public Builder(){

    }
    //Setters
    public void setHttpManager(IHttpManager httpManager){
        this.httpManager = httpManager;
    }
    public void setScheme(String scheme){
        this.scheme = scheme;
    }
    public void setHost(String host){
        this.host = host;
    }
    public void setPort(Integer port){
        this.port = port;
    }
    public void setProxyUrl(String proxyUrl){
        this.proxyUrl = proxyUrl;
    }
    public void setProxyPort(Integer proxyPort){
        this.proxyPort = proxyPort;
    }
    public void setProxyUsername(Integer proxyUsername){ this.proxyUsername = proxyUsername; }
    public void setProxyPassword(Integer proxyPassword) {
        this.proxyPassword = proxyPassword;
    }
    public void setClientId(String clientId) {
        this.clientId = clientId;
    }
    public void setClientSecret(String clientSecret) {
        this.clientSecret = clientSecret;
    }
    public void setRedirectUri(URI redirectUri) {
        this.redirectUri = redirectUri;
    }
    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
