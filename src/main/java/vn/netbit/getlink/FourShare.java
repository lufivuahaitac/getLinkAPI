/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.netbit.getlink;

import com.google.gson.Gson;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import vn.netbit.beans.RequestBean;
import vn.netbit.beans.Get4ShareResponse;
import vn.netbit.http.Get4Share;
import vn.netbit.http.GetLink;

/**
 *
 * @author Truong
 */
@Path("/4share")
public class FourShare {

    private static final Logger LOGGER = LogManager.getLogger(Fshare.class);
    private final Gson gson = new Gson();

    @Context
    HttpServletRequest request;

    @POST
    @Path("/get")
    @Produces(MediaType.TEXT_PLAIN)
    @Consumes(MediaType.TEXT_PLAIN)
    public String get4Share(String inputData) {
        try {
            LOGGER.info("Fshare Input Data: {}", inputData);
            RequestBean data = gson.fromJson(inputData, RequestBean.class);
            if (data.isIpV4()) {
                System.setProperty("java.net.preferIPv4Stack", "true");
                System.setProperty("java.net.preferIPv6Addresses", "false");
            } else {
                System.setProperty("java.net.preferIPv4Stack", "false");
                System.setProperty("java.net.preferIPv6Addresses", "true");
            }
            Get4Share get = new Get4Share();
            Get4ShareResponse response = get.sendPost(data.getUrl(), data.getPassword());
            return gson.toJson(response);
        } catch (Exception ex) {
            LOGGER.error("Lỗi");
            return "Error";
        }
    }
}
