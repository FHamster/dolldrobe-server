package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderEvaluationExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OrderEvaluationExample() {
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

        public Criteria andOeClevelIsNull() {
            addCriterion("OE_CLevel is null");
            return (Criteria) this;
        }

        public Criteria andOeClevelIsNotNull() {
            addCriterion("OE_CLevel is not null");
            return (Criteria) this;
        }

        public Criteria andOeClevelEqualTo(Integer value) {
            addCriterion("OE_CLevel =", value, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelNotEqualTo(Integer value) {
            addCriterion("OE_CLevel <>", value, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelGreaterThan(Integer value) {
            addCriterion("OE_CLevel >", value, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("OE_CLevel >=", value, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelLessThan(Integer value) {
            addCriterion("OE_CLevel <", value, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelLessThanOrEqualTo(Integer value) {
            addCriterion("OE_CLevel <=", value, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelIn(List<Integer> values) {
            addCriterion("OE_CLevel in", values, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelNotIn(List<Integer> values) {
            addCriterion("OE_CLevel not in", values, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelBetween(Integer value1, Integer value2) {
            addCriterion("OE_CLevel between", value1, value2, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeClevelNotBetween(Integer value1, Integer value2) {
            addCriterion("OE_CLevel not between", value1, value2, "oeClevel");
            return (Criteria) this;
        }

        public Criteria andOeTimeIsNull() {
            addCriterion("OE_Time is null");
            return (Criteria) this;
        }

        public Criteria andOeTimeIsNotNull() {
            addCriterion("OE_Time is not null");
            return (Criteria) this;
        }

        public Criteria andOeTimeEqualTo(Date value) {
            addCriterion("OE_Time =", value, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeNotEqualTo(Date value) {
            addCriterion("OE_Time <>", value, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeGreaterThan(Date value) {
            addCriterion("OE_Time >", value, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("OE_Time >=", value, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeLessThan(Date value) {
            addCriterion("OE_Time <", value, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeLessThanOrEqualTo(Date value) {
            addCriterion("OE_Time <=", value, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeIn(List<Date> values) {
            addCriterion("OE_Time in", values, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeNotIn(List<Date> values) {
            addCriterion("OE_Time not in", values, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeBetween(Date value1, Date value2) {
            addCriterion("OE_Time between", value1, value2, "oeTime");
            return (Criteria) this;
        }

        public Criteria andOeTimeNotBetween(Date value1, Date value2) {
            addCriterion("OE_Time not between", value1, value2, "oeTime");
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