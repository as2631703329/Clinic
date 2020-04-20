package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Role;
import cn.bdqn.his.masterdata.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//员工查询
@Mapper
public interface HosUserMapper {
    List<User> userList(@Param("name")String name);
    List<Role> roleList(@Param("id")String id);
}
