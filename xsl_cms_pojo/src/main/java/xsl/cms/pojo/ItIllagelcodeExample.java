package xsl.cms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItIllagelcodeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItIllagelcodeExample() {
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

        public Criteria andIcIdIsNull() {
            addCriterion("ic_id is null");
            return (Criteria) this;
        }

        public Criteria andIcIdIsNotNull() {
            addCriterion("ic_id is not null");
            return (Criteria) this;
        }

        public Criteria andIcIdEqualTo(Integer value) {
            addCriterion("ic_id =", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotEqualTo(Integer value) {
            addCriterion("ic_id <>", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdGreaterThan(Integer value) {
            addCriterion("ic_id >", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_id >=", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLessThan(Integer value) {
            addCriterion("ic_id <", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdLessThanOrEqualTo(Integer value) {
            addCriterion("ic_id <=", value, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdIn(List<Integer> values) {
            addCriterion("ic_id in", values, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotIn(List<Integer> values) {
            addCriterion("ic_id not in", values, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdBetween(Integer value1, Integer value2) {
            addCriterion("ic_id between", value1, value2, "icId");
            return (Criteria) this;
        }

        public Criteria andIcIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_id not between", value1, value2, "icId");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourIsNull() {
            addCriterion("ic_behaviour is null");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourIsNotNull() {
            addCriterion("ic_behaviour is not null");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourEqualTo(String value) {
            addCriterion("ic_behaviour =", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourNotEqualTo(String value) {
            addCriterion("ic_behaviour <>", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourGreaterThan(String value) {
            addCriterion("ic_behaviour >", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourGreaterThanOrEqualTo(String value) {
            addCriterion("ic_behaviour >=", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourLessThan(String value) {
            addCriterion("ic_behaviour <", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourLessThanOrEqualTo(String value) {
            addCriterion("ic_behaviour <=", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourLike(String value) {
            addCriterion("ic_behaviour like", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourNotLike(String value) {
            addCriterion("ic_behaviour not like", value, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourIn(List<String> values) {
            addCriterion("ic_behaviour in", values, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourNotIn(List<String> values) {
            addCriterion("ic_behaviour not in", values, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourBetween(String value1, String value2) {
            addCriterion("ic_behaviour between", value1, value2, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcBehaviourNotBetween(String value1, String value2) {
            addCriterion("ic_behaviour not between", value1, value2, "icBehaviour");
            return (Criteria) this;
        }

        public Criteria andIcFineIsNull() {
            addCriterion("ic_fine is null");
            return (Criteria) this;
        }

        public Criteria andIcFineIsNotNull() {
            addCriterion("ic_fine is not null");
            return (Criteria) this;
        }

        public Criteria andIcFineEqualTo(Integer value) {
            addCriterion("ic_fine =", value, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineNotEqualTo(Integer value) {
            addCriterion("ic_fine <>", value, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineGreaterThan(Integer value) {
            addCriterion("ic_fine >", value, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_fine >=", value, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineLessThan(Integer value) {
            addCriterion("ic_fine <", value, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineLessThanOrEqualTo(Integer value) {
            addCriterion("ic_fine <=", value, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineIn(List<Integer> values) {
            addCriterion("ic_fine in", values, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineNotIn(List<Integer> values) {
            addCriterion("ic_fine not in", values, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineBetween(Integer value1, Integer value2) {
            addCriterion("ic_fine between", value1, value2, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcFineNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_fine not between", value1, value2, "icFine");
            return (Criteria) this;
        }

        public Criteria andIcScoreIsNull() {
            addCriterion("ic_score is null");
            return (Criteria) this;
        }

        public Criteria andIcScoreIsNotNull() {
            addCriterion("ic_score is not null");
            return (Criteria) this;
        }

        public Criteria andIcScoreEqualTo(Integer value) {
            addCriterion("ic_score =", value, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreNotEqualTo(Integer value) {
            addCriterion("ic_score <>", value, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreGreaterThan(Integer value) {
            addCriterion("ic_score >", value, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreGreaterThanOrEqualTo(Integer value) {
            addCriterion("ic_score >=", value, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreLessThan(Integer value) {
            addCriterion("ic_score <", value, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreLessThanOrEqualTo(Integer value) {
            addCriterion("ic_score <=", value, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreIn(List<Integer> values) {
            addCriterion("ic_score in", values, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreNotIn(List<Integer> values) {
            addCriterion("ic_score not in", values, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreBetween(Integer value1, Integer value2) {
            addCriterion("ic_score between", value1, value2, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcScoreNotBetween(Integer value1, Integer value2) {
            addCriterion("ic_score not between", value1, value2, "icScore");
            return (Criteria) this;
        }

        public Criteria andIcTimeIsNull() {
            addCriterion("ic_time is null");
            return (Criteria) this;
        }

        public Criteria andIcTimeIsNotNull() {
            addCriterion("ic_time is not null");
            return (Criteria) this;
        }

        public Criteria andIcTimeEqualTo(Date value) {
            addCriterion("ic_time =", value, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeNotEqualTo(Date value) {
            addCriterion("ic_time <>", value, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeGreaterThan(Date value) {
            addCriterion("ic_time >", value, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ic_time >=", value, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeLessThan(Date value) {
            addCriterion("ic_time <", value, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeLessThanOrEqualTo(Date value) {
            addCriterion("ic_time <=", value, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeIn(List<Date> values) {
            addCriterion("ic_time in", values, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeNotIn(List<Date> values) {
            addCriterion("ic_time not in", values, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeBetween(Date value1, Date value2) {
            addCriterion("ic_time between", value1, value2, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcTimeNotBetween(Date value1, Date value2) {
            addCriterion("ic_time not between", value1, value2, "icTime");
            return (Criteria) this;
        }

        public Criteria andIcStateIsNull() {
            addCriterion("ic_state is null");
            return (Criteria) this;
        }

        public Criteria andIcStateIsNotNull() {
            addCriterion("ic_state is not null");
            return (Criteria) this;
        }

        public Criteria andIcStateEqualTo(Boolean value) {
            addCriterion("ic_state =", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotEqualTo(Boolean value) {
            addCriterion("ic_state <>", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateGreaterThan(Boolean value) {
            addCriterion("ic_state >", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ic_state >=", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateLessThan(Boolean value) {
            addCriterion("ic_state <", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateLessThanOrEqualTo(Boolean value) {
            addCriterion("ic_state <=", value, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateIn(List<Boolean> values) {
            addCriterion("ic_state in", values, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotIn(List<Boolean> values) {
            addCriterion("ic_state not in", values, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateBetween(Boolean value1, Boolean value2) {
            addCriterion("ic_state between", value1, value2, "icState");
            return (Criteria) this;
        }

        public Criteria andIcStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ic_state not between", value1, value2, "icState");
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