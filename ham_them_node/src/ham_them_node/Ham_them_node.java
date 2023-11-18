//Viết hàm thêm 1 node vào đầu danh sách liên kết đơn

package ham_them_node;

public class Ham_them_node {
    static void addHead(List l, Node newElement) {
        if (l.pHead == null) {
            l.pHead = newElement;
            l.pTail = l.pHead;
        } else {
            newElement.pNext = l.pHead;
            l.pHead = newElement;
        }
    }
}
