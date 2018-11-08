package xsl.cms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItBlacklistExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItBlacklistExample() {
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

        public Criteria andBlIdIsNull() {
            addCriterion("bl_id is null");
            return (Criteria) this;
        }

        public Criteria andBlIdIsNotNull() {
            addCriterion("bl_id is not null");
            return (Criteria) this;
        }

        public Criteria andBlIdEqualTo(Integer value) {
            addCriterion("bl_id =", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotEqualTo(Integer value) {
            addCriterion("bl_id <>", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdGreaterThan(Integer value) {
            addCriterion("bl_id >", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bl_id >=", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLessThan(Integer value) {
            addCriterion("bl_id <", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdLessThanOrEqualTo(Integer value) {
            addCriterion("bl_id <=", value, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdIn(List<Integer> values) {
            addCriterion("bl_id in", values, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotIn(List<Integer> values) {
            addCriterion("bl_id not in", values, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdBetween(Integer value1, Integer value2) {
            addCriterion("bl_id between", value1, value2, "blId");
            return (Criteria) this;
        }

        public Criteria andBlIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bl_id not between", value1, value2, "blId");
            return (Criteria) this;
        }

        public Criteria andBlBidIsNull() {
            addCriterion("bl_bid is null");
            return (Criteria) this;
        }

        public Criteria andBlBidIsNotNull() {
            addCriterion("bl_bid is not null");
            return (Criteria) this;
        }

        public Criteria andBlBidEqualTo(Integer value) {
            addCriterion("bl_bid =", value, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidNotEqualTo(Integer value) {
            addCriterion("bl_bid <>", value, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidGreaterThan(Integer value) {
            addCriterion("bl_bid >", value, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidGreaterThanOrEqualTo(Integer value) {
            addCriterion("bl_bid >=", value, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidLessThan(Integer value) {
            addCriterion("bl_bid <", value, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidLessThanOrEqualTo(Integer value) {
            addCriterion("bl_bid <=", value, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidIn(List<Integer> values) {
            addCriterion("bl_bid in", values, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidNotIn(List<Integer> values) {
            addCriterion("bl_bid not in", values, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidBetween(Integer value1, Integer value2) {
            addCriterion("bl_bid between", value1, value2, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlBidNotBetween(Integer value1, Integer value2) {
            addCriterion("bl_bid not between", value1, value2, "blBid");
            return (Criteria) this;
        }

        public Criteria andBlNameIsNull() {
            addCriterion("bl_name is null");
            return (Criteria) this;
        }

        public Criteria andBlNameIsNotNull() {
            addCriterion("bl_name is not null");
            return (Criteria) this;
        }

        public Criteria andBlNameEqualTo(String value) {
            addCriterion("bl_name =", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameNotEqualTo(String value) {
            addCriterion("bl_name <>", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameGreaterThan(String value) {
            addCriterion("bl_name >", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameGreaterThanOrEqualTo(String value) {
            addCriterion("bl_name >=", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameLessThan(String value) {
            addCriterion("bl_name <", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameLessThanOrEqualTo(String value) {
            addCriterion("bl_name <=", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameLike(String value) {
            addCriterion("bl_name like", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameNotLike(String value) {
            addCriterion("bl_name not like", value, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameIn(List<String> values) {
            addCriterion("bl_name in", values, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameNotIn(List<String> values) {
            addCriterion("bl_name not in", values, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameBetween(String value1, String value2) {
            addCriterion("bl_name between", value1, value2, "blName");
            return (Criteria) this;
        }

        public Criteria andBlNameNotBetween(String value1, String value2) {
            addCriterion("bl_name not between", value1, value2, "blName");
            return (Criteria) this;
        }

        public Criteria andBlStateIsNull() {
            addCriterion("bl_state is null");
            return (Criteria) this;
        }

        public Criteria andBlStateIsNotNull() {
            addCriterion("bl_state is not null");
            return (Criteria) this;
        }

        public Criteria andBlStateEqualTo(Boolean value) {
            addCriterion("bl_state =", value, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateNotEqualTo(Boolean value) {
            addCriterion("bl_state <>", value, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateGreaterThan(Boolean value) {
            addCriterion("bl_state >", value, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("bl_state >=", value, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateLessThan(Boolean value) {
            addCriterion("bl_state <", value, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateLessThanOrEqualTo(Boolean value) {
            addCriterion("bl_state <=", value, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateIn(List<Boolean> values) {
            addCriterion("bl_state in", values, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateNotIn(List<Boolean> values) {
            addCriterion("bl_state not in", values, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_state between", value1, value2, "blState");
            return (Criteria) this;
        }

        public Criteria andBlStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("bl_state not between", value1, value2, "blState");
            return (Criteria) this;
        }

        public Criteria andBlRemarkIsNull() {
            addCriterion("bl_remark is null");
            return (Criteria) this;
        }

        public Criteria andBlRemarkIsNotNull() {
            addCriterion("bl_remark is not null");
            return (Criteria) this;
        }

        public Criteria andBlRemarkEqualTo(String value) {
            addCriterion("bl_remark =", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkNotEqualTo(String value) {
            addCriterion("bl_remark <>", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkGreaterThan(String value) {
            addCriterion("bl_remark >", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("bl_remark >=", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkLessThan(String value) {
            addCriterion("bl_remark <", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkLessThanOrEqualTo(String value) {
            addCriterion("bl_remark <=", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkLike(String value) {
            addCriterion("bl_remark like", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkNotLike(String value) {
            addCriterion("bl_remark not like", value, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkIn(List<String> values) {
            addCriterion("bl_remark in", values, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkNotIn(List<String> values) {
            addCriterion("bl_remark not in", values, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkBetween(String value1, String value2) {
            addCriterion("bl_remark between", value1, value2, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlRemarkNotBetween(String value1, String value2) {
            addCriterion("bl_remark not between", value1, value2, "blRemark");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitIsNull() {
            addCriterion("bl_publishUnit is null");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitIsNotNull() {
            addCriterion("bl_publishUnit is not null");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitEqualTo(String value) {
            addCriterion("bl_publishUnit =", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitNotEqualTo(String value) {
            addCriterion("bl_publishUnit <>", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitGreaterThan(String value) {
            addCriterion("bl_publishUnit >", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitGreaterThanOrEqualTo(String value) {
            addCriterion("bl_publishUnit >=", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitLessThan(String value) {
            addCriterion("bl_publishUnit <", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitLessThanOrEqualTo(String value) {
            addCriterion("bl_publishUnit <=", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitLike(String value) {
            addCriterion("bl_publishUnit like", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitNotLike(String value) {
            addCriterion("bl_publishUnit not like", value, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitIn(List<String> values) {
            addCriterion("bl_publishUnit in", values, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitNotIn(List<String> values) {
            addCriterion("bl_publishUnit not in", values, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitBetween(String value1, String value2) {
            addCriterion("bl_publishUnit between", value1, value2, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPublishunitNotBetween(String value1, String value2) {
            addCriterion("bl_publishUnit not between", value1, value2, "blPublishunit");
            return (Criteria) this;
        }

        public Criteria andBlPhoneIsNull() {
            addCriterion("bl_phone is null");
            return (Criteria) this;
        }

        public Criteria andBlPhoneIsNotNull() {
            addCriterion("bl_phone is not null");
            return (Criteria) this;
        }

        public Criteria andBlPhoneEqualTo(String value) {
            addCriterion("bl_phone =", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneNotEqualTo(String value) {
            addCriterion("bl_phone <>", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneGreaterThan(String value) {
            addCriterion("bl_phone >", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("bl_phone >=", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneLessThan(String value) {
            addCriterion("bl_phone <", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneLessThanOrEqualTo(String value) {
            addCriterion("bl_phone <=", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneLike(String value) {
            addCriterion("bl_phone like", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneNotLike(String value) {
            addCriterion("bl_phone not like", value, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneIn(List<String> values) {
            addCriterion("bl_phone in", values, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneNotIn(List<String> values) {
            addCriterion("bl_phone not in", values, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneBetween(String value1, String value2) {
            addCriterion("bl_phone between", value1, value2, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlPhoneNotBetween(String value1, String value2) {
            addCriterion("bl_phone not between", value1, value2, "blPhone");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeIsNull() {
            addCriterion("bl_updateTime is null");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeIsNotNull() {
            addCriterion("bl_updateTime is not null");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeEqualTo(Date value) {
            addCriterion("bl_updateTime =", value, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeNotEqualTo(Date value) {
            addCriterion("bl_updateTime <>", value, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeGreaterThan(Date value) {
            addCriterion("bl_updateTime >", value, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("bl_updateTime >=", value, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeLessThan(Date value) {
            addCriterion("bl_updateTime <", value, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeLessThanOrEqualTo(Date value) {
            addCriterion("bl_updateTime <=", value, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeIn(List<Date> values) {
            addCriterion("bl_updateTime in", values, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeNotIn(List<Date> values) {
            addCriterion("bl_updateTime not in", values, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeBetween(Date value1, Date value2) {
            addCriterion("bl_updateTime between", value1, value2, "blUpdatetime");
            return (Criteria) this;
        }

        public Criteria andBlUpdatetimeNotBetween(Date value1, Date value2) {
            addCriterion("bl_updateTime not between", value1, value2, "blUpdatetime");
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