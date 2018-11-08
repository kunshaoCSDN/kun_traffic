package xsl.cms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItIllagelrecordExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItIllagelrecordExample() {
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

        public Criteria andIrIdIsNull() {
            addCriterion("ir_id is null");
            return (Criteria) this;
        }

        public Criteria andIrIdIsNotNull() {
            addCriterion("ir_id is not null");
            return (Criteria) this;
        }

        public Criteria andIrIdEqualTo(Integer value) {
            addCriterion("ir_id =", value, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdNotEqualTo(Integer value) {
            addCriterion("ir_id <>", value, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdGreaterThan(Integer value) {
            addCriterion("ir_id >", value, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("ir_id >=", value, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdLessThan(Integer value) {
            addCriterion("ir_id <", value, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdLessThanOrEqualTo(Integer value) {
            addCriterion("ir_id <=", value, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdIn(List<Integer> values) {
            addCriterion("ir_id in", values, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdNotIn(List<Integer> values) {
            addCriterion("ir_id not in", values, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdBetween(Integer value1, Integer value2) {
            addCriterion("ir_id between", value1, value2, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("ir_id not between", value1, value2, "irId");
            return (Criteria) this;
        }

        public Criteria andIrIidIsNull() {
            addCriterion("ir_iid is null");
            return (Criteria) this;
        }

        public Criteria andIrIidIsNotNull() {
            addCriterion("ir_iid is not null");
            return (Criteria) this;
        }

        public Criteria andIrIidEqualTo(Integer value) {
            addCriterion("ir_iid =", value, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidNotEqualTo(Integer value) {
            addCriterion("ir_iid <>", value, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidGreaterThan(Integer value) {
            addCriterion("ir_iid >", value, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidGreaterThanOrEqualTo(Integer value) {
            addCriterion("ir_iid >=", value, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidLessThan(Integer value) {
            addCriterion("ir_iid <", value, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidLessThanOrEqualTo(Integer value) {
            addCriterion("ir_iid <=", value, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidIn(List<Integer> values) {
            addCriterion("ir_iid in", values, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidNotIn(List<Integer> values) {
            addCriterion("ir_iid not in", values, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidBetween(Integer value1, Integer value2) {
            addCriterion("ir_iid between", value1, value2, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrIidNotBetween(Integer value1, Integer value2) {
            addCriterion("ir_iid not between", value1, value2, "irIid");
            return (Criteria) this;
        }

        public Criteria andIrStateIsNull() {
            addCriterion("ir_state is null");
            return (Criteria) this;
        }

        public Criteria andIrStateIsNotNull() {
            addCriterion("ir_state is not null");
            return (Criteria) this;
        }

        public Criteria andIrStateEqualTo(Boolean value) {
            addCriterion("ir_state =", value, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateNotEqualTo(Boolean value) {
            addCriterion("ir_state <>", value, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateGreaterThan(Boolean value) {
            addCriterion("ir_state >", value, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateGreaterThanOrEqualTo(Boolean value) {
            addCriterion("ir_state >=", value, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateLessThan(Boolean value) {
            addCriterion("ir_state <", value, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateLessThanOrEqualTo(Boolean value) {
            addCriterion("ir_state <=", value, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateIn(List<Boolean> values) {
            addCriterion("ir_state in", values, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateNotIn(List<Boolean> values) {
            addCriterion("ir_state not in", values, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateBetween(Boolean value1, Boolean value2) {
            addCriterion("ir_state between", value1, value2, "irState");
            return (Criteria) this;
        }

        public Criteria andIrStateNotBetween(Boolean value1, Boolean value2) {
            addCriterion("ir_state not between", value1, value2, "irState");
            return (Criteria) this;
        }

        public Criteria andIrImgIsNull() {
            addCriterion("ir_img is null");
            return (Criteria) this;
        }

        public Criteria andIrImgIsNotNull() {
            addCriterion("ir_img is not null");
            return (Criteria) this;
        }

        public Criteria andIrImgEqualTo(String value) {
            addCriterion("ir_img =", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgNotEqualTo(String value) {
            addCriterion("ir_img <>", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgGreaterThan(String value) {
            addCriterion("ir_img >", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgGreaterThanOrEqualTo(String value) {
            addCriterion("ir_img >=", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgLessThan(String value) {
            addCriterion("ir_img <", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgLessThanOrEqualTo(String value) {
            addCriterion("ir_img <=", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgLike(String value) {
            addCriterion("ir_img like", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgNotLike(String value) {
            addCriterion("ir_img not like", value, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgIn(List<String> values) {
            addCriterion("ir_img in", values, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgNotIn(List<String> values) {
            addCriterion("ir_img not in", values, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgBetween(String value1, String value2) {
            addCriterion("ir_img between", value1, value2, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrImgNotBetween(String value1, String value2) {
            addCriterion("ir_img not between", value1, value2, "irImg");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeIsNull() {
            addCriterion("ir_approveTime is null");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeIsNotNull() {
            addCriterion("ir_approveTime is not null");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeEqualTo(Date value) {
            addCriterion("ir_approveTime =", value, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeNotEqualTo(Date value) {
            addCriterion("ir_approveTime <>", value, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeGreaterThan(Date value) {
            addCriterion("ir_approveTime >", value, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("ir_approveTime >=", value, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeLessThan(Date value) {
            addCriterion("ir_approveTime <", value, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeLessThanOrEqualTo(Date value) {
            addCriterion("ir_approveTime <=", value, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeIn(List<Date> values) {
            addCriterion("ir_approveTime in", values, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeNotIn(List<Date> values) {
            addCriterion("ir_approveTime not in", values, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeBetween(Date value1, Date value2) {
            addCriterion("ir_approveTime between", value1, value2, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrApprovetimeNotBetween(Date value1, Date value2) {
            addCriterion("ir_approveTime not between", value1, value2, "irApprovetime");
            return (Criteria) this;
        }

        public Criteria andIrRemarkIsNull() {
            addCriterion("ir_remark is null");
            return (Criteria) this;
        }

        public Criteria andIrRemarkIsNotNull() {
            addCriterion("ir_remark is not null");
            return (Criteria) this;
        }

        public Criteria andIrRemarkEqualTo(String value) {
            addCriterion("ir_remark =", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkNotEqualTo(String value) {
            addCriterion("ir_remark <>", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkGreaterThan(String value) {
            addCriterion("ir_remark >", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkGreaterThanOrEqualTo(String value) {
            addCriterion("ir_remark >=", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkLessThan(String value) {
            addCriterion("ir_remark <", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkLessThanOrEqualTo(String value) {
            addCriterion("ir_remark <=", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkLike(String value) {
            addCriterion("ir_remark like", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkNotLike(String value) {
            addCriterion("ir_remark not like", value, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkIn(List<String> values) {
            addCriterion("ir_remark in", values, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkNotIn(List<String> values) {
            addCriterion("ir_remark not in", values, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkBetween(String value1, String value2) {
            addCriterion("ir_remark between", value1, value2, "irRemark");
            return (Criteria) this;
        }

        public Criteria andIrRemarkNotBetween(String value1, String value2) {
            addCriterion("ir_remark not between", value1, value2, "irRemark");
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