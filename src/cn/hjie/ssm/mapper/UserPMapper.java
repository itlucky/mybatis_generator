package cn.hjie.ssm.mapper;

import cn.hjie.ssm.po.UserP;
import cn.hjie.ssm.po.UserPExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserPMapper {
    int countByExample(UserPExample example);

    int deleteByExample(UserPExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UserP record);

    int insertSelective(UserP record);

    List<UserP> selectByExample(UserPExample example);

    UserP selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByExample(@Param("record") UserP record, @Param("example") UserPExample example);

    int updateByPrimaryKeySelective(UserP record);

    int updateByPrimaryKey(UserP record);
}