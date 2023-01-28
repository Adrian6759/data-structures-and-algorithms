package datastructures.trees;

import java.util.ArrayList;
import datastructures.trees.Node;

public class BinaryTree<T>
{
  Node <T> root;

  public Object[] preOrderTraversal()
  {
    Object[] outputValues = null;
    // Should return something like "A B C D"
    // Can use an ArrayList internally
    // ArrayList.toArray() returns Object[], hence why Object[] is the return type
    // outputValues = preOrder(root);
    // TODO: implement me
    doPreOrder(root, outputValues);


    return outputValues;
  }
public static void doPreOrder(node, arr){
arr.push(node.value)
  if(node.left) {
    doPreOrder(node.left, arr);
  }
  if (node.right) {
    doPreOrder(node.right, arr);
  }
}
  public Object[] inOrderTraversal()
  {
    Object[] outputValues = null;
    // outputValues = inOrder(root);
    // TODO: implement me
    if (root.left != null)
    inOrder(root.left);

    output = root.value

    if (root.right != null)
    inOrder(root.right)
    return outputValues;
  }

  public Object[] postOrderTraversal()
  {
    Object[] outputValues = null;
    // outputValues = postOrder(root);
    // TODO: implement me
    if (root.left !=null)
    postOrder(root.left)

    if (root.right != NULL)
    postOrder(root.right)

    output = postOrder(root.value)
    return outputValues;
  }
}
