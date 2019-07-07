package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class ShippingAddressExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShippingAddressExample() {
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

        public Criteria andSaNumIsNull() {
            addCriterion("SA_Num is null");
            return (Criteria) this;
        }

        public Criteria andSaNumIsNotNull() {
            addCriterion("SA_Num is not null");
            return (Criteria) this;
        }

        public Criteria andSaNumEqualTo(String value) {
            addCriterion("SA_Num =", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumNotEqualTo(String value) {
            addCriterion("SA_Num <>", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumGreaterThan(String value) {
            addCriterion("SA_Num >", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumGreaterThanOrEqualTo(String value) {
            addCriterion("SA_Num >=", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumLessThan(String value) {
            addCriterion("SA_Num <", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumLessThanOrEqualTo(String value) {
            addCriterion("SA_Num <=", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumLike(String value) {
            addCriterion("SA_Num like", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumNotLike(String value) {
            addCriterion("SA_Num not like", value, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumIn(List<String> values) {
            addCriterion("SA_Num in", values, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumNotIn(List<String> values) {
            addCriterion("SA_Num not in", values, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumBetween(String value1, String value2) {
            addCriterion("SA_Num between", value1, value2, "saNum");
            return (Criteria) this;
        }

        public Criteria andSaNumNotBetween(String value1, String value2) {
            addCriterion("SA_Num not between", value1, value2, "saNum");
            return (Criteria) this;
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

        public Criteria andSaDetailIsNull() {
            addCriterion("SA_Detail is null");
            return (Criteria) this;
        }

        public Criteria andSaDetailIsNotNull() {
            addCriterion("SA_Detail is not null");
            return (Criteria) this;
        }

        public Criteria andSaDetailEqualTo(String value) {
            addCriterion("SA_Detail =", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailNotEqualTo(String value) {
            addCriterion("SA_Detail <>", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailGreaterThan(String value) {
            addCriterion("SA_Detail >", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailGreaterThanOrEqualTo(String value) {
            addCriterion("SA_Detail >=", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailLessThan(String value) {
            addCriterion("SA_Detail <", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailLessThanOrEqualTo(String value) {
            addCriterion("SA_Detail <=", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailLike(String value) {
            addCriterion("SA_Detail like", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailNotLike(String value) {
            addCriterion("SA_Detail not like", value, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailIn(List<String> values) {
            addCriterion("SA_Detail in", values, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailNotIn(List<String> values) {
            addCriterion("SA_Detail not in", values, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailBetween(String value1, String value2) {
            addCriterion("SA_Detail between", value1, value2, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDetailNotBetween(String value1, String value2) {
            addCriterion("SA_Detail not between", value1, value2, "saDetail");
            return (Criteria) this;
        }

        public Criteria andSaDefaultIsNull() {
            addCriterion("SA_Default is null");
            return (Criteria) this;
        }

        public Criteria andSaDefaultIsNotNull() {
            addCriterion("SA_Default is not null");
            return (Criteria) this;
        }

        public Criteria andSaDefaultEqualTo(String value) {
            addCriterion("SA_Default =", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultNotEqualTo(String value) {
            addCriterion("SA_Default <>", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultGreaterThan(String value) {
            addCriterion("SA_Default >", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultGreaterThanOrEqualTo(String value) {
            addCriterion("SA_Default >=", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultLessThan(String value) {
            addCriterion("SA_Default <", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultLessThanOrEqualTo(String value) {
            addCriterion("SA_Default <=", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultLike(String value) {
            addCriterion("SA_Default like", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultNotLike(String value) {
            addCriterion("SA_Default not like", value, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultIn(List<String> values) {
            addCriterion("SA_Default in", values, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultNotIn(List<String> values) {
            addCriterion("SA_Default not in", values, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultBetween(String value1, String value2) {
            addCriterion("SA_Default between", value1, value2, "saDefault");
            return (Criteria) this;
        }

        public Criteria andSaDefaultNotBetween(String value1, String value2) {
            addCriterion("SA_Default not between", value1, value2, "saDefault");
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