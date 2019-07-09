package com.fhamster.dolldrobe.model;

import java.util.ArrayList;
import java.util.List;

public class DesignerExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public DesignerExample() {
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

        public Criteria andUNameIsNull() {
            addCriterion("U_Name is null");
            return (Criteria) this;
        }

        public Criteria andUNameIsNotNull() {
            addCriterion("U_Name is not null");
            return (Criteria) this;
        }

        public Criteria andUNameEqualTo(String value) {
            addCriterion("U_Name =", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotEqualTo(String value) {
            addCriterion("U_Name <>", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThan(String value) {
            addCriterion("U_Name >", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameGreaterThanOrEqualTo(String value) {
            addCriterion("U_Name >=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThan(String value) {
            addCriterion("U_Name <", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLessThanOrEqualTo(String value) {
            addCriterion("U_Name <=", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameLike(String value) {
            addCriterion("U_Name like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotLike(String value) {
            addCriterion("U_Name not like", value, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameIn(List<String> values) {
            addCriterion("U_Name in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotIn(List<String> values) {
            addCriterion("U_Name not in", values, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameBetween(String value1, String value2) {
            addCriterion("U_Name between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUNameNotBetween(String value1, String value2) {
            addCriterion("U_Name not between", value1, value2, "uName");
            return (Criteria) this;
        }

        public Criteria andUPswIsNull() {
            addCriterion("U_Psw is null");
            return (Criteria) this;
        }

        public Criteria andUPswIsNotNull() {
            addCriterion("U_Psw is not null");
            return (Criteria) this;
        }

        public Criteria andUPswEqualTo(String value) {
            addCriterion("U_Psw =", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswNotEqualTo(String value) {
            addCriterion("U_Psw <>", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswGreaterThan(String value) {
            addCriterion("U_Psw >", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswGreaterThanOrEqualTo(String value) {
            addCriterion("U_Psw >=", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswLessThan(String value) {
            addCriterion("U_Psw <", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswLessThanOrEqualTo(String value) {
            addCriterion("U_Psw <=", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswLike(String value) {
            addCriterion("U_Psw like", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswNotLike(String value) {
            addCriterion("U_Psw not like", value, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswIn(List<String> values) {
            addCriterion("U_Psw in", values, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswNotIn(List<String> values) {
            addCriterion("U_Psw not in", values, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswBetween(String value1, String value2) {
            addCriterion("U_Psw between", value1, value2, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUPswNotBetween(String value1, String value2) {
            addCriterion("U_Psw not between", value1, value2, "uPsw");
            return (Criteria) this;
        }

        public Criteria andUSexIsNull() {
            addCriterion("U_Sex is null");
            return (Criteria) this;
        }

        public Criteria andUSexIsNotNull() {
            addCriterion("U_Sex is not null");
            return (Criteria) this;
        }

        public Criteria andUSexEqualTo(String value) {
            addCriterion("U_Sex =", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotEqualTo(String value) {
            addCriterion("U_Sex <>", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThan(String value) {
            addCriterion("U_Sex >", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexGreaterThanOrEqualTo(String value) {
            addCriterion("U_Sex >=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThan(String value) {
            addCriterion("U_Sex <", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLessThanOrEqualTo(String value) {
            addCriterion("U_Sex <=", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexLike(String value) {
            addCriterion("U_Sex like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotLike(String value) {
            addCriterion("U_Sex not like", value, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexIn(List<String> values) {
            addCriterion("U_Sex in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotIn(List<String> values) {
            addCriterion("U_Sex not in", values, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexBetween(String value1, String value2) {
            addCriterion("U_Sex between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUSexNotBetween(String value1, String value2) {
            addCriterion("U_Sex not between", value1, value2, "uSex");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNull() {
            addCriterion("U_Email is null");
            return (Criteria) this;
        }

        public Criteria andUEmailIsNotNull() {
            addCriterion("U_Email is not null");
            return (Criteria) this;
        }

        public Criteria andUEmailEqualTo(String value) {
            addCriterion("U_Email =", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotEqualTo(String value) {
            addCriterion("U_Email <>", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThan(String value) {
            addCriterion("U_Email >", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailGreaterThanOrEqualTo(String value) {
            addCriterion("U_Email >=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThan(String value) {
            addCriterion("U_Email <", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLessThanOrEqualTo(String value) {
            addCriterion("U_Email <=", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailLike(String value) {
            addCriterion("U_Email like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotLike(String value) {
            addCriterion("U_Email not like", value, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailIn(List<String> values) {
            addCriterion("U_Email in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotIn(List<String> values) {
            addCriterion("U_Email not in", values, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailBetween(String value1, String value2) {
            addCriterion("U_Email between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUEmailNotBetween(String value1, String value2) {
            addCriterion("U_Email not between", value1, value2, "uEmail");
            return (Criteria) this;
        }

        public Criteria andUQqIsNull() {
            addCriterion("U_QQ is null");
            return (Criteria) this;
        }

        public Criteria andUQqIsNotNull() {
            addCriterion("U_QQ is not null");
            return (Criteria) this;
        }

        public Criteria andUQqEqualTo(String value) {
            addCriterion("U_QQ =", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotEqualTo(String value) {
            addCriterion("U_QQ <>", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThan(String value) {
            addCriterion("U_QQ >", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqGreaterThanOrEqualTo(String value) {
            addCriterion("U_QQ >=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThan(String value) {
            addCriterion("U_QQ <", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLessThanOrEqualTo(String value) {
            addCriterion("U_QQ <=", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqLike(String value) {
            addCriterion("U_QQ like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotLike(String value) {
            addCriterion("U_QQ not like", value, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqIn(List<String> values) {
            addCriterion("U_QQ in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotIn(List<String> values) {
            addCriterion("U_QQ not in", values, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqBetween(String value1, String value2) {
            addCriterion("U_QQ between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUQqNotBetween(String value1, String value2) {
            addCriterion("U_QQ not between", value1, value2, "uQq");
            return (Criteria) this;
        }

        public Criteria andUWxIsNull() {
            addCriterion("U_WX is null");
            return (Criteria) this;
        }

        public Criteria andUWxIsNotNull() {
            addCriterion("U_WX is not null");
            return (Criteria) this;
        }

        public Criteria andUWxEqualTo(String value) {
            addCriterion("U_WX =", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotEqualTo(String value) {
            addCriterion("U_WX <>", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxGreaterThan(String value) {
            addCriterion("U_WX >", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxGreaterThanOrEqualTo(String value) {
            addCriterion("U_WX >=", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxLessThan(String value) {
            addCriterion("U_WX <", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxLessThanOrEqualTo(String value) {
            addCriterion("U_WX <=", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxLike(String value) {
            addCriterion("U_WX like", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotLike(String value) {
            addCriterion("U_WX not like", value, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxIn(List<String> values) {
            addCriterion("U_WX in", values, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotIn(List<String> values) {
            addCriterion("U_WX not in", values, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxBetween(String value1, String value2) {
            addCriterion("U_WX between", value1, value2, "uWx");
            return (Criteria) this;
        }

        public Criteria andUWxNotBetween(String value1, String value2) {
            addCriterion("U_WX not between", value1, value2, "uWx");
            return (Criteria) this;
        }

        public Criteria andUTelIsNull() {
            addCriterion("U_Tel is null");
            return (Criteria) this;
        }

        public Criteria andUTelIsNotNull() {
            addCriterion("U_Tel is not null");
            return (Criteria) this;
        }

        public Criteria andUTelEqualTo(String value) {
            addCriterion("U_Tel =", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotEqualTo(String value) {
            addCriterion("U_Tel <>", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThan(String value) {
            addCriterion("U_Tel >", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelGreaterThanOrEqualTo(String value) {
            addCriterion("U_Tel >=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThan(String value) {
            addCriterion("U_Tel <", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLessThanOrEqualTo(String value) {
            addCriterion("U_Tel <=", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelLike(String value) {
            addCriterion("U_Tel like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotLike(String value) {
            addCriterion("U_Tel not like", value, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelIn(List<String> values) {
            addCriterion("U_Tel in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotIn(List<String> values) {
            addCriterion("U_Tel not in", values, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelBetween(String value1, String value2) {
            addCriterion("U_Tel between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andUTelNotBetween(String value1, String value2) {
            addCriterion("U_Tel not between", value1, value2, "uTel");
            return (Criteria) this;
        }

        public Criteria andDAttentionIsNull() {
            addCriterion("D_Attention is null");
            return (Criteria) this;
        }

        public Criteria andDAttentionIsNotNull() {
            addCriterion("D_Attention is not null");
            return (Criteria) this;
        }

        public Criteria andDAttentionEqualTo(Integer value) {
            addCriterion("D_Attention =", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotEqualTo(Integer value) {
            addCriterion("D_Attention <>", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionGreaterThan(Integer value) {
            addCriterion("D_Attention >", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_Attention >=", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLessThan(Integer value) {
            addCriterion("D_Attention <", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionLessThanOrEqualTo(Integer value) {
            addCriterion("D_Attention <=", value, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionIn(List<Integer> values) {
            addCriterion("D_Attention in", values, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotIn(List<Integer> values) {
            addCriterion("D_Attention not in", values, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionBetween(Integer value1, Integer value2) {
            addCriterion("D_Attention between", value1, value2, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDAttentionNotBetween(Integer value1, Integer value2) {
            addCriterion("D_Attention not between", value1, value2, "dAttention");
            return (Criteria) this;
        }

        public Criteria andDWorknumIsNull() {
            addCriterion("D_WorkNum is null");
            return (Criteria) this;
        }

        public Criteria andDWorknumIsNotNull() {
            addCriterion("D_WorkNum is not null");
            return (Criteria) this;
        }

        public Criteria andDWorknumEqualTo(Integer value) {
            addCriterion("D_WorkNum =", value, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumNotEqualTo(Integer value) {
            addCriterion("D_WorkNum <>", value, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumGreaterThan(Integer value) {
            addCriterion("D_WorkNum >", value, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumGreaterThanOrEqualTo(Integer value) {
            addCriterion("D_WorkNum >=", value, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumLessThan(Integer value) {
            addCriterion("D_WorkNum <", value, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumLessThanOrEqualTo(Integer value) {
            addCriterion("D_WorkNum <=", value, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumIn(List<Integer> values) {
            addCriterion("D_WorkNum in", values, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumNotIn(List<Integer> values) {
            addCriterion("D_WorkNum not in", values, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumBetween(Integer value1, Integer value2) {
            addCriterion("D_WorkNum between", value1, value2, "dWorknum");
            return (Criteria) this;
        }

        public Criteria andDWorknumNotBetween(Integer value1, Integer value2) {
            addCriterion("D_WorkNum not between", value1, value2, "dWorknum");
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