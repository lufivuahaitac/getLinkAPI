/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vn.netbit.http;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

/**
 *
 * @author Truong
 */
public class NewClass {
    private static String html = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\"><html lang=\"en\">\n" +
"    <head>\n" +
"\n" +
"        <title> 4Share.vn -  en_windows_7_enterprise_with_sp1_x64_dvd_u_677651.iso</title>\n" +
"        <meta charset=\"utf-8\">\n" +
"        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n" +
"        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n" +
"        <meta name=\"author\" content=\"\">\n" +
"\n" +
"        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" >\n" +
"<meta name=\"keywords\" content=\"4Share.vn, upload, download, free download, chia sẻ dữ liệu, free upload, dữ liệu trực tuyến, Windows, PC, Mac, OS X, Linux, Android, iPhone, iPad, free storage, cloud Storage, collaboration, file Sharing, share Files\" >\n" +
"<meta name=\"description\" content=\"Free Upload, Free download, Upload miễn phí, 4Share Upload, Download miễn phí, lưu trữ, sao lưu trực tuyến, Upload dữ liệu nhanh nhất, download dữ liệu nhanh nhất, lưu trữ dữ liệu trực tuyến – Tên file/Folder\" >\n" +
"        <link href=\"/public/templates/bootstr_tpl/css/bootstrap.min.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/bootstrap-theme.min.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/custom.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/css_k/common.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/css_k/font-awesome.min.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/css_k/template.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/css_k/custom.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"<link href=\"/public/templates/bootstr_tpl/css/css_k/responsive.css\" media=\"screen\" rel=\"stylesheet\" type=\"text/css\" >\n" +
"\n" +
"        <script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/jquery.min.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/bootstrap.min.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/ie-emulation-modes-warning.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/docs.min.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/ie10-viewport-bug-workaround.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/js_k/custom.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/templates/bootstr_tpl/js/js_k/libraries.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/js/submit.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/js/cloud.js\"></script>\n" +
"<script type=\"text/javascript\" src=\"/public/js/common.js\"></script>        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->\n" +
"        <!--[if lt IE 9]>\n" +
"          <script src=\"https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js\"></script>\n" +
"          <script src=\"https://oss.maxcdn.com/respond/1.4.2/respond.min.js\"></script>\n" +
"        <![endif]-->\n" +
"        <link href=\"/public/templates/user-tpl/public/js/jquery/1.9.2/themes/base/jquery.ui.all.css\">\n" +
"        <script type=\"text/javascript\" src=\"/public/templates/user-tpl/public/js/jquery/1.9.2/ui/minified/jquery-ui.min.js\"></script>\n" +
"<!--        <script async src=\"//pagead2.googlesyndication.com/pagead/js/adsbygoogle.js\"></script>\n" +
"        <script>\n" +
"            (adsbygoogle = window.adsbygoogle || []).push({\n" +
"                google_ad_client: \"ca-pub-3482631774465195\",\n" +
"                enable_page_level_ads: true\n" +
"            });\n" +
"        </script>-->\n" +
"\n" +
"        <script type='text/javascript'>\n" +
"            (function (w) {\n" +
"                var d = document, h = d.getElementsByTagName('head')[0], j = d.createElement('script'), k = d.createElement('script');\n" +
"                j.setAttribute('src', '//cdn.adsoptimal.com/advertisement/settings/20544.js');\n" +
"                k.setAttribute('src', '//cdn.adsoptimal.com/advertisement/manual.js');\n" +
"                h.appendChild(j);\n" +
"                h.appendChild(k);\n" +
"            })(window);\n" +
"        </script>\n" +
"\n" +
"\n" +
"    </head>\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"\n" +
"<body role=\"document\">\n" +
"    <!-- Fixed navbar -->\n" +
"    <!--        <nav class=\"navbar navbar-inverse navbar-fixed-top\">-->\n" +
"\n" +
"\n" +
"    <div style='background-color: #ddd ;'>\n" +
"\n" +
"        <div class=\"container\" style='background-color: transparent ; padding-left: 15px; color:gray; padding-top: 2px; padding-right: 2px; padding-bottom: 2px'>\n" +
"<!--            <a style='margin-top: 3px' href='http://ifile.tv' target=\"_blank\" ><img style=\"height: 14px\" src=\"/public/images/icons/phim.png\"/> Phim ảnh</a> \n" +
"            <a style='margin-top: 3px' href='http://docs.4share.vn' target=\"_blank\" ><img style=\"height: 14px\" src=\"/public/images/icons/doc.png\"/> Tài liệu</a> \n" +
"            <a style='margin-top: 3px' href='http://forum.4share.vn' target=\"_blank\" ><img style=\"height: 14px\" src=\"/public/images/icons/forum.png\"/> Diễn đàn</a> -->\n" +
"\n" +
"            \n" +
"            <div id=\"google_translate_element\" style=\" float: right; height: 16px; margin-top: -2px; margin-right: 10px\"></div>\n" +
"            <script type=\"text/javascript\">\n" +
"                function googleTranslateElementInit() {\n" +
"                    new google.translate.TranslateElement({pageLanguage: 'vi', includedLanguages: 'en,fr,id,ja,th', layout: google.translate.TranslateElement.InlineLayout.SIMPLE}, 'google_translate_element');\n" +
"                }\n" +
"            </script><script type=\"text/javascript\" src=\"//translate.google.com/translate_a/element.js?cb=googleTranslateElementInit\"></script>\n" +
"\n" +
"        </div>\n" +
"    </div>\n" +
"\n" +
"    <nav class=\"navbar navbar-custom\">\n" +
"        <div class=\"container\">\n" +
"            <div class=\"navbar-header\">\n" +
"                <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\n" +
"                    <span class=\"sr-only\">Toggle navigation</span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                    <span class=\"icon-bar\"></span>\n" +
"                </button>\n" +
"    <!--                <a class=\"navbar-brand\" href=\"/\"> 4Share.vn </a>-->\n" +
"                <a href=\"/\"> <img style='margin-top: 5px; width: 130px; height: 38px' src='/public/images/logo.png'/> </a>\n" +
"            </div>\n" +
"            <div id=\"navbar\" class=\"navbar-collapse collapse\">\n" +
"\n" +
"                <ul class=\"nav navbar-nav\">\n" +
"                    \n" +
"<li><a  href='/cloud/index/upload'> Upload  </a></li>\n" +
"<li><a  href='/tool-4s'> Tool  </a></li>\n" +
"<li><a  href='https://4share.vn/payment/'> Mua VIP  </a></li>\n" +
"<li class='dropdown'> <a class=\"dropdown-toggle disabled\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" href='/'> Thông tin <span class=\"caret\"></span> </a>\n" +
"<ul class='dropdown-menu'>\n" +
"<li><a  href='/information/intro'> Giới thiệu  </a></li>\n" +
"<li><a  href='/information/policy'> Chính sách  </a></li>\n" +
"<li><a  href='/information/function'> Tính năng  </a></li>\n" +
"<li><a  href='/information/bonus'> Điểm thưởng  </a></li>\n" +
"<li><a  href='/information/guide'> Hướng dẫn sử dụng  </a></li>\n" +
"<li><a  href='/information/news'> Thông báo  </a></li>\n" +
"<li><a  href='/information/contact'> Hỗ trợ - Hỏi đáp - Liên hệ  </a></li>\n" +
"</ul>\n" +
"</li>\n" +
"<li class='dropdown'> <a class=\"dropdown-toggle disabled\" data-toggle=\"dropdown\" role=\"button\" aria-expanded=\"false\" href='/member/'> Quản lý <span class=\"caret\"></span> </a>\n" +
"<ul class='dropdown-menu'>\n" +
"<li><a  href='/member'> Quản lý Tài khoản  </a></li>\n" +
"<li><a  href='/cloud/'> Quản lý File  </a></li>\n" +
"<li><a  href='/member/change-password'> Đổi mật khẩu  </a></li>\n" +
"<li><a  href='/member/check-link'> Kiểm tra Link download  </a></li>\n" +
"<li><a  href='/member/dlink'> Direct Link  </a></li>\n" +
"<li><a  href='/member/uploader'> Uploader  </a></li>\n" +
"</ul>\n" +
"</li>\n" +
"<li><a  href='/information/contact'> Hỗ trợ  </a></li>\n" +
"                </ul>\n" +
"                <ul class=\"nav navbar-nav navbar-right\">\n" +
"\n" +
"                    <li>\n" +
"                        <form class=\"navbar-form\" style=\"margin-left: 0px;margin-right: 0px;\" action=\"/search\" method=\"get\">\n" +
"                            <div class=\"form-group\">\n" +
"                                <input type=\"text\" name='search_string' class=\"form-control\" placeholder=\"Tìm file...\" style='width: 150px; '>\n" +
"                            </div>\n" +
"                            <button type=\"submit\" class=\"btn btn-default\">Tìm</button>\n" +
"\n" +
"                        </form>\n" +
"                    </li>\n" +
"                                            <li><a href=\"https://4share.vn/default/index/logout\">Thoát</a></li>\n" +
"                        \n" +
"                </ul>\n" +
"\n" +
"            </div>\n" +
"\n" +
"\n" +
"\n" +
"        </div>\n" +
"    </nav>\n" +
"            <div style='padding: 2px; border-bottom: 0px solid #ccc; background-color: #ddd; text-align: right'>\n" +
"            <div class=\"container\">\n" +
"                Số tài khoản: <strong><a style='color:; text-decoration: underline ' href='/member'>1304140</a></strong> (lufivuahaitac@gmail.com)  <b>  </b>  - TK <b>VIP</b> Hạn sử dụng VIP: 23-03-2017            </div>    \n" +
"        </div>\n" +
"                    <div class=\"\" style='color:red; padding: 5px;'>\n" +
"            <center>\n" +
"                \n" +
"                <span style='color: brown; font-size: 16px '>\n" +
"                    <center><b><a style='color: red; text-decoration: none ' target='blank' href='http://diendan.4share.vn/index.php?threads/ch%C3%8Dnh-s%C3%81ch-th%C6%AF%E1%BB%9Eng-uploader-m%E1%BB%9Ai-2014.121730/'>\n" +
"                                <image src=\"/public/images/new-blink.gif\" style='width: 48px'/> THAM GIA UPLOADER KIẾM TIỀN DỄ DÀNG CÙNG 4SHARE !\n" +
"                            </a></b>  \n" +
"                    </center>\n" +
"                </span>\n" +
"                </a>\n" +
"            </center>\n" +
"        </div>\n" +
"\n" +
"            \n" +
"    <div class=\"container\">\n" +
"        \n" +
"                <div id='main_content_t' style='min-height: 600px; margin-top: 2px'>\n" +
"            \n" +
"\n" +
"<center>\n" +
"\n" +
"    \n" +
"    <table border='0' style='margin-left: -40px'>\n" +
"        <tr>\n" +
"            <td style='width: 150px; padding: 5px; vertical-align:top;'>\n" +
"\n" +
"                                    <!--                    <div class=\"adsoptimal-slot\" style=\"width: 160px; height: 600px;\"></div>-->\n" +
"\n" +
"                    <!-- 4share 160x600 -->\n" +
"    <!--                    <ins class=\"adsbygoogle\"\n" +
"                         style=\"display:inline-block;width:160px;height:600px\"\n" +
"                         data-ad-client=\"ca-pub-3482631774465195\"\n" +
"                         data-ad-slot=\"2965486262\"></ins>\n" +
"                    <script>\n" +
"                        (adsbygoogle = window.adsbygoogle || []).push({});\n" +
"                    </script>-->\n" +
"                    \n" +
"            </td>\n" +
"            <td style='padding: 5px; min-width: 436px'>\n" +
"\n" +
"<!--        <center><a href='/payment/card/#FUNNY' target='_blank'><img style='width: 730px' src='/adsimg/funny15.png'></a>\n" +
"        </center>-->\n" +
"        <center>\n" +
"            <!--            <div class='affiliate' style='color: blue'>\n" +
"                            Siêu rẻ! Với số <a href='http://www.mobifone.vn/' target='_blank'>\n" +
"                                <img style='height: 25px' src='/images/mobi.png'></a>, nhắn <b style='color: red'>DK FSX</b> gửi <b style='color: red'>9242</b> <br/>Nhận ngay tài khoản 4Share Download Siêu tốc Chỉ <b>330 đồng/ngày</b><br/>\n" +
"                                <span style='font-size: 12px'><i><b>Thật không thể tin được - Chỉ có ở 4Share.vn - Một cốc trà đá dùng 4Share tới 1 tuần!</b></i></span>\n" +
"                        </div>\n" +
"                        <br/>\n" +
"            <div style=\"border: 1px solid #ccc; padding: 10px; background-color: snow\">\n" +
"                <a style=\"text-decoration: none\" href='http://4share.vn/payment/index/info' target='_blank'>\n" +
"                    <h4 style=\"color: RED\"> Tặng ngay 100% gold Khi thanh toán với thẻ quốc tế Visa/Master/JCB </h4>\n" +
"                    <img style='width: 300px' src='/images/visa_master_jcb.png'></a>\n" +
"            </div>\n" +
"            -->\n" +
"        </center>\n" +
"\n" +
"        \n" +
"        <center>\n" +
"            <iframe style=\"padding-top: 5px\" align=\"center\" allowtransparency=\"true\" frameborder=\"0\" height=\"25\" scrolling=\"no\" src=\"http://www.facebook.com/plugins/like.php?href=https://www.facebook.com/4sharedotvn&action=like&font=tahoma&colorscheme=light\" width=\"500\">\n" +
"            </iframe>\n" +
"\n" +
"            <div id=\"fb-root\"></div>\n" +
"            <script>(function (d, s, id) {\n" +
"                    var js, fjs = d.getElementsByTagName(s)[0];\n" +
"                    if (d.getElementById(id))\n" +
"                        return;\n" +
"                    js = d.createElement(s);\n" +
"                    js.id = id;\n" +
"                    js.src = \"//connect.facebook.net/vi_VN/sdk.js#xfbml=1&version=v2.5&appId=376690319200597\";\n" +
"                    fjs.parentNode.insertBefore(js, fjs);\n" +
"                }(document, 'script', 'facebook-jssdk'));\n" +
"            </script>\n" +
"\n" +
"            <br/>\n" +
"            <h4><a href='/tool-4s' target='_blank' style='background-color: snow; border: 1px solid #eee; padding: 5px 10px 5px 10px; color: brown; border-radius: 10px; text-decoration: none'>Hay quá! Xem phim trực tiếp với 4Share Tool mà không cần Download File!</a>\n" +
"            </h4>\n" +
"        </center>\n" +
"        <br/>\n" +
"\n" +
"                    <div class='affiliate'>\n" +
"                <b>Kiếm Tiền ngay </b> với link Affiliate: \n" +
"                <a href='http://forum.4share.vn/index.php?threads/chi%E1%BA%BFn-d%E1%BB%8Bch-ki%E1%BA%BFm-ti%E1%BB%81n-v%E1%BB%9Bi-4share-affiliate.129995/' target=\"_blank\"> Hướng dẫn</a>\n" +
"                                        <br/><input style='border: 1px solid #ccc; color: blue; padding: 3px; border-radius: 5px;' onClick=\"this.select();\" style=\"margin:0;padding:0; color: blue\" size=\"50\" type=\"text\" value='http://4share.vn/f/7a4e43434e48484e/affiliate/1304140'>\n" +
"                        <br/><span style='font-size: 14px;'>Bạn chỉ cần copy link này và chia sẻ, nếu có lượt download bạn sẽ có điểm và qui ra tiền thưởng!</span>\n" +
"                        \n" +
"            </div>\n" +
"            <br/><center><a style='text-decoration:none' href='http://sv6.4share.vn/8/?info=2819191b77191e1877111a771a181a051b11184b184a184d18181811184a1811055e4158051a1c191f101a'> <h4>En_windows_7_enterprise_with_sp1_x64_dvd_u_677651.iso</h4>   (<strong>2.96 GB</strong> )\n" +
"                        <br/>\n" +
"                        <img src='/public/templates/bootstr_tpl/images/download.button.png'/></a> <br/> <span style='font-size: 10px'> MD5: 6467c3875955df4514395f0afcaaa62a </span></center><center><div class='affiliate' style='color: blue'>Siêu rẻ! Với số <a href='http://www.mobifone.vn/' target='_blank'><img style='height: 25px' src='/images/mobi.png'></a>, nhắn <b style='color: red'>DK FSX</b> gửi <b style='color: red'>9242</b> <br/>Nhận ngay tài khoản 4Share Download Siêu tốc Chỉ <b>330 đồng/ngày</b><br/><span style='font-size: 12px'><i><b>Thật không thể tin được - Chỉ có ở 4Share.vn - Một cốc trà đá dùng 4Share tới 1 tuần!</b></i></span></div><br/>                \n" +
"                    <script src=\"//get.sbro.me/partners/4share.js?v=170217\" type=\"text/javascript\"></script>\n" +
"                    \n" +
"                    <!--                    <a target=\"_blank\" href='http://nhackhongloi.vn/music/397/nhac-cu/dan-piano/nhung-tinh-khuc-hoa-tau-chon-loc-relax-piano.html'>\n" +
"                                            <img src=\"/images/nhackhongloi.vn2.png\"> \n" +
"                                            </a>-->\n" +
"                    <!--                <a target=\"_blank\" href='http://coccoc.com/?utm_source=horizontal_banner&utm_medium=cpc&utm_campaign=4share'>\n" +
"                                            <img src=\"/images/600x120_flashy.png\">\n" +
"                                        </a>-->\n" +
"\n" +
"                                                                                                                                <!--                <script type=\"text/javascript\" src=\"http://js.genieessp.com/t/045/946/a1045946.js\"></script>-->\n" +
"\n" +
"                    <!--                    <a target=\"_blank\" href='http://hathuongduongnga.com/'>\n" +
"                                            <img style='width: 400px' src=\"http://4share.vn/images/hat huong duong nga.png\">\n" +
"                                        </a>-->\n" +
"\n" +
"                    <!--                <a target=\"_blank\" href='http://sonthaohoan.com/'>\n" +
"                                        <img style='width: 650px' src=\"http://4share.vn/images/son%20thao%20hoan.png\">\n" +
"                                    </a>-->\n" +
"\n" +
"                    </center>\n" +
"        </td>\n" +
"        <td style='width: 150px; vertical-align:top; padding: 5px'>\n" +
"            \n" +
"            <!--            <div class=\"adsoptimal-slot\" style=\"width: 160px; height: 600px;\"></div>-->\n" +
"\n" +
"        </td>\n" +
"        </tr>    \n" +
"\n" +
"    </table>\n" +
"\n" +
"</center>\n" +
"<span style='color: white; font-size: 8px'>\n" +
"    1-1487736604/2-1487736604/3-1487736604/4-1487736604/5-1487736604/6-1487736604</span>\n" +
"\n" +
"        </div>    \n" +
"        <br/>\n" +
"        <hr/>\n" +
"        <footer style='background-color: white; padding: 5px'>\n" +
"            <center> &copy; 4SHARE.VN - 2008-2015 </center>\n" +
"        </footer>\n" +
"    </div>\n" +
"\n" +
"    <script type=\"text/javascript\">\n" +
"        var gaJsHost = ((\"https:\" == document.location.protocol) ? \"https://ssl.\" : \"http://www.\");\n" +
"        document.write(unescape(\"%3Cscript src='\" + gaJsHost + \"google-analytics.com/ga.js' type='text/javascript'%3E%3C/script%3E\"));\n" +
"    </script>\n" +
"\n" +
"    <script type=\"text/javascript\">\n" +
"        try\n" +
"        {\n" +
"            var pageTracker = _gat._getTracker(\"UA-9991440-2\");\n" +
"            pageTracker._setDomainName(\".4share.vn\");\n" +
"            pageTracker._trackPageview();\n" +
"        } catch (err) {\n" +
"        }\n" +
"    </script>\n" +
"\n" +
"    <script type=\"text/javascript\">\n" +
"        var _gaq = _gaq || [];\n" +
"        _gaq.push(['_setAccount', 'UA-26965513-1']);\n" +
"        _gaq.push(['_trackPageview']);\n" +
"        (function () {\n" +
"            var ga = document.createElement('script');\n" +
"            ga.type = 'text/javascript';\n" +
"            ga.async = true;\n" +
"            ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\n" +
"            var s = document.getElementsByTagName('script')[0];\n" +
"            s.parentNode.insertBefore(ga, s);\n" +
"        })();\n" +
"    </script>\n" +
"    <script type=\"text/javascript\" src=\"https://s7.addthis.com/js/300/addthis_widget.js#pubid=ra-556ec0e74ffac74d\" async=\"async\"></script>\n" +
"    \n" +
"    <script type=\"text/javascript\" src=\"http://www.trungtamtinhoc.edu.vn/api/snowstorm.js\"></script>\n" +
"    \n" +
"</body>\n" +
"</html>\n" +
"\n" +
"    ";
    
    public static void main(String[] args) {
        Document doc = Jsoup.parse(html);
        System.out.println(html.contains("TK <b>VIP</b> Hạn sử dụng VIP"));
        Element image = doc.getElementsByAttributeValue("src", "/public/templates/bootstr_tpl/images/download.button.png").first();
        String link = image.parent().attr("href");
        System.out.println(link);
    }
}
