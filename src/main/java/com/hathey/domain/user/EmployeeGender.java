package com.hathey.domain.user;

public class EmployeeGender {


    private String employeeNumber, genderId;

    private EmployeeGender() {}

    public EmployeeGender(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.genderId = builder.genderId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getGenderId() {
        return genderId;
    }

    public void setGenderId(String genderId) {
        this.genderId = genderId;
    }

    public EmployeeGender(String employeeNumber, String genderId){
        this.employeeNumber = employeeNumber;
        this.genderId = genderId;
    }


    @Override
    public String toString() {
        return "EmployeeGender{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", genderId='" + genderId + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber, genderId;

        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;

            return this;
        }

        public Builder genderId() {
            this.genderId = genderId;
            return this;
        }

        public Builder copy(EmployeeGender employeeGender){
            this.employeeNumber = employeeNumber;
            this.genderId = genderId;

            return this;
        }

    }
}
