package com.xujc.dao;

import com.xujc.bean.Electronic;
import com.xujc.bean.ElectronicExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ElectronicMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    long countByExample(ElectronicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int deleteByExample(ElectronicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int insert(Electronic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int insertSelective(Electronic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    List<Electronic> selectByExample(ElectronicExample example);
    
    List<Electronic> selectByPrimaryKeywithbook(ElectronicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    Electronic selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") Electronic record, @Param("example") ElectronicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByExample(@Param("record") Electronic record, @Param("example") ElectronicExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByPrimaryKeySelective(Electronic record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByPrimaryKey(Electronic record);
}