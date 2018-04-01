package com.xujc.dao;

import com.xujc.bean.Book;
import com.xujc.bean.BookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BookMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    long countByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int deleteByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int deleteByPrimaryKey(Integer id);
     
    int deleteBathById(List<String> list);
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int insert(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int insertSelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    List<Book> selectByExample(BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    Book selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByExampleSelective(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByExample(@Param("record") Book record, @Param("example") BookExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByPrimaryKeySelective(Book record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_book
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    int updateByPrimaryKey(Book record);
}