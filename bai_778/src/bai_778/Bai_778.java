//Bài 778: Hãy khai báo cấu trúc dữ liệu cho danh sách liên kết đơn tổng quát

package bai_778;

public class Bai_778 {
    static class Node {
        KieuDuLieu info;
        Node pNext;

        public Node(KieuDuLieu info) {
            this.info = info;
            this.pNext = null;
        }
    }

    static class List {
        Node pHead;
        Node pTail;

        public List() {
            this.pHead = null;
            this.pTail = null;
        }
    }    
}
