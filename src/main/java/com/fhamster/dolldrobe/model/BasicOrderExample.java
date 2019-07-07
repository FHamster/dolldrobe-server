package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BasicOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BasicOrderExample() {
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

        public Criteria andOFtimeIsNull() {
            addCriterion("O_FTime is null");
            return (Criteria) this;
        }

        public Criteria andOFtimeIsNotNull() {
            addCriterion("O_FTime is not null");
            return (Criteria) this;
        }

        public Criteria andOFtimeEqualTo(Date value) {
            addCriterion("O_FTime =", value, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeNotEqualTo(Date value) {
            addCriterion("O_FTime <>", value, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeGreaterThan(Date value) {
            addCriterion("O_FTime >", value, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_FTime >=", value, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeLessThan(Date value) {
            addCriterion("O_FTime <", value, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeLessThanOrEqualTo(Date value) {
            addCriterion("O_FTime <=", value, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeIn(List<Date> values) {
            addCriterion("O_FTime in", values, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeNotIn(List<Date> values) {
            addCriterion("O_FTime not in", values, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeBetween(Date value1, Date value2) {
            addCriterion("O_FTime between", value1, value2, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOFtimeNotBetween(Date value1, Date value2) {
            addCriterion("O_FTime not between", value1, value2, "oFtime");
            return (Criteria) this;
        }

        public Criteria andOStimeIsNull() {
            addCriterion("O_STime is null");
            return (Criteria) this;
        }

        public Criteria andOStimeIsNotNull() {
            addCriterion("O_STime is not null");
            return (Criteria) this;
        }

        public Criteria andOStimeEqualTo(Date value) {
            addCriterion("O_STime =", value, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeNotEqualTo(Date value) {
            addCriterion("O_STime <>", value, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeGreaterThan(Date value) {
            addCriterion("O_STime >", value, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_STime >=", value, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeLessThan(Date value) {
            addCriterion("O_STime <", value, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeLessThanOrEqualTo(Date value) {
            addCriterion("O_STime <=", value, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeIn(List<Date> values) {
            addCriterion("O_STime in", values, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeNotIn(List<Date> values) {
            addCriterion("O_STime not in", values, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeBetween(Date value1, Date value2) {
            addCriterion("O_STime between", value1, value2, "oStime");
            return (Criteria) this;
        }

        public Criteria andOStimeNotBetween(Date value1, Date value2) {
            addCriterion("O_STime not between", value1, value2, "oStime");
            return (Criteria) this;
        }

        public Criteria andOEtimeIsNull() {
            addCriterion("O_ETime is null");
            return (Criteria) this;
        }

        public Criteria andOEtimeIsNotNull() {
            addCriterion("O_ETime is not null");
            return (Criteria) this;
        }

        public Criteria andOEtimeEqualTo(Date value) {
            addCriterion("O_ETime =", value, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeNotEqualTo(Date value) {
            addCriterion("O_ETime <>", value, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeGreaterThan(Date value) {
            addCriterion("O_ETime >", value, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_ETime >=", value, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeLessThan(Date value) {
            addCriterion("O_ETime <", value, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeLessThanOrEqualTo(Date value) {
            addCriterion("O_ETime <=", value, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeIn(List<Date> values) {
            addCriterion("O_ETime in", values, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeNotIn(List<Date> values) {
            addCriterion("O_ETime not in", values, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeBetween(Date value1, Date value2) {
            addCriterion("O_ETime between", value1, value2, "oEtime");
            return (Criteria) this;
        }

        public Criteria andOEtimeNotBetween(Date value1, Date value2) {
            addCriterion("O_ETime not between", value1, value2, "oEtime");
            return (Criteria) this;
        }

        public Criteria andORtimeIsNull() {
            addCriterion("O_RTime is null");
            return (Criteria) this;
        }

        public Criteria andORtimeIsNotNull() {
            addCriterion("O_RTime is not null");
            return (Criteria) this;
        }

        public Criteria andORtimeEqualTo(Date value) {
            addCriterion("O_RTime =", value, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeNotEqualTo(Date value) {
            addCriterion("O_RTime <>", value, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeGreaterThan(Date value) {
            addCriterion("O_RTime >", value, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_RTime >=", value, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeLessThan(Date value) {
            addCriterion("O_RTime <", value, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeLessThanOrEqualTo(Date value) {
            addCriterion("O_RTime <=", value, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeIn(List<Date> values) {
            addCriterion("O_RTime in", values, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeNotIn(List<Date> values) {
            addCriterion("O_RTime not in", values, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeBetween(Date value1, Date value2) {
            addCriterion("O_RTime between", value1, value2, "oRtime");
            return (Criteria) this;
        }

        public Criteria andORtimeNotBetween(Date value1, Date value2) {
            addCriterion("O_RTime not between", value1, value2, "oRtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeIsNull() {
            addCriterion("O_PTime is null");
            return (Criteria) this;
        }

        public Criteria andOPtimeIsNotNull() {
            addCriterion("O_PTime is not null");
            return (Criteria) this;
        }

        public Criteria andOPtimeEqualTo(Date value) {
            addCriterion("O_PTime =", value, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeNotEqualTo(Date value) {
            addCriterion("O_PTime <>", value, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeGreaterThan(Date value) {
            addCriterion("O_PTime >", value, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_PTime >=", value, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeLessThan(Date value) {
            addCriterion("O_PTime <", value, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeLessThanOrEqualTo(Date value) {
            addCriterion("O_PTime <=", value, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeIn(List<Date> values) {
            addCriterion("O_PTime in", values, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeNotIn(List<Date> values) {
            addCriterion("O_PTime not in", values, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeBetween(Date value1, Date value2) {
            addCriterion("O_PTime between", value1, value2, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOPtimeNotBetween(Date value1, Date value2) {
            addCriterion("O_PTime not between", value1, value2, "oPtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeIsNull() {
            addCriterion("O_CTime is null");
            return (Criteria) this;
        }

        public Criteria andOCtimeIsNotNull() {
            addCriterion("O_CTime is not null");
            return (Criteria) this;
        }

        public Criteria andOCtimeEqualTo(Date value) {
            addCriterion("O_CTime =", value, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeNotEqualTo(Date value) {
            addCriterion("O_CTime <>", value, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeGreaterThan(Date value) {
            addCriterion("O_CTime >", value, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("O_CTime >=", value, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeLessThan(Date value) {
            addCriterion("O_CTime <", value, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeLessThanOrEqualTo(Date value) {
            addCriterion("O_CTime <=", value, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeIn(List<Date> values) {
            addCriterion("O_CTime in", values, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeNotIn(List<Date> values) {
            addCriterion("O_CTime not in", values, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeBetween(Date value1, Date value2) {
            addCriterion("O_CTime between", value1, value2, "oCtime");
            return (Criteria) this;
        }

        public Criteria andOCtimeNotBetween(Date value1, Date value2) {
            addCriterion("O_CTime not between", value1, value2, "oCtime");
            return (Criteria) this;
        }

        public Criteria andTpmoneyIsNull() {
            addCriterion("TPMoney is null");
            return (Criteria) this;
        }

        public Criteria andTpmoneyIsNotNull() {
            addCriterion("TPMoney is not null");
            return (Criteria) this;
        }

        public Criteria andTpmoneyEqualTo(Float value) {
            addCriterion("TPMoney =", value, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyNotEqualTo(Float value) {
            addCriterion("TPMoney <>", value, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyGreaterThan(Float value) {
            addCriterion("TPMoney >", value, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyGreaterThanOrEqualTo(Float value) {
            addCriterion("TPMoney >=", value, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyLessThan(Float value) {
            addCriterion("TPMoney <", value, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyLessThanOrEqualTo(Float value) {
            addCriterion("TPMoney <=", value, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyIn(List<Float> values) {
            addCriterion("TPMoney in", values, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyNotIn(List<Float> values) {
            addCriterion("TPMoney not in", values, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyBetween(Float value1, Float value2) {
            addCriterion("TPMoney between", value1, value2, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTpmoneyNotBetween(Float value1, Float value2) {
            addCriterion("TPMoney not between", value1, value2, "tpmoney");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentIsNull() {
            addCriterion("TotalPayment is null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentIsNotNull() {
            addCriterion("TotalPayment is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentEqualTo(String value) {
            addCriterion("TotalPayment =", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentNotEqualTo(String value) {
            addCriterion("TotalPayment <>", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentGreaterThan(String value) {
            addCriterion("TotalPayment >", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentGreaterThanOrEqualTo(String value) {
            addCriterion("TotalPayment >=", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentLessThan(String value) {
            addCriterion("TotalPayment <", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentLessThanOrEqualTo(String value) {
            addCriterion("TotalPayment <=", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentLike(String value) {
            addCriterion("TotalPayment like", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentNotLike(String value) {
            addCriterion("TotalPayment not like", value, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentIn(List<String> values) {
            addCriterion("TotalPayment in", values, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentNotIn(List<String> values) {
            addCriterion("TotalPayment not in", values, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentBetween(String value1, String value2) {
            addCriterion("TotalPayment between", value1, value2, "totalpayment");
            return (Criteria) this;
        }

        public Criteria andTotalpaymentNotBetween(String value1, String value2) {
            addCriterion("TotalPayment not between", value1, value2, "totalpayment");
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