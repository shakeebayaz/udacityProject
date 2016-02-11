package com.example.techjini.myappportfolio.NetworkLayer;

import java.util.HashMap;
import java.util.Map;

import retrofit.Call;
import retrofit.http.Body;
import retrofit.http.DELETE;
import retrofit.http.Field;
import retrofit.http.FieldMap;
import retrofit.http.FormUrlEncoded;
import retrofit.http.GET;
import retrofit.http.Header;
import retrofit.http.Headers;
import retrofit.http.Multipart;
import retrofit.http.POST;
import retrofit.http.PUT;
import retrofit.http.Part;
import retrofit.http.Path;
import retrofit.http.Query;

/**
 * Created by Shakeeb on 1/11/2016
 */
public interface ApiService {
    final String baseURL="http://image.tmdb.org/t/p/w185";
    final String API_KEY="YOUR_API_KEY";


    //String baseURL="http://52.25.62.3/api/rest/techjini/";
    //http://52.25.62.3/api/rest/techjini/products/list/zipcode/560010/tokenid/9dc7777af14d3a886132fc1fda72b22a
//    String url = "api/rest/techjini/products/list/zipcode/560010";
    //api/rest/techjini/v1/catalogs/
/*    String url = "api/rest/techjini/v1/catalogs/dc_id//pincode//prefer_teaser_menu//device_resolution/mdpi";
    //String url = "api/rest/techjini/products/list/zipcode/560010/tokenid/9dc7777af14d3a886132fc1fda72b22a";

    String createOrAddtoCartUrl = "api/rest/techjini/checkout/cart/create";

    String checkProductAvailableAPI = "api/rest/techjini/inventory/list/zipcode/560010";

    String signUpUrl = "api/rest/techjini/customer/create/";

    //String loginAPIUrl = "api/rest/techjini/customer/login/email/customer@example.com/password/password/websiteid/1";
    String loginAPIUrl = "api/rest/techjini/v1/login/";


    final String OrderHistoryUrl = "api/rest/techjini/v1/customer/orderhistory";

    final String GetZipCodeUrl = "api/rest/techjini/v1/postalcodes/page_index/";
    final String GetCatLog = "api/rest/techjini/v1/catalogs/";
    final String VERIFY_OTP = "api/rest/techjini/v1/verifyotp/";
    final String RESEND_OTP = "api/rest/techjini/v1/resendotp/";
    final String addReviewURL = "api/rest/techjini/v1/product/review/add";
    final String ForgotPasswordURL="api/rest/techjini/v1/forgotpassword/";
    final String UpdateProfileURL="api/rest/techjini/v1/customer/update/";
    final String ChangePasswordURL="api/rest/techjini/v1/customer/password/";

    final String addAddressAPIURL = "api/rest/techjini/v1/customer/address/";

    final String updateAddressAPIURL = "api/rest/techjini/v1/customer/address/update";

    @GET("products")
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<Map<String, Map<String, String>>> getNewsList();
    //.baseUrl("http://52.25.62.3/api/rest/techjini/products/list/zipcode/560010")

    @GET(url)
    @Headers({"Content-Type: application/json", "Accept: application/json"})
    Call<CatalogModel> getCatalog(@Header("fltoken") String fltoken, @Header("guid") String guid);*/

}
