package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.DiagInfo;
import cn.bdqn.his.masterdata.mapper.DiaginfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DiagInfoServiceImpl implements DiagInfoService {

    @Resource
    DiaginfoMapper diaginfoMapper;

    @Override
    public List<DiagInfo> diagInfoList(String content) {
        return diaginfoMapper.diagInfoList(content);
    }
}
