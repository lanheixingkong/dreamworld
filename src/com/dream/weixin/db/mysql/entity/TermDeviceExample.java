package com.dream.weixin.db.mysql.entity;

import java.util.ArrayList;
import java.util.List;

public class TermDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public TermDeviceExample() {
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

        public Criteria andDeviceCodeIsNull() {
            addCriterion("device_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIsNotNull() {
            addCriterion("device_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeEqualTo(String value) {
            addCriterion("device_code =", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotEqualTo(String value) {
            addCriterion("device_code <>", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThan(String value) {
            addCriterion("device_code >", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_code >=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThan(String value) {
            addCriterion("device_code <", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLessThanOrEqualTo(String value) {
            addCriterion("device_code <=", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeLike(String value) {
            addCriterion("device_code like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotLike(String value) {
            addCriterion("device_code not like", value, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeIn(List<String> values) {
            addCriterion("device_code in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotIn(List<String> values) {
            addCriterion("device_code not in", values, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeBetween(String value1, String value2) {
            addCriterion("device_code between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceCodeNotBetween(String value1, String value2) {
            addCriterion("device_code not between", value1, value2, "deviceCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeIsNull() {
            addCriterion("device_erp_code is null");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeIsNotNull() {
            addCriterion("device_erp_code is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeEqualTo(String value) {
            addCriterion("device_erp_code =", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeNotEqualTo(String value) {
            addCriterion("device_erp_code <>", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeGreaterThan(String value) {
            addCriterion("device_erp_code >", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeGreaterThanOrEqualTo(String value) {
            addCriterion("device_erp_code >=", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeLessThan(String value) {
            addCriterion("device_erp_code <", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeLessThanOrEqualTo(String value) {
            addCriterion("device_erp_code <=", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeLike(String value) {
            addCriterion("device_erp_code like", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeNotLike(String value) {
            addCriterion("device_erp_code not like", value, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeIn(List<String> values) {
            addCriterion("device_erp_code in", values, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeNotIn(List<String> values) {
            addCriterion("device_erp_code not in", values, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeBetween(String value1, String value2) {
            addCriterion("device_erp_code between", value1, value2, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andDeviceErpCodeNotBetween(String value1, String value2) {
            addCriterion("device_erp_code not between", value1, value2, "deviceErpCode");
            return (Criteria) this;
        }

        public Criteria andTCodeIsNull() {
            addCriterion("t_code is null");
            return (Criteria) this;
        }

        public Criteria andTCodeIsNotNull() {
            addCriterion("t_code is not null");
            return (Criteria) this;
        }

        public Criteria andTCodeEqualTo(String value) {
            addCriterion("t_code =", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeNotEqualTo(String value) {
            addCriterion("t_code <>", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeGreaterThan(String value) {
            addCriterion("t_code >", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeGreaterThanOrEqualTo(String value) {
            addCriterion("t_code >=", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeLessThan(String value) {
            addCriterion("t_code <", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeLessThanOrEqualTo(String value) {
            addCriterion("t_code <=", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeLike(String value) {
            addCriterion("t_code like", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeNotLike(String value) {
            addCriterion("t_code not like", value, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeIn(List<String> values) {
            addCriterion("t_code in", values, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeNotIn(List<String> values) {
            addCriterion("t_code not in", values, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeBetween(String value1, String value2) {
            addCriterion("t_code between", value1, value2, "tCode");
            return (Criteria) this;
        }

        public Criteria andTCodeNotBetween(String value1, String value2) {
            addCriterion("t_code not between", value1, value2, "tCode");
            return (Criteria) this;
        }

        public Criteria andPsamIsNull() {
            addCriterion("psam is null");
            return (Criteria) this;
        }

        public Criteria andPsamIsNotNull() {
            addCriterion("psam is not null");
            return (Criteria) this;
        }

        public Criteria andPsamEqualTo(String value) {
            addCriterion("psam =", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamNotEqualTo(String value) {
            addCriterion("psam <>", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamGreaterThan(String value) {
            addCriterion("psam >", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamGreaterThanOrEqualTo(String value) {
            addCriterion("psam >=", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamLessThan(String value) {
            addCriterion("psam <", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamLessThanOrEqualTo(String value) {
            addCriterion("psam <=", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamLike(String value) {
            addCriterion("psam like", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamNotLike(String value) {
            addCriterion("psam not like", value, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamIn(List<String> values) {
            addCriterion("psam in", values, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamNotIn(List<String> values) {
            addCriterion("psam not in", values, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamBetween(String value1, String value2) {
            addCriterion("psam between", value1, value2, "psam");
            return (Criteria) this;
        }

        public Criteria andPsamNotBetween(String value1, String value2) {
            addCriterion("psam not between", value1, value2, "psam");
            return (Criteria) this;
        }

        public Criteria andNetNoIsNull() {
            addCriterion("net_no is null");
            return (Criteria) this;
        }

        public Criteria andNetNoIsNotNull() {
            addCriterion("net_no is not null");
            return (Criteria) this;
        }

        public Criteria andNetNoEqualTo(String value) {
            addCriterion("net_no =", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoNotEqualTo(String value) {
            addCriterion("net_no <>", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoGreaterThan(String value) {
            addCriterion("net_no >", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoGreaterThanOrEqualTo(String value) {
            addCriterion("net_no >=", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoLessThan(String value) {
            addCriterion("net_no <", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoLessThanOrEqualTo(String value) {
            addCriterion("net_no <=", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoLike(String value) {
            addCriterion("net_no like", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoNotLike(String value) {
            addCriterion("net_no not like", value, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoIn(List<String> values) {
            addCriterion("net_no in", values, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoNotIn(List<String> values) {
            addCriterion("net_no not in", values, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoBetween(String value1, String value2) {
            addCriterion("net_no between", value1, value2, "netNo");
            return (Criteria) this;
        }

        public Criteria andNetNoNotBetween(String value1, String value2) {
            addCriterion("net_no not between", value1, value2, "netNo");
            return (Criteria) this;
        }

        public Criteria andTNoIsNull() {
            addCriterion("t_no is null");
            return (Criteria) this;
        }

        public Criteria andTNoIsNotNull() {
            addCriterion("t_no is not null");
            return (Criteria) this;
        }

        public Criteria andTNoEqualTo(String value) {
            addCriterion("t_no =", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotEqualTo(String value) {
            addCriterion("t_no <>", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThan(String value) {
            addCriterion("t_no >", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoGreaterThanOrEqualTo(String value) {
            addCriterion("t_no >=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThan(String value) {
            addCriterion("t_no <", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLessThanOrEqualTo(String value) {
            addCriterion("t_no <=", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoLike(String value) {
            addCriterion("t_no like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotLike(String value) {
            addCriterion("t_no not like", value, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoIn(List<String> values) {
            addCriterion("t_no in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotIn(List<String> values) {
            addCriterion("t_no not in", values, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoBetween(String value1, String value2) {
            addCriterion("t_no between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTNoNotBetween(String value1, String value2) {
            addCriterion("t_no not between", value1, value2, "tNo");
            return (Criteria) this;
        }

        public Criteria andTExtIsNull() {
            addCriterion("t_ext is null");
            return (Criteria) this;
        }

        public Criteria andTExtIsNotNull() {
            addCriterion("t_ext is not null");
            return (Criteria) this;
        }

        public Criteria andTExtEqualTo(String value) {
            addCriterion("t_ext =", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtNotEqualTo(String value) {
            addCriterion("t_ext <>", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtGreaterThan(String value) {
            addCriterion("t_ext >", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtGreaterThanOrEqualTo(String value) {
            addCriterion("t_ext >=", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtLessThan(String value) {
            addCriterion("t_ext <", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtLessThanOrEqualTo(String value) {
            addCriterion("t_ext <=", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtLike(String value) {
            addCriterion("t_ext like", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtNotLike(String value) {
            addCriterion("t_ext not like", value, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtIn(List<String> values) {
            addCriterion("t_ext in", values, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtNotIn(List<String> values) {
            addCriterion("t_ext not in", values, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtBetween(String value1, String value2) {
            addCriterion("t_ext between", value1, value2, "tExt");
            return (Criteria) this;
        }

        public Criteria andTExtNotBetween(String value1, String value2) {
            addCriterion("t_ext not between", value1, value2, "tExt");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNull() {
            addCriterion("platform is null");
            return (Criteria) this;
        }

        public Criteria andPlatformIsNotNull() {
            addCriterion("platform is not null");
            return (Criteria) this;
        }

        public Criteria andPlatformEqualTo(String value) {
            addCriterion("platform =", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotEqualTo(String value) {
            addCriterion("platform <>", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThan(String value) {
            addCriterion("platform >", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformGreaterThanOrEqualTo(String value) {
            addCriterion("platform >=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThan(String value) {
            addCriterion("platform <", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLessThanOrEqualTo(String value) {
            addCriterion("platform <=", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformLike(String value) {
            addCriterion("platform like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotLike(String value) {
            addCriterion("platform not like", value, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformIn(List<String> values) {
            addCriterion("platform in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotIn(List<String> values) {
            addCriterion("platform not in", values, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformBetween(String value1, String value2) {
            addCriterion("platform between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andPlatformNotBetween(String value1, String value2) {
            addCriterion("platform not between", value1, value2, "platform");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNull() {
            addCriterion("open_date is null");
            return (Criteria) this;
        }

        public Criteria andOpenDateIsNotNull() {
            addCriterion("open_date is not null");
            return (Criteria) this;
        }

        public Criteria andOpenDateEqualTo(String value) {
            addCriterion("open_date =", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotEqualTo(String value) {
            addCriterion("open_date <>", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThan(String value) {
            addCriterion("open_date >", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateGreaterThanOrEqualTo(String value) {
            addCriterion("open_date >=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThan(String value) {
            addCriterion("open_date <", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLessThanOrEqualTo(String value) {
            addCriterion("open_date <=", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateLike(String value) {
            addCriterion("open_date like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotLike(String value) {
            addCriterion("open_date not like", value, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateIn(List<String> values) {
            addCriterion("open_date in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotIn(List<String> values) {
            addCriterion("open_date not in", values, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateBetween(String value1, String value2) {
            addCriterion("open_date between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andOpenDateNotBetween(String value1, String value2) {
            addCriterion("open_date not between", value1, value2, "openDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNull() {
            addCriterion("close_date is null");
            return (Criteria) this;
        }

        public Criteria andCloseDateIsNotNull() {
            addCriterion("close_date is not null");
            return (Criteria) this;
        }

        public Criteria andCloseDateEqualTo(String value) {
            addCriterion("close_date =", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotEqualTo(String value) {
            addCriterion("close_date <>", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThan(String value) {
            addCriterion("close_date >", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateGreaterThanOrEqualTo(String value) {
            addCriterion("close_date >=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThan(String value) {
            addCriterion("close_date <", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLessThanOrEqualTo(String value) {
            addCriterion("close_date <=", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateLike(String value) {
            addCriterion("close_date like", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotLike(String value) {
            addCriterion("close_date not like", value, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateIn(List<String> values) {
            addCriterion("close_date in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotIn(List<String> values) {
            addCriterion("close_date not in", values, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateBetween(String value1, String value2) {
            addCriterion("close_date between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andCloseDateNotBetween(String value1, String value2) {
            addCriterion("close_date not between", value1, value2, "closeDate");
            return (Criteria) this;
        }

        public Criteria andStateIsNull() {
            addCriterion("state is null");
            return (Criteria) this;
        }

        public Criteria andStateIsNotNull() {
            addCriterion("state is not null");
            return (Criteria) this;
        }

        public Criteria andStateEqualTo(String value) {
            addCriterion("state =", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotEqualTo(String value) {
            addCriterion("state <>", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThan(String value) {
            addCriterion("state >", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateGreaterThanOrEqualTo(String value) {
            addCriterion("state >=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThan(String value) {
            addCriterion("state <", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLessThanOrEqualTo(String value) {
            addCriterion("state <=", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateLike(String value) {
            addCriterion("state like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotLike(String value) {
            addCriterion("state not like", value, "state");
            return (Criteria) this;
        }

        public Criteria andStateIn(List<String> values) {
            addCriterion("state in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotIn(List<String> values) {
            addCriterion("state not in", values, "state");
            return (Criteria) this;
        }

        public Criteria andStateBetween(String value1, String value2) {
            addCriterion("state between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andStateNotBetween(String value1, String value2) {
            addCriterion("state not between", value1, value2, "state");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryIsNull() {
            addCriterion("machine_factory is null");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryIsNotNull() {
            addCriterion("machine_factory is not null");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryEqualTo(String value) {
            addCriterion("machine_factory =", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryNotEqualTo(String value) {
            addCriterion("machine_factory <>", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryGreaterThan(String value) {
            addCriterion("machine_factory >", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryGreaterThanOrEqualTo(String value) {
            addCriterion("machine_factory >=", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryLessThan(String value) {
            addCriterion("machine_factory <", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryLessThanOrEqualTo(String value) {
            addCriterion("machine_factory <=", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryLike(String value) {
            addCriterion("machine_factory like", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryNotLike(String value) {
            addCriterion("machine_factory not like", value, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryIn(List<String> values) {
            addCriterion("machine_factory in", values, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryNotIn(List<String> values) {
            addCriterion("machine_factory not in", values, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryBetween(String value1, String value2) {
            addCriterion("machine_factory between", value1, value2, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineFactoryNotBetween(String value1, String value2) {
            addCriterion("machine_factory not between", value1, value2, "machineFactory");
            return (Criteria) this;
        }

        public Criteria andMachineKindIsNull() {
            addCriterion("machine_kind is null");
            return (Criteria) this;
        }

        public Criteria andMachineKindIsNotNull() {
            addCriterion("machine_kind is not null");
            return (Criteria) this;
        }

        public Criteria andMachineKindEqualTo(String value) {
            addCriterion("machine_kind =", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindNotEqualTo(String value) {
            addCriterion("machine_kind <>", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindGreaterThan(String value) {
            addCriterion("machine_kind >", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindGreaterThanOrEqualTo(String value) {
            addCriterion("machine_kind >=", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindLessThan(String value) {
            addCriterion("machine_kind <", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindLessThanOrEqualTo(String value) {
            addCriterion("machine_kind <=", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindLike(String value) {
            addCriterion("machine_kind like", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindNotLike(String value) {
            addCriterion("machine_kind not like", value, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindIn(List<String> values) {
            addCriterion("machine_kind in", values, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindNotIn(List<String> values) {
            addCriterion("machine_kind not in", values, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindBetween(String value1, String value2) {
            addCriterion("machine_kind between", value1, value2, "machineKind");
            return (Criteria) this;
        }

        public Criteria andMachineKindNotBetween(String value1, String value2) {
            addCriterion("machine_kind not between", value1, value2, "machineKind");
            return (Criteria) this;
        }

        public Criteria andHasChassisIsNull() {
            addCriterion("has_chassis is null");
            return (Criteria) this;
        }

        public Criteria andHasChassisIsNotNull() {
            addCriterion("has_chassis is not null");
            return (Criteria) this;
        }

        public Criteria andHasChassisEqualTo(String value) {
            addCriterion("has_chassis =", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisNotEqualTo(String value) {
            addCriterion("has_chassis <>", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisGreaterThan(String value) {
            addCriterion("has_chassis >", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisGreaterThanOrEqualTo(String value) {
            addCriterion("has_chassis >=", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisLessThan(String value) {
            addCriterion("has_chassis <", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisLessThanOrEqualTo(String value) {
            addCriterion("has_chassis <=", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisLike(String value) {
            addCriterion("has_chassis like", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisNotLike(String value) {
            addCriterion("has_chassis not like", value, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisIn(List<String> values) {
            addCriterion("has_chassis in", values, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisNotIn(List<String> values) {
            addCriterion("has_chassis not in", values, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisBetween(String value1, String value2) {
            addCriterion("has_chassis between", value1, value2, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andHasChassisNotBetween(String value1, String value2) {
            addCriterion("has_chassis not between", value1, value2, "hasChassis");
            return (Criteria) this;
        }

        public Criteria andChassisKindIsNull() {
            addCriterion("chassis_kind is null");
            return (Criteria) this;
        }

        public Criteria andChassisKindIsNotNull() {
            addCriterion("chassis_kind is not null");
            return (Criteria) this;
        }

        public Criteria andChassisKindEqualTo(String value) {
            addCriterion("chassis_kind =", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindNotEqualTo(String value) {
            addCriterion("chassis_kind <>", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindGreaterThan(String value) {
            addCriterion("chassis_kind >", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindGreaterThanOrEqualTo(String value) {
            addCriterion("chassis_kind >=", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindLessThan(String value) {
            addCriterion("chassis_kind <", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindLessThanOrEqualTo(String value) {
            addCriterion("chassis_kind <=", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindLike(String value) {
            addCriterion("chassis_kind like", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindNotLike(String value) {
            addCriterion("chassis_kind not like", value, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindIn(List<String> values) {
            addCriterion("chassis_kind in", values, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindNotIn(List<String> values) {
            addCriterion("chassis_kind not in", values, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindBetween(String value1, String value2) {
            addCriterion("chassis_kind between", value1, value2, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andChassisKindNotBetween(String value1, String value2) {
            addCriterion("chassis_kind not between", value1, value2, "chassisKind");
            return (Criteria) this;
        }

        public Criteria andHasScreenIsNull() {
            addCriterion("has_screen is null");
            return (Criteria) this;
        }

        public Criteria andHasScreenIsNotNull() {
            addCriterion("has_screen is not null");
            return (Criteria) this;
        }

        public Criteria andHasScreenEqualTo(String value) {
            addCriterion("has_screen =", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenNotEqualTo(String value) {
            addCriterion("has_screen <>", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenGreaterThan(String value) {
            addCriterion("has_screen >", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenGreaterThanOrEqualTo(String value) {
            addCriterion("has_screen >=", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenLessThan(String value) {
            addCriterion("has_screen <", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenLessThanOrEqualTo(String value) {
            addCriterion("has_screen <=", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenLike(String value) {
            addCriterion("has_screen like", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenNotLike(String value) {
            addCriterion("has_screen not like", value, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenIn(List<String> values) {
            addCriterion("has_screen in", values, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenNotIn(List<String> values) {
            addCriterion("has_screen not in", values, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenBetween(String value1, String value2) {
            addCriterion("has_screen between", value1, value2, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andHasScreenNotBetween(String value1, String value2) {
            addCriterion("has_screen not between", value1, value2, "hasScreen");
            return (Criteria) this;
        }

        public Criteria andScreenKindIsNull() {
            addCriterion("screen_kind is null");
            return (Criteria) this;
        }

        public Criteria andScreenKindIsNotNull() {
            addCriterion("screen_kind is not null");
            return (Criteria) this;
        }

        public Criteria andScreenKindEqualTo(String value) {
            addCriterion("screen_kind =", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindNotEqualTo(String value) {
            addCriterion("screen_kind <>", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindGreaterThan(String value) {
            addCriterion("screen_kind >", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindGreaterThanOrEqualTo(String value) {
            addCriterion("screen_kind >=", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindLessThan(String value) {
            addCriterion("screen_kind <", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindLessThanOrEqualTo(String value) {
            addCriterion("screen_kind <=", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindLike(String value) {
            addCriterion("screen_kind like", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindNotLike(String value) {
            addCriterion("screen_kind not like", value, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindIn(List<String> values) {
            addCriterion("screen_kind in", values, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindNotIn(List<String> values) {
            addCriterion("screen_kind not in", values, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindBetween(String value1, String value2) {
            addCriterion("screen_kind between", value1, value2, "screenKind");
            return (Criteria) this;
        }

        public Criteria andScreenKindNotBetween(String value1, String value2) {
            addCriterion("screen_kind not between", value1, value2, "screenKind");
            return (Criteria) this;
        }

        public Criteria andMenuVerIsNull() {
            addCriterion("menu_ver is null");
            return (Criteria) this;
        }

        public Criteria andMenuVerIsNotNull() {
            addCriterion("menu_ver is not null");
            return (Criteria) this;
        }

        public Criteria andMenuVerEqualTo(String value) {
            addCriterion("menu_ver =", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerNotEqualTo(String value) {
            addCriterion("menu_ver <>", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerGreaterThan(String value) {
            addCriterion("menu_ver >", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerGreaterThanOrEqualTo(String value) {
            addCriterion("menu_ver >=", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerLessThan(String value) {
            addCriterion("menu_ver <", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerLessThanOrEqualTo(String value) {
            addCriterion("menu_ver <=", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerLike(String value) {
            addCriterion("menu_ver like", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerNotLike(String value) {
            addCriterion("menu_ver not like", value, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerIn(List<String> values) {
            addCriterion("menu_ver in", values, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerNotIn(List<String> values) {
            addCriterion("menu_ver not in", values, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerBetween(String value1, String value2) {
            addCriterion("menu_ver between", value1, value2, "menuVer");
            return (Criteria) this;
        }

        public Criteria andMenuVerNotBetween(String value1, String value2) {
            addCriterion("menu_ver not between", value1, value2, "menuVer");
            return (Criteria) this;
        }

        public Criteria andTsUpIsNull() {
            addCriterion("ts_up is null");
            return (Criteria) this;
        }

        public Criteria andTsUpIsNotNull() {
            addCriterion("ts_up is not null");
            return (Criteria) this;
        }

        public Criteria andTsUpEqualTo(String value) {
            addCriterion("ts_up =", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpNotEqualTo(String value) {
            addCriterion("ts_up <>", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpGreaterThan(String value) {
            addCriterion("ts_up >", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpGreaterThanOrEqualTo(String value) {
            addCriterion("ts_up >=", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpLessThan(String value) {
            addCriterion("ts_up <", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpLessThanOrEqualTo(String value) {
            addCriterion("ts_up <=", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpLike(String value) {
            addCriterion("ts_up like", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpNotLike(String value) {
            addCriterion("ts_up not like", value, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpIn(List<String> values) {
            addCriterion("ts_up in", values, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpNotIn(List<String> values) {
            addCriterion("ts_up not in", values, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpBetween(String value1, String value2) {
            addCriterion("ts_up between", value1, value2, "tsUp");
            return (Criteria) this;
        }

        public Criteria andTsUpNotBetween(String value1, String value2) {
            addCriterion("ts_up not between", value1, value2, "tsUp");
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