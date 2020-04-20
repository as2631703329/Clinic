package cn.bdqn.his.medicine.mapper;

import cn.bdqn.his.medicine.entity.DrugInformation;
import cn.bdqn.his.medicine.entity.PrescriType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugInformationMapper {
    //通过处方id查询每个药品分类下面的药品
    public List<DrugInformation> getDrugInformationByPrescriTypeId(@Param("prescriType") PrescriType prescriType, @Param("commonName") String commonName, @Param("pinyin") String pinyin, @Param("drugId") Integer drugId);
}
