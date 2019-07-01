package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InOrderDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InOrderDetailExample() {
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

        public Criteria andIIdIsNull() {
            addCriterion("I_Id is null");
            return (Criteria) this;
        }

        public Criteria andIIdIsNotNull() {
            addCriterion("I_Id is not null");
            return (Criteria) this;
        }

        public Criteria andIIdEqualTo(String value) {
            addCriterion("I_Id =", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotEqualTo(String value) {
            addCriterion("I_Id <>", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThan(String value) {
            addCriterion("I_Id >", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdGreaterThanOrEqualTo(String value) {
            addCriterion("I_Id >=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThan(String value) {
            addCriterion("I_Id <", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLessThanOrEqualTo(String value) {
            addCriterion("I_Id <=", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdLike(String value) {
            addCriterion("I_Id like", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotLike(String value) {
            addCriterion("I_Id not like", value, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdIn(List<String> values) {
            addCriterion("I_Id in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotIn(List<String> values) {
            addCriterion("I_Id not in", values, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdBetween(String value1, String value2) {
            addCriterion("I_Id between", value1, value2, "iId");
            return (Criteria) this;
        }

        public Criteria andIIdNotBetween(String value1, String value2) {
            addCriterion("I_Id not between", value1, value2, "iId");
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

        public Criteria andIodPaytimeIsNull() {
            addCriterion("IOD_PayTime is null");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeIsNotNull() {
            addCriterion("IOD_PayTime is not null");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeEqualTo(Date value) {
            addCriterion("IOD_PayTime =", value, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeNotEqualTo(Date value) {
            addCriterion("IOD_PayTime <>", value, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeGreaterThan(Date value) {
            addCriterion("IOD_PayTime >", value, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeGreaterThanOrEqualTo(Date value) {
            addCriterion("IOD_PayTime >=", value, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeLessThan(Date value) {
            addCriterion("IOD_PayTime <", value, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeLessThanOrEqualTo(Date value) {
            addCriterion("IOD_PayTime <=", value, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeIn(List<Date> values) {
            addCriterion("IOD_PayTime in", values, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeNotIn(List<Date> values) {
            addCriterion("IOD_PayTime not in", values, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeBetween(Date value1, Date value2) {
            addCriterion("IOD_PayTime between", value1, value2, "iodPaytime");
            return (Criteria) this;
        }

        public Criteria andIodPaytimeNotBetween(Date value1, Date value2) {
            addCriterion("IOD_PayTime not between", value1, value2, "iodPaytime");
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