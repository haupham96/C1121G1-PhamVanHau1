package model;

public class BoPhan {
    private Integer maBoPhan ;
    private String tenBoPhan ;

    public BoPhan() {
    }

    public BoPhan(Integer maBoPhan, String tenBoPhan) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
    }

    public Integer getMaBoPhan() {
        return maBoPhan;
    }

    public void setMaBoPhan(Integer maBoPhan) {
        this.maBoPhan = maBoPhan;
    }

    public String getTenBoPhan() {
        return tenBoPhan;
    }

    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }
}
