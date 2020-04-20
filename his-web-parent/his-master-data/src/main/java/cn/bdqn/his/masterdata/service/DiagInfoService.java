package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.DiagInfo;

import java.util.List;

public interface DiagInfoService {
    public List<DiagInfo> diagInfoList(String content);
}
