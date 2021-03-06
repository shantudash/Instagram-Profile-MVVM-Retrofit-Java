package com.snipex.shantu.androidarchitecturecomponentsdatabindingjava;

public class Constants {

    public static final String API_BASE_URL = "https://api.instagram.com/";

    /**
     * INSTAGRAM access token
     * You can get your access token from https://www.instagram.com/developer/
     *  Step-1 : Register Your Application
     *  Step-2 : Authentication
     *
     *          https://api.instagram.com/oauth/authorize/?client_id=CLIENT-ID&redirect_uri=REDIRECT-URI&response_type=token
     *          For authentication use this url. It has three arguments
     *
     *          First, client_id : you will get a client_id when you will register your application
     *          Second, redirect_uri : redirect_uri will be your redirect_uri when you register your application. NOTE :: It has to be same.
     *          Third, response_type : response_type will be token
     *
     * Step-3 : Once you has been authenticated and then authorized your application, Instagram redirects them to your redirect_uri with the access_token in the url fragment.
     * It will look like this: http://your-redirect-uri#access_token=YOUR-ACCESS-TOKEN
     */
    public static final String ACCESS_TOKEN = "YOUR_ACCESS_TOKEN";
}
