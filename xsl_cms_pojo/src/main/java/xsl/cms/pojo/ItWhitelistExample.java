package xsl.cms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItWhitelistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItWhitelistExample() {
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

        public Criteria andWlIdIsNull() {
            addCriterion("wl_id is null");
            return (Criteria) this;
        }

        public Criteria andWlIdIsNotNull() {
            addCriterion("wl_id is not null");
            return (Criteria) this;
        }

        public Criteria andWlIdEqualTo(Integer value) {
            addCriterion("wl_id =", value, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdNotEqualTo(Integer value) {
            addCriterion("wl_id <>", value, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdGreaterThan(Integer value) {
            addCriterion("wl_id >", value, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wl_id >=", value, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdLessThan(Integer value) {
            addCriterion("wl_id <", value, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdLessThanOrEqualTo(Integer value) {
            addCriterion("wl_id <=", value, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdIn(List<Integer> values) {
            addCriterion("wl_id in", values, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdNotIn(List<Integer> values) {
            addCriterion("wl_id not in", values, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdBetween(Integer value1, Integer value2) {
            addCriterion("wl_id between", value1, value2, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wl_id not between", value1, value2, "wlId");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaIsNull() {
            addCriterion("wl_carSign_area is null");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaIsNotNull() {
            addCriterion("wl_carSign_area is not null");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaEqualTo(String value) {
            addCriterion("wl_carSign_area =", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaNotEqualTo(String value) {
            addCriterion("wl_carSign_area <>", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaGreaterThan(String value) {
            addCriterion("wl_carSign_area >", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaGreaterThanOrEqualTo(String value) {
            addCriterion("wl_carSign_area >=", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaLessThan(String value) {
            addCriterion("wl_carSign_area <", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaLessThanOrEqualTo(String value) {
            addCriterion("wl_carSign_area <=", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaLike(String value) {
            addCriterion("wl_carSign_area like", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaNotLike(String value) {
            addCriterion("wl_carSign_area not like", value, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaIn(List<String> values) {
            addCriterion("wl_carSign_area in", values, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaNotIn(List<String> values) {
            addCriterion("wl_carSign_area not in", values, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaBetween(String value1, String value2) {
            addCriterion("wl_carSign_area between", value1, value2, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignAreaNotBetween(String value1, String value2) {
            addCriterion("wl_carSign_area not between", value1, value2, "wlCarsignArea");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumIsNull() {
            addCriterion("wl_carSign_num is null");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumIsNotNull() {
            addCriterion("wl_carSign_num is not null");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumEqualTo(String value) {
            addCriterion("wl_carSign_num =", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumNotEqualTo(String value) {
            addCriterion("wl_carSign_num <>", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumGreaterThan(String value) {
            addCriterion("wl_carSign_num >", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumGreaterThanOrEqualTo(String value) {
            addCriterion("wl_carSign_num >=", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumLessThan(String value) {
            addCriterion("wl_carSign_num <", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumLessThanOrEqualTo(String value) {
            addCriterion("wl_carSign_num <=", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumLike(String value) {
            addCriterion("wl_carSign_num like", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumNotLike(String value) {
            addCriterion("wl_carSign_num not like", value, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumIn(List<String> values) {
            addCriterion("wl_carSign_num in", values, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumNotIn(List<String> values) {
            addCriterion("wl_carSign_num not in", values, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumBetween(String value1, String value2) {
            addCriterion("wl_carSign_num between", value1, value2, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlCarsignNumNotBetween(String value1, String value2) {
            addCriterion("wl_carSign_num not between", value1, value2, "wlCarsignNum");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitIsNull() {
            addCriterion("wl_approveUnit is null");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitIsNotNull() {
            addCriterion("wl_approveUnit is not null");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitEqualTo(Boolean value) {
            addCriterion("wl_approveUnit =", value, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitNotEqualTo(Boolean value) {
            addCriterion("wl_approveUnit <>", value, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitGreaterThan(Boolean value) {
            addCriterion("wl_approveUnit >", value, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wl_approveUnit >=", value, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitLessThan(Boolean value) {
            addCriterion("wl_approveUnit <", value, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitLessThanOrEqualTo(Boolean value) {
            addCriterion("wl_approveUnit <=", value, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitIn(List<Boolean> values) {
            addCriterion("wl_approveUnit in", values, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitNotIn(List<Boolean> values) {
            addCriterion("wl_approveUnit not in", values, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitBetween(Boolean value1, Boolean value2) {
            addCriterion("wl_approveUnit between", value1, value2, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveunitNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wl_approveUnit not between", value1, value2, "wlApproveunit");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiIsNull() {
            addCriterion("wl_approvePosi is null");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiIsNotNull() {
            addCriterion("wl_approvePosi is not null");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiEqualTo(String value) {
            addCriterion("wl_approvePosi =", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiNotEqualTo(String value) {
            addCriterion("wl_approvePosi <>", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiGreaterThan(String value) {
            addCriterion("wl_approvePosi >", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiGreaterThanOrEqualTo(String value) {
            addCriterion("wl_approvePosi >=", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiLessThan(String value) {
            addCriterion("wl_approvePosi <", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiLessThanOrEqualTo(String value) {
            addCriterion("wl_approvePosi <=", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiLike(String value) {
            addCriterion("wl_approvePosi like", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiNotLike(String value) {
            addCriterion("wl_approvePosi not like", value, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiIn(List<String> values) {
            addCriterion("wl_approvePosi in", values, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiNotIn(List<String> values) {
            addCriterion("wl_approvePosi not in", values, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiBetween(String value1, String value2) {
            addCriterion("wl_approvePosi between", value1, value2, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlApproveposiNotBetween(String value1, String value2) {
            addCriterion("wl_approvePosi not between", value1, value2, "wlApproveposi");
            return (Criteria) this;
        }

        public Criteria andWlStateIsNull() {
            addCriterion("wl_state is null");
            return (Criteria) this;
        }

        public Criteria andWlStateIsNotNull() {
            addCriterion("wl_state is not null");
            return (Criteria) this;
        }

        public Criteria andWlStateEqualTo(Boolean value) {
            addCriterion("wl_state =", value, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateNotEqualTo(Boolean value) {
            addCriterion("wl_state <>", value, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateGreaterThan(Boolean value) {
            addCriterion("wl_state >", value, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("wl_state >=", value, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateLessThan(Boolean value) {
            addCriterion("wl_state <", value, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateLessThanOrEqualTo(Boolean value) {
            addCriterion("wl_state <=", value, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateIn(List<Boolean> values) {
            addCriterion("wl_state in", values, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateNotIn(List<Boolean> values) {
            addCriterion("wl_state not in", values, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateBetween(Boolean value1, Boolean value2) {
            addCriterion("wl_state between", value1, value2, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("wl_state not between", value1, value2, "wlState");
            return (Criteria) this;
        }

        public Criteria andWlTimeIsNull() {
            addCriterion("wl_time is null");
            return (Criteria) this;
        }

        public Criteria andWlTimeIsNotNull() {
            addCriterion("wl_time is not null");
            return (Criteria) this;
        }

        public Criteria andWlTimeEqualTo(Date value) {
            addCriterion("wl_time =", value, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeNotEqualTo(Date value) {
            addCriterion("wl_time <>", value, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeGreaterThan(Date value) {
            addCriterion("wl_time >", value, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("wl_time >=", value, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeLessThan(Date value) {
            addCriterion("wl_time <", value, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeLessThanOrEqualTo(Date value) {
            addCriterion("wl_time <=", value, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeIn(List<Date> values) {
            addCriterion("wl_time in", values, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeNotIn(List<Date> values) {
            addCriterion("wl_time not in", values, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeBetween(Date value1, Date value2) {
            addCriterion("wl_time between", value1, value2, "wlTime");
            return (Criteria) this;
        }

        public Criteria andWlTimeNotBetween(Date value1, Date value2) {
            addCriterion("wl_time not between", value1, value2, "wlTime");
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