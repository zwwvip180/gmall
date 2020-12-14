package com.atguigu.gmall.pms.mapper;

import com.atguigu.gmall.pms.entity.CommentEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价
 * 
 * @author zww
 * @email zww@atguigu.com
 * @date 2020-12-14 19:10:08
 */
@Mapper
public interface CommentMapper extends BaseMapper<CommentEntity> {
	
}
