package com.example.trial01.apihelper;

public class UtilsApi {

//    public static final String BASE_URL_API = "http://private-9936c-appscheftrialapi.apiary-mock.com/";
    static final String BASE_URL_API = "https://private-ce8e2e-productsapi17.apiary-mock.com/";

    public static BaseApiService getAPIService(){
        return RetrofitClient.getClient(BASE_URL_API).create(BaseApiService.class);
    }

}
