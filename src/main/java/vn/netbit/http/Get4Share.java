/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.netbit.http;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import vn.netbit.beans.Get4ShareResponse;

/**
 *
 * @author Truong
 */
public class Get4Share {
    private final HttpClient client = HttpClientBuilder.create().build();
    private final String USER_AGENT = "Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36";

    public Get4ShareResponse sendPost(String linkIn, String password) {
        Get4ShareResponse responseBean = null;
        try {
            System.setProperty("jsse.enableSNIExtension", "false");

            HttpPost post = new HttpPost("https://4share.vn/default/index/login");
            // add header
            post.setHeader("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/51.0.2704.84 Safari/537.36");
            post.setHeader("Content-Type", "application/x-www-form-urlencoded");
            List<NameValuePair> urlParameters = new ArrayList<NameValuePair>();
            urlParameters.add(new BasicNameValuePair("username", "lufivuahaitac@gmail.com"));
            urlParameters.add(new BasicNameValuePair("password", "phuong92"));
            post.setEntity(new UrlEncodedFormEntity(urlParameters));
            
            HttpResponse response = client.execute(post);
            
            int responseCode = response.getStatusLine().getStatusCode();
            
            
            String responseBody = EntityUtils.toString(response.getEntity());
            System.out.println("Response Code : " + responseCode);
            System.out.println(responseBody);
            
            String html = GetPageContent(linkIn);
            if (!html.contains("TK <b>VIP</b> Hạn sử dụng VIP")){
                responseBean = Get4ShareResponse.builder()
                        .error("Login không thành công hoặc tài khoản hết hạn vip")
                        .build();
            }
            Document doc = Jsoup.parse(html);
            Element image = doc.getElementsByAttributeValue("src", "/public/templates/bootstr_tpl/images/download.button.png").first();
            Element download = image.parent();
            String link = download.attr("href");
            String fileName = download.children().select("h4").first().text() + " - " + download.children().select("strong").first().text();
            responseBean = Get4ShareResponse.builder()
                        .url(link)
                        .fileName(fileName)
                        .build();
            return responseBean;
        } catch (Exception ex) {
            responseBean = Get4ShareResponse.builder()
                        .error("Có lỗi trong quá trình Get link")
                        .build();
            return responseBean;
        } 
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


    public static void main(String[] args) throws Exception {
        Get4Share get = new Get4Share();
        get.sendPost("https://www.fshare.vn/file/TD9Z2Q8YDT/", "");
    }
}
