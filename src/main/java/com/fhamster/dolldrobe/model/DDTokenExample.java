package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class DDTokenExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DDTokenExample() {
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

        public Criteria andTokenidIsNull() {
            addCriterion("tokenId is null");
            return (Criteria) this;
        }

        public Criteria andTokenidIsNotNull() {
            addCriterion("tokenId is not null");
            return (Criteria) this;
        }

        public Criteria andTokenidEqualTo(String value) {
            addCriterion("tokenId =", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotEqualTo(String value) {
            addCriterion("tokenId <>", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidGreaterThan(String value) {
            addCriterion("tokenId >", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidGreaterThanOrEqualTo(String value) {
            addCriterion("tokenId >=", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidLessThan(String value) {
            addCriterion("tokenId <", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidLessThanOrEqualTo(String value) {
            addCriterion("tokenId <=", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidLike(String value) {
            addCriterion("tokenId like", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotLike(String value) {
            addCriterion("tokenId not like", value, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidIn(List<String> values) {
            addCriterion("tokenId in", values, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotIn(List<String> values) {
            addCriterion("tokenId not in", values, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidBetween(String value1, String value2) {
            addCriterion("tokenId between", value1, value2, "tokenid");
            return (Criteria) this;
        }

        public Criteria andTokenidNotBetween(String value1, String value2) {
            addCriterion("tokenId not between", value1, value2, "tokenid");
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

        public Criteria andURightIsNull() {
            addCriterion("U_right is null");
            return (Criteria) this;
        }

        public Criteria andURightIsNotNull() {
            addCriterion("U_right is not null");
            return (Criteria) this;
        }

        public Criteria andURightEqualTo(Integer value) {
            addCriterion("U_right =", value, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightNotEqualTo(Integer value) {
            addCriterion("U_right <>", value, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightGreaterThan(Integer value) {
            addCriterion("U_right >", value, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightGreaterThanOrEqualTo(Integer value) {
            addCriterion("U_right >=", value, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightLessThan(Integer value) {
            addCriterion("U_right <", value, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightLessThanOrEqualTo(Integer value) {
            addCriterion("U_right <=", value, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightIn(List<Integer> values) {
            addCriterion("U_right in", values, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightNotIn(List<Integer> values) {
            addCriterion("U_right not in", values, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightBetween(Integer value1, Integer value2) {
            addCriterion("U_right between", value1, value2, "uRight");
            return (Criteria) this;
        }

        public Criteria andURightNotBetween(Integer value1, Integer value2) {
            addCriterion("U_right not between", value1, value2, "uRight");
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