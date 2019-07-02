package k9501.mapper;

import java.util.List;

import k9501.entity.Invitation;
import k9501.entity.ReplyDetail;
import k9501.entity.ReplyDetailExample;

public interface ReplyDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(ReplyDetail record);

    int insertSelective(ReplyDetail record);

    List<ReplyDetail> selectByExample(ReplyDetailExample example);

    ReplyDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(ReplyDetail record);

    int updateByPrimaryKey(ReplyDetail record);

    //查询帖子回复全部信息
    List<ReplyDetail> getAllReplyDetail();
}