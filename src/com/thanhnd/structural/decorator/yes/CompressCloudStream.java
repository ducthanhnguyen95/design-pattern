package com.thanhnd.structural.decorator.yes;

public class CompressCloudStream implements Stream {

    private Stream stream;

    public CompressCloudStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        var encrypted = compress(data);
        stream.write(encrypted);
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }
}
