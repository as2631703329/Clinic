package cn.bdqn.his.medicine.service;

import cn.bdqn.his.medicine.entity.DrugCate;
import cn.bdqn.his.medicine.entity.PrescriType;
import cn.bdqn.his.medicine.mapper.DrugCateMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

public interface DrugCateService {
    //药品分类 根据处方类型id查询所有药品分类
    public List<DrugCate> getAllDrugCateByprescriTypeId(PrescriType prescriType);

}
