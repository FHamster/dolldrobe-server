package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SketchExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SketchExample() {
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

        public Criteria andUAccountnumberIsNull() {
            addCriterion("U_AccountNumber is null");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberIsNotNull() {
            addCriterion("U_AccountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberEqualTo(String value) {
            addCriterion("U_AccountNumber =", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberNotEqualTo(String value) {
            addCriterion("U_AccountNumber <>", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberGreaterThan(String value) {
            addCriterion("U_AccountNumber >", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("U_AccountNumber >=", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberLessThan(String value) {
            addCriterion("U_AccountNumber <", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberLessThanOrEqualTo(String value) {
            addCriterion("U_AccountNumber <=", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberLike(String value) {
            addCriterion("U_AccountNumber like", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberNotLike(String value) {
            addCriterion("U_AccountNumber not like", value, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberIn(List<String> values) {
            addCriterion("U_AccountNumber in", values, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberNotIn(List<String> values) {
            addCriterion("U_AccountNumber not in", values, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberBetween(String value1, String value2) {
            addCriterion("U_AccountNumber between", value1, value2, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUAccountnumberNotBetween(String value1, String value2) {
            addCriterion("U_AccountNumber not between", value1, value2, "uAccountnumber");
            return (Criteria) this;
        }

        public Criteria andSNameIsNull() {
            addCriterion("S_Name is null");
            return (Criteria) this;
        }

        public Criteria andSNameIsNotNull() {
            addCriterion("S_Name is not null");
            return (Criteria) this;
        }

        public Criteria andSNameEqualTo(String value) {
            addCriterion("S_Name =", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotEqualTo(String value) {
            addCriterion("S_Name <>", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThan(String value) {
            addCriterion("S_Name >", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameGreaterThanOrEqualTo(String value) {
            addCriterion("S_Name >=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThan(String value) {
            addCriterion("S_Name <", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLessThanOrEqualTo(String value) {
            addCriterion("S_Name <=", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameLike(String value) {
            addCriterion("S_Name like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotLike(String value) {
            addCriterion("S_Name not like", value, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameIn(List<String> values) {
            addCriterion("S_Name in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotIn(List<String> values) {
            addCriterion("S_Name not in", values, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameBetween(String value1, String value2) {
            addCriterion("S_Name between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSNameNotBetween(String value1, String value2) {
            addCriterion("S_Name not between", value1, value2, "sName");
            return (Criteria) this;
        }

        public Criteria andSCtimeIsNull() {
            addCriterion("S_CTime is null");
            return (Criteria) this;
        }

        public Criteria andSCtimeIsNotNull() {
            addCriterion("S_CTime is not null");
            return (Criteria) this;
        }

        public Criteria andSCtimeEqualTo(Date value) {
            addCriterion("S_CTime =", value, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeNotEqualTo(Date value) {
            addCriterion("S_CTime <>", value, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeGreaterThan(Date value) {
            addCriterion("S_CTime >", value, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("S_CTime >=", value, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeLessThan(Date value) {
            addCriterion("S_CTime <", value, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeLessThanOrEqualTo(Date value) {
            addCriterion("S_CTime <=", value, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeIn(List<Date> values) {
            addCriterion("S_CTime in", values, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeNotIn(List<Date> values) {
            addCriterion("S_CTime not in", values, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeBetween(Date value1, Date value2) {
            addCriterion("S_CTime between", value1, value2, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSCtimeNotBetween(Date value1, Date value2) {
            addCriterion("S_CTime not between", value1, value2, "sCtime");
            return (Criteria) this;
        }

        public Criteria andSStateIsNull() {
            addCriterion("S_State is null");
            return (Criteria) this;
        }

        public Criteria andSStateIsNotNull() {
            addCriterion("S_State is not null");
            return (Criteria) this;
        }

        public Criteria andSStateEqualTo(Integer value) {
            addCriterion("S_State =", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotEqualTo(Integer value) {
            addCriterion("S_State <>", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThan(Integer value) {
            addCriterion("S_State >", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("S_State >=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThan(Integer value) {
            addCriterion("S_State <", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateLessThanOrEqualTo(Integer value) {
            addCriterion("S_State <=", value, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateIn(List<Integer> values) {
            addCriterion("S_State in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotIn(List<Integer> values) {
            addCriterion("S_State not in", values, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateBetween(Integer value1, Integer value2) {
            addCriterion("S_State between", value1, value2, "sState");
            return (Criteria) this;
        }

        public Criteria andSStateNotBetween(Integer value1, Integer value2) {
            addCriterion("S_State not between", value1, value2, "sState");
            return (Criteria) this;
        }

        public Criteria andSPageviewIsNull() {
            addCriterion("S_Pageview is null");
            return (Criteria) this;
        }

        public Criteria andSPageviewIsNotNull() {
            addCriterion("S_Pageview is not null");
            return (Criteria) this;
        }

        public Criteria andSPageviewEqualTo(Long value) {
            addCriterion("S_Pageview =", value, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewNotEqualTo(Long value) {
            addCriterion("S_Pageview <>", value, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewGreaterThan(Long value) {
            addCriterion("S_Pageview >", value, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewGreaterThanOrEqualTo(Long value) {
            addCriterion("S_Pageview >=", value, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewLessThan(Long value) {
            addCriterion("S_Pageview <", value, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewLessThanOrEqualTo(Long value) {
            addCriterion("S_Pageview <=", value, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewIn(List<Long> values) {
            addCriterion("S_Pageview in", values, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewNotIn(List<Long> values) {
            addCriterion("S_Pageview not in", values, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewBetween(Long value1, Long value2) {
            addCriterion("S_Pageview between", value1, value2, "sPageview");
            return (Criteria) this;
        }

        public Criteria andSPageviewNotBetween(Long value1, Long value2) {
            addCriterion("S_Pageview not between", value1, value2, "sPageview");
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