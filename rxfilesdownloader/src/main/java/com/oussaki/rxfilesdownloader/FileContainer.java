package com.oussaki.rxfilesdownloader;

import java.io.File;

/**
 * Created by oussama on 9/30/2017.
 */

public class FileContainer {
    File file;
    byte[] bytes;
    int progress;

    String filename;
    String url;
    boolean succeed = false;
    boolean canceled = false;

    FileContainer(String url, String filename) {
        this.url = url;
        this.filename = filename;
    }

    FileContainer() {

    }

    public boolean isCanceled() {
        return canceled;
    }

    public void setCanceled(boolean canceled) {
        this.canceled = canceled;
    }

    public boolean isSucceed() {
        return succeed;
    }

    public void setSucceed(boolean successed) {
        this.succeed = successed;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public int getProgress() {
        return progress;
    }

    public void setProgress(int progress) {
        this.progress = progress;
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public byte[] getBytes() {
        return bytes;
    }

    public void setBytes(byte[] bytes) {
        succeed = true;
        this.bytes = bytes;
    }

    @Override
    public boolean equals(Object obj) {
        FileContainer f = (FileContainer) obj;
        return (f.getFile().equals(getFile()) && f.getUrl().equals(getUrl()) && f.getBytes().equals(getBytes()));
    }

}
