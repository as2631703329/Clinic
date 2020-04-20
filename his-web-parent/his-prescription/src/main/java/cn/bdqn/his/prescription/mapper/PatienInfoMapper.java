package cn.bdqn.his.prescription.mapper;


import cn.bdqn.his.prescription.entity.hos.PatienInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PatienInfoMapper {
    public List<PatienInfo> getAllPatienInfo(String level,String createDate,String content );/*查询所有患者二表包过会员表*/
    public int insertPatienInfo();/*添加患者，添加的时候判断是否是复诊或初诊*/
}
