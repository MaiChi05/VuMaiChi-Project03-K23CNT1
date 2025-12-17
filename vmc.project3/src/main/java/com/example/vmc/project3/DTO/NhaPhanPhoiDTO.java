package com.example.vmc.project3.DTO;

public class NhaPhanPhoiDTO {
    private String maNhaPhanPhoi;
    private String tenNhaPhanPhoi;
    private String email;
    private String soDienThoai;
    private String diaChi;

    // getters & setters
    public String getMaNhaPhanPhoi() { return maNhaPhanPhoi; }
    public void setMaNhaPhanPhoi(String maNhaPhanPhoi) { this.maNhaPhanPhoi = maNhaPhanPhoi; }

    public String getTenNhaPhanPhoi() { return tenNhaPhanPhoi; }
    public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) { this.tenNhaPhanPhoi = tenNhaPhanPhoi; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getSoDienThoai() { return soDienThoai; }
    public void setSoDienThoai(String soDienThoai) { this.soDienThoai = soDienThoai; }

    public String getDiaChi() { return diaChi; }
    public void setDiaChi(String diaChi) { this.diaChi = diaChi; }
}
