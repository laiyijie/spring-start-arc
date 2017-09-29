package me.laiyijie.server.data.domain;

import java.util.ArrayList;
import java.util.List;

public class TbUserCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbUserCriteria() {
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

        public Criteria andIDIsNull() {
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIDIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIDEqualTo(Integer value) {
            addCriterion("ID =", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotEqualTo(Integer value) {
            addCriterion("ID <>", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThan(Integer value) {
            addCriterion("ID >", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDGreaterThanOrEqualTo(Integer value) {
            addCriterion("ID >=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThan(Integer value) {
            addCriterion("ID <", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDLessThanOrEqualTo(Integer value) {
            addCriterion("ID <=", value, "ID");
            return (Criteria) this;
        }

        public Criteria andIDIn(List<Integer> values) {
            addCriterion("ID in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotIn(List<Integer> values) {
            addCriterion("ID not in", values, "ID");
            return (Criteria) this;
        }

        public Criteria andIDBetween(Integer value1, Integer value2) {
            addCriterion("ID between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andIDNotBetween(Integer value1, Integer value2) {
            addCriterion("ID not between", value1, value2, "ID");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNull() {
            addCriterion("NAME is null");
            return (Criteria) this;
        }

        public Criteria andNAMEIsNotNull() {
            addCriterion("NAME is not null");
            return (Criteria) this;
        }

        public Criteria andNAMEEqualTo(String value) {
            addCriterion("NAME =", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotEqualTo(String value) {
            addCriterion("NAME <>", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThan(String value) {
            addCriterion("NAME >", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEGreaterThanOrEqualTo(String value) {
            addCriterion("NAME >=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThan(String value) {
            addCriterion("NAME <", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELessThanOrEqualTo(String value) {
            addCriterion("NAME <=", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMELike(String value) {
            addCriterion("NAME like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotLike(String value) {
            addCriterion("NAME not like", value, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEIn(List<String> values) {
            addCriterion("NAME in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotIn(List<String> values) {
            addCriterion("NAME not in", values, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMEBetween(String value1, String value2) {
            addCriterion("NAME between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andNAMENotBetween(String value1, String value2) {
            addCriterion("NAME not between", value1, value2, "NAME");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERIsNull() {
            addCriterion("PHONE_NUMBER is null");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERIsNotNull() {
            addCriterion("PHONE_NUMBER is not null");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBEREqualTo(String value) {
            addCriterion("PHONE_NUMBER =", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERNotEqualTo(String value) {
            addCriterion("PHONE_NUMBER <>", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERGreaterThan(String value) {
            addCriterion("PHONE_NUMBER >", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERGreaterThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER >=", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERLessThan(String value) {
            addCriterion("PHONE_NUMBER <", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERLessThanOrEqualTo(String value) {
            addCriterion("PHONE_NUMBER <=", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERLike(String value) {
            addCriterion("PHONE_NUMBER like", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERNotLike(String value) {
            addCriterion("PHONE_NUMBER not like", value, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERIn(List<String> values) {
            addCriterion("PHONE_NUMBER in", values, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERNotIn(List<String> values) {
            addCriterion("PHONE_NUMBER not in", values, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER between", value1, value2, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPHONE_NUMBERNotBetween(String value1, String value2) {
            addCriterion("PHONE_NUMBER not between", value1, value2, "PHONE_NUMBER");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNull() {
            addCriterion("PASSWORD is null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIsNotNull() {
            addCriterion("PASSWORD is not null");
            return (Criteria) this;
        }

        public Criteria andPASSWORDEqualTo(String value) {
            addCriterion("PASSWORD =", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotEqualTo(String value) {
            addCriterion("PASSWORD <>", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThan(String value) {
            addCriterion("PASSWORD >", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDGreaterThanOrEqualTo(String value) {
            addCriterion("PASSWORD >=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThan(String value) {
            addCriterion("PASSWORD <", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLessThanOrEqualTo(String value) {
            addCriterion("PASSWORD <=", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDLike(String value) {
            addCriterion("PASSWORD like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotLike(String value) {
            addCriterion("PASSWORD not like", value, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDIn(List<String> values) {
            addCriterion("PASSWORD in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotIn(List<String> values) {
            addCriterion("PASSWORD not in", values, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDBetween(String value1, String value2) {
            addCriterion("PASSWORD between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andPASSWORDNotBetween(String value1, String value2) {
            addCriterion("PASSWORD not between", value1, value2, "PASSWORD");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDIsNull() {
            addCriterion("WECHAT_UNION_ID is null");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDIsNotNull() {
            addCriterion("WECHAT_UNION_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDEqualTo(String value) {
            addCriterion("WECHAT_UNION_ID =", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDNotEqualTo(String value) {
            addCriterion("WECHAT_UNION_ID <>", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDGreaterThan(String value) {
            addCriterion("WECHAT_UNION_ID >", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT_UNION_ID >=", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDLessThan(String value) {
            addCriterion("WECHAT_UNION_ID <", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDLessThanOrEqualTo(String value) {
            addCriterion("WECHAT_UNION_ID <=", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDLike(String value) {
            addCriterion("WECHAT_UNION_ID like", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDNotLike(String value) {
            addCriterion("WECHAT_UNION_ID not like", value, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDIn(List<String> values) {
            addCriterion("WECHAT_UNION_ID in", values, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDNotIn(List<String> values) {
            addCriterion("WECHAT_UNION_ID not in", values, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDBetween(String value1, String value2) {
            addCriterion("WECHAT_UNION_ID between", value1, value2, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_UNION_IDNotBetween(String value1, String value2) {
            addCriterion("WECHAT_UNION_ID not between", value1, value2, "WECHAT_UNION_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDIsNull() {
            addCriterion("WECHAT_OPEN_ID is null");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDIsNotNull() {
            addCriterion("WECHAT_OPEN_ID is not null");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDEqualTo(String value) {
            addCriterion("WECHAT_OPEN_ID =", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDNotEqualTo(String value) {
            addCriterion("WECHAT_OPEN_ID <>", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDGreaterThan(String value) {
            addCriterion("WECHAT_OPEN_ID >", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDGreaterThanOrEqualTo(String value) {
            addCriterion("WECHAT_OPEN_ID >=", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDLessThan(String value) {
            addCriterion("WECHAT_OPEN_ID <", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDLessThanOrEqualTo(String value) {
            addCriterion("WECHAT_OPEN_ID <=", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDLike(String value) {
            addCriterion("WECHAT_OPEN_ID like", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDNotLike(String value) {
            addCriterion("WECHAT_OPEN_ID not like", value, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDIn(List<String> values) {
            addCriterion("WECHAT_OPEN_ID in", values, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDNotIn(List<String> values) {
            addCriterion("WECHAT_OPEN_ID not in", values, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDBetween(String value1, String value2) {
            addCriterion("WECHAT_OPEN_ID between", value1, value2, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andWECHAT_OPEN_IDNotBetween(String value1, String value2) {
            addCriterion("WECHAT_OPEN_ID not between", value1, value2, "WECHAT_OPEN_ID");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMIsNull() {
            addCriterion("REGISTER_FROM is null");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMIsNotNull() {
            addCriterion("REGISTER_FROM is not null");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMEqualTo(String value) {
            addCriterion("REGISTER_FROM =", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMNotEqualTo(String value) {
            addCriterion("REGISTER_FROM <>", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMGreaterThan(String value) {
            addCriterion("REGISTER_FROM >", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMGreaterThanOrEqualTo(String value) {
            addCriterion("REGISTER_FROM >=", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMLessThan(String value) {
            addCriterion("REGISTER_FROM <", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMLessThanOrEqualTo(String value) {
            addCriterion("REGISTER_FROM <=", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMLike(String value) {
            addCriterion("REGISTER_FROM like", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMNotLike(String value) {
            addCriterion("REGISTER_FROM not like", value, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMIn(List<String> values) {
            addCriterion("REGISTER_FROM in", values, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMNotIn(List<String> values) {
            addCriterion("REGISTER_FROM not in", values, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMBetween(String value1, String value2) {
            addCriterion("REGISTER_FROM between", value1, value2, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_FROMNotBetween(String value1, String value2) {
            addCriterion("REGISTER_FROM not between", value1, value2, "REGISTER_FROM");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEIsNull() {
            addCriterion("REGISTER_TIME is null");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEIsNotNull() {
            addCriterion("REGISTER_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEEqualTo(Long value) {
            addCriterion("REGISTER_TIME =", value, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMENotEqualTo(Long value) {
            addCriterion("REGISTER_TIME <>", value, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEGreaterThan(Long value) {
            addCriterion("REGISTER_TIME >", value, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEGreaterThanOrEqualTo(Long value) {
            addCriterion("REGISTER_TIME >=", value, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMELessThan(Long value) {
            addCriterion("REGISTER_TIME <", value, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMELessThanOrEqualTo(Long value) {
            addCriterion("REGISTER_TIME <=", value, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEIn(List<Long> values) {
            addCriterion("REGISTER_TIME in", values, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMENotIn(List<Long> values) {
            addCriterion("REGISTER_TIME not in", values, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMEBetween(Long value1, Long value2) {
            addCriterion("REGISTER_TIME between", value1, value2, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andREGISTER_TIMENotBetween(Long value1, Long value2) {
            addCriterion("REGISTER_TIME not between", value1, value2, "REGISTER_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEIsNull() {
            addCriterion("LAST_LOGIN_TIME is null");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEIsNotNull() {
            addCriterion("LAST_LOGIN_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME =", value, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMENotEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME <>", value, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEGreaterThan(Long value) {
            addCriterion("LAST_LOGIN_TIME >", value, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEGreaterThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME >=", value, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMELessThan(Long value) {
            addCriterion("LAST_LOGIN_TIME <", value, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMELessThanOrEqualTo(Long value) {
            addCriterion("LAST_LOGIN_TIME <=", value, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEIn(List<Long> values) {
            addCriterion("LAST_LOGIN_TIME in", values, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMENotIn(List<Long> values) {
            addCriterion("LAST_LOGIN_TIME not in", values, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMEBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_TIME between", value1, value2, "LAST_LOGIN_TIME");
            return (Criteria) this;
        }

        public Criteria andLAST_LOGIN_TIMENotBetween(Long value1, Long value2) {
            addCriterion("LAST_LOGIN_TIME not between", value1, value2, "LAST_LOGIN_TIME");
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