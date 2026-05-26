package com.swayam.bphl.dto;

import com.fasterxml.jackson.annotation.JsonAlias;
import java.util.List;

public class BfhlRequest {
    @JsonAlias({"data", "Data", "DATA"})
    private List<String> data;

    public BfhlRequest() {
    }

    public BfhlRequest(List<String> data) {
        this.data = data;
    }

    public List<String> getData() {
        return data;
    }

    public void setData(List<String> data) {
        this.data = data;
    }

    public static BfhlRequestBuilder builder() {
        return new BfhlRequestBuilder();
    }

    public static class BfhlRequestBuilder {
        private List<String> data;

        BfhlRequestBuilder() {
        }

        public BfhlRequestBuilder data(List<String> data) {
            this.data = data;
            return this;
        }

        public BfhlRequest build() {
            return new BfhlRequest(this.data);
        }
    }
}
