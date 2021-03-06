package com.xujc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public OrderExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderId is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderId is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(String value) {
            addCriterion("orderId =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(String value) {
            addCriterion("orderId <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(String value) {
            addCriterion("orderId >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(String value) {
            addCriterion("orderId >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(String value) {
            addCriterion("orderId <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(String value) {
            addCriterion("orderId <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLike(String value) {
            addCriterion("orderId like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotLike(String value) {
            addCriterion("orderId not like", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<String> values) {
            addCriterion("orderId in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<String> values) {
            addCriterion("orderId not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(String value1, String value2) {
            addCriterion("orderId between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(String value1, String value2) {
            addCriterion("orderId not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andBookidIsNull() {
            addCriterion("bookId is null");
            return (Criteria) this;
        }

        public Criteria andBookidIsNotNull() {
            addCriterion("bookId is not null");
            return (Criteria) this;
        }

        public Criteria andBookidEqualTo(String value) {
            addCriterion("bookId =", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotEqualTo(String value) {
            addCriterion("bookId <>", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThan(String value) {
            addCriterion("bookId >", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidGreaterThanOrEqualTo(String value) {
            addCriterion("bookId >=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThan(String value) {
            addCriterion("bookId <", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLessThanOrEqualTo(String value) {
            addCriterion("bookId <=", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidLike(String value) {
            addCriterion("bookId like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotLike(String value) {
            addCriterion("bookId not like", value, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidIn(List<String> values) {
            addCriterion("bookId in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotIn(List<String> values) {
            addCriterion("bookId not in", values, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidBetween(String value1, String value2) {
            addCriterion("bookId between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andBookidNotBetween(String value1, String value2) {
            addCriterion("bookId not between", value1, value2, "bookid");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNull() {
            addCriterion("sellerId is null");
            return (Criteria) this;
        }

        public Criteria andSelleridIsNotNull() {
            addCriterion("sellerId is not null");
            return (Criteria) this;
        }

        public Criteria andSelleridEqualTo(String value) {
            addCriterion("sellerId =", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotEqualTo(String value) {
            addCriterion("sellerId <>", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThan(String value) {
            addCriterion("sellerId >", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridGreaterThanOrEqualTo(String value) {
            addCriterion("sellerId >=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThan(String value) {
            addCriterion("sellerId <", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLessThanOrEqualTo(String value) {
            addCriterion("sellerId <=", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridLike(String value) {
            addCriterion("sellerId like", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotLike(String value) {
            addCriterion("sellerId not like", value, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridIn(List<String> values) {
            addCriterion("sellerId in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotIn(List<String> values) {
            addCriterion("sellerId not in", values, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridBetween(String value1, String value2) {
            addCriterion("sellerId between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andSelleridNotBetween(String value1, String value2) {
            addCriterion("sellerId not between", value1, value2, "sellerid");
            return (Criteria) this;
        }

        public Criteria andOrdertitleIsNull() {
            addCriterion("orderTitle is null");
            return (Criteria) this;
        }

        public Criteria andOrdertitleIsNotNull() {
            addCriterion("orderTitle is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertitleEqualTo(String value) {
            addCriterion("orderTitle =", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotEqualTo(String value) {
            addCriterion("orderTitle <>", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleGreaterThan(String value) {
            addCriterion("orderTitle >", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleGreaterThanOrEqualTo(String value) {
            addCriterion("orderTitle >=", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleLessThan(String value) {
            addCriterion("orderTitle <", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleLessThanOrEqualTo(String value) {
            addCriterion("orderTitle <=", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleLike(String value) {
            addCriterion("orderTitle like", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotLike(String value) {
            addCriterion("orderTitle not like", value, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleIn(List<String> values) {
            addCriterion("orderTitle in", values, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotIn(List<String> values) {
            addCriterion("orderTitle not in", values, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleBetween(String value1, String value2) {
            addCriterion("orderTitle between", value1, value2, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrdertitleNotBetween(String value1, String value2) {
            addCriterion("orderTitle not between", value1, value2, "ordertitle");
            return (Criteria) this;
        }

        public Criteria andOrderimageIsNull() {
            addCriterion("orderImage is null");
            return (Criteria) this;
        }

        public Criteria andOrderimageIsNotNull() {
            addCriterion("orderImage is not null");
            return (Criteria) this;
        }

        public Criteria andOrderimageEqualTo(String value) {
            addCriterion("orderImage =", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageNotEqualTo(String value) {
            addCriterion("orderImage <>", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageGreaterThan(String value) {
            addCriterion("orderImage >", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageGreaterThanOrEqualTo(String value) {
            addCriterion("orderImage >=", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageLessThan(String value) {
            addCriterion("orderImage <", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageLessThanOrEqualTo(String value) {
            addCriterion("orderImage <=", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageLike(String value) {
            addCriterion("orderImage like", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageNotLike(String value) {
            addCriterion("orderImage not like", value, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageIn(List<String> values) {
            addCriterion("orderImage in", values, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageNotIn(List<String> values) {
            addCriterion("orderImage not in", values, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageBetween(String value1, String value2) {
            addCriterion("orderImage between", value1, value2, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderimageNotBetween(String value1, String value2) {
            addCriterion("orderImage not between", value1, value2, "orderimage");
            return (Criteria) this;
        }

        public Criteria andOrderconditionIsNull() {
            addCriterion("orderCondition is null");
            return (Criteria) this;
        }

        public Criteria andOrderconditionIsNotNull() {
            addCriterion("orderCondition is not null");
            return (Criteria) this;
        }

        public Criteria andOrderconditionEqualTo(String value) {
            addCriterion("orderCondition =", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionNotEqualTo(String value) {
            addCriterion("orderCondition <>", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionGreaterThan(String value) {
            addCriterion("orderCondition >", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionGreaterThanOrEqualTo(String value) {
            addCriterion("orderCondition >=", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionLessThan(String value) {
            addCriterion("orderCondition <", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionLessThanOrEqualTo(String value) {
            addCriterion("orderCondition <=", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionLike(String value) {
            addCriterion("orderCondition like", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionNotLike(String value) {
            addCriterion("orderCondition not like", value, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionIn(List<String> values) {
            addCriterion("orderCondition in", values, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionNotIn(List<String> values) {
            addCriterion("orderCondition not in", values, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionBetween(String value1, String value2) {
            addCriterion("orderCondition between", value1, value2, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andOrderconditionNotBetween(String value1, String value2) {
            addCriterion("orderCondition not between", value1, value2, "ordercondition");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNull() {
            addCriterion("startTime is null");
            return (Criteria) this;
        }

        public Criteria andStarttimeIsNotNull() {
            addCriterion("startTime is not null");
            return (Criteria) this;
        }

        public Criteria andStarttimeEqualTo(Date value) {
            addCriterion("startTime =", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotEqualTo(Date value) {
            addCriterion("startTime <>", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThan(Date value) {
            addCriterion("startTime >", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("startTime >=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThan(Date value) {
            addCriterion("startTime <", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeLessThanOrEqualTo(Date value) {
            addCriterion("startTime <=", value, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeIn(List<Date> values) {
            addCriterion("startTime in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotIn(List<Date> values) {
            addCriterion("startTime not in", values, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeBetween(Date value1, Date value2) {
            addCriterion("startTime between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andStarttimeNotBetween(Date value1, Date value2) {
            addCriterion("startTime not between", value1, value2, "starttime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNull() {
            addCriterion("checkTime is null");
            return (Criteria) this;
        }

        public Criteria andChecktimeIsNotNull() {
            addCriterion("checkTime is not null");
            return (Criteria) this;
        }

        public Criteria andChecktimeEqualTo(Date value) {
            addCriterion("checkTime =", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotEqualTo(Date value) {
            addCriterion("checkTime <>", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThan(Date value) {
            addCriterion("checkTime >", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeGreaterThanOrEqualTo(Date value) {
            addCriterion("checkTime >=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThan(Date value) {
            addCriterion("checkTime <", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeLessThanOrEqualTo(Date value) {
            addCriterion("checkTime <=", value, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeIn(List<Date> values) {
            addCriterion("checkTime in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotIn(List<Date> values) {
            addCriterion("checkTime not in", values, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeBetween(Date value1, Date value2) {
            addCriterion("checkTime between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andChecktimeNotBetween(Date value1, Date value2) {
            addCriterion("checkTime not between", value1, value2, "checktime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNull() {
            addCriterion("finishTime is null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIsNotNull() {
            addCriterion("finishTime is not null");
            return (Criteria) this;
        }

        public Criteria andFinishtimeEqualTo(Date value) {
            addCriterion("finishTime =", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotEqualTo(Date value) {
            addCriterion("finishTime <>", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThan(Date value) {
            addCriterion("finishTime >", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("finishTime >=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThan(Date value) {
            addCriterion("finishTime <", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeLessThanOrEqualTo(Date value) {
            addCriterion("finishTime <=", value, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeIn(List<Date> values) {
            addCriterion("finishTime in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotIn(List<Date> values) {
            addCriterion("finishTime not in", values, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeBetween(Date value1, Date value2) {
            addCriterion("finishTime between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andFinishtimeNotBetween(Date value1, Date value2) {
            addCriterion("finishTime not between", value1, value2, "finishtime");
            return (Criteria) this;
        }

        public Criteria andOthersIsNull() {
            addCriterion("others is null");
            return (Criteria) this;
        }

        public Criteria andOthersIsNotNull() {
            addCriterion("others is not null");
            return (Criteria) this;
        }

        public Criteria andOthersEqualTo(String value) {
            addCriterion("others =", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotEqualTo(String value) {
            addCriterion("others <>", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThan(String value) {
            addCriterion("others >", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersGreaterThanOrEqualTo(String value) {
            addCriterion("others >=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThan(String value) {
            addCriterion("others <", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLessThanOrEqualTo(String value) {
            addCriterion("others <=", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersLike(String value) {
            addCriterion("others like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotLike(String value) {
            addCriterion("others not like", value, "others");
            return (Criteria) this;
        }

        public Criteria andOthersIn(List<String> values) {
            addCriterion("others in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotIn(List<String> values) {
            addCriterion("others not in", values, "others");
            return (Criteria) this;
        }

        public Criteria andOthersBetween(String value1, String value2) {
            addCriterion("others between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andOthersNotBetween(String value1, String value2) {
            addCriterion("others not between", value1, value2, "others");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNull() {
            addCriterion("insertTime is null");
            return (Criteria) this;
        }

        public Criteria andInserttimeIsNotNull() {
            addCriterion("insertTime is not null");
            return (Criteria) this;
        }

        public Criteria andInserttimeEqualTo(Date value) {
            addCriterion("insertTime =", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotEqualTo(Date value) {
            addCriterion("insertTime <>", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThan(Date value) {
            addCriterion("insertTime >", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeGreaterThanOrEqualTo(Date value) {
            addCriterion("insertTime >=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThan(Date value) {
            addCriterion("insertTime <", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeLessThanOrEqualTo(Date value) {
            addCriterion("insertTime <=", value, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeIn(List<Date> values) {
            addCriterion("insertTime in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotIn(List<Date> values) {
            addCriterion("insertTime not in", values, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeBetween(Date value1, Date value2) {
            addCriterion("insertTime between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andInserttimeNotBetween(Date value1, Date value2) {
            addCriterion("insertTime not between", value1, value2, "inserttime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updateTime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Date value) {
            addCriterion("updateTime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Date value) {
            addCriterion("updateTime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Date value) {
            addCriterion("updateTime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("updateTime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Date value) {
            addCriterion("updateTime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("updateTime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Date> values) {
            addCriterion("updateTime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Date> values) {
            addCriterion("updateTime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("updateTime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("updateTime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table info_order
     *
     * @mbg.generated do_not_delete_during_merge Sat Dec 30 12:03:56 CST 2017
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table info_order
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}