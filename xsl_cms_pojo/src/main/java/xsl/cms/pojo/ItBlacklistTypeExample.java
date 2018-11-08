package xsl.cms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItBlacklistTypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItBlacklistTypeExample() {
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

        public Criteria andBtIdIsNull() {
            addCriterion("bt_id is null");
            return (Criteria) this;
        }

        public Criteria andBtIdIsNotNull() {
            addCriterion("bt_id is not null");
            return (Criteria) this;
        }

        public Criteria andBtIdEqualTo(Integer value) {
            addCriterion("bt_id =", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotEqualTo(Integer value) {
            addCriterion("bt_id <>", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdGreaterThan(Integer value) {
            addCriterion("bt_id >", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bt_id >=", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLessThan(Integer value) {
            addCriterion("bt_id <", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdLessThanOrEqualTo(Integer value) {
            addCriterion("bt_id <=", value, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdIn(List<Integer> values) {
            addCriterion("bt_id in", values, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotIn(List<Integer> values) {
            addCriterion("bt_id not in", values, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdBetween(Integer value1, Integer value2) {
            addCriterion("bt_id between", value1, value2, "btId");
            return (Criteria) this;
        }

        public Criteria andBtIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bt_id not between", value1, value2, "btId");
            return (Criteria) this;
        }

        public Criteria andBtNameIsNull() {
            addCriterion("bt_name is null");
            return (Criteria) this;
        }

        public Criteria andBtNameIsNotNull() {
            addCriterion("bt_name is not null");
            return (Criteria) this;
        }

        public Criteria andBtNameEqualTo(String value) {
            addCriterion("bt_name =", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotEqualTo(String value) {
            addCriterion("bt_name <>", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameGreaterThan(String value) {
            addCriterion("bt_name >", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameGreaterThanOrEqualTo(String value) {
            addCriterion("bt_name >=", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameLessThan(String value) {
            addCriterion("bt_name <", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameLessThanOrEqualTo(String value) {
            addCriterion("bt_name <=", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameLike(String value) {
            addCriterion("bt_name like", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotLike(String value) {
            addCriterion("bt_name not like", value, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameIn(List<String> values) {
            addCriterion("bt_name in", values, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotIn(List<String> values) {
            addCriterion("bt_name not in", values, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameBetween(String value1, String value2) {
            addCriterion("bt_name between", value1, value2, "btName");
            return (Criteria) this;
        }

        public Criteria andBtNameNotBetween(String value1, String value2) {
            addCriterion("bt_name not between", value1, value2, "btName");
            return (Criteria) this;
        }

        public Criteria andBtLevelIsNull() {
            addCriterion("bt_level is null");
            return (Criteria) this;
        }

        public Criteria andBtLevelIsNotNull() {
            addCriterion("bt_level is not null");
            return (Criteria) this;
        }

        public Criteria andBtLevelEqualTo(Boolean value) {
            addCriterion("bt_level =", value, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelNotEqualTo(Boolean value) {
            addCriterion("bt_level <>", value, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelGreaterThan(Boolean value) {
            addCriterion("bt_level >", value, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bt_level >=", value, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelLessThan(Boolean value) {
            addCriterion("bt_level <", value, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelLessThanOrEqualTo(Boolean value) {
            addCriterion("bt_level <=", value, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelIn(List<Boolean> values) {
            addCriterion("bt_level in", values, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelNotIn(List<Boolean> values) {
            addCriterion("bt_level not in", values, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelBetween(Boolean value1, Boolean value2) {
            addCriterion("bt_level between", value1, value2, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtLevelNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bt_level not between", value1, value2, "btLevel");
            return (Criteria) this;
        }

        public Criteria andBtRemarkIsNull() {
            addCriterion("bt_remark is null");
            return (Criteria) this;
        }

        public Criteria andBtRemarkIsNotNull() {
            addCriterion("bt_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBtRemarkEqualTo(String value) {
            addCriterion("bt_remark =", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotEqualTo(String value) {
            addCriterion("bt_remark <>", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkGreaterThan(String value) {
            addCriterion("bt_remark >", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bt_remark >=", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkLessThan(String value) {
            addCriterion("bt_remark <", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkLessThanOrEqualTo(String value) {
            addCriterion("bt_remark <=", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkLike(String value) {
            addCriterion("bt_remark like", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotLike(String value) {
            addCriterion("bt_remark not like", value, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkIn(List<String> values) {
            addCriterion("bt_remark in", values, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotIn(List<String> values) {
            addCriterion("bt_remark not in", values, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkBetween(String value1, String value2) {
            addCriterion("bt_remark between", value1, value2, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtRemarkNotBetween(String value1, String value2) {
            addCriterion("bt_remark not between", value1, value2, "btRemark");
            return (Criteria) this;
        }

        public Criteria andBtStateIsNull() {
            addCriterion("bt_state is null");
            return (Criteria) this;
        }

        public Criteria andBtStateIsNotNull() {
            addCriterion("bt_state is not null");
            return (Criteria) this;
        }

        public Criteria andBtStateEqualTo(Boolean value) {
            addCriterion("bt_state =", value, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateNotEqualTo(Boolean value) {
            addCriterion("bt_state <>", value, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateGreaterThan(Boolean value) {
            addCriterion("bt_state >", value, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bt_state >=", value, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateLessThan(Boolean value) {
            addCriterion("bt_state <", value, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateLessThanOrEqualTo(Boolean value) {
            addCriterion("bt_state <=", value, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateIn(List<Boolean> values) {
            addCriterion("bt_state in", values, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateNotIn(List<Boolean> values) {
            addCriterion("bt_state not in", values, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateBetween(Boolean value1, Boolean value2) {
            addCriterion("bt_state between", value1, value2, "btState");
            return (Criteria) this;
        }

        public Criteria andBtStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bt_state not between", value1, value2, "btState");
            return (Criteria) this;
        }

        public Criteria andBtUsecountIsNull() {
            addCriterion("bt_useCount is null");
            return (Criteria) this;
        }

        public Criteria andBtUsecountIsNotNull() {
            addCriterion("bt_useCount is not null");
            return (Criteria) this;
        }

        public Criteria andBtUsecountEqualTo(Long value) {
            addCriterion("bt_useCount =", value, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountNotEqualTo(Long value) {
            addCriterion("bt_useCount <>", value, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountGreaterThan(Long value) {
            addCriterion("bt_useCount >", value, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountGreaterThanOrEqualTo(Long value) {
            addCriterion("bt_useCount >=", value, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountLessThan(Long value) {
            addCriterion("bt_useCount <", value, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountLessThanOrEqualTo(Long value) {
            addCriterion("bt_useCount <=", value, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountIn(List<Long> values) {
            addCriterion("bt_useCount in", values, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountNotIn(List<Long> values) {
            addCriterion("bt_useCount not in", values, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountBetween(Long value1, Long value2) {
            addCriterion("bt_useCount between", value1, value2, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUsecountNotBetween(Long value1, Long value2) {
            addCriterion("bt_useCount not between", value1, value2, "btUsecount");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeIsNull() {
            addCriterion("bt_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeIsNotNull() {
            addCriterion("bt_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeEqualTo(Date value) {
            addCriterion("bt_updateTime =", value, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeNotEqualTo(Date value) {
            addCriterion("bt_updateTime <>", value, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeGreaterThan(Date value) {
            addCriterion("bt_updateTime >", value, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bt_updateTime >=", value, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeLessThan(Date value) {
            addCriterion("bt_updateTime <", value, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("bt_updateTime <=", value, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeIn(List<Date> values) {
            addCriterion("bt_updateTime in", values, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeNotIn(List<Date> values) {
            addCriterion("bt_updateTime not in", values, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("bt_updateTime between", value1, value2, "btUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBtUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("bt_updateTime not between", value1, value2, "btUpdatetime");
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