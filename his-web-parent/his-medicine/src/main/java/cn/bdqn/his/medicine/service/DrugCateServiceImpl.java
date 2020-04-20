package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.DrugCate;
import cn.bdqn.his.medicine.entity.PrescriType;
import cn.bdqn.his.medicine.mapper.DrugCateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DrugCateServiceImpl implements DrugCateService{
    @Resource
    DrugCateMapper drugCateMapper; //药品分类mapper


    @Override
    public List<DrugCate> getAllDrugCateByprescriTypeId(PrescriType prescriType) {
        return drugCateMapper.getAllDrugCateByprescriTypeId(prescriType);
    }
}
