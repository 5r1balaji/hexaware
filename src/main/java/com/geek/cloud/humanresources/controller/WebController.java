package com.geek.cloud.humanresources.controller;

        import com.geek.cloud.humanresources.entity.EntitySet;
        import com.geek.cloud.humanresources.entity.UserMaster;
        import com.geek.cloud.humanresources.repository.UserMasterRepository;
        import com.sun.deploy.net.HttpResponse;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpRequest;
        import org.springframework.stereotype.Controller;
        import org.springframework.web.bind.annotation.RequestBody;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;
        import org.springframework.web.bind.annotation.ResponseBody;
        import org.springframework.web.servlet.ModelAndView;

        import javax.servlet.http.HttpSession;

@Controller
public class WebController {

    @Autowired
    UserMasterRepository userMasterRepository;

    @Autowired
    HttpSession session;

    @RequestMapping(value="/",method = RequestMethod.GET)
    public String homepage(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");

        return "index";
    }

    @RequestMapping(value="/login",method = RequestMethod.POST)
    public String login(@RequestBody EntitySet student){
        UserMaster ms=userMasterRepository.findByUserName(student.getUserName());
        session.setAttribute("userDetails",ms);
        System.out.println(session.getAttribute("userDetails"));
        return "redirect:/home";

    }


    @RequestMapping(value="/home",method = RequestMethod.GET)
    public String Dashboard(){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("index");
        System.out.println("red is returned");
        return "homePage";
    }

    @RequestMapping(value="/session",method = RequestMethod.GET)
    @ResponseBody
    public UserMaster getSessionDetails(){
        if(null!=session.getAttribute("userDetails")){
            return (UserMaster) session.getAttribute("userDetails");
        }


        return null;
    }



}
