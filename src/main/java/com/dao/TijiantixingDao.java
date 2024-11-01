package com.dao;

import com.entity.TijiantixingEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.TijiantixingView;

/**
 * 体检提醒 Dao 接口
 *
 * @author 
 */
public interface TijiantixingDao extends BaseMapper<TijiantixingEntity> {

   List<TijiantixingView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
