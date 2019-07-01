package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class DetailIOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DetailIOrderExample() {
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

        public Criteria andONumIsNull() {
            addCriterion("O_Num is null");
            return (Criteria) this;
        }

        public Criteria andONumIsNotNull() {
            addCriterion("O_Num is not null");
            return (Criteria) this;
        }

        public Criteria andONumEqualTo(String value) {
            addCriterion("O_Num =", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumNotEqualTo(String value) {
            addCriterion("O_Num <>", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumGreaterThan(String value) {
            addCriterion("O_Num >", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumGreaterThanOrEqualTo(String value) {
            addCriterion("O_Num >=", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumLessThan(String value) {
            addCriterion("O_Num <", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumLessThanOrEqualTo(String value) {
            addCriterion("O_Num <=", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumLike(String value) {
            addCriterion("O_Num like", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumNotLike(String value) {
            addCriterion("O_Num not like", value, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumIn(List<String> values) {
            addCriterion("O_Num in", values, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumNotIn(List<String> values) {
            addCriterion("O_Num not in", values, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumBetween(String value1, String value2) {
            addCriterion("O_Num between", value1, value2, "oNum");
            return (Criteria) this;
        }

        public Criteria andONumNotBetween(String value1, String value2) {
            addCriterion("O_Num not between", value1, value2, "oNum");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNull() {
            addCriterion("SKU_Id is null");
            return (Criteria) this;
        }

        public Criteria andSkuIdIsNotNull() {
            addCriterion("SKU_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSkuIdEqualTo(String value) {
            addCriterion("SKU_Id =", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotEqualTo(String value) {
            addCriterion("SKU_Id <>", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThan(String value) {
            addCriterion("SKU_Id >", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_Id >=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThan(String value) {
            addCriterion("SKU_Id <", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLessThanOrEqualTo(String value) {
            addCriterion("SKU_Id <=", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdLike(String value) {
            addCriterion("SKU_Id like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotLike(String value) {
            addCriterion("SKU_Id not like", value, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdIn(List<String> values) {
            addCriterion("SKU_Id in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotIn(List<String> values) {
            addCriterion("SKU_Id not in", values, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdBetween(String value1, String value2) {
            addCriterion("SKU_Id between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andSkuIdNotBetween(String value1, String value2) {
            addCriterion("SKU_Id not between", value1, value2, "skuId");
            return (Criteria) this;
        }

        public Criteria andDoNumIsNull() {
            addCriterion("DO_Num is null");
            return (Criteria) this;
        }

        public Criteria andDoNumIsNotNull() {
            addCriterion("DO_Num is not null");
            return (Criteria) this;
        }

        public Criteria andDoNumEqualTo(Integer value) {
            addCriterion("DO_Num =", value, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumNotEqualTo(Integer value) {
            addCriterion("DO_Num <>", value, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumGreaterThan(Integer value) {
            addCriterion("DO_Num >", value, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("DO_Num >=", value, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumLessThan(Integer value) {
            addCriterion("DO_Num <", value, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumLessThanOrEqualTo(Integer value) {
            addCriterion("DO_Num <=", value, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumIn(List<Integer> values) {
            addCriterion("DO_Num in", values, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumNotIn(List<Integer> values) {
            addCriterion("DO_Num not in", values, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumBetween(Integer value1, Integer value2) {
            addCriterion("DO_Num between", value1, value2, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoNumNotBetween(Integer value1, Integer value2) {
            addCriterion("DO_Num not between", value1, value2, "doNum");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountIsNull() {
            addCriterion("DO_DiscountAmount is null");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountIsNotNull() {
            addCriterion("DO_DiscountAmount is not null");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountEqualTo(Float value) {
            addCriterion("DO_DiscountAmount =", value, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountNotEqualTo(Float value) {
            addCriterion("DO_DiscountAmount <>", value, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountGreaterThan(Float value) {
            addCriterion("DO_DiscountAmount >", value, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountGreaterThanOrEqualTo(Float value) {
            addCriterion("DO_DiscountAmount >=", value, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountLessThan(Float value) {
            addCriterion("DO_DiscountAmount <", value, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountLessThanOrEqualTo(Float value) {
            addCriterion("DO_DiscountAmount <=", value, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountIn(List<Float> values) {
            addCriterion("DO_DiscountAmount in", values, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountNotIn(List<Float> values) {
            addCriterion("DO_DiscountAmount not in", values, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountBetween(Float value1, Float value2) {
            addCriterion("DO_DiscountAmount between", value1, value2, "doDiscountamount");
            return (Criteria) this;
        }

        public Criteria andDoDiscountamountNotBetween(Float value1, Float value2) {
            addCriterion("DO_DiscountAmount not between", value1, value2, "doDiscountamount");
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