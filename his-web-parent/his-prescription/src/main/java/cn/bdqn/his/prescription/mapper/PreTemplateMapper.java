package cn.bdqn.his.prescription.mapper;


import cn.bdqn.his.prescription.entity.hos.PreTemplate;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PreTemplateMapper {
    public List<PreTemplate> getAllPreTemplatesMenWestern();/*查询西药摸板及摸板下的详情*/
    public List<PreTemplate> getAllPreTemplatesMenEast();/*查询西药摸板及摸板下的详情*/
}
