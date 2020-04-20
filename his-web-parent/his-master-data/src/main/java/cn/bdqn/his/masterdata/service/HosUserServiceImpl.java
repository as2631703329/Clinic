package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.User;
import cn.bdqn.his.masterdata.mapper.HosUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class HosUserServiceImpl implements HosUserService {
    @Resource
    HosUserMapper hosUserMapper;

    @Override
    public List<User> userList(String type, String name) {
        return null;
    }
}
