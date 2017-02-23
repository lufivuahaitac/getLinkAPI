/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.netbit.http;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.json.JSONObject;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Truong
 */
public class GetLink {

    private HttpClient client = HttpClientBuilder.create().build();
    private final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36";

    public String sendPost(String linkIn, String password)
            throws Exception {

        HttpPost post = new HttpPost("https://www.fshare.vn/login");
        String fs_csrf = getfs_csrf();
        System.out.println("FSCSRF: " + fs_csrf);
        // add header
        post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.84 Safari/537.36");
        post.setHeader("Content-Type", "application/x-www-form-urlencoded");
        List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("fs_csrf", fs_csrf));
        urlParameters.add(new BasicNameValuePair("LoginForm[email]", "anhnhacktxd@gmail.com"));
        urlParameters.add(new BasicNameValuePair("LoginForm[password]", "anhnhackt5"));
        urlParameters.add(new BasicNameValuePair("LoginForm[checkloginpopup]", "0"));
        urlParameters.add(new BasicNameValuePair("LoginForm[rememberMe]", "0"));
        urlParameters.add(new BasicNameValuePair("yt0", "Đăng nhập"));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));

        HttpResponse response = client.execute(post);

        int responseCode = response.getStatusLine().getStatusCode();

        System.out.println("Response Code : " + responseCode);
        System.out.println(EntityUtils.toString(response.getEntity()));

        GetPageContent(linkIn);
        String linkCode = linkIn.split("/")[linkIn.split("/").length - 1];
        String url = "https://www.fshare.vn/download/get";
        post = new HttpPost(url);

        // add header
        post.setHeader("Content-Type", "application/x-www-form-urlencoded; charset=UTF-8");
        post.setHeader("Accept", "application/json, text/javascript, */*; q=0.01");
        post.setHeader("X-Requested-With", "XMLHttpRequest");
        urlParameters = new ArrayList<NameValuePair>();
        urlParameters.add(new BasicNameValuePair("fs_csrf", fs_csrf));
        urlParameters.add(new BasicNameValuePair("DownloadForm[pwd]", password));
        urlParameters.add(new BasicNameValuePair("DownloadForm[linkcode]", linkCode));
        urlParameters.add(new BasicNameValuePair("ajax", "download-form"));
        urlParameters.add(new BasicNameValuePair("undefined", "undefined"));
        post.setEntity(new UrlEncodedFormEntity(urlParameters));
        response = client.execute(post);
        System.out.println("\nSending 'POST' request to URL : " + url);
        System.out.println("Post parameters : " + post.getEntity());
        System.out.println("Response Code : "
                + response.getStatusLine().getStatusCode());
        String responseBody = EntityUtils.toString(response.getEntity());
        return responseBody;
    }

    private String GetPageContent(String url) throws Exception {

        HttpGet request = new HttpGet(url);

        request.setHeader("User-Agent", USER_AGENT);
        request.setHeader("Accept",
                "text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8");
        request.setHeader("Accept-Language", "en-US,en;q=0.5");

        HttpResponse response = client.execute(request);
        int responseCode = response.getStatusLine().getStatusCode();

        System.out.println("Response Code : " + responseCode);

        BufferedReader rd = new BufferedReader(
                new InputStreamReader(response.getEntity().getContent()));

        String responseBody = EntityUtils.toString(response.getEntity());

        // set cookies
        return responseBody;

    }

    private String getfs_csrf() throws Exception {
        String html = GetPageContent("https://www.fshare.vn/login");
        Document doc = Jsoup.parse(html);
        Element buddynameInput = doc.select("input[name=fs_csrf]").first();
        String fs_csrf = buddynameInput.attr("value");
        return fs_csrf;
    }

    public static void main(String[] args) throws Exception {
        GetLink get = new GetLink();
        get.sendPost("https://www.fshare.vn/file/TD9Z2Q8YDT/", "");
    }
}
