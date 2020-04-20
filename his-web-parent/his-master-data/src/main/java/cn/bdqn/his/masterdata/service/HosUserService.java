package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public class HosUserService {
    List<User> userList(@Param("type")String type, @Param("name")String name);
}
