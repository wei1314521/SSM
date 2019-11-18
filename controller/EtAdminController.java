package cn.xdl.controller;
import cn.xdl.service.EtAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import cn.xdl.entity.EtAdmin;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class EtAdminController {

    @Autowired
    private EtAdminService service;

    @RequestMapping("/toHello")
    public String toHello(HttpServletRequest request) {
        List<EtAdmin> admin = service.getAll();
        System.out.println(admin);
        System.out.println(admin);
        System.out.println(admin);
        request.setAttribute("admin",admin);
        return "index";
    }

}
