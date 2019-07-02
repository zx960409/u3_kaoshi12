package k9501.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import k9501.entity.Invitation;
import k9501.mapper.InvitationMapper;
import k9501.service.InvitationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.DispatcherServlet;

import java.util.List;

    @Service
public class InvitationServiceImpl implements InvitationService {
    @Autowired //默认按类型自动注入
    private InvitationMapper invitationMapper;

    //异步查询全部帖子信息
        @Override
        public List<Invitation> getAllInvitationYiBu() {
            return invitationMapper.getAllInvitationYiBu();
        }

        //查询全部
        @Override
        public List<Invitation> getAllInvitation() {
            return invitationMapper.getAllInvitation();
        }

        //删除
        @Override
        public int deleteByPrimaryKey(Integer id) {
            return invitationMapper.deleteByPrimaryKey(id);
        }

        //分页查询
        @Override
        public PageInfo<Invitation> getAllInvitationPage(int page, int pageSize) {
            //开启分页支持
            PageHelper.startPage(page,pageSize);
            //调用dao层查询所有
            List<Invitation> list = invitationMapper.getAllInvitation();
            //获取分页的相关信息
            PageInfo pageInfo= new PageInfo(list);
            return pageInfo;
        }
    }
