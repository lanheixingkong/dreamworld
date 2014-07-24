package com.dream.weixin.db.mysql.entity;

import java.util.ArrayList;
import java.util.List;

public class PsamPropertyInsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public PsamPropertyInsExample() {
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

        public Criteria andPsamPropInsIdIsNull() {
            addCriterion("psam_prop_ins_id is null");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdIsNotNull() {
            addCriterion("psam_prop_ins_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdEqualTo(Integer value) {
            addCriterion("psam_prop_ins_id =", value, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdNotEqualTo(Integer value) {
            addCriterion("psam_prop_ins_id <>", value, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdGreaterThan(Integer value) {
            addCriterion("psam_prop_ins_id >", value, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psam_prop_ins_id >=", value, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdLessThan(Integer value) {
            addCriterion("psam_prop_ins_id <", value, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdLessThanOrEqualTo(Integer value) {
            addCriterion("psam_prop_ins_id <=", value, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdIn(List<Integer> values) {
            addCriterion("psam_prop_ins_id in", values, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdNotIn(List<Integer> values) {
            addCriterion("psam_prop_ins_id not in", values, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdBetween(Integer value1, Integer value2) {
            addCriterion("psam_prop_ins_id between", value1, value2, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropInsIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psam_prop_ins_id not between", value1, value2, "psamPropInsId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdIsNull() {
            addCriterion("psam_prop_id is null");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdIsNotNull() {
            addCriterion("psam_prop_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdEqualTo(Integer value) {
            addCriterion("psam_prop_id =", value, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdNotEqualTo(Integer value) {
            addCriterion("psam_prop_id <>", value, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdGreaterThan(Integer value) {
            addCriterion("psam_prop_id >", value, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("psam_prop_id >=", value, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdLessThan(Integer value) {
            addCriterion("psam_prop_id <", value, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdLessThanOrEqualTo(Integer value) {
            addCriterion("psam_prop_id <=", value, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdIn(List<Integer> values) {
            addCriterion("psam_prop_id in", values, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdNotIn(List<Integer> values) {
            addCriterion("psam_prop_id not in", values, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdBetween(Integer value1, Integer value2) {
            addCriterion("psam_prop_id between", value1, value2, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamPropIdNotBetween(Integer value1, Integer value2) {
            addCriterion("psam_prop_id not between", value1, value2, "psamPropId");
            return (Criteria) this;
        }

        public Criteria andPsamIdIsNull() {
            addCriterion("psam_id is null");
            return (Criteria) this;
        }

        public Criteria andPsamIdIsNotNull() {
            addCriterion("psam_id is not null");
            return (Criteria) this;
        }

        public Criteria andPsamIdEqualTo(String value) {
            addCriterion("psam_id =", value, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdNotEqualTo(String value) {
            addCriterion("psam_id <>", value, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdGreaterThan(String value) {
            addCriterion("psam_id >", value, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdGreaterThanOrEqualTo(String value) {
            addCriterion("psam_id >=", value, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdLessThan(String value) {
            addCriterion("psam_id <", value, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdLessThanOrEqualTo(String value) {
            addCriterion("psam_id <=", value, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdIn(List<String> values) {
            addCriterion("psam_id in", values, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdNotIn(List<String> values) {
            addCriterion("psam_id not in", values, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdBetween(String value1, String value2) {
            addCriterion("psam_id between", value1, value2, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamIdNotBetween(String value1, String value2) {
            addCriterion("psam_id not between", value1, value2, "psamId");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameIsNull() {
            addCriterion("psam_prop_name is null");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameIsNotNull() {
            addCriterion("psam_prop_name is not null");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameEqualTo(String value) {
            addCriterion("psam_prop_name =", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameNotEqualTo(String value) {
            addCriterion("psam_prop_name <>", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameGreaterThan(String value) {
            addCriterion("psam_prop_name >", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameGreaterThanOrEqualTo(String value) {
            addCriterion("psam_prop_name >=", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameLessThan(String value) {
            addCriterion("psam_prop_name <", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameLessThanOrEqualTo(String value) {
            addCriterion("psam_prop_name <=", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameLike(String value) {
            addCriterion("psam_prop_name like", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameNotLike(String value) {
            addCriterion("psam_prop_name not like", value, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameIn(List<String> values) {
            addCriterion("psam_prop_name in", values, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameNotIn(List<String> values) {
            addCriterion("psam_prop_name not in", values, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameBetween(String value1, String value2) {
            addCriterion("psam_prop_name between", value1, value2, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropNameNotBetween(String value1, String value2) {
            addCriterion("psam_prop_name not between", value1, value2, "psamPropName");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueIsNull() {
            addCriterion("psam_prop_value is null");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueIsNotNull() {
            addCriterion("psam_prop_value is not null");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueEqualTo(String value) {
            addCriterion("psam_prop_value =", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueNotEqualTo(String value) {
            addCriterion("psam_prop_value <>", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueGreaterThan(String value) {
            addCriterion("psam_prop_value >", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueGreaterThanOrEqualTo(String value) {
            addCriterion("psam_prop_value >=", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueLessThan(String value) {
            addCriterion("psam_prop_value <", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueLessThanOrEqualTo(String value) {
            addCriterion("psam_prop_value <=", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueLike(String value) {
            addCriterion("psam_prop_value like", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueNotLike(String value) {
            addCriterion("psam_prop_value not like", value, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueIn(List<String> values) {
            addCriterion("psam_prop_value in", values, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueNotIn(List<String> values) {
            addCriterion("psam_prop_value not in", values, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueBetween(String value1, String value2) {
            addCriterion("psam_prop_value between", value1, value2, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropValueNotBetween(String value1, String value2) {
            addCriterion("psam_prop_value not between", value1, value2, "psamPropValue");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusIsNull() {
            addCriterion("psam_prop_status is null");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusIsNotNull() {
            addCriterion("psam_prop_status is not null");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusEqualTo(String value) {
            addCriterion("psam_prop_status =", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusNotEqualTo(String value) {
            addCriterion("psam_prop_status <>", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusGreaterThan(String value) {
            addCriterion("psam_prop_status >", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusGreaterThanOrEqualTo(String value) {
            addCriterion("psam_prop_status >=", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusLessThan(String value) {
            addCriterion("psam_prop_status <", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusLessThanOrEqualTo(String value) {
            addCriterion("psam_prop_status <=", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusLike(String value) {
            addCriterion("psam_prop_status like", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusNotLike(String value) {
            addCriterion("psam_prop_status not like", value, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusIn(List<String> values) {
            addCriterion("psam_prop_status in", values, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusNotIn(List<String> values) {
            addCriterion("psam_prop_status not in", values, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusBetween(String value1, String value2) {
            addCriterion("psam_prop_status between", value1, value2, "psamPropStatus");
            return (Criteria) this;
        }

        public Criteria andPsamPropStatusNotBetween(String value1, String value2) {
            addCriterion("psam_prop_status not between", value1, value2, "psamPropStatus");
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