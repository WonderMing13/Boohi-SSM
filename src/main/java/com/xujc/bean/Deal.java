package com.xujc.bean;

import java.util.Date;

public class Deal {
	
    public Deal(Integer id, String orderid, String buyerid, String buyeraddress, String dealway,
			String dealprice, String number, Byte ispaid,String audit, Date paidtime) {
		super();
		this.id = id;
		this.orderid = orderid;
		this.buyerid = buyerid;
		this.buyeraddress = buyeraddress;
		this.dealway = dealway;
		this.dealprice = dealprice;
		this.number = number;
		this.ispaid = ispaid;
		this.audit = audit;
		this.paidtime = paidtime;
	}

	public Deal() {
		super();
		
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Integer id;
    
    private Order order;

  

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.orderId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String orderid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.buyerId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String buyerid;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.buyerAddress
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String buyeraddress;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.dealWay
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String dealway;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.dealPrice
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String dealprice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.number
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private String number;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.isPaid
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Byte ispaid;
    
    private String audit;

   

	public String getAudit() {
		return audit;
	}

	public void setAudit(String audit) {
		this.audit = audit;
	}

	/**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.paidTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date paidtime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date inserttime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column order_deal.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    private Date updatetime;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.id
     *
     * @return the value of order_deal.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    
    public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.id
     *
     * @param id the value for order_deal.id
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.orderId
     *
     * @return the value of order_deal.orderId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getOrderid() {
        return orderid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.orderId
     *
     * @param orderid the value for order_deal.orderId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setOrderid(String orderid) {
        this.orderid = orderid == null ? null : orderid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.buyerId
     *
     * @return the value of order_deal.buyerId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBuyerid() {
        return buyerid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.buyerId
     *
     * @param buyerid the value for order_deal.buyerId
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid == null ? null : buyerid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.buyerAddress
     *
     * @return the value of order_deal.buyerAddress
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getBuyeraddress() {
        return buyeraddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.buyerAddress
     *
     * @param buyeraddress the value for order_deal.buyerAddress
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setBuyeraddress(String buyeraddress) {
        this.buyeraddress = buyeraddress == null ? null : buyeraddress.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.dealWay
     *
     * @return the value of order_deal.dealWay
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getDealway() {
        return dealway;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.dealWay
     *
     * @param dealway the value for order_deal.dealWay
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setDealway(String dealway) {
        this.dealway = dealway == null ? null : dealway.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.dealPrice
     *
     * @return the value of order_deal.dealPrice
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getDealprice() {
        return dealprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.dealPrice
     *
     * @param dealprice the value for order_deal.dealPrice
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setDealprice(String dealprice) {
        this.dealprice = dealprice == null ? null : dealprice.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.number
     *
     * @return the value of order_deal.number
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getNumber() {
        return number;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.number
     *
     * @param number the value for order_deal.number
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.isPaid
     *
     * @return the value of order_deal.isPaid
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Byte getIspaid() {
        return ispaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.isPaid
     *
     * @param ispaid the value for order_deal.isPaid
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setIspaid(Byte ispaid) {
        this.ispaid = ispaid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.paidTime
     *
     * @return the value of order_deal.paidTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getPaidtime() {
        return paidtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.paidTime
     *
     * @param paidtime the value for order_deal.paidTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setPaidtime(Date paidtime) {
        this.paidtime = paidtime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.insertTime
     *
     * @return the value of order_deal.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getInserttime() {
        return inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.insertTime
     *
     * @param inserttime the value for order_deal.insertTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setInserttime(Date inserttime) {
        this.inserttime = inserttime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column order_deal.updateTime
     *
     * @return the value of order_deal.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Date getUpdatetime() {
        return updatetime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column order_deal.updateTime
     *
     * @param updatetime the value for order_deal.updateTime
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}