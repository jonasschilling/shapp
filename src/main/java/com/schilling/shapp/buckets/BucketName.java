package com.schilling.shapp.buckets;

public enum BucketName {

    PROFILE_IMAGE("schilling-image-upload-123");

    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
