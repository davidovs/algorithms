package hw.task2;

import java.util.*;

/**
 * Randomly initialize BTree and print nodes with the level
 */
public class Main {

    private static final int MAX_VALUE = 100;

    public static void main(String[] args) {

        List<Integer> arrayList = new ArrayList();

        for (int i = 0; i < MAX_VALUE; i++) {
            arrayList.add(i);
        }

        Collections.shuffle(arrayList);

        BTreeNode head = new BTreeNode(arrayList.get(MAX_VALUE - 1), 0);
        arrayList.remove(MAX_VALUE - 1);

        // build BTree
        for (int element : arrayList) {

            BTreeNode current = head;
            boolean done = false;

            while (!done) {

                if (element == current.getValue()) {
                    done = true;
                } else if (element < current.getValue()) {
                    if (current.getLeft() == null) {
                        current.setLeft(new BTreeNode(element, current.getLevel() + 1));
                        done = true;
                    } else {
                        current = current.getLeft();
                    }
                } else {
                    if (current.getRight() == null) {
                        current.setRight(new BTreeNode(element, current.getLevel() + 1));
                        done = true;
                    } else {
                        current = current.getRight();
                    }
                }
            }
        }

        // print BTree
        LinkedList<BTreeNode> list = new LinkedList();
        list.push(head);

        while (!list.isEmpty()) {
            BTreeNode node = list.pop();
            System.out.println(node.getLevel() + "\t-\t" + node.getValue());
            if (node.getLeft() != null) {
                list.add(node.getLeft());
            }
            if (node.getRight() != null) {
                list.add(node.getRight());
            }
        }

    }
}
