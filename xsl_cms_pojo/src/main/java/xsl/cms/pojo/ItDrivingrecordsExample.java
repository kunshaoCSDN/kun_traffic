package xsl.cms.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ItDrivingrecordsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItDrivingrecordsExample() {
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

        public Criteria andDrIdIsNull() {
            addCriterion("dr_id is null");
            return (Criteria) this;
        }

        public Criteria andDrIdIsNotNull() {
            addCriterion("dr_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrIdEqualTo(Integer value) {
            addCriterion("dr_id =", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotEqualTo(Integer value) {
            addCriterion("dr_id <>", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThan(Integer value) {
            addCriterion("dr_id >", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_id >=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThan(Integer value) {
            addCriterion("dr_id <", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdLessThanOrEqualTo(Integer value) {
            addCriterion("dr_id <=", value, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdIn(List<Integer> values) {
            addCriterion("dr_id in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotIn(List<Integer> values) {
            addCriterion("dr_id not in", values, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdBetween(Integer value1, Integer value2) {
            addCriterion("dr_id between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_id not between", value1, value2, "drId");
            return (Criteria) this;
        }

        public Criteria andDrDidIsNull() {
            addCriterion("dr_did is null");
            return (Criteria) this;
        }

        public Criteria andDrDidIsNotNull() {
            addCriterion("dr_did is not null");
            return (Criteria) this;
        }

        public Criteria andDrDidEqualTo(Integer value) {
            addCriterion("dr_did =", value, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidNotEqualTo(Integer value) {
            addCriterion("dr_did <>", value, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidGreaterThan(Integer value) {
            addCriterion("dr_did >", value, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_did >=", value, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidLessThan(Integer value) {
            addCriterion("dr_did <", value, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidLessThanOrEqualTo(Integer value) {
            addCriterion("dr_did <=", value, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidIn(List<Integer> values) {
            addCriterion("dr_did in", values, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidNotIn(List<Integer> values) {
            addCriterion("dr_did not in", values, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidBetween(Integer value1, Integer value2) {
            addCriterion("dr_did between", value1, value2, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrDidNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_did not between", value1, value2, "drDid");
            return (Criteria) this;
        }

        public Criteria andDrTimeIsNull() {
            addCriterion("dr_time is null");
            return (Criteria) this;
        }

        public Criteria andDrTimeIsNotNull() {
            addCriterion("dr_time is not null");
            return (Criteria) this;
        }

        public Criteria andDrTimeEqualTo(Date value) {
            addCriterion("dr_time =", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeNotEqualTo(Date value) {
            addCriterion("dr_time <>", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeGreaterThan(Date value) {
            addCriterion("dr_time >", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("dr_time >=", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeLessThan(Date value) {
            addCriterion("dr_time <", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeLessThanOrEqualTo(Date value) {
            addCriterion("dr_time <=", value, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeIn(List<Date> values) {
            addCriterion("dr_time in", values, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeNotIn(List<Date> values) {
            addCriterion("dr_time not in", values, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeBetween(Date value1, Date value2) {
            addCriterion("dr_time between", value1, value2, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrTimeNotBetween(Date value1, Date value2) {
            addCriterion("dr_time not between", value1, value2, "drTime");
            return (Criteria) this;
        }

        public Criteria andDrWayIsNull() {
            addCriterion("dr_way is null");
            return (Criteria) this;
        }

        public Criteria andDrWayIsNotNull() {
            addCriterion("dr_way is not null");
            return (Criteria) this;
        }

        public Criteria andDrWayEqualTo(String value) {
            addCriterion("dr_way =", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayNotEqualTo(String value) {
            addCriterion("dr_way <>", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayGreaterThan(String value) {
            addCriterion("dr_way >", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayGreaterThanOrEqualTo(String value) {
            addCriterion("dr_way >=", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayLessThan(String value) {
            addCriterion("dr_way <", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayLessThanOrEqualTo(String value) {
            addCriterion("dr_way <=", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayLike(String value) {
            addCriterion("dr_way like", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayNotLike(String value) {
            addCriterion("dr_way not like", value, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayIn(List<String> values) {
            addCriterion("dr_way in", values, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayNotIn(List<String> values) {
            addCriterion("dr_way not in", values, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayBetween(String value1, String value2) {
            addCriterion("dr_way between", value1, value2, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrWayNotBetween(String value1, String value2) {
            addCriterion("dr_way not between", value1, value2, "drWay");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaIsNull() {
            addCriterion("dr_carSign_area is null");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaIsNotNull() {
            addCriterion("dr_carSign_area is not null");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaEqualTo(String value) {
            addCriterion("dr_carSign_area =", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaNotEqualTo(String value) {
            addCriterion("dr_carSign_area <>", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaGreaterThan(String value) {
            addCriterion("dr_carSign_area >", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaGreaterThanOrEqualTo(String value) {
            addCriterion("dr_carSign_area >=", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaLessThan(String value) {
            addCriterion("dr_carSign_area <", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaLessThanOrEqualTo(String value) {
            addCriterion("dr_carSign_area <=", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaLike(String value) {
            addCriterion("dr_carSign_area like", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaNotLike(String value) {
            addCriterion("dr_carSign_area not like", value, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaIn(List<String> values) {
            addCriterion("dr_carSign_area in", values, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaNotIn(List<String> values) {
            addCriterion("dr_carSign_area not in", values, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaBetween(String value1, String value2) {
            addCriterion("dr_carSign_area between", value1, value2, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignAreaNotBetween(String value1, String value2) {
            addCriterion("dr_carSign_area not between", value1, value2, "drCarsignArea");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumIsNull() {
            addCriterion("dr_carSign_num is null");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumIsNotNull() {
            addCriterion("dr_carSign_num is not null");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumEqualTo(String value) {
            addCriterion("dr_carSign_num =", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumNotEqualTo(String value) {
            addCriterion("dr_carSign_num <>", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumGreaterThan(String value) {
            addCriterion("dr_carSign_num >", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumGreaterThanOrEqualTo(String value) {
            addCriterion("dr_carSign_num >=", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumLessThan(String value) {
            addCriterion("dr_carSign_num <", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumLessThanOrEqualTo(String value) {
            addCriterion("dr_carSign_num <=", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumLike(String value) {
            addCriterion("dr_carSign_num like", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumNotLike(String value) {
            addCriterion("dr_carSign_num not like", value, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumIn(List<String> values) {
            addCriterion("dr_carSign_num in", values, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumNotIn(List<String> values) {
            addCriterion("dr_carSign_num not in", values, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumBetween(String value1, String value2) {
            addCriterion("dr_carSign_num between", value1, value2, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarsignNumNotBetween(String value1, String value2) {
            addCriterion("dr_carSign_num not between", value1, value2, "drCarsignNum");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeIsNull() {
            addCriterion("dr_car_type is null");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeIsNotNull() {
            addCriterion("dr_car_type is not null");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeEqualTo(String value) {
            addCriterion("dr_car_type =", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeNotEqualTo(String value) {
            addCriterion("dr_car_type <>", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeGreaterThan(String value) {
            addCriterion("dr_car_type >", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeGreaterThanOrEqualTo(String value) {
            addCriterion("dr_car_type >=", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeLessThan(String value) {
            addCriterion("dr_car_type <", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeLessThanOrEqualTo(String value) {
            addCriterion("dr_car_type <=", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeLike(String value) {
            addCriterion("dr_car_type like", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeNotLike(String value) {
            addCriterion("dr_car_type not like", value, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeIn(List<String> values) {
            addCriterion("dr_car_type in", values, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeNotIn(List<String> values) {
            addCriterion("dr_car_type not in", values, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeBetween(String value1, String value2) {
            addCriterion("dr_car_type between", value1, value2, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarTypeNotBetween(String value1, String value2) {
            addCriterion("dr_car_type not between", value1, value2, "drCarType");
            return (Criteria) this;
        }

        public Criteria andDrCarColorIsNull() {
            addCriterion("dr_car_color is null");
            return (Criteria) this;
        }

        public Criteria andDrCarColorIsNotNull() {
            addCriterion("dr_car_color is not null");
            return (Criteria) this;
        }

        public Criteria andDrCarColorEqualTo(String value) {
            addCriterion("dr_car_color =", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorNotEqualTo(String value) {
            addCriterion("dr_car_color <>", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorGreaterThan(String value) {
            addCriterion("dr_car_color >", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorGreaterThanOrEqualTo(String value) {
            addCriterion("dr_car_color >=", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorLessThan(String value) {
            addCriterion("dr_car_color <", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorLessThanOrEqualTo(String value) {
            addCriterion("dr_car_color <=", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorLike(String value) {
            addCriterion("dr_car_color like", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorNotLike(String value) {
            addCriterion("dr_car_color not like", value, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorIn(List<String> values) {
            addCriterion("dr_car_color in", values, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorNotIn(List<String> values) {
            addCriterion("dr_car_color not in", values, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorBetween(String value1, String value2) {
            addCriterion("dr_car_color between", value1, value2, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarColorNotBetween(String value1, String value2) {
            addCriterion("dr_car_color not between", value1, value2, "drCarColor");
            return (Criteria) this;
        }

        public Criteria andDrCarSignIsNull() {
            addCriterion("dr_car_sign is null");
            return (Criteria) this;
        }

        public Criteria andDrCarSignIsNotNull() {
            addCriterion("dr_car_sign is not null");
            return (Criteria) this;
        }

        public Criteria andDrCarSignEqualTo(String value) {
            addCriterion("dr_car_sign =", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignNotEqualTo(String value) {
            addCriterion("dr_car_sign <>", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignGreaterThan(String value) {
            addCriterion("dr_car_sign >", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignGreaterThanOrEqualTo(String value) {
            addCriterion("dr_car_sign >=", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignLessThan(String value) {
            addCriterion("dr_car_sign <", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignLessThanOrEqualTo(String value) {
            addCriterion("dr_car_sign <=", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignLike(String value) {
            addCriterion("dr_car_sign like", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignNotLike(String value) {
            addCriterion("dr_car_sign not like", value, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignIn(List<String> values) {
            addCriterion("dr_car_sign in", values, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignNotIn(List<String> values) {
            addCriterion("dr_car_sign not in", values, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignBetween(String value1, String value2) {
            addCriterion("dr_car_sign between", value1, value2, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrCarSignNotBetween(String value1, String value2) {
            addCriterion("dr_car_sign not between", value1, value2, "drCarSign");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalIsNull() {
            addCriterion("dr_isIllegal is null");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalIsNotNull() {
            addCriterion("dr_isIllegal is not null");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalEqualTo(Boolean value) {
            addCriterion("dr_isIllegal =", value, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalNotEqualTo(Boolean value) {
            addCriterion("dr_isIllegal <>", value, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalGreaterThan(Boolean value) {
            addCriterion("dr_isIllegal >", value, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalGreaterThanOrEqualTo(Boolean value) {
            addCriterion("dr_isIllegal >=", value, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalLessThan(Boolean value) {
            addCriterion("dr_isIllegal <", value, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalLessThanOrEqualTo(Boolean value) {
            addCriterion("dr_isIllegal <=", value, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalIn(List<Boolean> values) {
            addCriterion("dr_isIllegal in", values, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalNotIn(List<Boolean> values) {
            addCriterion("dr_isIllegal not in", values, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalBetween(Boolean value1, Boolean value2) {
            addCriterion("dr_isIllegal between", value1, value2, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIsillegalNotBetween(Boolean value1, Boolean value2) {
            addCriterion("dr_isIllegal not between", value1, value2, "drIsillegal");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdIsNull() {
            addCriterion("dr_illegal_id is null");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdIsNotNull() {
            addCriterion("dr_illegal_id is not null");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdEqualTo(Integer value) {
            addCriterion("dr_illegal_id =", value, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdNotEqualTo(Integer value) {
            addCriterion("dr_illegal_id <>", value, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdGreaterThan(Integer value) {
            addCriterion("dr_illegal_id >", value, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_illegal_id >=", value, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdLessThan(Integer value) {
            addCriterion("dr_illegal_id <", value, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdLessThanOrEqualTo(Integer value) {
            addCriterion("dr_illegal_id <=", value, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdIn(List<Integer> values) {
            addCriterion("dr_illegal_id in", values, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdNotIn(List<Integer> values) {
            addCriterion("dr_illegal_id not in", values, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdBetween(Integer value1, Integer value2) {
            addCriterion("dr_illegal_id between", value1, value2, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrIllegalIdNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_illegal_id not between", value1, value2, "drIllegalId");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeIsNull() {
            addCriterion("dr_alarm_code is null");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeIsNotNull() {
            addCriterion("dr_alarm_code is not null");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeEqualTo(Integer value) {
            addCriterion("dr_alarm_code =", value, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeNotEqualTo(Integer value) {
            addCriterion("dr_alarm_code <>", value, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeGreaterThan(Integer value) {
            addCriterion("dr_alarm_code >", value, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_alarm_code >=", value, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeLessThan(Integer value) {
            addCriterion("dr_alarm_code <", value, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeLessThanOrEqualTo(Integer value) {
            addCriterion("dr_alarm_code <=", value, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeIn(List<Integer> values) {
            addCriterion("dr_alarm_code in", values, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeNotIn(List<Integer> values) {
            addCriterion("dr_alarm_code not in", values, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeBetween(Integer value1, Integer value2) {
            addCriterion("dr_alarm_code between", value1, value2, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrAlarmCodeNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_alarm_code not between", value1, value2, "drAlarmCode");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedIsNull() {
            addCriterion("dr_actual_speed is null");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedIsNotNull() {
            addCriterion("dr_actual_speed is not null");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedEqualTo(Integer value) {
            addCriterion("dr_actual_speed =", value, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedNotEqualTo(Integer value) {
            addCriterion("dr_actual_speed <>", value, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedGreaterThan(Integer value) {
            addCriterion("dr_actual_speed >", value, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_actual_speed >=", value, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedLessThan(Integer value) {
            addCriterion("dr_actual_speed <", value, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("dr_actual_speed <=", value, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedIn(List<Integer> values) {
            addCriterion("dr_actual_speed in", values, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedNotIn(List<Integer> values) {
            addCriterion("dr_actual_speed not in", values, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedBetween(Integer value1, Integer value2) {
            addCriterion("dr_actual_speed between", value1, value2, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrActualSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_actual_speed not between", value1, value2, "drActualSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedIsNull() {
            addCriterion("dr_limit_speed is null");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedIsNotNull() {
            addCriterion("dr_limit_speed is not null");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedEqualTo(Integer value) {
            addCriterion("dr_limit_speed =", value, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedNotEqualTo(Integer value) {
            addCriterion("dr_limit_speed <>", value, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedGreaterThan(Integer value) {
            addCriterion("dr_limit_speed >", value, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedGreaterThanOrEqualTo(Integer value) {
            addCriterion("dr_limit_speed >=", value, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedLessThan(Integer value) {
            addCriterion("dr_limit_speed <", value, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedLessThanOrEqualTo(Integer value) {
            addCriterion("dr_limit_speed <=", value, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedIn(List<Integer> values) {
            addCriterion("dr_limit_speed in", values, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedNotIn(List<Integer> values) {
            addCriterion("dr_limit_speed not in", values, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedBetween(Integer value1, Integer value2) {
            addCriterion("dr_limit_speed between", value1, value2, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrLimitSpeedNotBetween(Integer value1, Integer value2) {
            addCriterion("dr_limit_speed not between", value1, value2, "drLimitSpeed");
            return (Criteria) this;
        }

        public Criteria andDrImageurlIsNull() {
            addCriterion("dr_imageUrl is null");
            return (Criteria) this;
        }

        public Criteria andDrImageurlIsNotNull() {
            addCriterion("dr_imageUrl is not null");
            return (Criteria) this;
        }

        public Criteria andDrImageurlEqualTo(String value) {
            addCriterion("dr_imageUrl =", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlNotEqualTo(String value) {
            addCriterion("dr_imageUrl <>", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlGreaterThan(String value) {
            addCriterion("dr_imageUrl >", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlGreaterThanOrEqualTo(String value) {
            addCriterion("dr_imageUrl >=", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlLessThan(String value) {
            addCriterion("dr_imageUrl <", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlLessThanOrEqualTo(String value) {
            addCriterion("dr_imageUrl <=", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlLike(String value) {
            addCriterion("dr_imageUrl like", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlNotLike(String value) {
            addCriterion("dr_imageUrl not like", value, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlIn(List<String> values) {
            addCriterion("dr_imageUrl in", values, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlNotIn(List<String> values) {
            addCriterion("dr_imageUrl not in", values, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlBetween(String value1, String value2) {
            addCriterion("dr_imageUrl between", value1, value2, "drImageurl");
            return (Criteria) this;
        }

        public Criteria andDrImageurlNotBetween(String value1, String value2) {
            addCriterion("dr_imageUrl not between", value1, value2, "drImageurl");
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