package com.hathey.domain.user;

public class EmployeeRace {

    private String employeeNumber, raceId;

    private EmployeeRace() {}

    public EmployeeRace(Builder builder){
        this.employeeNumber = builder.employeeNumber;
        this.raceId = builder.raceId;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getRaceId() {
        return raceId;
    }

    public void setRaceId(String raceId) {
        this.raceId = raceId;
    }

    public EmployeeRace(String employeeNumber, String raceId){
        this.employeeNumber = employeeNumber;
        this.raceId = raceId;
    }


    @Override
    public String toString() {
        return "EmployeeRace{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", raceId='" + raceId + '\'' +
                '}';
    }

    public static class Builder{
        private String employeeNumber, raceId;

        public Builder employeeNumber(String employeeNumber) {
            this.employeeNumber = employeeNumber;

            return this;
        }

        public Builder raceId() {
            this.raceId = raceId;
            return this;
        }

        public EmployeeRace build(){
            return new EmployeeRace(this);
        }

        public Builder copy(EmployeeRace employeeRace){
            this.employeeNumber = employeeNumber;
            this.raceId = raceId;

            return this;
        }

    }
}
