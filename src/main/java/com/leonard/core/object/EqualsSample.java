package com.leonard.core.object;

/**
 * Object equals 方法学习
 * Created by Leonard on 2016/7/19.
 */

class Sample {

    private String id;

    private String data;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Sample(String id, String data) {
        this.id = id;
        this.data = data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // 地址相同
        if (o == null || getClass() != o.getClass()) return false;

        Sample sample = (Sample) o;

        if (id != null ? !id.equals(sample.id) : sample.id != null) return false;
        return data != null ? data.equals(sample.data) : sample.data == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (data != null ? data.hashCode() : 0);
        return result;
    }
}

public class EqualsSample {

    public static void main(String[] args) {
        Sample sample1 = new Sample("1", "jack");
        Sample sample2 = new Sample("1", "jack1");

        System.out.println(sample1 == sample2);
    }

}
