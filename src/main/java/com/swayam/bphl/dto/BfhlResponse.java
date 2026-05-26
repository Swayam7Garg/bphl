package com.swayam.bphl.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class BfhlResponse {

    @JsonProperty("is_success")
    private boolean success;

    @JsonProperty("user_id")
    private String userId;

    @JsonProperty("email")
    private String email;

    @JsonProperty("roll_number")
    private String rollNumber;

    @JsonProperty("even_numbers")
    private List<String> evenNumbers;

    @JsonProperty("odd_numbers")
    private List<String> oddNumbers;

    @JsonProperty("alphabets")
    private List<String> alphabets;

    @JsonProperty("special_characters")
    private List<String> specialCharacters;

    @JsonProperty("sepcial_characters")
    private List<String> sepcialCharacters;

    @JsonProperty("sum")
    private String sum;

    @JsonProperty("concat_string")
    private String concatString;

    public BfhlResponse() {
    }

    public BfhlResponse(boolean success, String userId, String email, String rollNumber,
                        List<String> evenNumbers, List<String> oddNumbers, List<String> alphabets,
                        List<String> specialCharacters, List<String> sepcialCharacters, String sum, String concatString) {
        this.success = success;
        this.userId = userId;
        this.email = email;
        this.rollNumber = rollNumber;
        this.evenNumbers = evenNumbers;
        this.oddNumbers = oddNumbers;
        this.alphabets = alphabets;
        this.specialCharacters = specialCharacters;
        this.sepcialCharacters = sepcialCharacters;
        this.sum = sum;
        this.concatString = concatString;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(String rollNumber) {
        this.rollNumber = rollNumber;
    }

    public List<String> getEvenNumbers() {
        return evenNumbers;
    }

    public void setEvenNumbers(List<String> evenNumbers) {
        this.evenNumbers = evenNumbers;
    }

    public List<String> getOddNumbers() {
        return oddNumbers;
    }

    public void setOddNumbers(List<String> oddNumbers) {
        this.oddNumbers = oddNumbers;
    }

    public List<String> getAlphabets() {
        return alphabets;
    }

    public void setAlphabets(List<String> alphabets) {
        this.alphabets = alphabets;
    }

    public List<String> getSpecialCharacters() {
        return specialCharacters;
    }

    public void setSpecialCharacters(List<String> specialCharacters) {
        this.specialCharacters = specialCharacters;
    }

    public List<String> getSepcialCharacters() {
        return sepcialCharacters;
    }

    public void setSepcialCharacters(List<String> sepcialCharacters) {
        this.sepcialCharacters = sepcialCharacters;
    }

    public String getSum() {
        return sum;
    }

    public void setSum(String sum) {
        this.sum = sum;
    }

    public String getConcatString() {
        return concatString;
    }

    public void setConcatString(String concatString) {
        this.concatString = concatString;
    }

    public static BfhlResponseBuilder builder() {
        return new BfhlResponseBuilder();
    }

    public static class BfhlResponseBuilder {
        private boolean success;
        private String userId;
        private String email;
        private String rollNumber;
        private List<String> evenNumbers;
        private List<String> oddNumbers;
        private List<String> alphabets;
        private List<String> specialCharacters;
        private List<String> sepcialCharacters;
        private String sum;
        private String concatString;

        BfhlResponseBuilder() {
        }

        public BfhlResponseBuilder success(boolean success) {
            this.success = success;
            return this;
        }

        public BfhlResponseBuilder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public BfhlResponseBuilder email(String email) {
            this.email = email;
            return this;
        }

        public BfhlResponseBuilder rollNumber(String rollNumber) {
            this.rollNumber = rollNumber;
            return this;
        }

        public BfhlResponseBuilder evenNumbers(List<String> evenNumbers) {
            this.evenNumbers = evenNumbers;
            return this;
        }

        public BfhlResponseBuilder oddNumbers(List<String> oddNumbers) {
            this.oddNumbers = oddNumbers;
            return this;
        }

        public BfhlResponseBuilder alphabets(List<String> alphabets) {
            this.alphabets = alphabets;
            return this;
        }

        public BfhlResponseBuilder specialCharacters(List<String> specialCharacters) {
            this.specialCharacters = specialCharacters;
            return this;
        }

        public BfhlResponseBuilder sepcialCharacters(List<String> sepcialCharacters) {
            this.sepcialCharacters = sepcialCharacters;
            return this;
        }

        public BfhlResponseBuilder sum(String sum) {
            this.sum = sum;
            return this;
        }

        public BfhlResponseBuilder concatString(String concatString) {
            this.concatString = concatString;
            return this;
        }

        public BfhlResponse build() {
            return new BfhlResponse(success, userId, email, rollNumber, evenNumbers, oddNumbers, alphabets, specialCharacters, sepcialCharacters, sum, concatString);
        }
    }
}
