package solutions;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class SerializeBinaryTree {

    public class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) {val = x;}
    }

    public static String serialize(TreeNode root){
        StringBuilder sb = new StringBuilder();
        serialize(root, sb);
        return sb.toString();
    }

    private static void serialize(TreeNode node, StringBuilder sb){
        if (node == null) {
            sb.append("null ");
        } else {
            sb.append(node.val + " ");
            serialize(node.left, sb);
            serialize(node.right, sb);
        }
    }

    public TreeNode deserialize(String data){
      return  deserializeRecursively(new StringTokenizer(data));
    }

    public TreeNode deserializeRecursively(StringTokenizer str){

        if(!str.hasMoreTokens()){
            return null;
        }

        String val = str.nextToken();
        if(val.equals("null"))
            return null;

        TreeNode root = new TreeNode((Integer.parseInt(val)));
        root.left = deserializeRecursively(str);
        root.right = deserializeRecursively(str);
        return root;

    }
}
