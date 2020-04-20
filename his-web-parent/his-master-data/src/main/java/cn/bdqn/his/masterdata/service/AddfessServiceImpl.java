package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Addfess;
import cn.bdqn.his.masterdata.mapper.AddfessMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AddfessServiceImpl implements AddfessService{
    @Resource
    AddfessMapper addfessMapper;

    @Override
    public List<Addfess> addfessList(String type, String name) {
        return addfessMapper.addfessList(type,name);
    }
}
