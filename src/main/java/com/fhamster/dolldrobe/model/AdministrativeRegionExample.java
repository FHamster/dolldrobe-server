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

        public Criteria andArPrentNumIsNull() {
            addCriterion("AR_Prent_Num is null");
            return (Criteria) this;
        }

        public Criteria andArPrentNumIsNotNull() {
            addCriterion("AR_Prent_Num is not null");
            return (Criteria) this;
        }

        public Criteria andArPrentNumEqualTo(String value) {
            addCriterion("AR_Prent_Num =", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumNotEqualTo(String value) {
            addCriterion("AR_Prent_Num <>", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumGreaterThan(String value) {
            addCriterion("AR_Prent_Num >", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumGreaterThanOrEqualTo(String value) {
            addCriterion("AR_Prent_Num >=", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumLessThan(String value) {
            addCriterion("AR_Prent_Num <", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumLessThanOrEqualTo(String value) {
            addCriterion("AR_Prent_Num <=", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumLike(String value) {
            addCriterion("AR_Prent_Num like", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumNotLike(String value) {
            addCriterion("AR_Prent_Num not like", value, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumIn(List<String> values) {
            addCriterion("AR_Prent_Num in", values, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumNotIn(List<String> values) {
            addCriterion("AR_Prent_Num not in", values, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumBetween(String value1, String value2) {
            addCriterion("AR_Prent_Num between", value1, value2, "arPrentNum");
            return (Criteria) this;
        }

        public Criteria andArPrentNumNotBetween(String value1, String value2) {
            addCriterion("AR_Prent_Num not between", value1, value2, "arPrentNum");
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

        public Criteria andArIsuseEqualTo(String value) {
            addCriterion("AR_isUse =", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotEqualTo(String value) {
            addCriterion("AR_isUse <>", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseGreaterThan(String value) {
            addCriterion("AR_isUse >", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseGreaterThanOrEqualTo(String value) {
            addCriterion("AR_isUse >=", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseLessThan(String value) {
            addCriterion("AR_isUse <", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseLessThanOrEqualTo(String value) {
            addCriterion("AR_isUse <=", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseLike(String value) {
            addCriterion("AR_isUse like", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotLike(String value) {
            addCriterion("AR_isUse not like", value, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseIn(List<String> values) {
            addCriterion("AR_isUse in", values, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotIn(List<String> values) {
            addCriterion("AR_isUse not in", values, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseBetween(String value1, String value2) {
            addCriterion("AR_isUse between", value1, value2, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArIsuseNotBetween(String value1, String value2) {
            addCriterion("AR_isUse not between", value1, value2, "arIsuse");
            return (Criteria) this;
        }

        public Criteria andArTypeIsNull() {
            addCriterion("AR_Type is null");
            return (Criteria) this;
        }

        public Criteria andArTypeIsNotNull() {
            addCriterion("AR_Type is not null");
            return (Criteria) this;
        }

        public Criteria andArTypeEqualTo(Integer value) {
            addCriterion("AR_Type =", value, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeNotEqualTo(Integer value) {
            addCriterion("AR_Type <>", value, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeGreaterThan(Integer value) {
            addCriterion("AR_Type >", value, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("AR_Type >=", value, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeLessThan(Integer value) {
            addCriterion("AR_Type <", value, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeLessThanOrEqualTo(Integer value) {
            addCriterion("AR_Type <=", value, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeIn(List<Integer> values) {
            addCriterion("AR_Type in", values, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeNotIn(List<Integer> values) {
            addCriterion("AR_Type not in", values, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeBetween(Integer value1, Integer value2) {
            addCriterion("AR_Type between", value1, value2, "arType");
            return (Criteria) this;
        }

        public Criteria andArTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("AR_Type not between", value1, value2, "arType");
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