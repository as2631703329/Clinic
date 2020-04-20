package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Advice;

import cn.bdqn.his.masterdata.mapper.AdviceMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AdviceServiceImpl implements AdviceService {

    @Resource
    AdviceMapper adviceMapper;

    @Override
    public List<Advice> adviceList(String content) {
        return adviceMapper.adviceList(content);
    }

    @Override
    public int insertAdvice(String content, String createDate, Integer create_id) {
        return adviceMapper.insertAdvice(content,createDate,create_id);
    }


}
