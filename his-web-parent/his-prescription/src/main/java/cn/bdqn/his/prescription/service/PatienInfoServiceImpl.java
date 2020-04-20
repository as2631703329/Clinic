package cn.bdqn.his.prescription.service;

import cn.bdqn.his.prescription.entity.hos.PatienInfo;
import cn.bdqn.his.prescription.mapper.PatienInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class PatienInfoServiceImpl implements PatienInfoService{
    @Resource
    PatienInfoMapper patienInfoMapper;

    @Override
    public List<PatienInfo> getAllPatienInfo(String level, String createDate, String content) {
        return patienInfoMapper.getAllPatienInfo(level,createDate, content);
    }

    @Override
    public int insertPatienInfo() {
        return patienInfoMapper.insertPatienInfo();
    }
}
