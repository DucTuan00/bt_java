//Bài 782: Viết hàm tạo node trong danh sách liên kết đơn với thông tin được biết trước ở dạng trừu tượng

package bai_782;

public class Bai_782 {
    static Node getnode(KieuDuLieu x) {
        Node p = new Node(x);

        if (p == null) {
            return null;
        }
        
        p.info = x;
        p.pNext = null;

        return p;
    } 
}
