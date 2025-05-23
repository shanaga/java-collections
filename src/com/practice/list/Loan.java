package com.practice.list;

import java.util.List;

public class Loan {

    private List<String> tags;

    public Loan(List<String> tags) {
        this.tags = tags;
    }

    public List<String> getTags() {
        return tags;
    }
}
