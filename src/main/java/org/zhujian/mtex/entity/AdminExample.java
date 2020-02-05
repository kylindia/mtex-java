package org.zhujian.mtex.entity;

import java.util.ArrayList;
import java.util.List;

public class AdminExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public AdminExample() {
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

        public Criteria andAdminIdIsNull() {
            addCriterion("admin_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminIdIsNotNull() {
            addCriterion("admin_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminIdEqualTo(Integer value) {
            addCriterion("admin_id =", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotEqualTo(Integer value) {
            addCriterion("admin_id <>", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThan(Integer value) {
            addCriterion("admin_id >", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_id >=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThan(Integer value) {
            addCriterion("admin_id <", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_id <=", value, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdIn(List<Integer> values) {
            addCriterion("admin_id in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotIn(List<Integer> values) {
            addCriterion("admin_id not in", values, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_id between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_id not between", value1, value2, "adminId");
            return (Criteria) this;
        }

        public Criteria andAdminNumberIsNull() {
            addCriterion("admin_number is null");
            return (Criteria) this;
        }

        public Criteria andAdminNumberIsNotNull() {
            addCriterion("admin_number is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNumberEqualTo(String value) {
            addCriterion("admin_number =", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotEqualTo(String value) {
            addCriterion("admin_number <>", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberGreaterThan(String value) {
            addCriterion("admin_number >", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberGreaterThanOrEqualTo(String value) {
            addCriterion("admin_number >=", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberLessThan(String value) {
            addCriterion("admin_number <", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberLessThanOrEqualTo(String value) {
            addCriterion("admin_number <=", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberLike(String value) {
            addCriterion("admin_number like", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotLike(String value) {
            addCriterion("admin_number not like", value, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberIn(List<String> values) {
            addCriterion("admin_number in", values, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotIn(List<String> values) {
            addCriterion("admin_number not in", values, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberBetween(String value1, String value2) {
            addCriterion("admin_number between", value1, value2, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNumberNotBetween(String value1, String value2) {
            addCriterion("admin_number not between", value1, value2, "adminNumber");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNull() {
            addCriterion("admin_name is null");
            return (Criteria) this;
        }

        public Criteria andAdminNameIsNotNull() {
            addCriterion("admin_name is not null");
            return (Criteria) this;
        }

        public Criteria andAdminNameEqualTo(String value) {
            addCriterion("admin_name =", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotEqualTo(String value) {
            addCriterion("admin_name <>", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThan(String value) {
            addCriterion("admin_name >", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameGreaterThanOrEqualTo(String value) {
            addCriterion("admin_name >=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThan(String value) {
            addCriterion("admin_name <", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLessThanOrEqualTo(String value) {
            addCriterion("admin_name <=", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameLike(String value) {
            addCriterion("admin_name like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotLike(String value) {
            addCriterion("admin_name not like", value, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameIn(List<String> values) {
            addCriterion("admin_name in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotIn(List<String> values) {
            addCriterion("admin_name not in", values, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameBetween(String value1, String value2) {
            addCriterion("admin_name between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminNameNotBetween(String value1, String value2) {
            addCriterion("admin_name not between", value1, value2, "adminName");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNull() {
            addCriterion("admin_password is null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIsNotNull() {
            addCriterion("admin_password is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordEqualTo(String value) {
            addCriterion("admin_password =", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotEqualTo(String value) {
            addCriterion("admin_password <>", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThan(String value) {
            addCriterion("admin_password >", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordGreaterThanOrEqualTo(String value) {
            addCriterion("admin_password >=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThan(String value) {
            addCriterion("admin_password <", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLessThanOrEqualTo(String value) {
            addCriterion("admin_password <=", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordLike(String value) {
            addCriterion("admin_password like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotLike(String value) {
            addCriterion("admin_password not like", value, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordIn(List<String> values) {
            addCriterion("admin_password in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotIn(List<String> values) {
            addCriterion("admin_password not in", values, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordBetween(String value1, String value2) {
            addCriterion("admin_password between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminPasswordNotBetween(String value1, String value2) {
            addCriterion("admin_password not between", value1, value2, "adminPassword");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNull() {
            addCriterion("admin_sex is null");
            return (Criteria) this;
        }

        public Criteria andAdminSexIsNotNull() {
            addCriterion("admin_sex is not null");
            return (Criteria) this;
        }

        public Criteria andAdminSexEqualTo(Integer value) {
            addCriterion("admin_sex =", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotEqualTo(Integer value) {
            addCriterion("admin_sex <>", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThan(Integer value) {
            addCriterion("admin_sex >", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_sex >=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThan(Integer value) {
            addCriterion("admin_sex <", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexLessThanOrEqualTo(Integer value) {
            addCriterion("admin_sex <=", value, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexIn(List<Integer> values) {
            addCriterion("admin_sex in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotIn(List<Integer> values) {
            addCriterion("admin_sex not in", values, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexBetween(Integer value1, Integer value2) {
            addCriterion("admin_sex between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminSexNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_sex not between", value1, value2, "adminSex");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNull() {
            addCriterion("admin_phone is null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIsNotNull() {
            addCriterion("admin_phone is not null");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneEqualTo(String value) {
            addCriterion("admin_phone =", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotEqualTo(String value) {
            addCriterion("admin_phone <>", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThan(String value) {
            addCriterion("admin_phone >", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("admin_phone >=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThan(String value) {
            addCriterion("admin_phone <", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLessThanOrEqualTo(String value) {
            addCriterion("admin_phone <=", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneLike(String value) {
            addCriterion("admin_phone like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotLike(String value) {
            addCriterion("admin_phone not like", value, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneIn(List<String> values) {
            addCriterion("admin_phone in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotIn(List<String> values) {
            addCriterion("admin_phone not in", values, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneBetween(String value1, String value2) {
            addCriterion("admin_phone between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminPhoneNotBetween(String value1, String value2) {
            addCriterion("admin_phone not between", value1, value2, "adminPhone");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNull() {
            addCriterion("admin_address is null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIsNotNull() {
            addCriterion("admin_address is not null");
            return (Criteria) this;
        }

        public Criteria andAdminAddressEqualTo(String value) {
            addCriterion("admin_address =", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotEqualTo(String value) {
            addCriterion("admin_address <>", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThan(String value) {
            addCriterion("admin_address >", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressGreaterThanOrEqualTo(String value) {
            addCriterion("admin_address >=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThan(String value) {
            addCriterion("admin_address <", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLessThanOrEqualTo(String value) {
            addCriterion("admin_address <=", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressLike(String value) {
            addCriterion("admin_address like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotLike(String value) {
            addCriterion("admin_address not like", value, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressIn(List<String> values) {
            addCriterion("admin_address in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotIn(List<String> values) {
            addCriterion("admin_address not in", values, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressBetween(String value1, String value2) {
            addCriterion("admin_address between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminAddressNotBetween(String value1, String value2) {
            addCriterion("admin_address not between", value1, value2, "adminAddress");
            return (Criteria) this;
        }

        public Criteria andAdminImgIsNull() {
            addCriterion("admin_Img is null");
            return (Criteria) this;
        }

        public Criteria andAdminImgIsNotNull() {
            addCriterion("admin_Img is not null");
            return (Criteria) this;
        }

        public Criteria andAdminImgEqualTo(String value) {
            addCriterion("admin_Img =", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotEqualTo(String value) {
            addCriterion("admin_Img <>", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgGreaterThan(String value) {
            addCriterion("admin_Img >", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgGreaterThanOrEqualTo(String value) {
            addCriterion("admin_Img >=", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgLessThan(String value) {
            addCriterion("admin_Img <", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgLessThanOrEqualTo(String value) {
            addCriterion("admin_Img <=", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgLike(String value) {
            addCriterion("admin_Img like", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotLike(String value) {
            addCriterion("admin_Img not like", value, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgIn(List<String> values) {
            addCriterion("admin_Img in", values, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotIn(List<String> values) {
            addCriterion("admin_Img not in", values, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgBetween(String value1, String value2) {
            addCriterion("admin_Img between", value1, value2, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminImgNotBetween(String value1, String value2) {
            addCriterion("admin_Img not between", value1, value2, "adminImg");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdIsNull() {
            addCriterion("admin_department_id is null");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdIsNotNull() {
            addCriterion("admin_department_id is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdEqualTo(Integer value) {
            addCriterion("admin_department_id =", value, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdNotEqualTo(Integer value) {
            addCriterion("admin_department_id <>", value, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdGreaterThan(Integer value) {
            addCriterion("admin_department_id >", value, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_department_id >=", value, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdLessThan(Integer value) {
            addCriterion("admin_department_id <", value, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdLessThanOrEqualTo(Integer value) {
            addCriterion("admin_department_id <=", value, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdIn(List<Integer> values) {
            addCriterion("admin_department_id in", values, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdNotIn(List<Integer> values) {
            addCriterion("admin_department_id not in", values, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdBetween(Integer value1, Integer value2) {
            addCriterion("admin_department_id between", value1, value2, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDepartmentIdNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_department_id not between", value1, value2, "adminDepartmentId");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionIsNull() {
            addCriterion("admin_description is null");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionIsNotNull() {
            addCriterion("admin_description is not null");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionEqualTo(String value) {
            addCriterion("admin_description =", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionNotEqualTo(String value) {
            addCriterion("admin_description <>", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionGreaterThan(String value) {
            addCriterion("admin_description >", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("admin_description >=", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionLessThan(String value) {
            addCriterion("admin_description <", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionLessThanOrEqualTo(String value) {
            addCriterion("admin_description <=", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionLike(String value) {
            addCriterion("admin_description like", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionNotLike(String value) {
            addCriterion("admin_description not like", value, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionIn(List<String> values) {
            addCriterion("admin_description in", values, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionNotIn(List<String> values) {
            addCriterion("admin_description not in", values, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionBetween(String value1, String value2) {
            addCriterion("admin_description between", value1, value2, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminDescriptionNotBetween(String value1, String value2) {
            addCriterion("admin_description not between", value1, value2, "adminDescription");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNull() {
            addCriterion("admin_state is null");
            return (Criteria) this;
        }

        public Criteria andAdminStateIsNotNull() {
            addCriterion("admin_state is not null");
            return (Criteria) this;
        }

        public Criteria andAdminStateEqualTo(Integer value) {
            addCriterion("admin_state =", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotEqualTo(Integer value) {
            addCriterion("admin_state <>", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThan(Integer value) {
            addCriterion("admin_state >", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateGreaterThanOrEqualTo(Integer value) {
            addCriterion("admin_state >=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThan(Integer value) {
            addCriterion("admin_state <", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateLessThanOrEqualTo(Integer value) {
            addCriterion("admin_state <=", value, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateIn(List<Integer> values) {
            addCriterion("admin_state in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotIn(List<Integer> values) {
            addCriterion("admin_state not in", values, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateBetween(Integer value1, Integer value2) {
            addCriterion("admin_state between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminStateNotBetween(Integer value1, Integer value2) {
            addCriterion("admin_state not between", value1, value2, "adminState");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNull() {
            addCriterion("admin_email is null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIsNotNull() {
            addCriterion("admin_email is not null");
            return (Criteria) this;
        }

        public Criteria andAdminEmailEqualTo(String value) {
            addCriterion("admin_email =", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotEqualTo(String value) {
            addCriterion("admin_email <>", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThan(String value) {
            addCriterion("admin_email >", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailGreaterThanOrEqualTo(String value) {
            addCriterion("admin_email >=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThan(String value) {
            addCriterion("admin_email <", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLessThanOrEqualTo(String value) {
            addCriterion("admin_email <=", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailLike(String value) {
            addCriterion("admin_email like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotLike(String value) {
            addCriterion("admin_email not like", value, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailIn(List<String> values) {
            addCriterion("admin_email in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotIn(List<String> values) {
            addCriterion("admin_email not in", values, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailBetween(String value1, String value2) {
            addCriterion("admin_email between", value1, value2, "adminEmail");
            return (Criteria) this;
        }

        public Criteria andAdminEmailNotBetween(String value1, String value2) {
            addCriterion("admin_email not between", value1, value2, "adminEmail");
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