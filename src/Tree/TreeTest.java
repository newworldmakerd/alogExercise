package Tree;

import java.util.*;

public class TreeTest {
    public static void main(String[] args) {

    }

    //非递归二叉树中序遍历
    void pre(Node head){
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || head!=null){
            if(head!=null){
                stack.push(head);
                head = head.left;
            }
            else {
                head = stack.pop();
                System.out.println(head.value);
                head = head.right;
            }
        }
    }
//只用一个堆内存空间的后序遍历
    void pos2(Node h){
        if(h!=null){
            Node c;
            Stack<Node> stack = new Stack<>();
            stack.push(h);
            while (stack!=null){
                c = stack.peek();
                if(c.left!=null&&h!=c.left&&h!=c.right){
                    stack.push(c.left);
                }else if(c.left!=null&&h!=c.right){
                    stack.push(c.right);
                }else{
                    h=c;
                    System.out.println(stack.pop().value);
                }
            }
        }
    }

    //按层遍历二叉树
    void level(Node head){
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(head);
        while (queue!=null){
            final Node poll = queue.poll();
            System.out.println(poll.value);
            if(poll.left!=null){
                queue.add(poll.left);
            }if(poll.right!=null){
                queue.add(poll.right);
            }
        }
    }

    //获取最宽的一层
    int getMaxWithMap(Node head){
        Map<Node,Integer> map = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        int currentLevel = 0;//当前正在比对哪一层
        int currentNode = 1;
        int maxNode = 0;
        int maxLevel = 0;
        map.put(head,1);
        queue.add(head);
        while (!queue.isEmpty())
        {
            final Node poll = queue.poll();
            int currentNodeLevel = map.get(poll);//当前节点在哪一层
            if(poll.left!=null){
                map.put(poll.left,currentLevel+1);
                queue.add(poll.left);
            }
            if(poll.right!=null){
                map.put(poll.right,currentLevel+1);
                queue.add(poll.right);
            }
            if(currentNodeLevel == currentLevel){
                currentNode++;
            }else {
                if(currentNode>maxNode){
                    maxLevel = currentLevel;
                }
                currentLevel++;
                currentNode = 1;
            }
        }
        if(currentNode>maxNode){
            maxLevel = currentLevel;
        }
        return maxLevel;
    }
}
