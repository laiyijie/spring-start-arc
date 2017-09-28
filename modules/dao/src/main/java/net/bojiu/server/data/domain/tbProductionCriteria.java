package net.bojiu.server.data.domain;

import java.util.ArrayList;
import java.util.List;

public class tbProductionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public tbProductionCriteria() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(String value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(String value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(String value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(String value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(String value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(String value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLike(String value) {
            addCriterion("name like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotLike(String value) {
            addCriterion("name not like", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<String> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<String> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(String value1, String value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(String value1, String value2) {
            addCriterion("name not between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andPhone_numberIsNull() {
            addCriterion("phone_number is null");
            return (Criteria) this;
        }

        public Criteria andPhone_numberIsNotNull() {
            addCriterion("phone_number is not null");
            return (Criteria) this;
        }

        public Criteria andPhone_numberEqualTo(String value) {
            addCriterion("phone_number =", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberNotEqualTo(String value) {
            addCriterion("phone_number <>", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberGreaterThan(String value) {
            addCriterion("phone_number >", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberGreaterThanOrEqualTo(String value) {
            addCriterion("phone_number >=", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberLessThan(String value) {
            addCriterion("phone_number <", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberLessThanOrEqualTo(String value) {
            addCriterion("phone_number <=", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberLike(String value) {
            addCriterion("phone_number like", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberNotLike(String value) {
            addCriterion("phone_number not like", value, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberIn(List<String> values) {
            addCriterion("phone_number in", values, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberNotIn(List<String> values) {
            addCriterion("phone_number not in", values, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberBetween(String value1, String value2) {
            addCriterion("phone_number between", value1, value2, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPhone_numberNotBetween(String value1, String value2) {
            addCriterion("phone_number not between", value1, value2, "phone_number");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNull() {
            addCriterion("password is null");
            return (Criteria) this;
        }

        public Criteria andPasswordIsNotNull() {
            addCriterion("password is not null");
            return (Criteria) this;
        }

        public Criteria andPasswordEqualTo(String value) {
            addCriterion("password =", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotEqualTo(String value) {
            addCriterion("password <>", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThan(String value) {
            addCriterion("password >", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("password >=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThan(String value) {
            addCriterion("password <", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLessThanOrEqualTo(String value) {
            addCriterion("password <=", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordLike(String value) {
            addCriterion("password like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotLike(String value) {
            addCriterion("password not like", value, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordIn(List<String> values) {
            addCriterion("password in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotIn(List<String> values) {
            addCriterion("password not in", values, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordBetween(String value1, String value2) {
            addCriterion("password between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andPasswordNotBetween(String value1, String value2) {
            addCriterion("password not between", value1, value2, "password");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idIsNull() {
            addCriterion("wechat_union_id is null");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idIsNotNull() {
            addCriterion("wechat_union_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idEqualTo(String value) {
            addCriterion("wechat_union_id =", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idNotEqualTo(String value) {
            addCriterion("wechat_union_id <>", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idGreaterThan(String value) {
            addCriterion("wechat_union_id >", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_union_id >=", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idLessThan(String value) {
            addCriterion("wechat_union_id <", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idLessThanOrEqualTo(String value) {
            addCriterion("wechat_union_id <=", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idLike(String value) {
            addCriterion("wechat_union_id like", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idNotLike(String value) {
            addCriterion("wechat_union_id not like", value, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idIn(List<String> values) {
            addCriterion("wechat_union_id in", values, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idNotIn(List<String> values) {
            addCriterion("wechat_union_id not in", values, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idBetween(String value1, String value2) {
            addCriterion("wechat_union_id between", value1, value2, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_union_idNotBetween(String value1, String value2) {
            addCriterion("wechat_union_id not between", value1, value2, "wechat_union_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idIsNull() {
            addCriterion("wechat_open_id is null");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idIsNotNull() {
            addCriterion("wechat_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idEqualTo(String value) {
            addCriterion("wechat_open_id =", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idNotEqualTo(String value) {
            addCriterion("wechat_open_id <>", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idGreaterThan(String value) {
            addCriterion("wechat_open_id >", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_open_id >=", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idLessThan(String value) {
            addCriterion("wechat_open_id <", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idLessThanOrEqualTo(String value) {
            addCriterion("wechat_open_id <=", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idLike(String value) {
            addCriterion("wechat_open_id like", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idNotLike(String value) {
            addCriterion("wechat_open_id not like", value, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idIn(List<String> values) {
            addCriterion("wechat_open_id in", values, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idNotIn(List<String> values) {
            addCriterion("wechat_open_id not in", values, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idBetween(String value1, String value2) {
            addCriterion("wechat_open_id between", value1, value2, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andWechat_open_idNotBetween(String value1, String value2) {
            addCriterion("wechat_open_id not between", value1, value2, "wechat_open_id");
            return (Criteria) this;
        }

        public Criteria andRegister_fromIsNull() {
            addCriterion("register_from is null");
            return (Criteria) this;
        }

        public Criteria andRegister_fromIsNotNull() {
            addCriterion("register_from is not null");
            return (Criteria) this;
        }

        public Criteria andRegister_fromEqualTo(String value) {
            addCriterion("register_from =", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromNotEqualTo(String value) {
            addCriterion("register_from <>", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromGreaterThan(String value) {
            addCriterion("register_from >", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromGreaterThanOrEqualTo(String value) {
            addCriterion("register_from >=", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromLessThan(String value) {
            addCriterion("register_from <", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromLessThanOrEqualTo(String value) {
            addCriterion("register_from <=", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromLike(String value) {
            addCriterion("register_from like", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromNotLike(String value) {
            addCriterion("register_from not like", value, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromIn(List<String> values) {
            addCriterion("register_from in", values, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromNotIn(List<String> values) {
            addCriterion("register_from not in", values, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromBetween(String value1, String value2) {
            addCriterion("register_from between", value1, value2, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_fromNotBetween(String value1, String value2) {
            addCriterion("register_from not between", value1, value2, "register_from");
            return (Criteria) this;
        }

        public Criteria andRegister_timeIsNull() {
            addCriterion("register_time is null");
            return (Criteria) this;
        }

        public Criteria andRegister_timeIsNotNull() {
            addCriterion("register_time is not null");
            return (Criteria) this;
        }

        public Criteria andRegister_timeEqualTo(Long value) {
            addCriterion("register_time =", value, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeNotEqualTo(Long value) {
            addCriterion("register_time <>", value, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeGreaterThan(Long value) {
            addCriterion("register_time >", value, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeGreaterThanOrEqualTo(Long value) {
            addCriterion("register_time >=", value, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeLessThan(Long value) {
            addCriterion("register_time <", value, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeLessThanOrEqualTo(Long value) {
            addCriterion("register_time <=", value, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeIn(List<Long> values) {
            addCriterion("register_time in", values, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeNotIn(List<Long> values) {
            addCriterion("register_time not in", values, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeBetween(Long value1, Long value2) {
            addCriterion("register_time between", value1, value2, "register_time");
            return (Criteria) this;
        }

        public Criteria andRegister_timeNotBetween(Long value1, Long value2) {
            addCriterion("register_time not between", value1, value2, "register_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNull() {
            addCriterion("last_login_time is null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIsNotNull() {
            addCriterion("last_login_time is not null");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeEqualTo(Long value) {
            addCriterion("last_login_time =", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotEqualTo(Long value) {
            addCriterion("last_login_time <>", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThan(Long value) {
            addCriterion("last_login_time >", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeGreaterThanOrEqualTo(Long value) {
            addCriterion("last_login_time >=", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThan(Long value) {
            addCriterion("last_login_time <", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeLessThanOrEqualTo(Long value) {
            addCriterion("last_login_time <=", value, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeIn(List<Long> values) {
            addCriterion("last_login_time in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotIn(List<Long> values) {
            addCriterion("last_login_time not in", values, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeBetween(Long value1, Long value2) {
            addCriterion("last_login_time between", value1, value2, "last_login_time");
            return (Criteria) this;
        }

        public Criteria andLast_login_timeNotBetween(Long value1, Long value2) {
            addCriterion("last_login_time not between", value1, value2, "last_login_time");
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