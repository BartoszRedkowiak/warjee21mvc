package pl.coderslab.zadanie4;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.util.WebUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
public class CookieController {

    @GetMapping("/setcookie/{value1}/{value2}")
    public String setCookies(@PathVariable String value1,
                             @PathVariable String value2,
                             HttpServletResponse response){
        Cookie cookie1 = new Cookie("cookie1", value1);
        Cookie cookie2 = new Cookie("cookie2", value2);
        cookie1.setPath("/");
        cookie2.setPath("/");
        response.addCookie(cookie1);
        response.addCookie(cookie2);

    return "cookieTest";
    }

}
