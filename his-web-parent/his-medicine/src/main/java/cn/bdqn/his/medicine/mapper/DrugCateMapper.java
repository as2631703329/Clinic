package cn.bdqn.his.medicine.mapper;

import cn.bdqn.his.medicine.entity.DrugCate;
import cn.bdqn.his.medicine.entity.PrescriType;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DrugCateMapper {

    public List<DrugCate> getAllDrugCateByprescriTypeId(@Param("prescriType") PrescriType prescriType);//查询所有药品分类 根据处方类型id查询所有药品分类

}
