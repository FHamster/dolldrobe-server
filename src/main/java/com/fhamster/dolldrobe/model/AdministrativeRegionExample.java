package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class AdministrativeRegionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdministrativeRegionExample() {
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

        public Criteria andArNumIsNull() {
            addCriterion("AR_Num is null");
            return (Criteria) this;
        }

        public Criteria andArNumIsNotNull() {
            addCriterion("AR_Num is not null");
            return (Criteria) this;
        }

        public Criteria andArNumEqualTo(String value) {
            addCriterion("AR_Num =", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumNotEqualTo(String value) {
            addCriterion("AR_Num <>", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumGreaterThan(String value) {
            addCriterion("AR_Num >", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumGreaterThanOrEqualTo(String value) {
            addCriterion("AR_Num >=", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumLessThan(String value) {
            addCriterion("AR_Num <", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumLessThanOrEqualTo(String value) {
            addCriterion("AR_Num <=", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumLike(String value) {
            addCriterion("AR_Num like", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumNotLike(String value) {
            addCriterion("AR_Num not like", value, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumIn(List<String> values) {
            addCriterion("AR_Num in", values, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumNotIn(List<String> values) {
            addCriterion("AR_Num not in", values, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumBetween(String value1, String value2) {
            addCriterion("AR_Num between", value1, value2, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNumNotBetween(String value1, String value2) {
            addCriterion("AR_Num not between", value1, value2, "arNum");
            return (Criteria) this;
        }

        public Criteria andArNameIsNull() {
            addCriterion("AR_Name is null");
            return (Criteria) this;
        }

        public Criteria andArNameIsNotNull() {
            addCriterion("AR_Name is not null");
            return (Criteria) this;
        }

        public Criteria andArNameEqualTo(String value) {
            addCriterion("AR_Name =", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotEqualTo(String value) {
            addCriterion("AR_Name <>", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameGreaterThan(String value) {
            addCriterion("AR_Name >", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameGreaterThanOrEqualTo(String value) {
            addCriterion("AR_Name >=", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameLessThan(String value) {
            addCriterion("AR_Name <", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameLessThanOrEqualTo(String value) {
            addCriterion("AR_Name <=", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameLike(String value) {
            addCriterion("AR_Name like", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotLike(String value) {
            addCriterion("AR_Name not like", value, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameIn(List<String> values) {
            addCriterion("AR_Name in", values, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotIn(List<String> values) {
            addCriterion("AR_Name not in", values, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameBetween(String value1, String value2) {
            addCriterion("AR_Name between", value1, value2, "arName");
            return (Criteria) this;
        }

        public Criteria andArNameNotBetween(String value1, String value2) {
            addCriterion("AR_Name not between", value1, value2, "arName");
            return (Criteria) this;
        }

        public Criteria andArIsuseIsNull() {
            addCriterion("AR_isUse is null");
            return (Criteria) this;
        }

        public Criteria andArIsuseIsNotNull() {
            addCriterion("AR_isUse is not null");
            return (Criteria) this;
        }

        public Criteria andArIsuseEqualTo(Byte value) {
            addCriterion("AR_isUse =", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotEqualTo(Byte value) {
            addCriterion("AR_isUse <>", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseGreaterThan(Byte value) {
            addCriterion("AR_isUse >", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseGreaterThanOrEqualTo(Byte value) {
            addCriterion("AR_isUse >=", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseLessThan(Byte value) {
            addCriterion("AR_isUse <", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseLessThanOrEqualTo(Byte value) {
            addCriterion("AR_isUse <=", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseIn(List<Byte> values) {
            addCriterion("AR_isUse in", values, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotIn(List<Byte> values) {
            addCriterion("AR_isUse not in", values, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseBetween(Byte value1, Byte value2) {
            addCriterion("AR_isUse between", value1, value2, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotBetween(Byte value1, Byte value2) {
            addCriterion("AR_isUse not between", value1, value2, "arIsuse");
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