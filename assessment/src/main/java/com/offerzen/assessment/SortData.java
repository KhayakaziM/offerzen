package com.offerzen.assessment;

import java.util.List;

public class SortData {

    private List<Data> data;
    private int sortedData;

    public int getSortedData() {
        return sortedData;
    }
    public void setSortedData(int sortedData) {
        this.sortedData = sortedData;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data>data) {
        this.data = data;
    }
}
