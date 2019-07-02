package k9501.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import k9501.entity.Invitation;
import k9501.entity.ReplyDetail;
import k9501.mapper.ReplyDetailMapper;
import k9501.service.RepiyDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RepiyDetailServiceImpl implements RepiyDetailService {
    @Autowired
    private ReplyDetailMapper replyDetailMapper;
    //实现查询回复列表
    @Override
    public List<ReplyDetail> getAllReplyDetail() {
        return replyDetailMapper.getAllReplyDetail();
    }

    @Override
    public PageInfo<ReplyDetail> getAllRepiyDetailPage(int page, int pageSize) {
        //开启分页支持
        PageHelper.startPage(page,pageSize);
        //调用dao层查询所有
        List<ReplyDetail> list = replyDetailMapper.getAllReplyDetail();
        //获取分页的相关信息
        PageInfo pageInfo= new PageInfo(list);
        return pageInfo;
    }
}
