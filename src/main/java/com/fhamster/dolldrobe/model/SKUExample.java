package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class SKUExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SKUExample() {
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

        public Criteria andCSpecificationIsNull() {
            addCriterion("C_Specification is null");
            return (Criteria) this;
        }

        public Criteria andCSpecificationIsNotNull() {
            addCriterion("C_Specification is not null");
            return (Criteria) this;
        }

        public Criteria andCSpecificationEqualTo(String value) {
            addCriterion("C_Specification =", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationNotEqualTo(String value) {
            addCriterion("C_Specification <>", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationGreaterThan(String value) {
            addCriterion("C_Specification >", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationGreaterThanOrEqualTo(String value) {
            addCriterion("C_Specification >=", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationLessThan(String value) {
            addCriterion("C_Specification <", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationLessThanOrEqualTo(String value) {
            addCriterion("C_Specification <=", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationLike(String value) {
            addCriterion("C_Specification like", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationNotLike(String value) {
            addCriterion("C_Specification not like", value, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationIn(List<String> values) {
            addCriterion("C_Specification in", values, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationNotIn(List<String> values) {
            addCriterion("C_Specification not in", values, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationBetween(String value1, String value2) {
            addCriterion("C_Specification between", value1, value2, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCSpecificationNotBetween(String value1, String value2) {
            addCriterion("C_Specification not between", value1, value2, "cSpecification");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNull() {
            addCriterion("C_Price is null");
            return (Criteria) this;
        }

        public Criteria andCPriceIsNotNull() {
            addCriterion("C_Price is not null");
            return (Criteria) this;
        }

        public Criteria andCPriceEqualTo(Float value) {
            addCriterion("C_Price =", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotEqualTo(Float value) {
            addCriterion("C_Price <>", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThan(Float value) {
            addCriterion("C_Price >", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceGreaterThanOrEqualTo(Float value) {
            addCriterion("C_Price >=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThan(Float value) {
            addCriterion("C_Price <", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceLessThanOrEqualTo(Float value) {
            addCriterion("C_Price <=", value, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceIn(List<Float> values) {
            addCriterion("C_Price in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotIn(List<Float> values) {
            addCriterion("C_Price not in", values, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceBetween(Float value1, Float value2) {
            addCriterion("C_Price between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCPriceNotBetween(Float value1, Float value2) {
            addCriterion("C_Price not between", value1, value2, "cPrice");
            return (Criteria) this;
        }

        public Criteria andCInventoryIsNull() {
            addCriterion("C_Inventory is null");
            return (Criteria) this;
        }

        public Criteria andCInventoryIsNotNull() {
            addCriterion("C_Inventory is not null");
            return (Criteria) this;
        }

        public Criteria andCInventoryEqualTo(Integer value) {
            addCriterion("C_Inventory =", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryNotEqualTo(Integer value) {
            addCriterion("C_Inventory <>", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryGreaterThan(Integer value) {
            addCriterion("C_Inventory >", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("C_Inventory >=", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryLessThan(Integer value) {
            addCriterion("C_Inventory <", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("C_Inventory <=", value, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryIn(List<Integer> values) {
            addCriterion("C_Inventory in", values, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryNotIn(List<Integer> values) {
            addCriterion("C_Inventory not in", values, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryBetween(Integer value1, Integer value2) {
            addCriterion("C_Inventory between", value1, value2, "cInventory");
            return (Criteria) this;
        }

        public Criteria andCInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("C_Inventory not between", value1, value2, "cInventory");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNull() {
            addCriterion("SKU_img is null");
            return (Criteria) this;
        }

        public Criteria andSkuImgIsNotNull() {
            addCriterion("SKU_img is not null");
            return (Criteria) this;
        }

        public Criteria andSkuImgEqualTo(String value) {
            addCriterion("SKU_img =", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotEqualTo(String value) {
            addCriterion("SKU_img <>", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThan(String value) {
            addCriterion("SKU_img >", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgGreaterThanOrEqualTo(String value) {
            addCriterion("SKU_img >=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThan(String value) {
            addCriterion("SKU_img <", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLessThanOrEqualTo(String value) {
            addCriterion("SKU_img <=", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgLike(String value) {
            addCriterion("SKU_img like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotLike(String value) {
            addCriterion("SKU_img not like", value, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgIn(List<String> values) {
            addCriterion("SKU_img in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotIn(List<String> values) {
            addCriterion("SKU_img not in", values, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgBetween(String value1, String value2) {
            addCriterion("SKU_img between", value1, value2, "skuImg");
            return (Criteria) this;
        }

        public Criteria andSkuImgNotBetween(String value1, String value2) {
            addCriterion("SKU_img not between", value1, value2, "skuImg");
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