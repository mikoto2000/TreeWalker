package jp.dip.oyasirazu.treewalker;

import java.util.List;
import java.util.function.Function;

/**
 * TreeWalker
 */
public class TreeWalker<T> {
    Function<T, List<T>> getChildrenProcess;
    TreeNodeVisitor<T> nodeVisitor;

    /**
     * Constructor
     */
    public TreeWalker(Function<T, List<T>> getChildrenProcess, TreeNodeVisitor<T> nodeVsitor) {
        this.getChildrenProcess = getChildrenProcess;
        this.nodeVisitor = nodeVisitor;
    }
}

