//Bài 784: Viết hàm duyệt danh sách liên kết đơn ở dạng trừu tượng

package bai_784;

public class Bai_784 {
    static void processList(List l) {
        Node p = l.pHead;
        while (p != null) {
            processNode(p);
            p = p.pNext;
        }
    }

    // Cách viết khác
    static void processList(List l) {
        for (Node p = l.pHead; p != null; p = p.pNext) {
            processNode(p);
        }
    }
}
