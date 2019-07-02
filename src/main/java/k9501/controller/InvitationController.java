package k9501.controller;
import com.github.pagehelper.PageInfo;
import com.sun.javafx.image.BytePixelSetter;
import k9501.entity.Invitation;
import k9501.service.InvitationService;
import org.springframework.stereotype.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class InvitationController {
    @Autowired
    private InvitationService invitationService;

        //一请求一方法
    //查询全部
    @RequestMapping("/showInvitation")
    public String showInvitation(Model model)throws Exception{
        //调用业务
        List<Invitation> list = invitationService.getAllInvitation();
        model.addAttribute("list",list);
        return "index";
    }

    //删除
    @RequestMapping("/deleteInvitation")
    public String deleteInvitation(Integer id)throws Exception{
        //调用业务
        System.out.println(id);
        int temp = invitationService.deleteByPrimaryKey(id);
        System.out.println("temp = " + temp);
        if (temp<0){
            return "error";
        }else {
            return "redirect:/showInvitation2";
        }
    }

    //分页
    @RequestMapping("/showInvitation2")
    public String showInvitation2(Integer page, Model model)throws Exception{
        //调用分页业务
        if (page==null){
            page=1;
        }
        PageInfo<Invitation> PageInfo = invitationService.getAllInvitationPage(page, 4);
        model.addAttribute("pageInfo",PageInfo);
            return "index2";

    }
    //编写处理请求的服务，用于返回帖子的数据（数据格式为json）
    @RequestMapping("/getData")
    // @ResponseBody的作用就是讲处理请求的方法返回值输出响应体
    @ResponseBody
    public Invitation getData() throws Exception{
        Invitation invitation = new Invitation();
        invitation.setId(new Integer("100"));
        invitation.setAuthor("123456");
        return invitation;
    }

    @RequestMapping("/getData2")
    // @ResponseBody的作用就是讲处理请求的方法返回值输出响应体
    @ResponseBody
    public List<Invitation> getData2() throws Exception{
        List<Invitation> list = invitationService.getAllInvitationYiBu();
        return list;
    }
}
