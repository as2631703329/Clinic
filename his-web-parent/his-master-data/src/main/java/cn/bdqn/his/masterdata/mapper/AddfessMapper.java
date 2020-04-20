package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Addfess;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//附加费查询
@Mapper
public interface AddfessMapper {
    List<Addfess> addfessList(@Param("type")String type, @Param("name")String name);
}
