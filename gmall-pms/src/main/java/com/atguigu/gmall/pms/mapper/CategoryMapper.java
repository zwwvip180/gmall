package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author zww
 * @email zww@atguigu.com
 * @date 2020-12-14 19:10:08
 */
@Mapper
public interface CategoryMapper extends BaseMapper<CategoryEntity> {
	
}
