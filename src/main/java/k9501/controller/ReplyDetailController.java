package k9501.controller;

import com.github.pagehelper.PageInfo;
import k9501.entity.ReplyDetail;
import k9501.mapper.ReplyDetailMapper;
import k9501.service.RepiyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ReplyDetailController {
    @Autowired
    private RepiyDetailService repiyDetailService;
    @RequestMapping("/showReplyDetail")
    //实现查询回复列表
    public String showReplyDetail( int page, Model model) throws  Exception{
        PageInfo<ReplyDetail> pageInfo = repiyDetailService.getAllRepiyDetailPage(page, 4);
        model.addAttribute("pageInfo",pageInfo);
        return "replyDetail";
    }
}
