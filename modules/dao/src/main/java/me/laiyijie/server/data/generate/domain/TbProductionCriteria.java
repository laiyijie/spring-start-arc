package me.laiyijie.server.data.generate.domain;

import java.util.ArrayList;
import java.util.List;

public class TbProductionCriteria {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbProductionCriteria() {
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

        public Criteria andAUTHOR_IDIsNull() {
            addCriterion("AUTHOR_ID is null");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDIsNotNull() {
            addCriterion("AUTHOR_ID is not null");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDEqualTo(Integer value) {
            addCriterion("AUTHOR_ID =", value, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDNotEqualTo(Integer value) {
            addCriterion("AUTHOR_ID <>", value, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDGreaterThan(Integer value) {
            addCriterion("AUTHOR_ID >", value, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDGreaterThanOrEqualTo(Integer value) {
            addCriterion("AUTHOR_ID >=", value, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDLessThan(Integer value) {
            addCriterion("AUTHOR_ID <", value, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDLessThanOrEqualTo(Integer value) {
            addCriterion("AUTHOR_ID <=", value, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDIn(List<Integer> values) {
            addCriterion("AUTHOR_ID in", values, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDNotIn(List<Integer> values) {
            addCriterion("AUTHOR_ID not in", values, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDBetween(Integer value1, Integer value2) {
            addCriterion("AUTHOR_ID between", value1, value2, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andAUTHOR_IDNotBetween(Integer value1, Integer value2) {
            addCriterion("AUTHOR_ID not between", value1, value2, "AUTHOR_ID");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHIsNull() {
            addCriterion("COVER_IMAGE_PATH is null");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHIsNotNull() {
            addCriterion("COVER_IMAGE_PATH is not null");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHEqualTo(String value) {
            addCriterion("COVER_IMAGE_PATH =", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHNotEqualTo(String value) {
            addCriterion("COVER_IMAGE_PATH <>", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHGreaterThan(String value) {
            addCriterion("COVER_IMAGE_PATH >", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHGreaterThanOrEqualTo(String value) {
            addCriterion("COVER_IMAGE_PATH >=", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHLessThan(String value) {
            addCriterion("COVER_IMAGE_PATH <", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHLessThanOrEqualTo(String value) {
            addCriterion("COVER_IMAGE_PATH <=", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHLike(String value) {
            addCriterion("COVER_IMAGE_PATH like", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHNotLike(String value) {
            addCriterion("COVER_IMAGE_PATH not like", value, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHIn(List<String> values) {
            addCriterion("COVER_IMAGE_PATH in", values, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHNotIn(List<String> values) {
            addCriterion("COVER_IMAGE_PATH not in", values, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHBetween(String value1, String value2) {
            addCriterion("COVER_IMAGE_PATH between", value1, value2, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andCOVER_IMAGE_PATHNotBetween(String value1, String value2) {
            addCriterion("COVER_IMAGE_PATH not between", value1, value2, "COVER_IMAGE_PATH");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNull() {
            addCriterion("TITLE is null");
            return (Criteria) this;
        }

        public Criteria andTITLEIsNotNull() {
            addCriterion("TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andTITLEEqualTo(String value) {
            addCriterion("TITLE =", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotEqualTo(String value) {
            addCriterion("TITLE <>", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThan(String value) {
            addCriterion("TITLE >", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEGreaterThanOrEqualTo(String value) {
            addCriterion("TITLE >=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThan(String value) {
            addCriterion("TITLE <", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELessThanOrEqualTo(String value) {
            addCriterion("TITLE <=", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLELike(String value) {
            addCriterion("TITLE like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotLike(String value) {
            addCriterion("TITLE not like", value, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEIn(List<String> values) {
            addCriterion("TITLE in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotIn(List<String> values) {
            addCriterion("TITLE not in", values, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLEBetween(String value1, String value2) {
            addCriterion("TITLE between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andTITLENotBetween(String value1, String value2) {
            addCriterion("TITLE not between", value1, value2, "TITLE");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDIsNull() {
            addCriterion("VIDEO_ID is null");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDIsNotNull() {
            addCriterion("VIDEO_ID is not null");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDEqualTo(String value) {
            addCriterion("VIDEO_ID =", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDNotEqualTo(String value) {
            addCriterion("VIDEO_ID <>", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDGreaterThan(String value) {
            addCriterion("VIDEO_ID >", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDGreaterThanOrEqualTo(String value) {
            addCriterion("VIDEO_ID >=", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDLessThan(String value) {
            addCriterion("VIDEO_ID <", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDLessThanOrEqualTo(String value) {
            addCriterion("VIDEO_ID <=", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDLike(String value) {
            addCriterion("VIDEO_ID like", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDNotLike(String value) {
            addCriterion("VIDEO_ID not like", value, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDIn(List<String> values) {
            addCriterion("VIDEO_ID in", values, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDNotIn(List<String> values) {
            addCriterion("VIDEO_ID not in", values, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDBetween(String value1, String value2) {
            addCriterion("VIDEO_ID between", value1, value2, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_IDNotBetween(String value1, String value2) {
            addCriterion("VIDEO_ID not between", value1, value2, "VIDEO_ID");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONIsNull() {
            addCriterion("VIDEO_DURATION is null");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONIsNotNull() {
            addCriterion("VIDEO_DURATION is not null");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONEqualTo(Integer value) {
            addCriterion("VIDEO_DURATION =", value, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONNotEqualTo(Integer value) {
            addCriterion("VIDEO_DURATION <>", value, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONGreaterThan(Integer value) {
            addCriterion("VIDEO_DURATION >", value, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONGreaterThanOrEqualTo(Integer value) {
            addCriterion("VIDEO_DURATION >=", value, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONLessThan(Integer value) {
            addCriterion("VIDEO_DURATION <", value, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONLessThanOrEqualTo(Integer value) {
            addCriterion("VIDEO_DURATION <=", value, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONIn(List<Integer> values) {
            addCriterion("VIDEO_DURATION in", values, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONNotIn(List<Integer> values) {
            addCriterion("VIDEO_DURATION not in", values, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONBetween(Integer value1, Integer value2) {
            addCriterion("VIDEO_DURATION between", value1, value2, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andVIDEO_DURATIONNotBetween(Integer value1, Integer value2) {
            addCriterion("VIDEO_DURATION not between", value1, value2, "VIDEO_DURATION");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTIsNull() {
            addCriterion("COMMENT_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTIsNotNull() {
            addCriterion("COMMENT_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT =", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTNotEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT <>", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTGreaterThan(Integer value) {
            addCriterion("COMMENT_COUNT >", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTGreaterThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT >=", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTLessThan(Integer value) {
            addCriterion("COMMENT_COUNT <", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTLessThanOrEqualTo(Integer value) {
            addCriterion("COMMENT_COUNT <=", value, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTIn(List<Integer> values) {
            addCriterion("COMMENT_COUNT in", values, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTNotIn(List<Integer> values) {
            addCriterion("COMMENT_COUNT not in", values, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COUNT between", value1, value2, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andCOMMENT_COUNTNotBetween(Integer value1, Integer value2) {
            addCriterion("COMMENT_COUNT not between", value1, value2, "COMMENT_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTIsNull() {
            addCriterion("FAVORITE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTIsNotNull() {
            addCriterion("FAVORITE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT =", value, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTNotEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT <>", value, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTGreaterThan(Integer value) {
            addCriterion("FAVORITE_COUNT >", value, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTGreaterThanOrEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT >=", value, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTLessThan(Integer value) {
            addCriterion("FAVORITE_COUNT <", value, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTLessThanOrEqualTo(Integer value) {
            addCriterion("FAVORITE_COUNT <=", value, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTIn(List<Integer> values) {
            addCriterion("FAVORITE_COUNT in", values, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTNotIn(List<Integer> values) {
            addCriterion("FAVORITE_COUNT not in", values, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTBetween(Integer value1, Integer value2) {
            addCriterion("FAVORITE_COUNT between", value1, value2, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andFAVORITE_COUNTNotBetween(Integer value1, Integer value2) {
            addCriterion("FAVORITE_COUNT not between", value1, value2, "FAVORITE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTIsNull() {
            addCriterion("SHARE_COUNT is null");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTIsNotNull() {
            addCriterion("SHARE_COUNT is not null");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTEqualTo(Integer value) {
            addCriterion("SHARE_COUNT =", value, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTNotEqualTo(Integer value) {
            addCriterion("SHARE_COUNT <>", value, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTGreaterThan(Integer value) {
            addCriterion("SHARE_COUNT >", value, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTGreaterThanOrEqualTo(Integer value) {
            addCriterion("SHARE_COUNT >=", value, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTLessThan(Integer value) {
            addCriterion("SHARE_COUNT <", value, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTLessThanOrEqualTo(Integer value) {
            addCriterion("SHARE_COUNT <=", value, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTIn(List<Integer> values) {
            addCriterion("SHARE_COUNT in", values, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTNotIn(List<Integer> values) {
            addCriterion("SHARE_COUNT not in", values, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTBetween(Integer value1, Integer value2) {
            addCriterion("SHARE_COUNT between", value1, value2, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andSHARE_COUNTNotBetween(Integer value1, Integer value2) {
            addCriterion("SHARE_COUNT not between", value1, value2, "SHARE_COUNT");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEIsNull() {
            addCriterion("UPLOAD_TIME is null");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEIsNotNull() {
            addCriterion("UPLOAD_TIME is not null");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEEqualTo(Long value) {
            addCriterion("UPLOAD_TIME =", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMENotEqualTo(Long value) {
            addCriterion("UPLOAD_TIME <>", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEGreaterThan(Long value) {
            addCriterion("UPLOAD_TIME >", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEGreaterThanOrEqualTo(Long value) {
            addCriterion("UPLOAD_TIME >=", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMELessThan(Long value) {
            addCriterion("UPLOAD_TIME <", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMELessThanOrEqualTo(Long value) {
            addCriterion("UPLOAD_TIME <=", value, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEIn(List<Long> values) {
            addCriterion("UPLOAD_TIME in", values, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMENotIn(List<Long> values) {
            addCriterion("UPLOAD_TIME not in", values, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMEBetween(Long value1, Long value2) {
            addCriterion("UPLOAD_TIME between", value1, value2, "UPLOAD_TIME");
            return (Criteria) this;
        }

        public Criteria andUPLOAD_TIMENotBetween(Long value1, Long value2) {
            addCriterion("UPLOAD_TIME not between", value1, value2, "UPLOAD_TIME");
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