package k9501.mapper;

import java.util.List;
import k9501.entity.Invitation;
import k9501.entity.InvitationExample;

public interface InvitationMapper {
    //异步查询全部学生
    List<Invitation> getAllInvitationYiBu();

    //查询帖子全部信息
    List<Invitation> getAllInvitation();

    //删除
    int deleteByPrimaryKey(Integer id);

    int insert(Invitation record);

    int insertSelective(Invitation record);

    List<Invitation> selectByExample(InvitationExample example);

    Invitation selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Invitation record);

    int updateByPrimaryKey(Invitation record);
}