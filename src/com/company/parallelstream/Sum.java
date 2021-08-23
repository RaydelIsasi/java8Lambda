package com.company.parallelstream;

public class Sum {

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    private int total;

    public void performSum(int input) {

        total += input;

    }
}
