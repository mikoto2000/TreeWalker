package jp.dip.oyasirazu.treewalker;

/**
 * TreeNodeVisitor
 */
public interface TreeNodeVisitor<T> {
    public TreeNodeVisitResult visitNode(T currentNode);
}

