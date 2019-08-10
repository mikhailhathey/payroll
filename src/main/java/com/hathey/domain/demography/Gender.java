package com.hathey.domain.demography;

public class Gender {

    private String id, description;

    private Gender(){}

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Gender(Builder builder){
        this.id = builder.id;
        this.description = builder.description;
    }

    public String getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return "Gender{" +
                "id='" + id + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder {
        private String id, description;

        public Builder id(String id){
            this.id = id;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }

        public Gender build(){
            return new Gender(this);
        }

        public Builder copy(Gender gender){
            this.id = id;
            this.description = description;

            return this;
        }
    }
}
