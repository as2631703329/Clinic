package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Addfess;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddfessService {
    List<Addfess> addfessList(@Param("type")String type, @Param("name")String name);
}
