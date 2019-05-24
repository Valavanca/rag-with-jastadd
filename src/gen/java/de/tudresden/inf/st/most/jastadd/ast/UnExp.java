/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/expressions.ast:5
 * @production UnExp : {@link Exp} ::= <span class="component">A:{@link Exp}</span>;

 */
public abstract class UnExp extends Exp implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public UnExp() {
    super();
  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @declaredat ASTNode:10
   */
  public void init$Children() {
    children = new ASTNode[1];
  }
  /**
   * @declaredat ASTNode:13
   */
  public UnExp(Exp p0) {
    setChild(p0, 0);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:17
   */
  protected int numChildren() {
    return 1;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:23
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:27
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public UnExp clone() throws CloneNotSupportedException {
    UnExp node = (UnExp) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:46
   */
  @Deprecated
  public abstract UnExp fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:54
   */
  public abstract UnExp treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:62
   */
  public abstract UnExp treeCopy();
  /**
   * Replaces the A child.
   * @param node The new node to replace the A child.
   * @apilevel high-level
   */
  public void setA(Exp node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the A child.
   * @return The current node used as the A child.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Child(name="A")
  public Exp getA() {
    return (Exp) getChild(0);
  }
  /**
   * Retrieves the A child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the A child.
   * @apilevel low-level
   */
  public Exp getANoTransform() {
    return (Exp) getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect Optimization
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Optimization", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:4")
  public boolean isConstantSubtree() {
    boolean isConstantSubtree_value = getA().isConstantSubtree();
    return isConstantSubtree_value;
  }
  /**
   * @attribute syn
   * @aspect Analysis
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Analysis.jrag:10
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Analysis", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Analysis.jrag:10")
  public boolean isUsed(Def d) {
    boolean isUsed_Def_value = getA().isUsed(d);
    return isUsed_Def_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
}
