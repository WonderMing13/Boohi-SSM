package com.xujc.bean;

import java.util.Date;

public class Paper {
    public Paper(Integer id, String bookid, Double bidprice, Integer onsalenum) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.bidprice = bidprice;
		this.onsalenum = onsalenum;

	}

	public Paper() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_paper.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Integer id;
    
    private Book book;
    
    public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_paper.bookId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String bookid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_paper.bidPrice
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Double bidprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_paper.onsaleNum
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Integer onsalenum;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_paper.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date inserttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column book_paper.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_paper.id
     *
     * @return the value of book_paper.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_paper.id
     *
     * @param id the value for book_paper.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_paper.bookId
     *
     * @return the value of book_paper.bookId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_paper.bookId
     *
     * @param bookid the value for book_paper.bookId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_paper.bidPrice
     *
     * @return the value of book_paper.bidPrice
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Double getBidprice() {
        return bidprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_paper.bidPrice
     *
     * @param bidprice the value for book_paper.bidPrice
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBidprice(Double bidprice) {
        this.bidprice = bidprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_paper.onsaleNum
     *
     * @return the value of book_paper.onsaleNum
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Integer getOnsalenum() {
        return onsalenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_paper.onsaleNum
     *
     * @param onsalenum the value for book_paper.onsaleNum
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setOnsalenum(Integer onsalenum) {
        this.onsalenum = onsalenum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_paper.insertTime
     *
     * @return the value of book_paper.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_paper.insertTime
     *
     * @param inserttime the value for book_paper.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column book_paper.updateTime
     *
     * @return the value of book_paper.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column book_paper.updateTime
     *
     * @param updatetime the value for book_paper.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}