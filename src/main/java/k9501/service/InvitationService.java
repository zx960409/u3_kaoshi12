package k9501.service;

import com.github.pagehelper.PageInfo;
import k9501.entity.Invitation;

import java.util.List;

public interface InvitationService {

    //异步查询全部学生
    List<Invitation> getAllInvitationYiBu();

    //查询全部信息
    List<Invitation> getAllInvitation();

    //删除
    int deleteByPrimaryKey(Integer id);

    //分页查询
    PageInfo<Invitation> getAllInvitationPage(int page, int pageSize);

}
