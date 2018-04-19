public class class3 {
    static class Node {
        int  value;
        Node leftChild = null;
        Node rightChild = null;

        Node(int value) {
            this.value = value;
        }

        public void display() {
            System.out.print(this.value + "\t");
        }

        @Override
        public String toString() {
            // TODO Auto-generated method stub
            return String.valueOf(value);
        }
    }

    static class Tree {
        private Node root = null;

        public Node find(int key) {
            if (root == null) {
                System.out.println("The tree is empty!");
                return null;
            }
            Node current = root;
            while (current.value != key) {
                if (key > current.value)
                    current = current.rightChild;
                else
                    current = current.leftChild;
                if (current == null)
                    return null;
            }
            return current;
        }

        public boolean insert(Node node) {
            if (root == null) {
                root = node;
                return true;
            }
            //树中不允许插入重复的数据项
            if (this.find(node.value) != null) {
                System.out.println("Node with id '" +
                        node.value + "' has already existed!");
                return false;
            }
            Node current = root;
            while (current != null) {
                if (node.value > current.value) {
                    if (current.rightChild == null) {
                        current.rightChild = node;
                        return true;
                    }
                    current = current.rightChild;
                } else {
                    if (current.leftChild == null) {
                        current.leftChild = node;
                        return true;
                    }
                    current = current.leftChild;
                }
            }
            return false;
        }

        //前序遍历,根左右
        public void preorderIterator(Node node) {
            System.out.println(node.value);
            if(node.leftChild != null){
                preorderIterator(node.leftChild);
            }
            if(node.rightChild != null){
                preorderIterator(node.rightChild);
            }
        }
    }

    public static void main(String[] args){
        Tree tree = new Tree();
        int[] ints = {6,2,8,1,4,3};
        for(int i=0;i<ints.length;i++){
            Node news = new Node(ints[i]);
            tree.insert(news);
        }
        tree.preorderIterator(tree.root);
    }
}
