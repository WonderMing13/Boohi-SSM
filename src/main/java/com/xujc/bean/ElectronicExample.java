package com.xujc.bean;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ElectronicExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public ElectronicExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
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
     * This method corresponds to the database table book_electronic
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
     * This method corresponds to the database table book_electronic
     *
     * @mbg.generated Sat Dec 30 12:03:56 CST 2017
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table book_electronic
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
     * This class corresponds to the database table book_electronic
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

        public Criteria andDllimitsIsNull() {
            addCriterion("dlLimits is null");
            return (Criteria) this;
        }

        public Criteria andDllimitsIsNotNull() {
            addCriterion("dlLimits is not null");
            return (Criteria) this;
        }

        public Criteria andDllimitsEqualTo(String value) {
            addCriterion("dlLimits =", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsNotEqualTo(String value) {
            addCriterion("dlLimits <>", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsGreaterThan(String value) {
            addCriterion("dlLimits >", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsGreaterThanOrEqualTo(String value) {
            addCriterion("dlLimits >=", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsLessThan(String value) {
            addCriterion("dlLimits <", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsLessThanOrEqualTo(String value) {
            addCriterion("dlLimits <=", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsLike(String value) {
            addCriterion("dlLimits like", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsNotLike(String value) {
            addCriterion("dlLimits not like", value, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsIn(List<String> values) {
            addCriterion("dlLimits in", values, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsNotIn(List<String> values) {
            addCriterion("dlLimits not in", values, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsBetween(String value1, String value2) {
            addCriterion("dlLimits between", value1, value2, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDllimitsNotBetween(String value1, String value2) {
            addCriterion("dlLimits not between", value1, value2, "dllimits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsIsNull() {
            addCriterion("dlCredits is null");
            return (Criteria) this;
        }

        public Criteria andDlcreditsIsNotNull() {
            addCriterion("dlCredits is not null");
            return (Criteria) this;
        }

        public Criteria andDlcreditsEqualTo(Integer value) {
            addCriterion("dlCredits =", value, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsNotEqualTo(Integer value) {
            addCriterion("dlCredits <>", value, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsGreaterThan(Integer value) {
            addCriterion("dlCredits >", value, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsGreaterThanOrEqualTo(Integer value) {
            addCriterion("dlCredits >=", value, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsLessThan(Integer value) {
            addCriterion("dlCredits <", value, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsLessThanOrEqualTo(Integer value) {
            addCriterion("dlCredits <=", value, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsIn(List<Integer> values) {
            addCriterion("dlCredits in", values, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsNotIn(List<Integer> values) {
            addCriterion("dlCredits not in", values, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsBetween(Integer value1, Integer value2) {
            addCriterion("dlCredits between", value1, value2, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlcreditsNotBetween(Integer value1, Integer value2) {
            addCriterion("dlCredits not between", value1, value2, "dlcredits");
            return (Criteria) this;
        }

        public Criteria andDlnumIsNull() {
            addCriterion("dlNum is null");
            return (Criteria) this;
        }

        public Criteria andDlnumIsNotNull() {
            addCriterion("dlNum is not null");
            return (Criteria) this;
        }

        public Criteria andDlnumEqualTo(Integer value) {
            addCriterion("dlNum =", value, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumNotEqualTo(Integer value) {
            addCriterion("dlNum <>", value, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumGreaterThan(Integer value) {
            addCriterion("dlNum >", value, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("dlNum >=", value, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumLessThan(Integer value) {
            addCriterion("dlNum <", value, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumLessThanOrEqualTo(Integer value) {
            addCriterion("dlNum <=", value, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumIn(List<Integer> values) {
            addCriterion("dlNum in", values, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumNotIn(List<Integer> values) {
            addCriterion("dlNum not in", values, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumBetween(Integer value1, Integer value2) {
            addCriterion("dlNum between", value1, value2, "dlnum");
            return (Criteria) this;
        }

        public Criteria andDlnumNotBetween(Integer value1, Integer value2) {
            addCriterion("dlNum not between", value1, value2, "dlnum");
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
     * This class corresponds to the database table book_electronic
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
     * This class corresponds to the database table book_electronic
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