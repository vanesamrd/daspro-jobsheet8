import java.util.Scanner;
/**
 * RataNilai23
 */
public class RataNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i, j;
        float nilaiMahasiswa, totalNilai, rataNilai;

        i = 1;
        while(i <= 5) {
            System.out.println("Input Nilai Mahasiswa ke-" + i);
            totalNilai = 0;
            for (j = 1; j <= 5; j++) {
                System.out.print("Nilai ke-" + j + " : ");
                nilaiMahasiswa = sc.nextInt();
                totalNilai += nilaiMahasiswa;
            }
            rataNilai = totalNilai / 5;
            System.out.println("Rata Rata Nilai Mahasiswa ke-" + i + " : " + rataNilai);
            i++;
    }
}
}