package com.dream.weixin.db.mysql.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class B2cOrderExample {
	
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    protected Integer limitStart;

    protected Integer limitEnd;

    public B2cOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Long value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Long value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Long value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Long value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Long value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Long value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Long> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Long> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Long value1, Long value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Long value1, Long value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
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

        public Criteria andGysidsIsNull() {
            addCriterion("gysids is null");
            return (Criteria) this;
        }

        public Criteria andGysidsIsNotNull() {
            addCriterion("gysids is not null");
            return (Criteria) this;
        }

        public Criteria andGysidsEqualTo(String value) {
            addCriterion("gysids =", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsNotEqualTo(String value) {
            addCriterion("gysids <>", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsGreaterThan(String value) {
            addCriterion("gysids >", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsGreaterThanOrEqualTo(String value) {
            addCriterion("gysids >=", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsLessThan(String value) {
            addCriterion("gysids <", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsLessThanOrEqualTo(String value) {
            addCriterion("gysids <=", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsLike(String value) {
            addCriterion("gysids like", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsNotLike(String value) {
            addCriterion("gysids not like", value, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsIn(List<String> values) {
            addCriterion("gysids in", values, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsNotIn(List<String> values) {
            addCriterion("gysids not in", values, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsBetween(String value1, String value2) {
            addCriterion("gysids between", value1, value2, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysidsNotBetween(String value1, String value2) {
            addCriterion("gysids not between", value1, value2, "gysids");
            return (Criteria) this;
        }

        public Criteria andGysNameIsNull() {
            addCriterion("gys_name is null");
            return (Criteria) this;
        }

        public Criteria andGysNameIsNotNull() {
            addCriterion("gys_name is not null");
            return (Criteria) this;
        }

        public Criteria andGysNameEqualTo(String value) {
            addCriterion("gys_name =", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotEqualTo(String value) {
            addCriterion("gys_name <>", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameGreaterThan(String value) {
            addCriterion("gys_name >", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameGreaterThanOrEqualTo(String value) {
            addCriterion("gys_name >=", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLessThan(String value) {
            addCriterion("gys_name <", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLessThanOrEqualTo(String value) {
            addCriterion("gys_name <=", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameLike(String value) {
            addCriterion("gys_name like", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotLike(String value) {
            addCriterion("gys_name not like", value, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameIn(List<String> values) {
            addCriterion("gys_name in", values, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotIn(List<String> values) {
            addCriterion("gys_name not in", values, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameBetween(String value1, String value2) {
            addCriterion("gys_name between", value1, value2, "gysName");
            return (Criteria) this;
        }

        public Criteria andGysNameNotBetween(String value1, String value2) {
            addCriterion("gys_name not between", value1, value2, "gysName");
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

        public Criteria andBillnoIsNull() {
            addCriterion("billno is null");
            return (Criteria) this;
        }

        public Criteria andBillnoIsNotNull() {
            addCriterion("billno is not null");
            return (Criteria) this;
        }

        public Criteria andBillnoEqualTo(String value) {
            addCriterion("billno =", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotEqualTo(String value) {
            addCriterion("billno <>", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThan(String value) {
            addCriterion("billno >", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoGreaterThanOrEqualTo(String value) {
            addCriterion("billno >=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThan(String value) {
            addCriterion("billno <", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLessThanOrEqualTo(String value) {
            addCriterion("billno <=", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoLike(String value) {
            addCriterion("billno like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotLike(String value) {
            addCriterion("billno not like", value, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoIn(List<String> values) {
            addCriterion("billno in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotIn(List<String> values) {
            addCriterion("billno not in", values, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoBetween(String value1, String value2) {
            addCriterion("billno between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andBillnoNotBetween(String value1, String value2) {
            addCriterion("billno not between", value1, value2, "billno");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNull() {
            addCriterion("pay_time is null");
            return (Criteria) this;
        }

        public Criteria andPayTimeIsNotNull() {
            addCriterion("pay_time is not null");
            return (Criteria) this;
        }

        public Criteria andPayTimeEqualTo(String value) {
            addCriterion("pay_time =", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotEqualTo(String value) {
            addCriterion("pay_time <>", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThan(String value) {
            addCriterion("pay_time >", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeGreaterThanOrEqualTo(String value) {
            addCriterion("pay_time >=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThan(String value) {
            addCriterion("pay_time <", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLessThanOrEqualTo(String value) {
            addCriterion("pay_time <=", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeLike(String value) {
            addCriterion("pay_time like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotLike(String value) {
            addCriterion("pay_time not like", value, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeIn(List<String> values) {
            addCriterion("pay_time in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotIn(List<String> values) {
            addCriterion("pay_time not in", values, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeBetween(String value1, String value2) {
            addCriterion("pay_time between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andPayTimeNotBetween(String value1, String value2) {
            addCriterion("pay_time not between", value1, value2, "payTime");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNull() {
            addCriterion("total_amount is null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIsNotNull() {
            addCriterion("total_amount is not null");
            return (Criteria) this;
        }

        public Criteria andTotalAmountEqualTo(BigDecimal value) {
            addCriterion("total_amount =", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotEqualTo(BigDecimal value) {
            addCriterion("total_amount <>", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThan(BigDecimal value) {
            addCriterion("total_amount >", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount >=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThan(BigDecimal value) {
            addCriterion("total_amount <", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("total_amount <=", value, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountIn(List<BigDecimal> values) {
            addCriterion("total_amount in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotIn(List<BigDecimal> values) {
            addCriterion("total_amount not in", values, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andTotalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("total_amount not between", value1, value2, "totalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountIsNull() {
            addCriterion("final_amount is null");
            return (Criteria) this;
        }

        public Criteria andFinalAmountIsNotNull() {
            addCriterion("final_amount is not null");
            return (Criteria) this;
        }

        public Criteria andFinalAmountEqualTo(BigDecimal value) {
            addCriterion("final_amount =", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountNotEqualTo(BigDecimal value) {
            addCriterion("final_amount <>", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountGreaterThan(BigDecimal value) {
            addCriterion("final_amount >", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("final_amount >=", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountLessThan(BigDecimal value) {
            addCriterion("final_amount <", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("final_amount <=", value, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountIn(List<BigDecimal> values) {
            addCriterion("final_amount in", values, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountNotIn(List<BigDecimal> values) {
            addCriterion("final_amount not in", values, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_amount between", value1, value2, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andFinalAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("final_amount not between", value1, value2, "finalAmount");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNull() {
            addCriterion("pay_status is null");
            return (Criteria) this;
        }

        public Criteria andPayStatusIsNotNull() {
            addCriterion("pay_status is not null");
            return (Criteria) this;
        }

        public Criteria andPayStatusEqualTo(String value) {
            addCriterion("pay_status =", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotEqualTo(String value) {
            addCriterion("pay_status <>", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThan(String value) {
            addCriterion("pay_status >", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusGreaterThanOrEqualTo(String value) {
            addCriterion("pay_status >=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThan(String value) {
            addCriterion("pay_status <", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLessThanOrEqualTo(String value) {
            addCriterion("pay_status <=", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusLike(String value) {
            addCriterion("pay_status like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotLike(String value) {
            addCriterion("pay_status not like", value, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusIn(List<String> values) {
            addCriterion("pay_status in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotIn(List<String> values) {
            addCriterion("pay_status not in", values, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusBetween(String value1, String value2) {
            addCriterion("pay_status between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andPayStatusNotBetween(String value1, String value2) {
            addCriterion("pay_status not between", value1, value2, "payStatus");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeIsNull() {
            addCriterion("quhuotime is null");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeIsNotNull() {
            addCriterion("quhuotime is not null");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeEqualTo(String value) {
            addCriterion("quhuotime =", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeNotEqualTo(String value) {
            addCriterion("quhuotime <>", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeGreaterThan(String value) {
            addCriterion("quhuotime >", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeGreaterThanOrEqualTo(String value) {
            addCriterion("quhuotime >=", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeLessThan(String value) {
            addCriterion("quhuotime <", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeLessThanOrEqualTo(String value) {
            addCriterion("quhuotime <=", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeLike(String value) {
            addCriterion("quhuotime like", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeNotLike(String value) {
            addCriterion("quhuotime not like", value, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeIn(List<String> values) {
            addCriterion("quhuotime in", values, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeNotIn(List<String> values) {
            addCriterion("quhuotime not in", values, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeBetween(String value1, String value2) {
            addCriterion("quhuotime between", value1, value2, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andQuhuotimeNotBetween(String value1, String value2) {
            addCriterion("quhuotime not between", value1, value2, "quhuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeIsNull() {
            addCriterion("daohuotime is null");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeIsNotNull() {
            addCriterion("daohuotime is not null");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeEqualTo(String value) {
            addCriterion("daohuotime =", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeNotEqualTo(String value) {
            addCriterion("daohuotime <>", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeGreaterThan(String value) {
            addCriterion("daohuotime >", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeGreaterThanOrEqualTo(String value) {
            addCriterion("daohuotime >=", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeLessThan(String value) {
            addCriterion("daohuotime <", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeLessThanOrEqualTo(String value) {
            addCriterion("daohuotime <=", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeLike(String value) {
            addCriterion("daohuotime like", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeNotLike(String value) {
            addCriterion("daohuotime not like", value, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeIn(List<String> values) {
            addCriterion("daohuotime in", values, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeNotIn(List<String> values) {
            addCriterion("daohuotime not in", values, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeBetween(String value1, String value2) {
            addCriterion("daohuotime between", value1, value2, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andDaohuotimeNotBetween(String value1, String value2) {
            addCriterion("daohuotime not between", value1, value2, "daohuotime");
            return (Criteria) this;
        }

        public Criteria andIsqianshouIsNull() {
            addCriterion("isqianshou is null");
            return (Criteria) this;
        }

        public Criteria andIsqianshouIsNotNull() {
            addCriterion("isqianshou is not null");
            return (Criteria) this;
        }

        public Criteria andIsqianshouEqualTo(String value) {
            addCriterion("isqianshou =", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouNotEqualTo(String value) {
            addCriterion("isqianshou <>", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouGreaterThan(String value) {
            addCriterion("isqianshou >", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouGreaterThanOrEqualTo(String value) {
            addCriterion("isqianshou >=", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouLessThan(String value) {
            addCriterion("isqianshou <", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouLessThanOrEqualTo(String value) {
            addCriterion("isqianshou <=", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouLike(String value) {
            addCriterion("isqianshou like", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouNotLike(String value) {
            addCriterion("isqianshou not like", value, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouIn(List<String> values) {
            addCriterion("isqianshou in", values, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouNotIn(List<String> values) {
            addCriterion("isqianshou not in", values, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouBetween(String value1, String value2) {
            addCriterion("isqianshou between", value1, value2, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsqianshouNotBetween(String value1, String value2) {
            addCriterion("isqianshou not between", value1, value2, "isqianshou");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoIsNull() {
            addCriterion("isdaohuo is null");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoIsNotNull() {
            addCriterion("isdaohuo is not null");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoEqualTo(String value) {
            addCriterion("isdaohuo =", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoNotEqualTo(String value) {
            addCriterion("isdaohuo <>", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoGreaterThan(String value) {
            addCriterion("isdaohuo >", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoGreaterThanOrEqualTo(String value) {
            addCriterion("isdaohuo >=", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoLessThan(String value) {
            addCriterion("isdaohuo <", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoLessThanOrEqualTo(String value) {
            addCriterion("isdaohuo <=", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoLike(String value) {
            addCriterion("isdaohuo like", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoNotLike(String value) {
            addCriterion("isdaohuo not like", value, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoIn(List<String> values) {
            addCriterion("isdaohuo in", values, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoNotIn(List<String> values) {
            addCriterion("isdaohuo not in", values, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoBetween(String value1, String value2) {
            addCriterion("isdaohuo between", value1, value2, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andIsdaohuoNotBetween(String value1, String value2) {
            addCriterion("isdaohuo not between", value1, value2, "isdaohuo");
            return (Criteria) this;
        }

        public Criteria andShipStatusIsNull() {
            addCriterion("ship_status is null");
            return (Criteria) this;
        }

        public Criteria andShipStatusIsNotNull() {
            addCriterion("ship_status is not null");
            return (Criteria) this;
        }

        public Criteria andShipStatusEqualTo(String value) {
            addCriterion("ship_status =", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotEqualTo(String value) {
            addCriterion("ship_status <>", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusGreaterThan(String value) {
            addCriterion("ship_status >", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusGreaterThanOrEqualTo(String value) {
            addCriterion("ship_status >=", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusLessThan(String value) {
            addCriterion("ship_status <", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusLessThanOrEqualTo(String value) {
            addCriterion("ship_status <=", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusLike(String value) {
            addCriterion("ship_status like", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotLike(String value) {
            addCriterion("ship_status not like", value, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusIn(List<String> values) {
            addCriterion("ship_status in", values, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotIn(List<String> values) {
            addCriterion("ship_status not in", values, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusBetween(String value1, String value2) {
            addCriterion("ship_status between", value1, value2, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andShipStatusNotBetween(String value1, String value2) {
            addCriterion("ship_status not between", value1, value2, "shipStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusIsNull() {
            addCriterion("arrival_status is null");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusIsNotNull() {
            addCriterion("arrival_status is not null");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusEqualTo(String value) {
            addCriterion("arrival_status =", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusNotEqualTo(String value) {
            addCriterion("arrival_status <>", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusGreaterThan(String value) {
            addCriterion("arrival_status >", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusGreaterThanOrEqualTo(String value) {
            addCriterion("arrival_status >=", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusLessThan(String value) {
            addCriterion("arrival_status <", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusLessThanOrEqualTo(String value) {
            addCriterion("arrival_status <=", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusLike(String value) {
            addCriterion("arrival_status like", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusNotLike(String value) {
            addCriterion("arrival_status not like", value, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusIn(List<String> values) {
            addCriterion("arrival_status in", values, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusNotIn(List<String> values) {
            addCriterion("arrival_status not in", values, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusBetween(String value1, String value2) {
            addCriterion("arrival_status between", value1, value2, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andArrivalStatusNotBetween(String value1, String value2) {
            addCriterion("arrival_status not between", value1, value2, "arrivalStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusIsNull() {
            addCriterion("recevice_status is null");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusIsNotNull() {
            addCriterion("recevice_status is not null");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusEqualTo(String value) {
            addCriterion("recevice_status =", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusNotEqualTo(String value) {
            addCriterion("recevice_status <>", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusGreaterThan(String value) {
            addCriterion("recevice_status >", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusGreaterThanOrEqualTo(String value) {
            addCriterion("recevice_status >=", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusLessThan(String value) {
            addCriterion("recevice_status <", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusLessThanOrEqualTo(String value) {
            addCriterion("recevice_status <=", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusLike(String value) {
            addCriterion("recevice_status like", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusNotLike(String value) {
            addCriterion("recevice_status not like", value, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusIn(List<String> values) {
            addCriterion("recevice_status in", values, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusNotIn(List<String> values) {
            addCriterion("recevice_status not in", values, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusBetween(String value1, String value2) {
            addCriterion("recevice_status between", value1, value2, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andReceviceStatusNotBetween(String value1, String value2) {
            addCriterion("recevice_status not between", value1, value2, "receviceStatus");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryIsNull() {
            addCriterion("is_delivery is null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryIsNotNull() {
            addCriterion("is_delivery is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryEqualTo(String value) {
            addCriterion("is_delivery =", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotEqualTo(String value) {
            addCriterion("is_delivery <>", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryGreaterThan(String value) {
            addCriterion("is_delivery >", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryGreaterThanOrEqualTo(String value) {
            addCriterion("is_delivery >=", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryLessThan(String value) {
            addCriterion("is_delivery <", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryLessThanOrEqualTo(String value) {
            addCriterion("is_delivery <=", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryLike(String value) {
            addCriterion("is_delivery like", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotLike(String value) {
            addCriterion("is_delivery not like", value, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryIn(List<String> values) {
            addCriterion("is_delivery in", values, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotIn(List<String> values) {
            addCriterion("is_delivery not in", values, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryBetween(String value1, String value2) {
            addCriterion("is_delivery between", value1, value2, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andIsDeliveryNotBetween(String value1, String value2) {
            addCriterion("is_delivery not between", value1, value2, "isDelivery");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Long value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Long value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Long value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Long value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Long value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Long value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Long> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Long> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Long value1, Long value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Long value1, Long value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNull() {
            addCriterion("last_modified is null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIsNotNull() {
            addCriterion("last_modified is not null");
            return (Criteria) this;
        }

        public Criteria andLastModifiedEqualTo(Long value) {
            addCriterion("last_modified =", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotEqualTo(Long value) {
            addCriterion("last_modified <>", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThan(Long value) {
            addCriterion("last_modified >", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedGreaterThanOrEqualTo(Long value) {
            addCriterion("last_modified >=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThan(Long value) {
            addCriterion("last_modified <", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedLessThanOrEqualTo(Long value) {
            addCriterion("last_modified <=", value, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedIn(List<Long> values) {
            addCriterion("last_modified in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotIn(List<Long> values) {
            addCriterion("last_modified not in", values, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedBetween(Long value1, Long value2) {
            addCriterion("last_modified between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andLastModifiedNotBetween(Long value1, Long value2) {
            addCriterion("last_modified not between", value1, value2, "lastModified");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNull() {
            addCriterion("payment is null");
            return (Criteria) this;
        }

        public Criteria andPaymentIsNotNull() {
            addCriterion("payment is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentEqualTo(String value) {
            addCriterion("payment =", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotEqualTo(String value) {
            addCriterion("payment <>", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThan(String value) {
            addCriterion("payment >", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentGreaterThanOrEqualTo(String value) {
            addCriterion("payment >=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThan(String value) {
            addCriterion("payment <", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLessThanOrEqualTo(String value) {
            addCriterion("payment <=", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentLike(String value) {
            addCriterion("payment like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotLike(String value) {
            addCriterion("payment not like", value, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentIn(List<String> values) {
            addCriterion("payment in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotIn(List<String> values) {
            addCriterion("payment not in", values, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentBetween(String value1, String value2) {
            addCriterion("payment between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andPaymentNotBetween(String value1, String value2) {
            addCriterion("payment not between", value1, value2, "payment");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNull() {
            addCriterion("shipping_id is null");
            return (Criteria) this;
        }

        public Criteria andShippingIdIsNotNull() {
            addCriterion("shipping_id is not null");
            return (Criteria) this;
        }

        public Criteria andShippingIdEqualTo(Integer value) {
            addCriterion("shipping_id =", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotEqualTo(Integer value) {
            addCriterion("shipping_id <>", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThan(Integer value) {
            addCriterion("shipping_id >", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shipping_id >=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThan(Integer value) {
            addCriterion("shipping_id <", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdLessThanOrEqualTo(Integer value) {
            addCriterion("shipping_id <=", value, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdIn(List<Integer> values) {
            addCriterion("shipping_id in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotIn(List<Integer> values) {
            addCriterion("shipping_id not in", values, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdBetween(Integer value1, Integer value2) {
            addCriterion("shipping_id between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shipping_id not between", value1, value2, "shippingId");
            return (Criteria) this;
        }

        public Criteria andShippingIsNull() {
            addCriterion("shipping is null");
            return (Criteria) this;
        }

        public Criteria andShippingIsNotNull() {
            addCriterion("shipping is not null");
            return (Criteria) this;
        }

        public Criteria andShippingEqualTo(String value) {
            addCriterion("shipping =", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotEqualTo(String value) {
            addCriterion("shipping <>", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThan(String value) {
            addCriterion("shipping >", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingGreaterThanOrEqualTo(String value) {
            addCriterion("shipping >=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThan(String value) {
            addCriterion("shipping <", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLessThanOrEqualTo(String value) {
            addCriterion("shipping <=", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingLike(String value) {
            addCriterion("shipping like", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotLike(String value) {
            addCriterion("shipping not like", value, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingIn(List<String> values) {
            addCriterion("shipping in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotIn(List<String> values) {
            addCriterion("shipping not in", values, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingBetween(String value1, String value2) {
            addCriterion("shipping between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andShippingNotBetween(String value1, String value2) {
            addCriterion("shipping not between", value1, value2, "shipping");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNull() {
            addCriterion("member_id is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdIsNotNull() {
            addCriterion("member_id is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdEqualTo(Integer value) {
            addCriterion("member_id =", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotEqualTo(Integer value) {
            addCriterion("member_id <>", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThan(Integer value) {
            addCriterion("member_id >", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("member_id >=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThan(Integer value) {
            addCriterion("member_id <", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdLessThanOrEqualTo(Integer value) {
            addCriterion("member_id <=", value, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdIn(List<Integer> values) {
            addCriterion("member_id in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotIn(List<Integer> values) {
            addCriterion("member_id not in", values, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdBetween(Integer value1, Integer value2) {
            addCriterion("member_id between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberIdNotBetween(Integer value1, Integer value2) {
            addCriterion("member_id not between", value1, value2, "memberId");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNull() {
            addCriterion("member_name is null");
            return (Criteria) this;
        }

        public Criteria andMemberNameIsNotNull() {
            addCriterion("member_name is not null");
            return (Criteria) this;
        }

        public Criteria andMemberNameEqualTo(String value) {
            addCriterion("member_name =", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotEqualTo(String value) {
            addCriterion("member_name <>", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThan(String value) {
            addCriterion("member_name >", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameGreaterThanOrEqualTo(String value) {
            addCriterion("member_name >=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThan(String value) {
            addCriterion("member_name <", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLessThanOrEqualTo(String value) {
            addCriterion("member_name <=", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameLike(String value) {
            addCriterion("member_name like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotLike(String value) {
            addCriterion("member_name not like", value, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameIn(List<String> values) {
            addCriterion("member_name in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotIn(List<String> values) {
            addCriterion("member_name not in", values, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameBetween(String value1, String value2) {
            addCriterion("member_name between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberNameNotBetween(String value1, String value2) {
            addCriterion("member_name not between", value1, value2, "memberName");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardIsNull() {
            addCriterion("member_id_card is null");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardIsNotNull() {
            addCriterion("member_id_card is not null");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardEqualTo(String value) {
            addCriterion("member_id_card =", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotEqualTo(String value) {
            addCriterion("member_id_card <>", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardGreaterThan(String value) {
            addCriterion("member_id_card >", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardGreaterThanOrEqualTo(String value) {
            addCriterion("member_id_card >=", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardLessThan(String value) {
            addCriterion("member_id_card <", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardLessThanOrEqualTo(String value) {
            addCriterion("member_id_card <=", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardLike(String value) {
            addCriterion("member_id_card like", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotLike(String value) {
            addCriterion("member_id_card not like", value, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardIn(List<String> values) {
            addCriterion("member_id_card in", values, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotIn(List<String> values) {
            addCriterion("member_id_card not in", values, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardBetween(String value1, String value2) {
            addCriterion("member_id_card between", value1, value2, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andMemberIdCardNotBetween(String value1, String value2) {
            addCriterion("member_id_card not between", value1, value2, "memberIdCard");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsDeadIsNull() {
            addCriterion("is_dead is null");
            return (Criteria) this;
        }

        public Criteria andIsDeadIsNotNull() {
            addCriterion("is_dead is not null");
            return (Criteria) this;
        }

        public Criteria andIsDeadEqualTo(String value) {
            addCriterion("is_dead =", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadNotEqualTo(String value) {
            addCriterion("is_dead <>", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadGreaterThan(String value) {
            addCriterion("is_dead >", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadGreaterThanOrEqualTo(String value) {
            addCriterion("is_dead >=", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadLessThan(String value) {
            addCriterion("is_dead <", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadLessThanOrEqualTo(String value) {
            addCriterion("is_dead <=", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadLike(String value) {
            addCriterion("is_dead like", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadNotLike(String value) {
            addCriterion("is_dead not like", value, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadIn(List<String> values) {
            addCriterion("is_dead in", values, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadNotIn(List<String> values) {
            addCriterion("is_dead not in", values, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadBetween(String value1, String value2) {
            addCriterion("is_dead between", value1, value2, "isDead");
            return (Criteria) this;
        }

        public Criteria andIsDeadNotBetween(String value1, String value2) {
            addCriterion("is_dead not between", value1, value2, "isDead");
            return (Criteria) this;
        }

        public Criteria andConfirmIsNull() {
            addCriterion("confirm is null");
            return (Criteria) this;
        }

        public Criteria andConfirmIsNotNull() {
            addCriterion("confirm is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmEqualTo(String value) {
            addCriterion("confirm =", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotEqualTo(String value) {
            addCriterion("confirm <>", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmGreaterThan(String value) {
            addCriterion("confirm >", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmGreaterThanOrEqualTo(String value) {
            addCriterion("confirm >=", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLessThan(String value) {
            addCriterion("confirm <", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLessThanOrEqualTo(String value) {
            addCriterion("confirm <=", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmLike(String value) {
            addCriterion("confirm like", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotLike(String value) {
            addCriterion("confirm not like", value, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmIn(List<String> values) {
            addCriterion("confirm in", values, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotIn(List<String> values) {
            addCriterion("confirm not in", values, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmBetween(String value1, String value2) {
            addCriterion("confirm between", value1, value2, "confirm");
            return (Criteria) this;
        }

        public Criteria andConfirmNotBetween(String value1, String value2) {
            addCriterion("confirm not between", value1, value2, "confirm");
            return (Criteria) this;
        }

        public Criteria andShipAreaIsNull() {
            addCriterion("ship_area is null");
            return (Criteria) this;
        }

        public Criteria andShipAreaIsNotNull() {
            addCriterion("ship_area is not null");
            return (Criteria) this;
        }

        public Criteria andShipAreaEqualTo(String value) {
            addCriterion("ship_area =", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotEqualTo(String value) {
            addCriterion("ship_area <>", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaGreaterThan(String value) {
            addCriterion("ship_area >", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaGreaterThanOrEqualTo(String value) {
            addCriterion("ship_area >=", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaLessThan(String value) {
            addCriterion("ship_area <", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaLessThanOrEqualTo(String value) {
            addCriterion("ship_area <=", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaLike(String value) {
            addCriterion("ship_area like", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotLike(String value) {
            addCriterion("ship_area not like", value, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaIn(List<String> values) {
            addCriterion("ship_area in", values, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotIn(List<String> values) {
            addCriterion("ship_area not in", values, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaBetween(String value1, String value2) {
            addCriterion("ship_area between", value1, value2, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipAreaNotBetween(String value1, String value2) {
            addCriterion("ship_area not between", value1, value2, "shipArea");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNull() {
            addCriterion("ship_name is null");
            return (Criteria) this;
        }

        public Criteria andShipNameIsNotNull() {
            addCriterion("ship_name is not null");
            return (Criteria) this;
        }

        public Criteria andShipNameEqualTo(String value) {
            addCriterion("ship_name =", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotEqualTo(String value) {
            addCriterion("ship_name <>", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThan(String value) {
            addCriterion("ship_name >", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameGreaterThanOrEqualTo(String value) {
            addCriterion("ship_name >=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThan(String value) {
            addCriterion("ship_name <", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLessThanOrEqualTo(String value) {
            addCriterion("ship_name <=", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameLike(String value) {
            addCriterion("ship_name like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotLike(String value) {
            addCriterion("ship_name not like", value, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameIn(List<String> values) {
            addCriterion("ship_name in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotIn(List<String> values) {
            addCriterion("ship_name not in", values, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameBetween(String value1, String value2) {
            addCriterion("ship_name between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andShipNameNotBetween(String value1, String value2) {
            addCriterion("ship_name not between", value1, value2, "shipName");
            return (Criteria) this;
        }

        public Criteria andWeightIsNull() {
            addCriterion("weight is null");
            return (Criteria) this;
        }

        public Criteria andWeightIsNotNull() {
            addCriterion("weight is not null");
            return (Criteria) this;
        }

        public Criteria andWeightEqualTo(BigDecimal value) {
            addCriterion("weight =", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotEqualTo(BigDecimal value) {
            addCriterion("weight <>", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThan(BigDecimal value) {
            addCriterion("weight >", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("weight >=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThan(BigDecimal value) {
            addCriterion("weight <", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("weight <=", value, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightIn(List<BigDecimal> values) {
            addCriterion("weight in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotIn(List<BigDecimal> values) {
            addCriterion("weight not in", values, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andWeightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("weight not between", value1, value2, "weight");
            return (Criteria) this;
        }

        public Criteria andItemnumIsNull() {
            addCriterion("itemnum is null");
            return (Criteria) this;
        }

        public Criteria andItemnumIsNotNull() {
            addCriterion("itemnum is not null");
            return (Criteria) this;
        }

        public Criteria andItemnumEqualTo(Integer value) {
            addCriterion("itemnum =", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotEqualTo(Integer value) {
            addCriterion("itemnum <>", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumGreaterThan(Integer value) {
            addCriterion("itemnum >", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("itemnum >=", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumLessThan(Integer value) {
            addCriterion("itemnum <", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumLessThanOrEqualTo(Integer value) {
            addCriterion("itemnum <=", value, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumIn(List<Integer> values) {
            addCriterion("itemnum in", values, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotIn(List<Integer> values) {
            addCriterion("itemnum not in", values, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumBetween(Integer value1, Integer value2) {
            addCriterion("itemnum between", value1, value2, "itemnum");
            return (Criteria) this;
        }

        public Criteria andItemnumNotBetween(Integer value1, Integer value2) {
            addCriterion("itemnum not between", value1, value2, "itemnum");
            return (Criteria) this;
        }

        public Criteria andIpIsNull() {
            addCriterion("ip is null");
            return (Criteria) this;
        }

        public Criteria andIpIsNotNull() {
            addCriterion("ip is not null");
            return (Criteria) this;
        }

        public Criteria andIpEqualTo(String value) {
            addCriterion("ip =", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotEqualTo(String value) {
            addCriterion("ip <>", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThan(String value) {
            addCriterion("ip >", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpGreaterThanOrEqualTo(String value) {
            addCriterion("ip >=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThan(String value) {
            addCriterion("ip <", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLessThanOrEqualTo(String value) {
            addCriterion("ip <=", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpLike(String value) {
            addCriterion("ip like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotLike(String value) {
            addCriterion("ip not like", value, "ip");
            return (Criteria) this;
        }

        public Criteria andIpIn(List<String> values) {
            addCriterion("ip in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotIn(List<String> values) {
            addCriterion("ip not in", values, "ip");
            return (Criteria) this;
        }

        public Criteria andIpBetween(String value1, String value2) {
            addCriterion("ip between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andIpNotBetween(String value1, String value2) {
            addCriterion("ip not between", value1, value2, "ip");
            return (Criteria) this;
        }

        public Criteria andShipZipIsNull() {
            addCriterion("ship_zip is null");
            return (Criteria) this;
        }

        public Criteria andShipZipIsNotNull() {
            addCriterion("ship_zip is not null");
            return (Criteria) this;
        }

        public Criteria andShipZipEqualTo(String value) {
            addCriterion("ship_zip =", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipNotEqualTo(String value) {
            addCriterion("ship_zip <>", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipGreaterThan(String value) {
            addCriterion("ship_zip >", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipGreaterThanOrEqualTo(String value) {
            addCriterion("ship_zip >=", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipLessThan(String value) {
            addCriterion("ship_zip <", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipLessThanOrEqualTo(String value) {
            addCriterion("ship_zip <=", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipLike(String value) {
            addCriterion("ship_zip like", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipNotLike(String value) {
            addCriterion("ship_zip not like", value, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipIn(List<String> values) {
            addCriterion("ship_zip in", values, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipNotIn(List<String> values) {
            addCriterion("ship_zip not in", values, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipBetween(String value1, String value2) {
            addCriterion("ship_zip between", value1, value2, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipZipNotBetween(String value1, String value2) {
            addCriterion("ship_zip not between", value1, value2, "shipZip");
            return (Criteria) this;
        }

        public Criteria andShipTelIsNull() {
            addCriterion("ship_tel is null");
            return (Criteria) this;
        }

        public Criteria andShipTelIsNotNull() {
            addCriterion("ship_tel is not null");
            return (Criteria) this;
        }

        public Criteria andShipTelEqualTo(String value) {
            addCriterion("ship_tel =", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotEqualTo(String value) {
            addCriterion("ship_tel <>", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelGreaterThan(String value) {
            addCriterion("ship_tel >", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelGreaterThanOrEqualTo(String value) {
            addCriterion("ship_tel >=", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelLessThan(String value) {
            addCriterion("ship_tel <", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelLessThanOrEqualTo(String value) {
            addCriterion("ship_tel <=", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelLike(String value) {
            addCriterion("ship_tel like", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotLike(String value) {
            addCriterion("ship_tel not like", value, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelIn(List<String> values) {
            addCriterion("ship_tel in", values, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotIn(List<String> values) {
            addCriterion("ship_tel not in", values, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelBetween(String value1, String value2) {
            addCriterion("ship_tel between", value1, value2, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipTelNotBetween(String value1, String value2) {
            addCriterion("ship_tel not between", value1, value2, "shipTel");
            return (Criteria) this;
        }

        public Criteria andShipEmailIsNull() {
            addCriterion("ship_email is null");
            return (Criteria) this;
        }

        public Criteria andShipEmailIsNotNull() {
            addCriterion("ship_email is not null");
            return (Criteria) this;
        }

        public Criteria andShipEmailEqualTo(String value) {
            addCriterion("ship_email =", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailNotEqualTo(String value) {
            addCriterion("ship_email <>", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailGreaterThan(String value) {
            addCriterion("ship_email >", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailGreaterThanOrEqualTo(String value) {
            addCriterion("ship_email >=", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailLessThan(String value) {
            addCriterion("ship_email <", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailLessThanOrEqualTo(String value) {
            addCriterion("ship_email <=", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailLike(String value) {
            addCriterion("ship_email like", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailNotLike(String value) {
            addCriterion("ship_email not like", value, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailIn(List<String> values) {
            addCriterion("ship_email in", values, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailNotIn(List<String> values) {
            addCriterion("ship_email not in", values, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailBetween(String value1, String value2) {
            addCriterion("ship_email between", value1, value2, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipEmailNotBetween(String value1, String value2) {
            addCriterion("ship_email not between", value1, value2, "shipEmail");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNull() {
            addCriterion("ship_time is null");
            return (Criteria) this;
        }

        public Criteria andShipTimeIsNotNull() {
            addCriterion("ship_time is not null");
            return (Criteria) this;
        }

        public Criteria andShipTimeEqualTo(String value) {
            addCriterion("ship_time =", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotEqualTo(String value) {
            addCriterion("ship_time <>", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThan(String value) {
            addCriterion("ship_time >", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeGreaterThanOrEqualTo(String value) {
            addCriterion("ship_time >=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThan(String value) {
            addCriterion("ship_time <", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLessThanOrEqualTo(String value) {
            addCriterion("ship_time <=", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeLike(String value) {
            addCriterion("ship_time like", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotLike(String value) {
            addCriterion("ship_time not like", value, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeIn(List<String> values) {
            addCriterion("ship_time in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotIn(List<String> values) {
            addCriterion("ship_time not in", values, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeBetween(String value1, String value2) {
            addCriterion("ship_time between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipTimeNotBetween(String value1, String value2) {
            addCriterion("ship_time not between", value1, value2, "shipTime");
            return (Criteria) this;
        }

        public Criteria andShipMobileIsNull() {
            addCriterion("ship_mobile is null");
            return (Criteria) this;
        }

        public Criteria andShipMobileIsNotNull() {
            addCriterion("ship_mobile is not null");
            return (Criteria) this;
        }

        public Criteria andShipMobileEqualTo(String value) {
            addCriterion("ship_mobile =", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotEqualTo(String value) {
            addCriterion("ship_mobile <>", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileGreaterThan(String value) {
            addCriterion("ship_mobile >", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileGreaterThanOrEqualTo(String value) {
            addCriterion("ship_mobile >=", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileLessThan(String value) {
            addCriterion("ship_mobile <", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileLessThanOrEqualTo(String value) {
            addCriterion("ship_mobile <=", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileLike(String value) {
            addCriterion("ship_mobile like", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotLike(String value) {
            addCriterion("ship_mobile not like", value, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileIn(List<String> values) {
            addCriterion("ship_mobile in", values, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotIn(List<String> values) {
            addCriterion("ship_mobile not in", values, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileBetween(String value1, String value2) {
            addCriterion("ship_mobile between", value1, value2, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andShipMobileNotBetween(String value1, String value2) {
            addCriterion("ship_mobile not between", value1, value2, "shipMobile");
            return (Criteria) this;
        }

        public Criteria andCostItemIsNull() {
            addCriterion("cost_item is null");
            return (Criteria) this;
        }

        public Criteria andCostItemIsNotNull() {
            addCriterion("cost_item is not null");
            return (Criteria) this;
        }

        public Criteria andCostItemEqualTo(BigDecimal value) {
            addCriterion("cost_item =", value, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemNotEqualTo(BigDecimal value) {
            addCriterion("cost_item <>", value, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemGreaterThan(BigDecimal value) {
            addCriterion("cost_item >", value, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_item >=", value, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemLessThan(BigDecimal value) {
            addCriterion("cost_item <", value, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_item <=", value, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemIn(List<BigDecimal> values) {
            addCriterion("cost_item in", values, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemNotIn(List<BigDecimal> values) {
            addCriterion("cost_item not in", values, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_item between", value1, value2, "costItem");
            return (Criteria) this;
        }

        public Criteria andCostItemNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_item not between", value1, value2, "costItem");
            return (Criteria) this;
        }

        public Criteria andIsTaxIsNull() {
            addCriterion("is_tax is null");
            return (Criteria) this;
        }

        public Criteria andIsTaxIsNotNull() {
            addCriterion("is_tax is not null");
            return (Criteria) this;
        }

        public Criteria andIsTaxEqualTo(String value) {
            addCriterion("is_tax =", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotEqualTo(String value) {
            addCriterion("is_tax <>", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxGreaterThan(String value) {
            addCriterion("is_tax >", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxGreaterThanOrEqualTo(String value) {
            addCriterion("is_tax >=", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLessThan(String value) {
            addCriterion("is_tax <", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLessThanOrEqualTo(String value) {
            addCriterion("is_tax <=", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxLike(String value) {
            addCriterion("is_tax like", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotLike(String value) {
            addCriterion("is_tax not like", value, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxIn(List<String> values) {
            addCriterion("is_tax in", values, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotIn(List<String> values) {
            addCriterion("is_tax not in", values, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxBetween(String value1, String value2) {
            addCriterion("is_tax between", value1, value2, "isTax");
            return (Criteria) this;
        }

        public Criteria andIsTaxNotBetween(String value1, String value2) {
            addCriterion("is_tax not between", value1, value2, "isTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxIsNull() {
            addCriterion("cost_tax is null");
            return (Criteria) this;
        }

        public Criteria andCostTaxIsNotNull() {
            addCriterion("cost_tax is not null");
            return (Criteria) this;
        }

        public Criteria andCostTaxEqualTo(BigDecimal value) {
            addCriterion("cost_tax =", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotEqualTo(BigDecimal value) {
            addCriterion("cost_tax <>", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxGreaterThan(BigDecimal value) {
            addCriterion("cost_tax >", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_tax >=", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxLessThan(BigDecimal value) {
            addCriterion("cost_tax <", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_tax <=", value, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxIn(List<BigDecimal> values) {
            addCriterion("cost_tax in", values, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotIn(List<BigDecimal> values) {
            addCriterion("cost_tax not in", values, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_tax between", value1, value2, "costTax");
            return (Criteria) this;
        }

        public Criteria andCostTaxNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_tax not between", value1, value2, "costTax");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyIsNull() {
            addCriterion("tax_company is null");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyIsNotNull() {
            addCriterion("tax_company is not null");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyEqualTo(String value) {
            addCriterion("tax_company =", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyNotEqualTo(String value) {
            addCriterion("tax_company <>", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyGreaterThan(String value) {
            addCriterion("tax_company >", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyGreaterThanOrEqualTo(String value) {
            addCriterion("tax_company >=", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyLessThan(String value) {
            addCriterion("tax_company <", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyLessThanOrEqualTo(String value) {
            addCriterion("tax_company <=", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyLike(String value) {
            addCriterion("tax_company like", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyNotLike(String value) {
            addCriterion("tax_company not like", value, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyIn(List<String> values) {
            addCriterion("tax_company in", values, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyNotIn(List<String> values) {
            addCriterion("tax_company not in", values, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyBetween(String value1, String value2) {
            addCriterion("tax_company between", value1, value2, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andTaxCompanyNotBetween(String value1, String value2) {
            addCriterion("tax_company not between", value1, value2, "taxCompany");
            return (Criteria) this;
        }

        public Criteria andIsProtectIsNull() {
            addCriterion("is_protect is null");
            return (Criteria) this;
        }

        public Criteria andIsProtectIsNotNull() {
            addCriterion("is_protect is not null");
            return (Criteria) this;
        }

        public Criteria andIsProtectEqualTo(String value) {
            addCriterion("is_protect =", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectNotEqualTo(String value) {
            addCriterion("is_protect <>", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectGreaterThan(String value) {
            addCriterion("is_protect >", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectGreaterThanOrEqualTo(String value) {
            addCriterion("is_protect >=", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectLessThan(String value) {
            addCriterion("is_protect <", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectLessThanOrEqualTo(String value) {
            addCriterion("is_protect <=", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectLike(String value) {
            addCriterion("is_protect like", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectNotLike(String value) {
            addCriterion("is_protect not like", value, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectIn(List<String> values) {
            addCriterion("is_protect in", values, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectNotIn(List<String> values) {
            addCriterion("is_protect not in", values, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectBetween(String value1, String value2) {
            addCriterion("is_protect between", value1, value2, "isProtect");
            return (Criteria) this;
        }

        public Criteria andIsProtectNotBetween(String value1, String value2) {
            addCriterion("is_protect not between", value1, value2, "isProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectIsNull() {
            addCriterion("cost_protect is null");
            return (Criteria) this;
        }

        public Criteria andCostProtectIsNotNull() {
            addCriterion("cost_protect is not null");
            return (Criteria) this;
        }

        public Criteria andCostProtectEqualTo(BigDecimal value) {
            addCriterion("cost_protect =", value, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectNotEqualTo(BigDecimal value) {
            addCriterion("cost_protect <>", value, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectGreaterThan(BigDecimal value) {
            addCriterion("cost_protect >", value, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_protect >=", value, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectLessThan(BigDecimal value) {
            addCriterion("cost_protect <", value, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_protect <=", value, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectIn(List<BigDecimal> values) {
            addCriterion("cost_protect in", values, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectNotIn(List<BigDecimal> values) {
            addCriterion("cost_protect not in", values, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_protect between", value1, value2, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostProtectNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_protect not between", value1, value2, "costProtect");
            return (Criteria) this;
        }

        public Criteria andCostPaymentIsNull() {
            addCriterion("cost_payment is null");
            return (Criteria) this;
        }

        public Criteria andCostPaymentIsNotNull() {
            addCriterion("cost_payment is not null");
            return (Criteria) this;
        }

        public Criteria andCostPaymentEqualTo(BigDecimal value) {
            addCriterion("cost_payment =", value, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentNotEqualTo(BigDecimal value) {
            addCriterion("cost_payment <>", value, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentGreaterThan(BigDecimal value) {
            addCriterion("cost_payment >", value, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_payment >=", value, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentLessThan(BigDecimal value) {
            addCriterion("cost_payment <", value, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_payment <=", value, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentIn(List<BigDecimal> values) {
            addCriterion("cost_payment in", values, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentNotIn(List<BigDecimal> values) {
            addCriterion("cost_payment not in", values, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_payment between", value1, value2, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCostPaymentNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_payment not between", value1, value2, "costPayment");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNull() {
            addCriterion("currency is null");
            return (Criteria) this;
        }

        public Criteria andCurrencyIsNotNull() {
            addCriterion("currency is not null");
            return (Criteria) this;
        }

        public Criteria andCurrencyEqualTo(String value) {
            addCriterion("currency =", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotEqualTo(String value) {
            addCriterion("currency <>", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThan(String value) {
            addCriterion("currency >", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyGreaterThanOrEqualTo(String value) {
            addCriterion("currency >=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThan(String value) {
            addCriterion("currency <", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLessThanOrEqualTo(String value) {
            addCriterion("currency <=", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyLike(String value) {
            addCriterion("currency like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotLike(String value) {
            addCriterion("currency not like", value, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyIn(List<String> values) {
            addCriterion("currency in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotIn(List<String> values) {
            addCriterion("currency not in", values, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyBetween(String value1, String value2) {
            addCriterion("currency between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurrencyNotBetween(String value1, String value2) {
            addCriterion("currency not between", value1, value2, "currency");
            return (Criteria) this;
        }

        public Criteria andCurRateIsNull() {
            addCriterion("cur_rate is null");
            return (Criteria) this;
        }

        public Criteria andCurRateIsNotNull() {
            addCriterion("cur_rate is not null");
            return (Criteria) this;
        }

        public Criteria andCurRateEqualTo(BigDecimal value) {
            addCriterion("cur_rate =", value, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateNotEqualTo(BigDecimal value) {
            addCriterion("cur_rate <>", value, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateGreaterThan(BigDecimal value) {
            addCriterion("cur_rate >", value, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_rate >=", value, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateLessThan(BigDecimal value) {
            addCriterion("cur_rate <", value, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cur_rate <=", value, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateIn(List<BigDecimal> values) {
            addCriterion("cur_rate in", values, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateNotIn(List<BigDecimal> values) {
            addCriterion("cur_rate not in", values, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_rate between", value1, value2, "curRate");
            return (Criteria) this;
        }

        public Criteria andCurRateNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cur_rate not between", value1, value2, "curRate");
            return (Criteria) this;
        }

        public Criteria andScoreUIsNull() {
            addCriterion("score_u is null");
            return (Criteria) this;
        }

        public Criteria andScoreUIsNotNull() {
            addCriterion("score_u is not null");
            return (Criteria) this;
        }

        public Criteria andScoreUEqualTo(BigDecimal value) {
            addCriterion("score_u =", value, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUNotEqualTo(BigDecimal value) {
            addCriterion("score_u <>", value, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUGreaterThan(BigDecimal value) {
            addCriterion("score_u >", value, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score_u >=", value, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreULessThan(BigDecimal value) {
            addCriterion("score_u <", value, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreULessThanOrEqualTo(BigDecimal value) {
            addCriterion("score_u <=", value, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUIn(List<BigDecimal> values) {
            addCriterion("score_u in", values, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUNotIn(List<BigDecimal> values) {
            addCriterion("score_u not in", values, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_u between", value1, value2, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreUNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_u not between", value1, value2, "scoreU");
            return (Criteria) this;
        }

        public Criteria andScoreGIsNull() {
            addCriterion("score_g is null");
            return (Criteria) this;
        }

        public Criteria andScoreGIsNotNull() {
            addCriterion("score_g is not null");
            return (Criteria) this;
        }

        public Criteria andScoreGEqualTo(BigDecimal value) {
            addCriterion("score_g =", value, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGNotEqualTo(BigDecimal value) {
            addCriterion("score_g <>", value, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGGreaterThan(BigDecimal value) {
            addCriterion("score_g >", value, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("score_g >=", value, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGLessThan(BigDecimal value) {
            addCriterion("score_g <", value, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGLessThanOrEqualTo(BigDecimal value) {
            addCriterion("score_g <=", value, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGIn(List<BigDecimal> values) {
            addCriterion("score_g in", values, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGNotIn(List<BigDecimal> values) {
            addCriterion("score_g not in", values, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_g between", value1, value2, "scoreG");
            return (Criteria) this;
        }

        public Criteria andScoreGNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("score_g not between", value1, value2, "scoreG");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNull() {
            addCriterion("discount is null");
            return (Criteria) this;
        }

        public Criteria andDiscountIsNotNull() {
            addCriterion("discount is not null");
            return (Criteria) this;
        }

        public Criteria andDiscountEqualTo(BigDecimal value) {
            addCriterion("discount =", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotEqualTo(BigDecimal value) {
            addCriterion("discount <>", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThan(BigDecimal value) {
            addCriterion("discount >", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("discount >=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThan(BigDecimal value) {
            addCriterion("discount <", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("discount <=", value, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountIn(List<BigDecimal> values) {
            addCriterion("discount in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotIn(List<BigDecimal> values) {
            addCriterion("discount not in", values, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andDiscountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("discount not between", value1, value2, "discount");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsIsNull() {
            addCriterion("pmt_goods is null");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsIsNotNull() {
            addCriterion("pmt_goods is not null");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsEqualTo(BigDecimal value) {
            addCriterion("pmt_goods =", value, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsNotEqualTo(BigDecimal value) {
            addCriterion("pmt_goods <>", value, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsGreaterThan(BigDecimal value) {
            addCriterion("pmt_goods >", value, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pmt_goods >=", value, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsLessThan(BigDecimal value) {
            addCriterion("pmt_goods <", value, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pmt_goods <=", value, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsIn(List<BigDecimal> values) {
            addCriterion("pmt_goods in", values, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsNotIn(List<BigDecimal> values) {
            addCriterion("pmt_goods not in", values, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pmt_goods between", value1, value2, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtGoodsNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pmt_goods not between", value1, value2, "pmtGoods");
            return (Criteria) this;
        }

        public Criteria andPmtOrderIsNull() {
            addCriterion("pmt_order is null");
            return (Criteria) this;
        }

        public Criteria andPmtOrderIsNotNull() {
            addCriterion("pmt_order is not null");
            return (Criteria) this;
        }

        public Criteria andPmtOrderEqualTo(BigDecimal value) {
            addCriterion("pmt_order =", value, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderNotEqualTo(BigDecimal value) {
            addCriterion("pmt_order <>", value, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderGreaterThan(BigDecimal value) {
            addCriterion("pmt_order >", value, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("pmt_order >=", value, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderLessThan(BigDecimal value) {
            addCriterion("pmt_order <", value, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderLessThanOrEqualTo(BigDecimal value) {
            addCriterion("pmt_order <=", value, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderIn(List<BigDecimal> values) {
            addCriterion("pmt_order in", values, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderNotIn(List<BigDecimal> values) {
            addCriterion("pmt_order not in", values, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pmt_order between", value1, value2, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPmtOrderNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("pmt_order not between", value1, value2, "pmtOrder");
            return (Criteria) this;
        }

        public Criteria andPayedIsNull() {
            addCriterion("payed is null");
            return (Criteria) this;
        }

        public Criteria andPayedIsNotNull() {
            addCriterion("payed is not null");
            return (Criteria) this;
        }

        public Criteria andPayedEqualTo(BigDecimal value) {
            addCriterion("payed =", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotEqualTo(BigDecimal value) {
            addCriterion("payed <>", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedGreaterThan(BigDecimal value) {
            addCriterion("payed >", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("payed >=", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedLessThan(BigDecimal value) {
            addCriterion("payed <", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedLessThanOrEqualTo(BigDecimal value) {
            addCriterion("payed <=", value, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedIn(List<BigDecimal> values) {
            addCriterion("payed in", values, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotIn(List<BigDecimal> values) {
            addCriterion("payed not in", values, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payed between", value1, value2, "payed");
            return (Criteria) this;
        }

        public Criteria andPayedNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("payed not between", value1, value2, "payed");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNull() {
            addCriterion("disabled is null");
            return (Criteria) this;
        }

        public Criteria andDisabledIsNotNull() {
            addCriterion("disabled is not null");
            return (Criteria) this;
        }

        public Criteria andDisabledEqualTo(String value) {
            addCriterion("disabled =", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotEqualTo(String value) {
            addCriterion("disabled <>", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThan(String value) {
            addCriterion("disabled >", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledGreaterThanOrEqualTo(String value) {
            addCriterion("disabled >=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThan(String value) {
            addCriterion("disabled <", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLessThanOrEqualTo(String value) {
            addCriterion("disabled <=", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledLike(String value) {
            addCriterion("disabled like", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotLike(String value) {
            addCriterion("disabled not like", value, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledIn(List<String> values) {
            addCriterion("disabled in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotIn(List<String> values) {
            addCriterion("disabled not in", values, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledBetween(String value1, String value2) {
            addCriterion("disabled between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andDisabledNotBetween(String value1, String value2) {
            addCriterion("disabled not between", value1, value2, "disabled");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIsNull() {
            addCriterion("mark_type is null");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIsNotNull() {
            addCriterion("mark_type is not null");
            return (Criteria) this;
        }

        public Criteria andMarkTypeEqualTo(String value) {
            addCriterion("mark_type =", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotEqualTo(String value) {
            addCriterion("mark_type <>", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeGreaterThan(String value) {
            addCriterion("mark_type >", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeGreaterThanOrEqualTo(String value) {
            addCriterion("mark_type >=", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLessThan(String value) {
            addCriterion("mark_type <", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLessThanOrEqualTo(String value) {
            addCriterion("mark_type <=", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeLike(String value) {
            addCriterion("mark_type like", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotLike(String value) {
            addCriterion("mark_type not like", value, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeIn(List<String> values) {
            addCriterion("mark_type in", values, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotIn(List<String> values) {
            addCriterion("mark_type not in", values, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeBetween(String value1, String value2) {
            addCriterion("mark_type between", value1, value2, "markType");
            return (Criteria) this;
        }

        public Criteria andMarkTypeNotBetween(String value1, String value2) {
            addCriterion("mark_type not between", value1, value2, "markType");
            return (Criteria) this;
        }

        public Criteria andCostFreightIsNull() {
            addCriterion("cost_freight is null");
            return (Criteria) this;
        }

        public Criteria andCostFreightIsNotNull() {
            addCriterion("cost_freight is not null");
            return (Criteria) this;
        }

        public Criteria andCostFreightEqualTo(BigDecimal value) {
            addCriterion("cost_freight =", value, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightNotEqualTo(BigDecimal value) {
            addCriterion("cost_freight <>", value, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightGreaterThan(BigDecimal value) {
            addCriterion("cost_freight >", value, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_freight >=", value, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightLessThan(BigDecimal value) {
            addCriterion("cost_freight <", value, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightLessThanOrEqualTo(BigDecimal value) {
            addCriterion("cost_freight <=", value, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightIn(List<BigDecimal> values) {
            addCriterion("cost_freight in", values, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightNotIn(List<BigDecimal> values) {
            addCriterion("cost_freight not in", values, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_freight between", value1, value2, "costFreight");
            return (Criteria) this;
        }

        public Criteria andCostFreightNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("cost_freight not between", value1, value2, "costFreight");
            return (Criteria) this;
        }

        public Criteria andExtendIsNull() {
            addCriterion("extend is null");
            return (Criteria) this;
        }

        public Criteria andExtendIsNotNull() {
            addCriterion("extend is not null");
            return (Criteria) this;
        }

        public Criteria andExtendEqualTo(String value) {
            addCriterion("extend =", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotEqualTo(String value) {
            addCriterion("extend <>", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThan(String value) {
            addCriterion("extend >", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendGreaterThanOrEqualTo(String value) {
            addCriterion("extend >=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThan(String value) {
            addCriterion("extend <", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLessThanOrEqualTo(String value) {
            addCriterion("extend <=", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendLike(String value) {
            addCriterion("extend like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotLike(String value) {
            addCriterion("extend not like", value, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendIn(List<String> values) {
            addCriterion("extend in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotIn(List<String> values) {
            addCriterion("extend not in", values, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendBetween(String value1, String value2) {
            addCriterion("extend between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andExtendNotBetween(String value1, String value2) {
            addCriterion("extend not between", value1, value2, "extend");
            return (Criteria) this;
        }

        public Criteria andOrderReferIsNull() {
            addCriterion("order_refer is null");
            return (Criteria) this;
        }

        public Criteria andOrderReferIsNotNull() {
            addCriterion("order_refer is not null");
            return (Criteria) this;
        }

        public Criteria andOrderReferEqualTo(String value) {
            addCriterion("order_refer =", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferNotEqualTo(String value) {
            addCriterion("order_refer <>", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferGreaterThan(String value) {
            addCriterion("order_refer >", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferGreaterThanOrEqualTo(String value) {
            addCriterion("order_refer >=", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferLessThan(String value) {
            addCriterion("order_refer <", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferLessThanOrEqualTo(String value) {
            addCriterion("order_refer <=", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferLike(String value) {
            addCriterion("order_refer like", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferNotLike(String value) {
            addCriterion("order_refer not like", value, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferIn(List<String> values) {
            addCriterion("order_refer in", values, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferNotIn(List<String> values) {
            addCriterion("order_refer not in", values, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferBetween(String value1, String value2) {
            addCriterion("order_refer between", value1, value2, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andOrderReferNotBetween(String value1, String value2) {
            addCriterion("order_refer not between", value1, value2, "orderRefer");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusIsNull() {
            addCriterion("bill_settle_status is null");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusIsNotNull() {
            addCriterion("bill_settle_status is not null");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusEqualTo(String value) {
            addCriterion("bill_settle_status =", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusNotEqualTo(String value) {
            addCriterion("bill_settle_status <>", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusGreaterThan(String value) {
            addCriterion("bill_settle_status >", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusGreaterThanOrEqualTo(String value) {
            addCriterion("bill_settle_status >=", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusLessThan(String value) {
            addCriterion("bill_settle_status <", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusLessThanOrEqualTo(String value) {
            addCriterion("bill_settle_status <=", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusLike(String value) {
            addCriterion("bill_settle_status like", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusNotLike(String value) {
            addCriterion("bill_settle_status not like", value, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusIn(List<String> values) {
            addCriterion("bill_settle_status in", values, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusNotIn(List<String> values) {
            addCriterion("bill_settle_status not in", values, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusBetween(String value1, String value2) {
            addCriterion("bill_settle_status between", value1, value2, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleStatusNotBetween(String value1, String value2) {
            addCriterion("bill_settle_status not between", value1, value2, "billSettleStatus");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgIsNull() {
            addCriterion("bill_settle_msg is null");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgIsNotNull() {
            addCriterion("bill_settle_msg is not null");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgEqualTo(String value) {
            addCriterion("bill_settle_msg =", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgNotEqualTo(String value) {
            addCriterion("bill_settle_msg <>", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgGreaterThan(String value) {
            addCriterion("bill_settle_msg >", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgGreaterThanOrEqualTo(String value) {
            addCriterion("bill_settle_msg >=", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgLessThan(String value) {
            addCriterion("bill_settle_msg <", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgLessThanOrEqualTo(String value) {
            addCriterion("bill_settle_msg <=", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgLike(String value) {
            addCriterion("bill_settle_msg like", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgNotLike(String value) {
            addCriterion("bill_settle_msg not like", value, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgIn(List<String> values) {
            addCriterion("bill_settle_msg in", values, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgNotIn(List<String> values) {
            addCriterion("bill_settle_msg not in", values, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgBetween(String value1, String value2) {
            addCriterion("bill_settle_msg between", value1, value2, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andBillSettleMsgNotBetween(String value1, String value2) {
            addCriterion("bill_settle_msg not between", value1, value2, "billSettleMsg");
            return (Criteria) this;
        }

        public Criteria andChannelSourceIsNull() {
            addCriterion("channel_source is null");
            return (Criteria) this;
        }

        public Criteria andChannelSourceIsNotNull() {
            addCriterion("channel_source is not null");
            return (Criteria) this;
        }

        public Criteria andChannelSourceEqualTo(String value) {
            addCriterion("channel_source =", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotEqualTo(String value) {
            addCriterion("channel_source <>", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceGreaterThan(String value) {
            addCriterion("channel_source >", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceGreaterThanOrEqualTo(String value) {
            addCriterion("channel_source >=", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceLessThan(String value) {
            addCriterion("channel_source <", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceLessThanOrEqualTo(String value) {
            addCriterion("channel_source <=", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceLike(String value) {
            addCriterion("channel_source like", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotLike(String value) {
            addCriterion("channel_source not like", value, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceIn(List<String> values) {
            addCriterion("channel_source in", values, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotIn(List<String> values) {
            addCriterion("channel_source not in", values, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceBetween(String value1, String value2) {
            addCriterion("channel_source between", value1, value2, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelSourceNotBetween(String value1, String value2) {
            addCriterion("channel_source not between", value1, value2, "channelSource");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNull() {
            addCriterion("channel_type is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("channel_type is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(String value) {
            addCriterion("channel_type =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(String value) {
            addCriterion("channel_type <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(String value) {
            addCriterion("channel_type >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(String value) {
            addCriterion("channel_type >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(String value) {
            addCriterion("channel_type <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(String value) {
            addCriterion("channel_type <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLike(String value) {
            addCriterion("channel_type like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotLike(String value) {
            addCriterion("channel_type not like", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<String> values) {
            addCriterion("channel_type in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<String> values) {
            addCriterion("channel_type not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(String value1, String value2) {
            addCriterion("channel_type between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(String value1, String value2) {
            addCriterion("channel_type not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andOsIsNull() {
            addCriterion("os is null");
            return (Criteria) this;
        }

        public Criteria andOsIsNotNull() {
            addCriterion("os is not null");
            return (Criteria) this;
        }

        public Criteria andOsEqualTo(String value) {
            addCriterion("os =", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotEqualTo(String value) {
            addCriterion("os <>", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThan(String value) {
            addCriterion("os >", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsGreaterThanOrEqualTo(String value) {
            addCriterion("os >=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThan(String value) {
            addCriterion("os <", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLessThanOrEqualTo(String value) {
            addCriterion("os <=", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsLike(String value) {
            addCriterion("os like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotLike(String value) {
            addCriterion("os not like", value, "os");
            return (Criteria) this;
        }

        public Criteria andOsIn(List<String> values) {
            addCriterion("os in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotIn(List<String> values) {
            addCriterion("os not in", values, "os");
            return (Criteria) this;
        }

        public Criteria andOsBetween(String value1, String value2) {
            addCriterion("os between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andOsNotBetween(String value1, String value2) {
            addCriterion("os not between", value1, value2, "os");
            return (Criteria) this;
        }

        public Criteria andSidIsNull() {
            addCriterion("sid is null");
            return (Criteria) this;
        }

        public Criteria andSidIsNotNull() {
            addCriterion("sid is not null");
            return (Criteria) this;
        }

        public Criteria andSidEqualTo(String value) {
            addCriterion("sid =", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotEqualTo(String value) {
            addCriterion("sid <>", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThan(String value) {
            addCriterion("sid >", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidGreaterThanOrEqualTo(String value) {
            addCriterion("sid >=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThan(String value) {
            addCriterion("sid <", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLessThanOrEqualTo(String value) {
            addCriterion("sid <=", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidLike(String value) {
            addCriterion("sid like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotLike(String value) {
            addCriterion("sid not like", value, "sid");
            return (Criteria) this;
        }

        public Criteria andSidIn(List<String> values) {
            addCriterion("sid in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotIn(List<String> values) {
            addCriterion("sid not in", values, "sid");
            return (Criteria) this;
        }

        public Criteria andSidBetween(String value1, String value2) {
            addCriterion("sid between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andSidNotBetween(String value1, String value2) {
            addCriterion("sid not between", value1, value2, "sid");
            return (Criteria) this;
        }

        public Criteria andNetidIsNull() {
            addCriterion("netid is null");
            return (Criteria) this;
        }

        public Criteria andNetidIsNotNull() {
            addCriterion("netid is not null");
            return (Criteria) this;
        }

        public Criteria andNetidEqualTo(String value) {
            addCriterion("netid =", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidNotEqualTo(String value) {
            addCriterion("netid <>", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidGreaterThan(String value) {
            addCriterion("netid >", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidGreaterThanOrEqualTo(String value) {
            addCriterion("netid >=", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidLessThan(String value) {
            addCriterion("netid <", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidLessThanOrEqualTo(String value) {
            addCriterion("netid <=", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidLike(String value) {
            addCriterion("netid like", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidNotLike(String value) {
            addCriterion("netid not like", value, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidIn(List<String> values) {
            addCriterion("netid in", values, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidNotIn(List<String> values) {
            addCriterion("netid not in", values, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidBetween(String value1, String value2) {
            addCriterion("netid between", value1, value2, "netid");
            return (Criteria) this;
        }

        public Criteria andNetidNotBetween(String value1, String value2) {
            addCriterion("netid not between", value1, value2, "netid");
            return (Criteria) this;
        }

        public Criteria andTerminalnoIsNull() {
            addCriterion("terminalno is null");
            return (Criteria) this;
        }

        public Criteria andTerminalnoIsNotNull() {
            addCriterion("terminalno is not null");
            return (Criteria) this;
        }

        public Criteria andTerminalnoEqualTo(String value) {
            addCriterion("terminalno =", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotEqualTo(String value) {
            addCriterion("terminalno <>", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoGreaterThan(String value) {
            addCriterion("terminalno >", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoGreaterThanOrEqualTo(String value) {
            addCriterion("terminalno >=", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoLessThan(String value) {
            addCriterion("terminalno <", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoLessThanOrEqualTo(String value) {
            addCriterion("terminalno <=", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoLike(String value) {
            addCriterion("terminalno like", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotLike(String value) {
            addCriterion("terminalno not like", value, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoIn(List<String> values) {
            addCriterion("terminalno in", values, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotIn(List<String> values) {
            addCriterion("terminalno not in", values, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoBetween(String value1, String value2) {
            addCriterion("terminalno between", value1, value2, "terminalno");
            return (Criteria) this;
        }

        public Criteria andTerminalnoNotBetween(String value1, String value2) {
            addCriterion("terminalno not between", value1, value2, "terminalno");
            return (Criteria) this;
        }

        public Criteria andPaymentseriIsNull() {
            addCriterion("paymentseri is null");
            return (Criteria) this;
        }

        public Criteria andPaymentseriIsNotNull() {
            addCriterion("paymentseri is not null");
            return (Criteria) this;
        }

        public Criteria andPaymentseriEqualTo(String value) {
            addCriterion("paymentseri =", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriNotEqualTo(String value) {
            addCriterion("paymentseri <>", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriGreaterThan(String value) {
            addCriterion("paymentseri >", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriGreaterThanOrEqualTo(String value) {
            addCriterion("paymentseri >=", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriLessThan(String value) {
            addCriterion("paymentseri <", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriLessThanOrEqualTo(String value) {
            addCriterion("paymentseri <=", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriLike(String value) {
            addCriterion("paymentseri like", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriNotLike(String value) {
            addCriterion("paymentseri not like", value, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriIn(List<String> values) {
            addCriterion("paymentseri in", values, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriNotIn(List<String> values) {
            addCriterion("paymentseri not in", values, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriBetween(String value1, String value2) {
            addCriterion("paymentseri between", value1, value2, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andPaymentseriNotBetween(String value1, String value2) {
            addCriterion("paymentseri not between", value1, value2, "paymentseri");
            return (Criteria) this;
        }

        public Criteria andBillidIsNull() {
            addCriterion("billid is null");
            return (Criteria) this;
        }

        public Criteria andBillidIsNotNull() {
            addCriterion("billid is not null");
            return (Criteria) this;
        }

        public Criteria andBillidEqualTo(String value) {
            addCriterion("billid =", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotEqualTo(String value) {
            addCriterion("billid <>", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThan(String value) {
            addCriterion("billid >", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidGreaterThanOrEqualTo(String value) {
            addCriterion("billid >=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThan(String value) {
            addCriterion("billid <", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLessThanOrEqualTo(String value) {
            addCriterion("billid <=", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidLike(String value) {
            addCriterion("billid like", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotLike(String value) {
            addCriterion("billid not like", value, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidIn(List<String> values) {
            addCriterion("billid in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotIn(List<String> values) {
            addCriterion("billid not in", values, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidBetween(String value1, String value2) {
            addCriterion("billid between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andBillidNotBetween(String value1, String value2) {
            addCriterion("billid not between", value1, value2, "billid");
            return (Criteria) this;
        }

        public Criteria andIsFenrunIsNull() {
            addCriterion("is_fenrun is null");
            return (Criteria) this;
        }

        public Criteria andIsFenrunIsNotNull() {
            addCriterion("is_fenrun is not null");
            return (Criteria) this;
        }

        public Criteria andIsFenrunEqualTo(String value) {
            addCriterion("is_fenrun =", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunNotEqualTo(String value) {
            addCriterion("is_fenrun <>", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunGreaterThan(String value) {
            addCriterion("is_fenrun >", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunGreaterThanOrEqualTo(String value) {
            addCriterion("is_fenrun >=", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunLessThan(String value) {
            addCriterion("is_fenrun <", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunLessThanOrEqualTo(String value) {
            addCriterion("is_fenrun <=", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunLike(String value) {
            addCriterion("is_fenrun like", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunNotLike(String value) {
            addCriterion("is_fenrun not like", value, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunIn(List<String> values) {
            addCriterion("is_fenrun in", values, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunNotIn(List<String> values) {
            addCriterion("is_fenrun not in", values, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunBetween(String value1, String value2) {
            addCriterion("is_fenrun between", value1, value2, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsFenrunNotBetween(String value1, String value2) {
            addCriterion("is_fenrun not between", value1, value2, "isFenrun");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyIsNull() {
            addCriterion("is_remoney is null");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyIsNotNull() {
            addCriterion("is_remoney is not null");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyEqualTo(String value) {
            addCriterion("is_remoney =", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyNotEqualTo(String value) {
            addCriterion("is_remoney <>", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyGreaterThan(String value) {
            addCriterion("is_remoney >", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyGreaterThanOrEqualTo(String value) {
            addCriterion("is_remoney >=", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyLessThan(String value) {
            addCriterion("is_remoney <", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyLessThanOrEqualTo(String value) {
            addCriterion("is_remoney <=", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyLike(String value) {
            addCriterion("is_remoney like", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyNotLike(String value) {
            addCriterion("is_remoney not like", value, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyIn(List<String> values) {
            addCriterion("is_remoney in", values, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyNotIn(List<String> values) {
            addCriterion("is_remoney not in", values, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyBetween(String value1, String value2) {
            addCriterion("is_remoney between", value1, value2, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andIsRemoneyNotBetween(String value1, String value2) {
            addCriterion("is_remoney not between", value1, value2, "isRemoney");
            return (Criteria) this;
        }

        public Criteria andReAmountIsNull() {
            addCriterion("re_amount is null");
            return (Criteria) this;
        }

        public Criteria andReAmountIsNotNull() {
            addCriterion("re_amount is not null");
            return (Criteria) this;
        }

        public Criteria andReAmountEqualTo(BigDecimal value) {
            addCriterion("re_amount =", value, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountNotEqualTo(BigDecimal value) {
            addCriterion("re_amount <>", value, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountGreaterThan(BigDecimal value) {
            addCriterion("re_amount >", value, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("re_amount >=", value, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountLessThan(BigDecimal value) {
            addCriterion("re_amount <", value, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountLessThanOrEqualTo(BigDecimal value) {
            addCriterion("re_amount <=", value, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountIn(List<BigDecimal> values) {
            addCriterion("re_amount in", values, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountNotIn(List<BigDecimal> values) {
            addCriterion("re_amount not in", values, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("re_amount between", value1, value2, "reAmount");
            return (Criteria) this;
        }

        public Criteria andReAmountNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("re_amount not between", value1, value2, "reAmount");
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