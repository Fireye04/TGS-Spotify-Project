package project.SpotifyApi;

import se.michaelthelin.spotify.IHttpManager;

public class Builder {
    //The default authentication host of Spotify API calls.
    public static final String DEFAULT_AUTHENTICATION_HOST = "accounts.spotify.com";

    //The default authentication port of Spotify API calls.
    public static final int DEFAULT_AUTHENTICATION_PORT = 443;

    //The default authentication http scheme of Spotify API calls.
    public static final String DEFAULT_AUTHENTICATION_STRING = "https";

    //The default host of Spotify API calls.
    public static final String DEFAULT_HOST = "api.spotify.com";

    //An HttpManager configured with default settings.
    public static final int DEFAULT_PORT = 443;

    //The default http scheme of Spotify API calls.
    public static final String DEFAULT_SCHEME = "https";

    public static IHttpManager httpManager;

    public Builder(){

    }

    void setHttpManager(IHttpManager httpManager){
        this.httpManager = httpManager;
    }

}
