package com.dream.weixin.db.mysql.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpenidMobileExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OpenidMobileExample() {
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

    public void setLimitStart(Integer limitStart) {
        this.limitStart=limitStart;
    }

    public Integer getLimitStart() {
        return limitStart;
    }

    public void setLimitEnd(Integer limitEnd) {
        this.limitEnd=limitEnd;
    }

    public Integer getLimitEnd() {
        return limitEnd;
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

        public Criteria andMobileOpenIdIsNull() {
            addCriterion("mobile_open_id is null");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdIsNotNull() {
            addCriterion("mobile_open_id is not null");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdEqualTo(Integer value) {
            addCriterion("mobile_open_id =", value, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdNotEqualTo(Integer value) {
            addCriterion("mobile_open_id <>", value, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdGreaterThan(Integer value) {
            addCriterion("mobile_open_id >", value, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("mobile_open_id >=", value, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdLessThan(Integer value) {
            addCriterion("mobile_open_id <", value, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdLessThanOrEqualTo(Integer value) {
            addCriterion("mobile_open_id <=", value, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdIn(List<Integer> values) {
            addCriterion("mobile_open_id in", values, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdNotIn(List<Integer> values) {
            addCriterion("mobile_open_id not in", values, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdBetween(Integer value1, Integer value2) {
            addCriterion("mobile_open_id between", value1, value2, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileOpenIdNotBetween(Integer value1, Integer value2) {
            addCriterion("mobile_open_id not between", value1, value2, "mobileOpenId");
            return (Criteria) this;
        }

        public Criteria andMobileIsNull() {
            addCriterion("mobile is null");
            return (Criteria) this;
        }

        public Criteria andMobileIsNotNull() {
            addCriterion("mobile is not null");
            return (Criteria) this;
        }

        public Criteria andMobileEqualTo(String value) {
            addCriterion("mobile =", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotEqualTo(String value) {
            addCriterion("mobile <>", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThan(String value) {
            addCriterion("mobile >", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileGreaterThanOrEqualTo(String value) {
            addCriterion("mobile >=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThan(String value) {
            addCriterion("mobile <", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLessThanOrEqualTo(String value) {
            addCriterion("mobile <=", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileLike(String value) {
            addCriterion("mobile like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotLike(String value) {
            addCriterion("mobile not like", value, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileIn(List<String> values) {
            addCriterion("mobile in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotIn(List<String> values) {
            addCriterion("mobile not in", values, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileBetween(String value1, String value2) {
            addCriterion("mobile between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andMobileNotBetween(String value1, String value2) {
            addCriterion("mobile not between", value1, value2, "mobile");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNull() {
            addCriterion("openid is null");
            return (Criteria) this;
        }

        public Criteria andOpenidIsNotNull() {
            addCriterion("openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidEqualTo(String value) {
            addCriterion("openid =", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotEqualTo(String value) {
            addCriterion("openid <>", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThan(String value) {
            addCriterion("openid >", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("openid >=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThan(String value) {
            addCriterion("openid <", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLessThanOrEqualTo(String value) {
            addCriterion("openid <=", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidLike(String value) {
            addCriterion("openid like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotLike(String value) {
            addCriterion("openid not like", value, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidIn(List<String> values) {
            addCriterion("openid in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotIn(List<String> values) {
            addCriterion("openid not in", values, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidBetween(String value1, String value2) {
            addCriterion("openid between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andOpenidNotBetween(String value1, String value2) {
            addCriterion("openid not between", value1, value2, "openid");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeIsNull() {
            addCriterion("mo_create_time is null");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeIsNotNull() {
            addCriterion("mo_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeEqualTo(Date value) {
            addCriterion("mo_create_time =", value, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeNotEqualTo(Date value) {
            addCriterion("mo_create_time <>", value, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeGreaterThan(Date value) {
            addCriterion("mo_create_time >", value, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_create_time >=", value, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeLessThan(Date value) {
            addCriterion("mo_create_time <", value, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("mo_create_time <=", value, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeIn(List<Date> values) {
            addCriterion("mo_create_time in", values, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeNotIn(List<Date> values) {
            addCriterion("mo_create_time not in", values, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeBetween(Date value1, Date value2) {
            addCriterion("mo_create_time between", value1, value2, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("mo_create_time not between", value1, value2, "moCreateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeIsNull() {
            addCriterion("mo_update_time is null");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeIsNotNull() {
            addCriterion("mo_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeEqualTo(Date value) {
            addCriterion("mo_update_time =", value, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeNotEqualTo(Date value) {
            addCriterion("mo_update_time <>", value, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeGreaterThan(Date value) {
            addCriterion("mo_update_time >", value, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("mo_update_time >=", value, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeLessThan(Date value) {
            addCriterion("mo_update_time <", value, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("mo_update_time <=", value, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeIn(List<Date> values) {
            addCriterion("mo_update_time in", values, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeNotIn(List<Date> values) {
            addCriterion("mo_update_time not in", values, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("mo_update_time between", value1, value2, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("mo_update_time not between", value1, value2, "moUpdateTime");
            return (Criteria) this;
        }

        public Criteria andMoStatusIsNull() {
            addCriterion("mo_status is null");
            return (Criteria) this;
        }

        public Criteria andMoStatusIsNotNull() {
            addCriterion("mo_status is not null");
            return (Criteria) this;
        }

        public Criteria andMoStatusEqualTo(String value) {
            addCriterion("mo_status =", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotEqualTo(String value) {
            addCriterion("mo_status <>", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusGreaterThan(String value) {
            addCriterion("mo_status >", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusGreaterThanOrEqualTo(String value) {
            addCriterion("mo_status >=", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusLessThan(String value) {
            addCriterion("mo_status <", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusLessThanOrEqualTo(String value) {
            addCriterion("mo_status <=", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusLike(String value) {
            addCriterion("mo_status like", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotLike(String value) {
            addCriterion("mo_status not like", value, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusIn(List<String> values) {
            addCriterion("mo_status in", values, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotIn(List<String> values) {
            addCriterion("mo_status not in", values, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusBetween(String value1, String value2) {
            addCriterion("mo_status between", value1, value2, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoStatusNotBetween(String value1, String value2) {
            addCriterion("mo_status not between", value1, value2, "moStatus");
            return (Criteria) this;
        }

        public Criteria andMoTypeIsNull() {
            addCriterion("mo_type is null");
            return (Criteria) this;
        }

        public Criteria andMoTypeIsNotNull() {
            addCriterion("mo_type is not null");
            return (Criteria) this;
        }

        public Criteria andMoTypeEqualTo(String value) {
            addCriterion("mo_type =", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeNotEqualTo(String value) {
            addCriterion("mo_type <>", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeGreaterThan(String value) {
            addCriterion("mo_type >", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mo_type >=", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeLessThan(String value) {
            addCriterion("mo_type <", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeLessThanOrEqualTo(String value) {
            addCriterion("mo_type <=", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeLike(String value) {
            addCriterion("mo_type like", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeNotLike(String value) {
            addCriterion("mo_type not like", value, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeIn(List<String> values) {
            addCriterion("mo_type in", values, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeNotIn(List<String> values) {
            addCriterion("mo_type not in", values, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeBetween(String value1, String value2) {
            addCriterion("mo_type between", value1, value2, "moType");
            return (Criteria) this;
        }

        public Criteria andMoTypeNotBetween(String value1, String value2) {
            addCriterion("mo_type not between", value1, value2, "moType");
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