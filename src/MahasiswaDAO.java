import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class MahasiswaDAO {
    public void insertMahasiswa(String nim, String nama, int nilaiTugas, int nilaiKuis, int nilaiUTS, int nilaiUAS, String grade, String keterangan) {
    try (Connection conn = DatabaseConnection.getConnection()) {

        String query = "INSERT INTO mahasiswa (nim, nama, nilai_tugas, nilai_kuis, nilai_uts, nilai_uas, grade, keterangan) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement pstmt = conn.prepareStatement(query);
        pstmt.setString(1, nim);
        pstmt.setString(2, nama);
        pstmt.setInt(3, nilaiTugas);
        pstmt.setInt(4, nilaiKuis);
        pstmt.setInt(5, nilaiUTS);
        pstmt.setInt(6, nilaiUAS);
        pstmt.setString(7, grade);
        pstmt.setString(8, keterangan);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

}
