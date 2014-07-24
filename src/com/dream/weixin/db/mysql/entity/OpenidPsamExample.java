package com.dream.weixin.db.mysql.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OpenidPsamExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public OpenidPsamExample() {
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

        public Criteria andOpenidPsamIdIsNull() {
            addCriterion("openid_psam_id is null");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdIsNotNull() {
            addCriterion("openid_psam_id is not null");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdEqualTo(Integer value) {
            addCriterion("openid_psam_id =", value, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdNotEqualTo(Integer value) {
            addCriterion("openid_psam_id <>", value, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdGreaterThan(Integer value) {
            addCriterion("openid_psam_id >", value, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("openid_psam_id >=", value, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdLessThan(Integer value) {
            addCriterion("openid_psam_id <", value, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdLessThanOrEqualTo(Integer value) {
            addCriterion("openid_psam_id <=", value, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdIn(List<Integer> values) {
            addCriterion("openid_psam_id in", values, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdNotIn(List<Integer> values) {
            addCriterion("openid_psam_id not in", values, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdBetween(Integer value1, Integer value2) {
            addCriterion("openid_psam_id between", value1, value2, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpenidPsamIdNotBetween(Integer value1, Integer value2) {
            addCriterion("openid_psam_id not between", value1, value2, "openidPsamId");
            return (Criteria) this;
        }

        public Criteria andOpPsamIsNull() {
            addCriterion("op_psam is null");
            return (Criteria) this;
        }

        public Criteria andOpPsamIsNotNull() {
            addCriterion("op_psam is not null");
            return (Criteria) this;
        }

        public Criteria andOpPsamEqualTo(String value) {
            addCriterion("op_psam =", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamNotEqualTo(String value) {
            addCriterion("op_psam <>", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamGreaterThan(String value) {
            addCriterion("op_psam >", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamGreaterThanOrEqualTo(String value) {
            addCriterion("op_psam >=", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamLessThan(String value) {
            addCriterion("op_psam <", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamLessThanOrEqualTo(String value) {
            addCriterion("op_psam <=", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamLike(String value) {
            addCriterion("op_psam like", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamNotLike(String value) {
            addCriterion("op_psam not like", value, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamIn(List<String> values) {
            addCriterion("op_psam in", values, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamNotIn(List<String> values) {
            addCriterion("op_psam not in", values, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamBetween(String value1, String value2) {
            addCriterion("op_psam between", value1, value2, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpPsamNotBetween(String value1, String value2) {
            addCriterion("op_psam not between", value1, value2, "opPsam");
            return (Criteria) this;
        }

        public Criteria andOpOpenidIsNull() {
            addCriterion("op_openid is null");
            return (Criteria) this;
        }

        public Criteria andOpOpenidIsNotNull() {
            addCriterion("op_openid is not null");
            return (Criteria) this;
        }

        public Criteria andOpOpenidEqualTo(String value) {
            addCriterion("op_openid =", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidNotEqualTo(String value) {
            addCriterion("op_openid <>", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidGreaterThan(String value) {
            addCriterion("op_openid >", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidGreaterThanOrEqualTo(String value) {
            addCriterion("op_openid >=", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidLessThan(String value) {
            addCriterion("op_openid <", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidLessThanOrEqualTo(String value) {
            addCriterion("op_openid <=", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidLike(String value) {
            addCriterion("op_openid like", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidNotLike(String value) {
            addCriterion("op_openid not like", value, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidIn(List<String> values) {
            addCriterion("op_openid in", values, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidNotIn(List<String> values) {
            addCriterion("op_openid not in", values, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidBetween(String value1, String value2) {
            addCriterion("op_openid between", value1, value2, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpOpenidNotBetween(String value1, String value2) {
            addCriterion("op_openid not between", value1, value2, "opOpenid");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeIsNull() {
            addCriterion("op_gem_code is null");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeIsNotNull() {
            addCriterion("op_gem_code is not null");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeEqualTo(String value) {
            addCriterion("op_gem_code =", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeNotEqualTo(String value) {
            addCriterion("op_gem_code <>", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeGreaterThan(String value) {
            addCriterion("op_gem_code >", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeGreaterThanOrEqualTo(String value) {
            addCriterion("op_gem_code >=", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeLessThan(String value) {
            addCriterion("op_gem_code <", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeLessThanOrEqualTo(String value) {
            addCriterion("op_gem_code <=", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeLike(String value) {
            addCriterion("op_gem_code like", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeNotLike(String value) {
            addCriterion("op_gem_code not like", value, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeIn(List<String> values) {
            addCriterion("op_gem_code in", values, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeNotIn(List<String> values) {
            addCriterion("op_gem_code not in", values, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeBetween(String value1, String value2) {
            addCriterion("op_gem_code between", value1, value2, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeNotBetween(String value1, String value2) {
            addCriterion("op_gem_code not between", value1, value2, "opGemCode");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeIsNull() {
            addCriterion("op_create_time is null");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeIsNotNull() {
            addCriterion("op_create_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeEqualTo(Date value) {
            addCriterion("op_create_time =", value, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeNotEqualTo(Date value) {
            addCriterion("op_create_time <>", value, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeGreaterThan(Date value) {
            addCriterion("op_create_time >", value, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_create_time >=", value, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeLessThan(Date value) {
            addCriterion("op_create_time <", value, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_create_time <=", value, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeIn(List<Date> values) {
            addCriterion("op_create_time in", values, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeNotIn(List<Date> values) {
            addCriterion("op_create_time not in", values, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeBetween(Date value1, Date value2) {
            addCriterion("op_create_time between", value1, value2, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_create_time not between", value1, value2, "opCreateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeIsNull() {
            addCriterion("op_update_time is null");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeIsNotNull() {
            addCriterion("op_update_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeEqualTo(Date value) {
            addCriterion("op_update_time =", value, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeNotEqualTo(Date value) {
            addCriterion("op_update_time <>", value, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeGreaterThan(Date value) {
            addCriterion("op_update_time >", value, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_update_time >=", value, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeLessThan(Date value) {
            addCriterion("op_update_time <", value, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_update_time <=", value, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeIn(List<Date> values) {
            addCriterion("op_update_time in", values, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeNotIn(List<Date> values) {
            addCriterion("op_update_time not in", values, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("op_update_time between", value1, value2, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_update_time not between", value1, value2, "opUpdateTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeIsNull() {
            addCriterion("op_invalid_time is null");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeIsNotNull() {
            addCriterion("op_invalid_time is not null");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeEqualTo(Date value) {
            addCriterion("op_invalid_time =", value, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeNotEqualTo(Date value) {
            addCriterion("op_invalid_time <>", value, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeGreaterThan(Date value) {
            addCriterion("op_invalid_time >", value, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("op_invalid_time >=", value, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeLessThan(Date value) {
            addCriterion("op_invalid_time <", value, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeLessThanOrEqualTo(Date value) {
            addCriterion("op_invalid_time <=", value, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeIn(List<Date> values) {
            addCriterion("op_invalid_time in", values, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeNotIn(List<Date> values) {
            addCriterion("op_invalid_time not in", values, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeBetween(Date value1, Date value2) {
            addCriterion("op_invalid_time between", value1, value2, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpInvalidTimeNotBetween(Date value1, Date value2) {
            addCriterion("op_invalid_time not between", value1, value2, "opInvalidTime");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNull() {
            addCriterion("op_status is null");
            return (Criteria) this;
        }

        public Criteria andOpStatusIsNotNull() {
            addCriterion("op_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpStatusEqualTo(String value) {
            addCriterion("op_status =", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotEqualTo(String value) {
            addCriterion("op_status <>", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThan(String value) {
            addCriterion("op_status >", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusGreaterThanOrEqualTo(String value) {
            addCriterion("op_status >=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThan(String value) {
            addCriterion("op_status <", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLessThanOrEqualTo(String value) {
            addCriterion("op_status <=", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusLike(String value) {
            addCriterion("op_status like", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotLike(String value) {
            addCriterion("op_status not like", value, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusIn(List<String> values) {
            addCriterion("op_status in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotIn(List<String> values) {
            addCriterion("op_status not in", values, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusBetween(String value1, String value2) {
            addCriterion("op_status between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpStatusNotBetween(String value1, String value2) {
            addCriterion("op_status not between", value1, value2, "opStatus");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNull() {
            addCriterion("op_type is null");
            return (Criteria) this;
        }

        public Criteria andOpTypeIsNotNull() {
            addCriterion("op_type is not null");
            return (Criteria) this;
        }

        public Criteria andOpTypeEqualTo(String value) {
            addCriterion("op_type =", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotEqualTo(String value) {
            addCriterion("op_type <>", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThan(String value) {
            addCriterion("op_type >", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeGreaterThanOrEqualTo(String value) {
            addCriterion("op_type >=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThan(String value) {
            addCriterion("op_type <", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLessThanOrEqualTo(String value) {
            addCriterion("op_type <=", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeLike(String value) {
            addCriterion("op_type like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotLike(String value) {
            addCriterion("op_type not like", value, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeIn(List<String> values) {
            addCriterion("op_type in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotIn(List<String> values) {
            addCriterion("op_type not in", values, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeBetween(String value1, String value2) {
            addCriterion("op_type between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpTypeNotBetween(String value1, String value2) {
            addCriterion("op_type not between", value1, value2, "opType");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusIsNull() {
            addCriterion("op_gem_code_status is null");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusIsNotNull() {
            addCriterion("op_gem_code_status is not null");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusEqualTo(String value) {
            addCriterion("op_gem_code_status =", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusNotEqualTo(String value) {
            addCriterion("op_gem_code_status <>", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusGreaterThan(String value) {
            addCriterion("op_gem_code_status >", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusGreaterThanOrEqualTo(String value) {
            addCriterion("op_gem_code_status >=", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusLessThan(String value) {
            addCriterion("op_gem_code_status <", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusLessThanOrEqualTo(String value) {
            addCriterion("op_gem_code_status <=", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusLike(String value) {
            addCriterion("op_gem_code_status like", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusNotLike(String value) {
            addCriterion("op_gem_code_status not like", value, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusIn(List<String> values) {
            addCriterion("op_gem_code_status in", values, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusNotIn(List<String> values) {
            addCriterion("op_gem_code_status not in", values, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusBetween(String value1, String value2) {
            addCriterion("op_gem_code_status between", value1, value2, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemCodeStatusNotBetween(String value1, String value2) {
            addCriterion("op_gem_code_status not between", value1, value2, "opGemCodeStatus");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeIsNull() {
            addCriterion("op_gem_grade is null");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeIsNotNull() {
            addCriterion("op_gem_grade is not null");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeEqualTo(String value) {
            addCriterion("op_gem_grade =", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeNotEqualTo(String value) {
            addCriterion("op_gem_grade <>", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeGreaterThan(String value) {
            addCriterion("op_gem_grade >", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeGreaterThanOrEqualTo(String value) {
            addCriterion("op_gem_grade >=", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeLessThan(String value) {
            addCriterion("op_gem_grade <", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeLessThanOrEqualTo(String value) {
            addCriterion("op_gem_grade <=", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeLike(String value) {
            addCriterion("op_gem_grade like", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeNotLike(String value) {
            addCriterion("op_gem_grade not like", value, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeIn(List<String> values) {
            addCriterion("op_gem_grade in", values, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeNotIn(List<String> values) {
            addCriterion("op_gem_grade not in", values, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeBetween(String value1, String value2) {
            addCriterion("op_gem_grade between", value1, value2, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andOpGemGradeNotBetween(String value1, String value2) {
            addCriterion("op_gem_grade not between", value1, value2, "opGemGrade");
            return (Criteria) this;
        }

        public Criteria andQqCodeIsNull() {
            addCriterion("qq_code is null");
            return (Criteria) this;
        }

        public Criteria andQqCodeIsNotNull() {
            addCriterion("qq_code is not null");
            return (Criteria) this;
        }

        public Criteria andQqCodeEqualTo(String value) {
            addCriterion("qq_code =", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeNotEqualTo(String value) {
            addCriterion("qq_code <>", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeGreaterThan(String value) {
            addCriterion("qq_code >", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeGreaterThanOrEqualTo(String value) {
            addCriterion("qq_code >=", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeLessThan(String value) {
            addCriterion("qq_code <", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeLessThanOrEqualTo(String value) {
            addCriterion("qq_code <=", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeLike(String value) {
            addCriterion("qq_code like", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeNotLike(String value) {
            addCriterion("qq_code not like", value, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeIn(List<String> values) {
            addCriterion("qq_code in", values, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeNotIn(List<String> values) {
            addCriterion("qq_code not in", values, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeBetween(String value1, String value2) {
            addCriterion("qq_code between", value1, value2, "qqCode");
            return (Criteria) this;
        }

        public Criteria andQqCodeNotBetween(String value1, String value2) {
            addCriterion("qq_code not between", value1, value2, "qqCode");
            return (Criteria) this;
        }

        public Criteria andOtherOneIsNull() {
            addCriterion("other_one is null");
            return (Criteria) this;
        }

        public Criteria andOtherOneIsNotNull() {
            addCriterion("other_one is not null");
            return (Criteria) this;
        }

        public Criteria andOtherOneEqualTo(String value) {
            addCriterion("other_one =", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneNotEqualTo(String value) {
            addCriterion("other_one <>", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneGreaterThan(String value) {
            addCriterion("other_one >", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneGreaterThanOrEqualTo(String value) {
            addCriterion("other_one >=", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneLessThan(String value) {
            addCriterion("other_one <", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneLessThanOrEqualTo(String value) {
            addCriterion("other_one <=", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneLike(String value) {
            addCriterion("other_one like", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneNotLike(String value) {
            addCriterion("other_one not like", value, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneIn(List<String> values) {
            addCriterion("other_one in", values, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneNotIn(List<String> values) {
            addCriterion("other_one not in", values, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneBetween(String value1, String value2) {
            addCriterion("other_one between", value1, value2, "otherOne");
            return (Criteria) this;
        }

        public Criteria andOtherOneNotBetween(String value1, String value2) {
            addCriterion("other_one not between", value1, value2, "otherOne");
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