//Bài 786: Viết hàm nhập danh sách liên kết ở dạng trừu tượng

package bai_786;

import java.util.Scanner;

public class Bai_786 {
    static void input(List l) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("\nNhap so luong node: ");
        int n = scanner.nextInt();
        init(l);
        for (int i = 1; i <= n; i++) {
            KieuDuLieu x = new KieuDuLieu();
            nhap(x);
            Node p = getnode(x);
            addHead(l, p);
        }
    }
}
