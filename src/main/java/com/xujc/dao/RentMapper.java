package com.xujc.dao;

import com.xujc.bean.Rent;
import com.xujc.bean.RentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RentMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    long countByExample(RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int deleteByExample(RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int insert(Rent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int insertSelective(Rent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    List<Rent> selectByExample(RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    Rent selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") Rent record, @Param("example") RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByExample(@Param("record") Rent record, @Param("example") RentExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByPrimaryKeySelective(Rent record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table order_rent
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByPrimaryKey(Rent record);
}