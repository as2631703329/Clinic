package cn.bdqn.his.masterdata.mapper;

import cn.bdqn.his.masterdata.entity.DiagInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//疾病查询
@Mapper
public interface DiaginfoMapper {
    List<DiagInfo> diagInfoList(@Param("content") String content);
}
