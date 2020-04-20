package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Role;
import cn.bdqn.his.masterdata.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface HosUserService {
    List<User> userList(@Param("name")String name);
    List<Role> roleList(@Param("id")String id);
}
