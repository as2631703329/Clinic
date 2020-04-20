package cn.bdqn.his.masterdata.service;

import cn.bdqn.his.masterdata.entity.Advice;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;


public interface AdviceService {
    List<Advice> adviceList(@Param("content") String content);
    int insertAdvice(String content,String createDate,Integer create_id);
}
