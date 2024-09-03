package com.macro.mall.mapper;

import com.macro.mall.model.OmsCartItem;
import com.macro.mall.model.OmsCartItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OmsCartItemMapper {
    long countByExample(OmsCartItemExample example);

    int deleteByExample(OmsCartItemExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OmsCartItem record);

    int insertSelective(OmsCartItem record);

    List<OmsCartItem> selectByExample(OmsCartItemExample example);

    OmsCartItem selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    int updateByExample(@Param("record") OmsCartItem record, @Param("example") OmsCartItemExample example);

    int updateByPrimaryKeySelective(OmsCartItem record);

    /**
     * 获取指定会员的购物车列表
     *
     * @param memberId 会员id
     * @return 购物车列表
     */
    List<OmsCartItem> getCartListByMemberId(Long memberId);

    int updateByPrimaryKey(OmsCartItem record);
}