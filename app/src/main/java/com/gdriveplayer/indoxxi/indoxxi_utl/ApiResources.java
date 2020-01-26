package com.gdriveplayer.indoxxi.indoxxi_utl;

import com.gdriveplayer.indoxxi.Config;

public class ApiResources {

    public static String admobStatus="0",adMobBannerId="null", adMobInterstitialId="null", adMobPublisherId="null";
    public static String fanadStatus="0",fanBannerid="null", faninter="null";
    public static String statusapp="0",apk="null";
    public static String statusnotif="0",judulstatus="null",pesan="null",foto="null",icon="null",apknew="null";
    public static String admobstatus="0";
    public static String startappid,startappstatus;
    String URL = Config.API_SERVER_URL;
    String newgdriveplayerus="https://api.gdriveplayer.us/v1/movie/newest?limit=20";

    public String getNewgdriveplayerus() {
        return newgdriveplayerus;
    }

    String API_SECRECT_KEY = "api_secret_key="+Config.API_KEY;


    String slider = URL+"get_slider?"+API_SECRECT_KEY;
    String latest_movie = URL+"get_latest_movies?"+API_SECRECT_KEY+"&&page=";
    String popular_movie = URL+"get_popular_movies?"+API_SECRECT_KEY+"&&page=";

    public String getPopular_movie() {
        return popular_movie;
    }

    String get_movie = URL+"get_movies?"+API_SECRECT_KEY+"&&page=";
    String get_featured_tv = URL+"get_featured_tv_channel?"+API_SECRECT_KEY;
    String get_live_tv = URL+"get_featured_tv_channel?"+API_SECRECT_KEY+"&&page=";

    String latestTvSeries = URL+"get_latest_tvseries?"+API_SECRECT_KEY;
    String popularTvSeries = URL+"get_popular_tvseries?"+API_SECRECT_KEY;


    String tvSeries = URL+"get_tvseries?"+API_SECRECT_KEY+"&&page=";
    String popularSeries = URL+"get_popstvseries?"+API_SECRECT_KEY+"&&page=";



    String allCountry = URL+"get_all_country?"+API_SECRECT_KEY;

    String allGenre = URL+"get_all_genre?"+API_SECRECT_KEY;

    String details = URL+"get_single_details?"+API_SECRECT_KEY;

    String movieByCountry = URL+"get_movie_by_country_id?"+API_SECRECT_KEY;
    String movieByGenre = URL+"get_movie_by_genre_id?"+API_SECRECT_KEY;
    String login = URL+"login?"+API_SECRECT_KEY;
    String signup = URL+"signup?"+API_SECRECT_KEY;

    String searchUrl = URL+"search?"+API_SECRECT_KEY;
    String favoriteUrl = URL+"get_favorite?"+API_SECRECT_KEY;

    String passResetUrl = URL+"password_reset?"+API_SECRECT_KEY+"&&email=";
    String profileUpdateURL = URL+"update_profile?"+API_SECRECT_KEY;
    String profileURL = URL+"get_user_details_by_email?"+API_SECRECT_KEY+"&&email=";
    String addFav = URL+"add_favorite?"+API_SECRECT_KEY;

    String favStatusURl = URL+"verify_favorite_list?"+API_SECRECT_KEY;
    String removeFav = URL+"remove_favorite?"+API_SECRECT_KEY;

    String addComment = URL+"add_comments?"+API_SECRECT_KEY;

    String commentsURL = URL+"get_all_comments?"+API_SECRECT_KEY;

    String addReplyURL = URL+"add_replay?"+API_SECRECT_KEY;
    String getAllReply = URL+"get_all_replay?"+API_SECRECT_KEY;
    String termsURL = Config.TERMS_URL;
    String genreMovieURL = URL+"/get_features_genre_and_movie?"+API_SECRECT_KEY;
    String adDetails = URL+"get_ads?"+API_SECRECT_KEY;
    String infoapp = URL+"get_info_app?"+API_SECRECT_KEY;


    public String getPopularTvSeries() {
        return popularTvSeries;
    }
    public String getInfoApp() {
        return infoapp;
    }
    public String getAdDetails() {
        return adDetails;
    }

    public String getGenreMovieURL() {
        return genreMovieURL;
    }

    public String getTermsURL() {
        return termsURL;
    }

    public String getGetAllReply() {
        return getAllReply;
    }

    public String getAddReplyURL() {
        return addReplyURL;
    }

    public String getCommentsURL() {
        return commentsURL;
    }

    public String getAddComment() {
        return addComment;
    }

    public String getRemoveFav() {
        return removeFav;
    }

    public String getFavStatusURl() {
        return favStatusURl;
    }

    public String getAddFav() {
        return addFav;
    }

    public String getProfileURL() {
        return profileURL;
    }

    public String getProfileUpdateURL() {
        return profileUpdateURL;
    }

    public String getPassResetUrl() {
        return passResetUrl;
    }

    public String getFavoriteUrl() {
        return favoriteUrl;
    }

    public String getSearchUrl() {
        return searchUrl;
    }

    public String getLogin() {
        return login;
    }

    public String getSignup() {
        return signup;
    }

    public String getMovieByCountry() {
        return movieByCountry;
    }

    public String getMovieByGenre() {
        return movieByGenre;
    }

    public String getDetails() {
        return details;
    }

    public String getAllGenre() {
        return allGenre;
    }

    public String getAllCountry() {
        return allCountry;
    }

    public String getTvSeries() {
        return tvSeries;
    }

    public String getPopularTvSerieslist() {
        return popularSeries;
    }
    public String getLatestTvSeries() {
        return latestTvSeries;
    }

    public String getSlider() {
        return slider;
    }

    public String getGet_live_tv() {
        return get_live_tv;
    }

    public String getGet_featured_tv() {
        return get_featured_tv;
    }

    public String getLatest_movie() {
        return latest_movie;
    }

    public String getGet_movie() {
        return get_movie;
    }
}
