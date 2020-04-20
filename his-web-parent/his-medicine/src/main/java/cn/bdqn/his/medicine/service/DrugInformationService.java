package cn.bdqn.his.medicine.service;
import cn.bdqn.his.medicine.entity.DrugInformation;
import cn.bdqn.his.medicine.entity.PrescriType;
import cn.bdqn.his.medicine.mapper.DrugInformationMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;


public interface DrugInformationService {
    public List<DrugInformation> getDrugInformationByPrescriTypeId(PrescriType prescriType, String commonName, String pinyin, Integer drugId);
}
