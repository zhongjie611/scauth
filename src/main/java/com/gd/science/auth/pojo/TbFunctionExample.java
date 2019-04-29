package com.gd.science.auth.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TbFunctionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TbFunctionExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNull() {
            addCriterion("function_code is null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIsNotNull() {
            addCriterion("function_code is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeEqualTo(String value) {
            addCriterion("function_code =", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotEqualTo(String value) {
            addCriterion("function_code <>", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThan(String value) {
            addCriterion("function_code >", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeGreaterThanOrEqualTo(String value) {
            addCriterion("function_code >=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThan(String value) {
            addCriterion("function_code <", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLessThanOrEqualTo(String value) {
            addCriterion("function_code <=", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeLike(String value) {
            addCriterion("function_code like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotLike(String value) {
            addCriterion("function_code not like", value, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeIn(List<String> values) {
            addCriterion("function_code in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotIn(List<String> values) {
            addCriterion("function_code not in", values, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeBetween(String value1, String value2) {
            addCriterion("function_code between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionCodeNotBetween(String value1, String value2) {
            addCriterion("function_code not between", value1, value2, "functionCode");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNull() {
            addCriterion("function_name is null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIsNotNull() {
            addCriterion("function_name is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionNameEqualTo(String value) {
            addCriterion("function_name =", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotEqualTo(String value) {
            addCriterion("function_name <>", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThan(String value) {
            addCriterion("function_name >", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameGreaterThanOrEqualTo(String value) {
            addCriterion("function_name >=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThan(String value) {
            addCriterion("function_name <", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLessThanOrEqualTo(String value) {
            addCriterion("function_name <=", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameLike(String value) {
            addCriterion("function_name like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotLike(String value) {
            addCriterion("function_name not like", value, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameIn(List<String> values) {
            addCriterion("function_name in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotIn(List<String> values) {
            addCriterion("function_name not in", values, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameBetween(String value1, String value2) {
            addCriterion("function_name between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andFunctionNameNotBetween(String value1, String value2) {
            addCriterion("function_name not between", value1, value2, "functionName");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNull() {
            addCriterion("function_url is null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIsNotNull() {
            addCriterion("function_url is not null");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlEqualTo(String value) {
            addCriterion("function_url =", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotEqualTo(String value) {
            addCriterion("function_url <>", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThan(String value) {
            addCriterion("function_url >", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlGreaterThanOrEqualTo(String value) {
            addCriterion("function_url >=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThan(String value) {
            addCriterion("function_url <", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLessThanOrEqualTo(String value) {
            addCriterion("function_url <=", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlLike(String value) {
            addCriterion("function_url like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotLike(String value) {
            addCriterion("function_url not like", value, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlIn(List<String> values) {
            addCriterion("function_url in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotIn(List<String> values) {
            addCriterion("function_url not in", values, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlBetween(String value1, String value2) {
            addCriterion("function_url between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andFunctionUrlNotBetween(String value1, String value2) {
            addCriterion("function_url not between", value1, value2, "functionUrl");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuIsNull() {
            addCriterion("generate_menu is null");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuIsNotNull() {
            addCriterion("generate_menu is not null");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuEqualTo(String value) {
            addCriterion("generate_menu =", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuNotEqualTo(String value) {
            addCriterion("generate_menu <>", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuGreaterThan(String value) {
            addCriterion("generate_menu >", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuGreaterThanOrEqualTo(String value) {
            addCriterion("generate_menu >=", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuLessThan(String value) {
            addCriterion("generate_menu <", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuLessThanOrEqualTo(String value) {
            addCriterion("generate_menu <=", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuLike(String value) {
            addCriterion("generate_menu like", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuNotLike(String value) {
            addCriterion("generate_menu not like", value, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuIn(List<String> values) {
            addCriterion("generate_menu in", values, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuNotIn(List<String> values) {
            addCriterion("generate_menu not in", values, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuBetween(String value1, String value2) {
            addCriterion("generate_menu between", value1, value2, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andGenerateMenuNotBetween(String value1, String value2) {
            addCriterion("generate_menu not between", value1, value2, "generateMenu");
            return (Criteria) this;
        }

        public Criteria andIIndexIsNull() {
            addCriterion("i_index is null");
            return (Criteria) this;
        }

        public Criteria andIIndexIsNotNull() {
            addCriterion("i_index is not null");
            return (Criteria) this;
        }

        public Criteria andIIndexEqualTo(Integer value) {
            addCriterion("i_index =", value, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexNotEqualTo(Integer value) {
            addCriterion("i_index <>", value, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexGreaterThan(Integer value) {
            addCriterion("i_index >", value, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexGreaterThanOrEqualTo(Integer value) {
            addCriterion("i_index >=", value, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexLessThan(Integer value) {
            addCriterion("i_index <", value, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexLessThanOrEqualTo(Integer value) {
            addCriterion("i_index <=", value, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexIn(List<Integer> values) {
            addCriterion("i_index in", values, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexNotIn(List<Integer> values) {
            addCriterion("i_index not in", values, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexBetween(Integer value1, Integer value2) {
            addCriterion("i_index between", value1, value2, "iIndex");
            return (Criteria) this;
        }

        public Criteria andIIndexNotBetween(Integer value1, Integer value2) {
            addCriterion("i_index not between", value1, value2, "iIndex");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNull() {
            addCriterion("create_by is null");
            return (Criteria) this;
        }

        public Criteria andCreateByIsNotNull() {
            addCriterion("create_by is not null");
            return (Criteria) this;
        }

        public Criteria andCreateByEqualTo(String value) {
            addCriterion("create_by =", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotEqualTo(String value) {
            addCriterion("create_by <>", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThan(String value) {
            addCriterion("create_by >", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByGreaterThanOrEqualTo(String value) {
            addCriterion("create_by >=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThan(String value) {
            addCriterion("create_by <", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLessThanOrEqualTo(String value) {
            addCriterion("create_by <=", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByLike(String value) {
            addCriterion("create_by like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotLike(String value) {
            addCriterion("create_by not like", value, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByIn(List<String> values) {
            addCriterion("create_by in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotIn(List<String> values) {
            addCriterion("create_by not in", values, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByBetween(String value1, String value2) {
            addCriterion("create_by between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreateByNotBetween(String value1, String value2) {
            addCriterion("create_by not between", value1, value2, "createBy");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNull() {
            addCriterion("creation_time is null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIsNotNull() {
            addCriterion("creation_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreationTimeEqualTo(Date value) {
            addCriterion("creation_time =", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotEqualTo(Date value) {
            addCriterion("creation_time <>", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThan(Date value) {
            addCriterion("creation_time >", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("creation_time >=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThan(Date value) {
            addCriterion("creation_time <", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeLessThanOrEqualTo(Date value) {
            addCriterion("creation_time <=", value, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeIn(List<Date> values) {
            addCriterion("creation_time in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotIn(List<Date> values) {
            addCriterion("creation_time not in", values, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeBetween(Date value1, Date value2) {
            addCriterion("creation_time between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andCreationTimeNotBetween(Date value1, Date value2) {
            addCriterion("creation_time not between", value1, value2, "creationTime");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNull() {
            addCriterion("parent_id is null");
            return (Criteria) this;
        }

        public Criteria andParentIdIsNotNull() {
            addCriterion("parent_id is not null");
            return (Criteria) this;
        }

        public Criteria andParentIdEqualTo(Long value) {
            addCriterion("parent_id =", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotEqualTo(Long value) {
            addCriterion("parent_id <>", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThan(Long value) {
            addCriterion("parent_id >", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdGreaterThanOrEqualTo(Long value) {
            addCriterion("parent_id >=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThan(Long value) {
            addCriterion("parent_id <", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdLessThanOrEqualTo(Long value) {
            addCriterion("parent_id <=", value, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdIn(List<Long> values) {
            addCriterion("parent_id in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotIn(List<Long> values) {
            addCriterion("parent_id not in", values, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdBetween(Long value1, Long value2) {
            addCriterion("parent_id between", value1, value2, "parentId");
            return (Criteria) this;
        }

        public Criteria andParentIdNotBetween(Long value1, Long value2) {
            addCriterion("parent_id not between", value1, value2, "parentId");
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