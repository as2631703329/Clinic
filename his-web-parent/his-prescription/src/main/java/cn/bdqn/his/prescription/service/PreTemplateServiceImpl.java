package cn.bdqn.his.prescription.service;

import cn.bdqn.his.prescription.entity.hos.PreTemplate;
import cn.bdqn.his.prescription.mapper.PreTemplateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PreTemplateServiceImpl implements  PreTemplateService{
    @Resource
    PreTemplateMapper preTemplateMapper;

    @Override
    public List<PreTemplate> getAllPreTemplatesMenWestern() {
        return preTemplateMapper.getAllPreTemplatesMenWestern();
    }

    @Override
    public List<PreTemplate> getAllPreTemplatesMenEast() {
        return preTemplateMapper.getAllPreTemplatesMenEast();
    }
}
