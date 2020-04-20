package cn.bdqn.his.prescription.service;

import cn.bdqn.his.prescription.entity.hos.PatienInfo;

import java.util.List;

public interface PatienInfoService {
    public List<PatienInfo> getAllPatienInfo(String level, String createDate, String content );/*查询所有患者二表包过会员表*/
    public int insertPatienInfo();/*添加患者，添加的时候判断是否是复诊或初诊*/
}
