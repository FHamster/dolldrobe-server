package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SketchSamplelFeedbackExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SketchSamplelFeedbackExample() {
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

        public Criteria andSsfIdIsNull() {
            addCriterion("SSF_Id is null");
            return (Criteria) this;
        }

        public Criteria andSsfIdIsNotNull() {
            addCriterion("SSF_Id is not null");
            return (Criteria) this;
        }

        public Criteria andSsfIdEqualTo(String value) {
            addCriterion("SSF_Id =", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotEqualTo(String value) {
            addCriterion("SSF_Id <>", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdGreaterThan(String value) {
            addCriterion("SSF_Id >", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdGreaterThanOrEqualTo(String value) {
            addCriterion("SSF_Id >=", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdLessThan(String value) {
            addCriterion("SSF_Id <", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdLessThanOrEqualTo(String value) {
            addCriterion("SSF_Id <=", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdLike(String value) {
            addCriterion("SSF_Id like", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotLike(String value) {
            addCriterion("SSF_Id not like", value, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdIn(List<String> values) {
            addCriterion("SSF_Id in", values, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotIn(List<String> values) {
            addCriterion("SSF_Id not in", values, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdBetween(String value1, String value2) {
            addCriterion("SSF_Id between", value1, value2, "ssfId");
            return (Criteria) this;
        }

        public Criteria andSsfIdNotBetween(String value1, String value2) {
            addCriterion("SSF_Id not between", value1, value2, "ssfId");
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

        public Criteria andSsfCategoryIsNull() {
            addCriterion("SSF_Category is null");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryIsNotNull() {
            addCriterion("SSF_Category is not null");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryEqualTo(String value) {
            addCriterion("SSF_Category =", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryNotEqualTo(String value) {
            addCriterion("SSF_Category <>", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryGreaterThan(String value) {
            addCriterion("SSF_Category >", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryGreaterThanOrEqualTo(String value) {
            addCriterion("SSF_Category >=", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryLessThan(String value) {
            addCriterion("SSF_Category <", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryLessThanOrEqualTo(String value) {
            addCriterion("SSF_Category <=", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryLike(String value) {
            addCriterion("SSF_Category like", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryNotLike(String value) {
            addCriterion("SSF_Category not like", value, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryIn(List<String> values) {
            addCriterion("SSF_Category in", values, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryNotIn(List<String> values) {
            addCriterion("SSF_Category not in", values, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryBetween(String value1, String value2) {
            addCriterion("SSF_Category between", value1, value2, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfCategoryNotBetween(String value1, String value2) {
            addCriterion("SSF_Category not between", value1, value2, "ssfCategory");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelIsNull() {
            addCriterion("SSF_EvaluationLevel is null");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelIsNotNull() {
            addCriterion("SSF_EvaluationLevel is not null");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelEqualTo(Integer value) {
            addCriterion("SSF_EvaluationLevel =", value, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelNotEqualTo(Integer value) {
            addCriterion("SSF_EvaluationLevel <>", value, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelGreaterThan(Integer value) {
            addCriterion("SSF_EvaluationLevel >", value, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("SSF_EvaluationLevel >=", value, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelLessThan(Integer value) {
            addCriterion("SSF_EvaluationLevel <", value, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelLessThanOrEqualTo(Integer value) {
            addCriterion("SSF_EvaluationLevel <=", value, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelIn(List<Integer> values) {
            addCriterion("SSF_EvaluationLevel in", values, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelNotIn(List<Integer> values) {
            addCriterion("SSF_EvaluationLevel not in", values, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelBetween(Integer value1, Integer value2) {
            addCriterion("SSF_EvaluationLevel between", value1, value2, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfEvaluationlevelNotBetween(Integer value1, Integer value2) {
            addCriterion("SSF_EvaluationLevel not between", value1, value2, "ssfEvaluationlevel");
            return (Criteria) this;
        }

        public Criteria andSsfDateIsNull() {
            addCriterion("SSF_Date is null");
            return (Criteria) this;
        }

        public Criteria andSsfDateIsNotNull() {
            addCriterion("SSF_Date is not null");
            return (Criteria) this;
        }

        public Criteria andSsfDateEqualTo(Date value) {
            addCriterion("SSF_Date =", value, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateNotEqualTo(Date value) {
            addCriterion("SSF_Date <>", value, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateGreaterThan(Date value) {
            addCriterion("SSF_Date >", value, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateGreaterThanOrEqualTo(Date value) {
            addCriterion("SSF_Date >=", value, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateLessThan(Date value) {
            addCriterion("SSF_Date <", value, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateLessThanOrEqualTo(Date value) {
            addCriterion("SSF_Date <=", value, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateIn(List<Date> values) {
            addCriterion("SSF_Date in", values, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateNotIn(List<Date> values) {
            addCriterion("SSF_Date not in", values, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateBetween(Date value1, Date value2) {
            addCriterion("SSF_Date between", value1, value2, "ssfDate");
            return (Criteria) this;
        }

        public Criteria andSsfDateNotBetween(Date value1, Date value2) {
            addCriterion("SSF_Date not between", value1, value2, "ssfDate");
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