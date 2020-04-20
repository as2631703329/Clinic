package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.Advice;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//医嘱查询
@Mapper
public interface  AdviceMapper{
    List<Advice> adviceList(@Param("content") String content);
    int insertAdvice(@Param("content") String content, @Param("createDate")String createDate,@Param("create_id") Integer create_id);
}
