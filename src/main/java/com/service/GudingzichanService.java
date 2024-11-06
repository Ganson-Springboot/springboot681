package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.GudingzichanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.GudingzichanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.GudingzichanView;


/**
 * 固定资产
 *
 * @author 
 * @email 
 * @date 2022-05-27 17:12:06
 */
public interface GudingzichanService extends IService<GudingzichanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<GudingzichanVO> selectListVO(Wrapper<GudingzichanEntity> wrapper);
   	
   	GudingzichanVO selectVO(@Param("ew") Wrapper<GudingzichanEntity> wrapper);
   	
   	List<GudingzichanView> selectListView(Wrapper<GudingzichanEntity> wrapper);
   	
   	GudingzichanView selectView(@Param("ew") Wrapper<GudingzichanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<GudingzichanEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<GudingzichanEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<GudingzichanEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<GudingzichanEntity> wrapper);
}

