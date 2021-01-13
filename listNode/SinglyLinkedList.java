package listNode;

import java.util.ArrayList;

/**
 * 链表是一种数据结构，链表的指针指向下一个节点。
 * ListNode是java自定义实现的链表结构
 */
public class SinglyLinkedList {
    public static void main(String[] args) {

    }
}

/**
 * 创建链表
 */
class ListNode{
    int val;//数据
    ListNode next;

    ListNode(int val){
        this.val = val;
    }

}

/**
 * 创建链表的范式写法
 * @param <String>
 */
class ListNode2<String>{
    ArrayList<String> val;
    ListNode2 next;
    ListNode2(ArrayList<String> val){this.val = val;}

}


/**
 * 对单链表的操作：create/ insert/ replace/ delete
 */
class Operations{
    public static void main(String[] args) {
        ListNode staNode = new ListNode(0);//创建首节点
        ListNode nextNode;//创建指针
        nextNode = staNode;//把指针移动到首节点


        /**
         * create linkedList
         */
        for(int i = 1; i < 10; i++){
            ListNode node = new ListNode(i);
            nextNode.next = node;//为什么不能用nodeSta连接？
            nextNode = nextNode.next;
        }
        nextNode = staNode;//把指针移动回首节点
        print(nextNode);

        /**
         * insert node
         * 在val==4之后插入节点
         */
        while(nextNode != null){
            if(nextNode.val == 4){
                ListNode newNode = new ListNode(12); //创建新的节点
                ListNode node = nextNode.next; //保存下一个节点
                nextNode.next = newNode; //连接左边节点
                newNode.next = node; //连接右边节点
            }
            nextNode = nextNode.next; //判断不是目标节点，下一个
        }
        nextNode = staNode;
        print(nextNode);

        /**
         * replace node
         * 替换val==7后面这个节点
         */
        while(nextNode != null){
            if(nextNode.val == 7){
                ListNode newNode = new ListNode(13);
                ListNode node = nextNode.next.next;//储存右边节点
                nextNode.next = newNode; //连接左边节点
                newNode.next = node; //连接右边节点
            }
            nextNode = nextNode.next;
        }
        nextNode = staNode;
        print(nextNode);

        /**
         * delete node
         * 删除val==5后面这个节点
         */
        while(nextNode != null){
            if(nextNode.val == 5){
                ListNode node = nextNode.next.next; //储存右边节点
                nextNode.next = node; //连接左右节点
            }
            nextNode = nextNode.next;
        }
        nextNode = staNode;
        print(nextNode);
    }


    /**
     * 打印输出方法
     * 从某节点开始打印出它及之后的所有节点
     * @param node
     */
    static void print(ListNode node){
        // 创建链表节点
        while(node != null){
            System.out.println("节点："+node.val);
            node = node.next;
        }
        System.out.println();
    }

}

// credit by: https://www.cnblogs.com/easyidea/p/13371863.html
