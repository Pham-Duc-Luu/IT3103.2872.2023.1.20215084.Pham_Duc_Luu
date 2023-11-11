import java.util.ArrayList;
import java.util.Stack;

public class NhanVien {
    private String tenNhanVien;
    private double heSoLuong;
    public static final double LUONG_CO_BAN = 750000.0;
    public static final double LUONG_MAX = 20000000.0;

    public NhanVien(String tenNhanVien, double heSoLuong) {
        this.tenNhanVien = tenNhanVien;
        this.heSoLuong = heSoLuong;
    }

    public boolean tangLuong(double heSoTang) {
        if (heSoTang > 0 && (heSoLuong + heSoTang) * LUONG_CO_BAN <= LUONG_MAX) {
            heSoLuong += heSoTang;
            return true;
        }
        return false;
    }

    public double tinhLuong() {
        return heSoLuong * LUONG_CO_BAN;
    }

    public void inTTin() {
        System.out.println("Tên nhân viên: " + tenNhanVien);
        System.out.println("Hệ số lương: " + heSoLuong);
        System.out.println("Lương cơ bản: " + LUONG_CO_BAN);
        System.out.println("Lương: " + tinhLuong());
    }
}

public class PhongBan {
    private String tenPhongBan;
    private byte soNhanVien;
    private static final byte SO_NV_MAX = 100;
    private ArrayList<NhanVien> nhanViens = new ArrayList<>();

    public PhongBan(String tenPhongBan) {
        this.tenPhongBan = tenPhongBan;
        this.soNhanVien = 0;
    }

    public boolean themNV(NhanVien nhanVien) {
        if (soNhanVien < SO_NV_MAX) {
            nhanViens.add(nhanVien);
            soNhanVien++;
            return true;
        }
        return false;
    }

    public NhanVien xoaNV() {
        if (soNhanVien > 0) {
            NhanVien removedNhanVien = nhanViens.remove(soNhanVien - 1);
            soNhanVien--;
            return removedNhanVien;
        }
        return null;
    }

    public double tongLuong() {
        double totalSalary = 0.0;
        for (NhanVien nhanVien : nhanViens) {
            totalSalary += nhanVien.tinhLuong();
        }
        return totalSalary;
    }

    public void inTTin() {
        System.out.println("Tên phòng ban: " + tenPhongBan);
        System.out.println("Số nhân viên: " + soNhanVien);
        System.out.println("Danh sách nhân viên trong phòng:");
        for (NhanVien nhanVien : nhanViens) {
            nhanVien.inTTin();
        }
        System.out.println("Tổng lương của phòng: " + tongLuong());
    }
}
