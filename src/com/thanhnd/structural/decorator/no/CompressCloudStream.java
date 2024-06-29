package com.thanhnd.structural.decorator.no;

public class CompressCloudStream extends CloudStream {

    @Override
    public void write(String data) {
        var encrypted = compress(data);
        super.write(encrypted);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
