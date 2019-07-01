package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class SketchPicExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SketchPicExample() {
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

        public Criteria andSpIdIsNull() {
            addCriterion("SP_Id is null");
            return (Criteria) this;
        }

        public Criteria andSpIdIsNotNull() {
            addCriterion("SP_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSpIdEqualTo(String value) {
            addCriterion("SP_Id =", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotEqualTo(String value) {
            addCriterion("SP_Id <>", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThan(String value) {
            addCriterion("SP_Id >", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdGreaterThanOrEqualTo(String value) {
            addCriterion("SP_Id >=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThan(String value) {
            addCriterion("SP_Id <", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLessThanOrEqualTo(String value) {
            addCriterion("SP_Id <=", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdLike(String value) {
            addCriterion("SP_Id like", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotLike(String value) {
            addCriterion("SP_Id not like", value, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdIn(List<String> values) {
            addCriterion("SP_Id in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotIn(List<String> values) {
            addCriterion("SP_Id not in", values, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdBetween(String value1, String value2) {
            addCriterion("SP_Id between", value1, value2, "spId");
            return (Criteria) this;
        }

        public Criteria andSpIdNotBetween(String value1, String value2) {
            addCriterion("SP_Id not between", value1, value2, "spId");
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