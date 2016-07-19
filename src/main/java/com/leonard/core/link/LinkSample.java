package com.leonard.core.link;

/**
 *  链表数据结构
 * Created by Leonard on 2016/7/19.
 */

class Node {       // 定义一个结点

    private String data;     // 要保存的数据

    private Node next;   // 要保存的下一个结点

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String data) {
        this.data = data;
    }
}

public class LinkSample {

    public static void main(String[] args) {
        Node root = new Node("头结点");
        Node n1 = new Node("结点2");
        Node n2 = new Node("结点2");
        root.setNext(n1);
        n1.setNext(n2);

        Node currentNode = root;

        /**
         *  while 循环读取
         */

        /*while (currentNode != null) {
            System.out.println(currentNode.getData());
            currentNode = currentNode.getNext();
        }*/

        print(root);


    }

    /**
     *  递归遍历
     * @param current
     */
    public static void print(Node current) {
        if(current == null) {    // 递归结束条件
            return;  // 结束方法
        }
        System.out.println(current.getData());
        print(current.getNext());
    }

}
