package cn.limbo.controller;

import cn.limbo.entity.User;
import cn.limbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by limbo on 2016/11/8.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/showUsers.do")
    public String showUsers(HttpServletRequest request){
        request.setAttribute("list",userService.getAllUsers());
        return "/index.jsp";
    }

    @RequestMapping("/addUser.do")
    public String addUser(HttpServletRequest request){
        String userName = request.getParameter("userName");
        Integer userAge = Integer.valueOf(request.getParameter("userAge"));
        String userAddress = request.getParameter("userAddress");

        User user = new User(userName,userAge,userAddress);
        userService.save(user);
        return "showUsers.do";
    }
}
