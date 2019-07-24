package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CommodityExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CommodityExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

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

        public Criteria andCNumIsNull() {
            addCriterion("C_Num is null");
            return (Criteria) this;
        }

        public Criteria andCNumIsNotNull() {
            addCriterion("C_Num is not null");
            return (Criteria) this;
        }

        public Criteria andCNumEqualTo(String value) {
            addCriterion("C_Num =", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotEqualTo(String value) {
            addCriterion("C_Num <>", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThan(String value) {
            addCriterion("C_Num >", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumGreaterThanOrEqualTo(String value) {
            addCriterion("C_Num >=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThan(String value) {
            addCriterion("C_Num <", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLessThanOrEqualTo(String value) {
            addCriterion("C_Num <=", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumLike(String value) {
            addCriterion("C_Num like", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotLike(String value) {
            addCriterion("C_Num not like", value, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumIn(List<String> values) {
            addCriterion("C_Num in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotIn(List<String> values) {
            addCriterion("C_Num not in", values, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumBetween(String value1, String value2) {
            addCriterion("C_Num between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andCNumNotBetween(String value1, String value2) {
            addCriterion("C_Num not between", value1, value2, "cNum");
            return (Criteria) this;
        }

        public Criteria andSNumIsNull() {
            addCriterion("S_Num is null");
            return (Criteria) this;
        }

        public Criteria andSNumIsNotNull() {
            addCriterion("S_Num is not null");
            return (Criteria) this;
        }

        public Criteria andSNumEqualTo(String value) {
            addCriterion("S_Num =", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotEqualTo(String value) {
            addCriterion("S_Num <>", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumGreaterThan(String value) {
            addCriterion("S_Num >", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumGreaterThanOrEqualTo(String value) {
            addCriterion("S_Num >=", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLessThan(String value) {
            addCriterion("S_Num <", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLessThanOrEqualTo(String value) {
            addCriterion("S_Num <=", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumLike(String value) {
            addCriterion("S_Num like", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotLike(String value) {
            addCriterion("S_Num not like", value, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumIn(List<String> values) {
            addCriterion("S_Num in", values, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotIn(List<String> values) {
            addCriterion("S_Num not in", values, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumBetween(String value1, String value2) {
            addCriterion("S_Num between", value1, value2, "sNum");
            return (Criteria) this;
        }

        public Criteria andSNumNotBetween(String value1, String value2) {
            addCriterion("S_Num not between", value1, value2, "sNum");
            return (Criteria) this;
        }

        public Criteria andCNameIsNull() {
            addCriterion("C_Name is null");
            return (Criteria) this;
        }

        public Criteria andCNameIsNotNull() {
            addCriterion("C_Name is not null");
            return (Criteria) this;
        }

        public Criteria andCNameEqualTo(String value) {
            addCriterion("C_Name =", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotEqualTo(String value) {
            addCriterion("C_Name <>", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThan(String value) {
            addCriterion("C_Name >", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameGreaterThanOrEqualTo(String value) {
            addCriterion("C_Name >=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThan(String value) {
            addCriterion("C_Name <", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLessThanOrEqualTo(String value) {
            addCriterion("C_Name <=", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameLike(String value) {
            addCriterion("C_Name like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotLike(String value) {
            addCriterion("C_Name not like", value, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameIn(List<String> values) {
            addCriterion("C_Name in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotIn(List<String> values) {
            addCriterion("C_Name not in", values, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameBetween(String value1, String value2) {
            addCriterion("C_Name between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCNameNotBetween(String value1, String value2) {
            addCriterion("C_Name not between", value1, value2, "cName");
            return (Criteria) this;
        }

        public Criteria andCEndtimeIsNull() {
            addCriterion("C_EndTime is null");
            return (Criteria) this;
        }

        public Criteria andCEndtimeIsNotNull() {
            addCriterion("C_EndTime is not null");
            return (Criteria) this;
        }

        public Criteria andCEndtimeEqualTo(Date value) {
            addCriterion("C_EndTime =", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeNotEqualTo(Date value) {
            addCriterion("C_EndTime <>", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeGreaterThan(Date value) {
            addCriterion("C_EndTime >", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("C_EndTime >=", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeLessThan(Date value) {
            addCriterion("C_EndTime <", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeLessThanOrEqualTo(Date value) {
            addCriterion("C_EndTime <=", value, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeIn(List<Date> values) {
            addCriterion("C_EndTime in", values, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeNotIn(List<Date> values) {
            addCriterion("C_EndTime not in", values, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeBetween(Date value1, Date value2) {
            addCriterion("C_EndTime between", value1, value2, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCEndtimeNotBetween(Date value1, Date value2) {
            addCriterion("C_EndTime not between", value1, value2, "cEndtime");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyIsNull() {
            addCriterion("C_MinMoney is null");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyIsNotNull() {
            addCriterion("C_MinMoney is not null");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyEqualTo(Integer value) {
            addCriterion("C_MinMoney =", value, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyNotEqualTo(Integer value) {
            addCriterion("C_MinMoney <>", value, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyGreaterThan(Integer value) {
            addCriterion("C_MinMoney >", value, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_MinMoney >=", value, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyLessThan(Integer value) {
            addCriterion("C_MinMoney <", value, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyLessThanOrEqualTo(Integer value) {
            addCriterion("C_MinMoney <=", value, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyIn(List<Integer> values) {
            addCriterion("C_MinMoney in", values, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyNotIn(List<Integer> values) {
            addCriterion("C_MinMoney not in", values, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyBetween(Integer value1, Integer value2) {
            addCriterion("C_MinMoney between", value1, value2, "cMinmoney");
            return (Criteria) this;
        }

        public Criteria andCMinmoneyNotBetween(Integer value1, Integer value2) {
            addCriterion("C_MinMoney not between", value1, value2, "cMinmoney");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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