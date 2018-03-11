package jp.dip.oyasirazu.treewalker;

import static org.junit.Assert.*;

import org.junit.Test;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;

/**
 * TestTreeWalker
 */
public class TestTreeWalker {
    @Test
    public void testConstructor() {
        TreeNodeVisitor<String> visitor = new TreeNodeVisitor<>() {
            public TreeNodeVisitResult visitNode(String s) {
                System.out.println(s);
                return TreeNodeVisitResult.TERMINATE;
            }
        };

        Function<String, List<String>> getChildrenProcess = new Function<>() {
            public List<String> apply(String s) {
                return Collections.emptyList();
            }
        };

        TreeWalker tw = new TreeWalker<String>(getChildrenProcess, visitor);
    }
}

