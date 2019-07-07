package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class InOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InOrderExample() {
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

        public Criteria andITotalmoneyIsNull() {
            addCriterion("I_TotalMoney is null");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyIsNotNull() {
            addCriterion("I_TotalMoney is not null");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyEqualTo(Float value) {
            addCriterion("I_TotalMoney =", value, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyNotEqualTo(Float value) {
            addCriterion("I_TotalMoney <>", value, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyGreaterThan(Float value) {
            addCriterion("I_TotalMoney >", value, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("I_TotalMoney >=", value, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyLessThan(Float value) {
            addCriterion("I_TotalMoney <", value, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyLessThanOrEqualTo(Float value) {
            addCriterion("I_TotalMoney <=", value, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyIn(List<Float> values) {
            addCriterion("I_TotalMoney in", values, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyNotIn(List<Float> values) {
            addCriterion("I_TotalMoney not in", values, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyBetween(Float value1, Float value2) {
            addCriterion("I_TotalMoney between", value1, value2, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andITotalmoneyNotBetween(Float value1, Float value2) {
            addCriterion("I_TotalMoney not between", value1, value2, "iTotalmoney");
            return (Criteria) this;
        }

        public Criteria andIGroupIsNull() {
            addCriterion("I_Group is null");
            return (Criteria) this;
        }

        public Criteria andIGroupIsNotNull() {
            addCriterion("I_Group is not null");
            return (Criteria) this;
        }

        public Criteria andIGroupEqualTo(String value) {
            addCriterion("I_Group =", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupNotEqualTo(String value) {
            addCriterion("I_Group <>", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupGreaterThan(String value) {
            addCriterion("I_Group >", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupGreaterThanOrEqualTo(String value) {
            addCriterion("I_Group >=", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupLessThan(String value) {
            addCriterion("I_Group <", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupLessThanOrEqualTo(String value) {
            addCriterion("I_Group <=", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupLike(String value) {
            addCriterion("I_Group like", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupNotLike(String value) {
            addCriterion("I_Group not like", value, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupIn(List<String> values) {
            addCriterion("I_Group in", values, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupNotIn(List<String> values) {
            addCriterion("I_Group not in", values, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupBetween(String value1, String value2) {
            addCriterion("I_Group between", value1, value2, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIGroupNotBetween(String value1, String value2) {
            addCriterion("I_Group not between", value1, value2, "iGroup");
            return (Criteria) this;
        }

        public Criteria andIPayIsNull() {
            addCriterion("I_Pay is null");
            return (Criteria) this;
        }

        public Criteria andIPayIsNotNull() {
            addCriterion("I_Pay is not null");
            return (Criteria) this;
        }

        public Criteria andIPayEqualTo(String value) {
            addCriterion("I_Pay =", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayNotEqualTo(String value) {
            addCriterion("I_Pay <>", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayGreaterThan(String value) {
            addCriterion("I_Pay >", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayGreaterThanOrEqualTo(String value) {
            addCriterion("I_Pay >=", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayLessThan(String value) {
            addCriterion("I_Pay <", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayLessThanOrEqualTo(String value) {
            addCriterion("I_Pay <=", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayLike(String value) {
            addCriterion("I_Pay like", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayNotLike(String value) {
            addCriterion("I_Pay not like", value, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayIn(List<String> values) {
            addCriterion("I_Pay in", values, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayNotIn(List<String> values) {
            addCriterion("I_Pay not in", values, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayBetween(String value1, String value2) {
            addCriterion("I_Pay between", value1, value2, "iPay");
            return (Criteria) this;
        }

        public Criteria andIPayNotBetween(String value1, String value2) {
            addCriterion("I_Pay not between", value1, value2, "iPay");
            return (Criteria) this;
        }

        public Criteria andIBegintimeIsNull() {
            addCriterion("I_BeginTime is null");
            return (Criteria) this;
        }

        public Criteria andIBegintimeIsNotNull() {
            addCriterion("I_BeginTime is not null");
            return (Criteria) this;
        }

        public Criteria andIBegintimeEqualTo(Date value) {
            addCriterion("I_BeginTime =", value, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeNotEqualTo(Date value) {
            addCriterion("I_BeginTime <>", value, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeGreaterThan(Date value) {
            addCriterion("I_BeginTime >", value, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeGreaterThanOrEqualTo(Date value) {
            addCriterion("I_BeginTime >=", value, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeLessThan(Date value) {
            addCriterion("I_BeginTime <", value, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeLessThanOrEqualTo(Date value) {
            addCriterion("I_BeginTime <=", value, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeIn(List<Date> values) {
            addCriterion("I_BeginTime in", values, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeNotIn(List<Date> values) {
            addCriterion("I_BeginTime not in", values, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeBetween(Date value1, Date value2) {
            addCriterion("I_BeginTime between", value1, value2, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andIBegintimeNotBetween(Date value1, Date value2) {
            addCriterion("I_BeginTime not between", value1, value2, "iBegintime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeIsNull() {
            addCriterion("I_CancelTime is null");
            return (Criteria) this;
        }

        public Criteria andICanceltimeIsNotNull() {
            addCriterion("I_CancelTime is not null");
            return (Criteria) this;
        }

        public Criteria andICanceltimeEqualTo(Date value) {
            addCriterion("I_CancelTime =", value, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeNotEqualTo(Date value) {
            addCriterion("I_CancelTime <>", value, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeGreaterThan(Date value) {
            addCriterion("I_CancelTime >", value, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeGreaterThanOrEqualTo(Date value) {
            addCriterion("I_CancelTime >=", value, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeLessThan(Date value) {
            addCriterion("I_CancelTime <", value, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeLessThanOrEqualTo(Date value) {
            addCriterion("I_CancelTime <=", value, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeIn(List<Date> values) {
            addCriterion("I_CancelTime in", values, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeNotIn(List<Date> values) {
            addCriterion("I_CancelTime not in", values, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeBetween(Date value1, Date value2) {
            addCriterion("I_CancelTime between", value1, value2, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andICanceltimeNotBetween(Date value1, Date value2) {
            addCriterion("I_CancelTime not between", value1, value2, "iCanceltime");
            return (Criteria) this;
        }

        public Criteria andITranstimeIsNull() {
            addCriterion("I_TransTime is null");
            return (Criteria) this;
        }

        public Criteria andITranstimeIsNotNull() {
            addCriterion("I_TransTime is not null");
            return (Criteria) this;
        }

        public Criteria andITranstimeEqualTo(Date value) {
            addCriterion("I_TransTime =", value, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeNotEqualTo(Date value) {
            addCriterion("I_TransTime <>", value, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeGreaterThan(Date value) {
            addCriterion("I_TransTime >", value, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeGreaterThanOrEqualTo(Date value) {
            addCriterion("I_TransTime >=", value, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeLessThan(Date value) {
            addCriterion("I_TransTime <", value, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeLessThanOrEqualTo(Date value) {
            addCriterion("I_TransTime <=", value, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeIn(List<Date> values) {
            addCriterion("I_TransTime in", values, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeNotIn(List<Date> values) {
            addCriterion("I_TransTime not in", values, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeBetween(Date value1, Date value2) {
            addCriterion("I_TransTime between", value1, value2, "iTranstime");
            return (Criteria) this;
        }

        public Criteria andITranstimeNotBetween(Date value1, Date value2) {
            addCriterion("I_TransTime not between", value1, value2, "iTranstime");
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