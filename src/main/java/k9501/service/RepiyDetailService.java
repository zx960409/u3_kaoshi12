package k9501.service;

import com.github.pagehelper.PageInfo;
import k9501.entity.ReplyDetail;

import java.util.List;

public interface RepiyDetailService {
    //查询帖子回复全部信息
    List<ReplyDetail> getAllReplyDetail();
    //分页查询
    PageInfo<ReplyDetail> getAllRepiyDetailPage(int page, int pageSize);
}
