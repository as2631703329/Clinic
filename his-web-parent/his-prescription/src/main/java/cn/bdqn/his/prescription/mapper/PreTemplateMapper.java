package cn.jinzhu.cli.prescription.mapper.hos;

import cn.jinzhu.cli.prescription.entity.hos.PatienInfo;
import cn.jinzhu.cli.prescription.entity.hos.PreTemplate;

import java.util.List;

public interface PreTemplateMapper {


    public List<PreTemplate> getAllPreTemplatesMenWestern();/*查询西药摸板及摸板下的详情*/
    public List<PreTemplate> getAllPreTemplatesMenEast();/*查询西药摸板及摸板下的详情*/
}
