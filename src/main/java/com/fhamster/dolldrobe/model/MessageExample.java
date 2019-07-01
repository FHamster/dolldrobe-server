package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class MessageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public MessageExample() {
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

        public Criteria andUseUAccountnumberIsNull() {
            addCriterion("Use_U_AccountNumber is null");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberIsNotNull() {
            addCriterion("Use_U_AccountNumber is not null");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberEqualTo(String value) {
            addCriterion("Use_U_AccountNumber =", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberNotEqualTo(String value) {
            addCriterion("Use_U_AccountNumber <>", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberGreaterThan(String value) {
            addCriterion("Use_U_AccountNumber >", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberGreaterThanOrEqualTo(String value) {
            addCriterion("Use_U_AccountNumber >=", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberLessThan(String value) {
            addCriterion("Use_U_AccountNumber <", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberLessThanOrEqualTo(String value) {
            addCriterion("Use_U_AccountNumber <=", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberLike(String value) {
            addCriterion("Use_U_AccountNumber like", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberNotLike(String value) {
            addCriterion("Use_U_AccountNumber not like", value, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberIn(List<String> values) {
            addCriterion("Use_U_AccountNumber in", values, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberNotIn(List<String> values) {
            addCriterion("Use_U_AccountNumber not in", values, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberBetween(String value1, String value2) {
            addCriterion("Use_U_AccountNumber between", value1, value2, "useUAccountnumber");
            return (Criteria) this;
        }

        public Criteria andUseUAccountnumberNotBetween(String value1, String value2) {
            addCriterion("Use_U_AccountNumber not between", value1, value2, "useUAccountnumber");
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

        public Criteria andMNumIsNull() {
            addCriterion("M_Num is null");
            return (Criteria) this;
        }

        public Criteria andMNumIsNotNull() {
            addCriterion("M_Num is not null");
            return (Criteria) this;
        }

        public Criteria andMNumEqualTo(String value) {
            addCriterion("M_Num =", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotEqualTo(String value) {
            addCriterion("M_Num <>", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumGreaterThan(String value) {
            addCriterion("M_Num >", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumGreaterThanOrEqualTo(String value) {
            addCriterion("M_Num >=", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumLessThan(String value) {
            addCriterion("M_Num <", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumLessThanOrEqualTo(String value) {
            addCriterion("M_Num <=", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumLike(String value) {
            addCriterion("M_Num like", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotLike(String value) {
            addCriterion("M_Num not like", value, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumIn(List<String> values) {
            addCriterion("M_Num in", values, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotIn(List<String> values) {
            addCriterion("M_Num not in", values, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumBetween(String value1, String value2) {
            addCriterion("M_Num between", value1, value2, "mNum");
            return (Criteria) this;
        }

        public Criteria andMNumNotBetween(String value1, String value2) {
            addCriterion("M_Num not between", value1, value2, "mNum");
            return (Criteria) this;
        }

        public Criteria andMSendtimeIsNull() {
            addCriterion("M_SendTime is null");
            return (Criteria) this;
        }

        public Criteria andMSendtimeIsNotNull() {
            addCriterion("M_SendTime is not null");
            return (Criteria) this;
        }

        public Criteria andMSendtimeEqualTo(Date value) {
            addCriterion("M_SendTime =", value, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeNotEqualTo(Date value) {
            addCriterion("M_SendTime <>", value, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeGreaterThan(Date value) {
            addCriterion("M_SendTime >", value, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("M_SendTime >=", value, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeLessThan(Date value) {
            addCriterion("M_SendTime <", value, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("M_SendTime <=", value, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeIn(List<Date> values) {
            addCriterion("M_SendTime in", values, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeNotIn(List<Date> values) {
            addCriterion("M_SendTime not in", values, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeBetween(Date value1, Date value2) {
            addCriterion("M_SendTime between", value1, value2, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("M_SendTime not between", value1, value2, "mSendtime");
            return (Criteria) this;
        }

        public Criteria andMSentcontentIsNull() {
            addCriterion("M_SentContent is null");
            return (Criteria) this;
        }

        public Criteria andMSentcontentIsNotNull() {
            addCriterion("M_SentContent is not null");
            return (Criteria) this;
        }

        public Criteria andMSentcontentEqualTo(String value) {
            addCriterion("M_SentContent =", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentNotEqualTo(String value) {
            addCriterion("M_SentContent <>", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentGreaterThan(String value) {
            addCriterion("M_SentContent >", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentGreaterThanOrEqualTo(String value) {
            addCriterion("M_SentContent >=", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentLessThan(String value) {
            addCriterion("M_SentContent <", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentLessThanOrEqualTo(String value) {
            addCriterion("M_SentContent <=", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentLike(String value) {
            addCriterion("M_SentContent like", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentNotLike(String value) {
            addCriterion("M_SentContent not like", value, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentIn(List<String> values) {
            addCriterion("M_SentContent in", values, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentNotIn(List<String> values) {
            addCriterion("M_SentContent not in", values, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentBetween(String value1, String value2) {
            addCriterion("M_SentContent between", value1, value2, "mSentcontent");
            return (Criteria) this;
        }

        public Criteria andMSentcontentNotBetween(String value1, String value2) {
            addCriterion("M_SentContent not between", value1, value2, "mSentcontent");
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