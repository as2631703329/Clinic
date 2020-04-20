package cn.bdqn.his.prescription.service;

import cn.bdqn.his.prescription.entity.hos.PreTemplate;

import java.util.List;

public interface PreTemplateService {
    public List<PreTemplate> getAllPreTemplatesMenWestern();/*查询西药摸板及摸板下的详情*/
    public List<PreTemplate> getAllPreTemplatesMenEast();/*查询西药摸板及摸板下的详情*/
}
