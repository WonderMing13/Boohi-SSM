package com.xujc.bean;

import java.util.Date;

public class Book {
    public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(Integer id, String bookid, String bookname, String bookeditor, String bookpress, String publicationdate,
			String bookisbn, String category, String imgPath) {
		super();
		this.id = id;
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookeditor = bookeditor;
		this.bookpress = bookpress;
		this.publicationdate = publicationdate;
		this.bookisbn = bookisbn;
		this.category = category;
		this.imgPath = imgPath;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.bookId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String bookid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.bookName
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String bookname;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.bookEditor
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String bookeditor;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.bookPress
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String bookpress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.publicationDate
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String publicationdate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.bookISBN
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String bookisbn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.category
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String category;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.img_path
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String imgPath;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date inserttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column info_book.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.id
     *
     * @return the value of info_book.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.id
     *
     * @param id the value for info_book.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.bookId
     *
     * @return the value of info_book.bookId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBookid() {
        return bookid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.bookId
     *
     * @param bookid the value for info_book.bookId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBookid(String bookid) {
        this.bookid = bookid == null ? null : bookid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.bookName
     *
     * @return the value of info_book.bookName
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBookname() {
        return bookname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.bookName
     *
     * @param bookname the value for info_book.bookName
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.bookEditor
     *
     * @return the value of info_book.bookEditor
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBookeditor() {
        return bookeditor;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.bookEditor
     *
     * @param bookeditor the value for info_book.bookEditor
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBookeditor(String bookeditor) {
        this.bookeditor = bookeditor == null ? null : bookeditor.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.bookPress
     *
     * @return the value of info_book.bookPress
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBookpress() {
        return bookpress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.bookPress
     *
     * @param bookpress the value for info_book.bookPress
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBookpress(String bookpress) {
        this.bookpress = bookpress == null ? null : bookpress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.publicationDate
     *
     * @return the value of info_book.publicationDate
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getPublicationdate() {
        return publicationdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.publicationDate
     *
     * @param publicationdate the value for info_book.publicationDate
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setPublicationdate(String publicationdate) {
        this.publicationdate = publicationdate == null ? null : publicationdate.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.bookISBN
     *
     * @return the value of info_book.bookISBN
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBookisbn() {
        return bookisbn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.bookISBN
     *
     * @param bookisbn the value for info_book.bookISBN
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBookisbn(String bookisbn) {
        this.bookisbn = bookisbn == null ? null : bookisbn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.category
     *
     * @return the value of info_book.category
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getCategory() {
        return category;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.category
     *
     * @param category the value for info_book.category
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setCategory(String category) {
        this.category = category == null ? null : category.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.img_path
     *
     * @return the value of info_book.img_path
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getImgPath() {
        return imgPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.img_path
     *
     * @param imgPath the value for info_book.img_path
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setImgPath(String imgPath) {
        this.imgPath = imgPath == null ? null : imgPath.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.insertTime
     *
     * @return the value of info_book.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.insertTime
     *
     * @param inserttime the value for info_book.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column info_book.updateTime
     *
     * @return the value of info_book.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column info_book.updateTime
     *
     * @param updatetime the value for info_book.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}