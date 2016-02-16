package ru.cbr.candidatesCheck.web;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;


@Controller
public class RootController {
    @RequestMapping(value = "/",method = RequestMethod.GET)
    @ResponseBody
    void root(HttpServletResponse response) throws IOException {
        response.setContentType("text/html; charset=UTF-8");
        response.setCharacterEncoding("UTF-8");
        File index = new File("client/src/index.html");
        String data = FileUtils.readFileToString(index, "UTF-8");
        IOUtils.write(data, response.getWriter());
    }
}
