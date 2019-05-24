/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/expressions.ast:3
 * @production Exp : {@link ASTNode};

 */
public abstract class Exp extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Exp() {
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
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:13
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:19
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:23
   */
  public void flushAttrCache() {
    super.flushAttrCache();
    rewrittenNode_reset();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:28
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:32
   */
  public Exp clone() throws CloneNotSupportedException {
    Exp node = (Exp) super.clone();
    return node;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:43
   */
  @Deprecated
  public abstract Exp fullCopy();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:51
   */
  public abstract Exp treeCopyNoTransform();
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:59
   */
  public abstract Exp treeCopy();
  /**
   * @attribute syn
   * @aspect Evaluation
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Evaluation.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Evaluation", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Evaluation.jrag:3")
  public abstract float eval();
  /**
   * @attribute syn
   * @aspect Optimization
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:4
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Optimization", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:4")
  public boolean isConstantSubtree() {
    boolean isConstantSubtree_value = false;
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
    boolean isUsed_Def_value = false;
    return isUsed_Def_value;
  }
  /**
   * @attribute inh
   * @aspect NameResolution
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/NameResolution.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="NameResolution", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/NameResolution.jrag:3")
  public Def lookup(String name) {
    Def lookup_String_value = getParent().Define_lookup(this, null, name);
    return lookup_String_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    // Declared at /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:10
    if ((this.getClass() != Number.class) && isConstantSubtree()) {
      return rewriteRule0();
    }
    return super.rewriteTo();
  }
  /**
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:10
   * @apilevel internal
   */
  private Number rewriteRule0() {
{
            return new Number(eval());
         }  }
  /** @apilevel internal */
  public boolean canRewrite() {
    // Declared at /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Optimization.jrag:10
    if ((this.getClass() != Number.class) && isConstantSubtree()) {
      return true;
    }
    return false;
  }
  /** @apilevel internal */
  private void rewrittenNode_reset() {
    rewrittenNode_computed = false;
    rewrittenNode_initialized = false;
    rewrittenNode_value = null;
    rewrittenNode_cycle = null;
  }
/** @apilevel internal */
protected ASTNode$State.Cycle rewrittenNode_cycle = null;
  /** @apilevel internal */
  protected boolean rewrittenNode_computed = false;

  /** @apilevel internal */
  protected ASTNode rewrittenNode_value;
  /** @apilevel internal */
  protected boolean rewrittenNode_initialized = false;
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN, isCircular=true, isNTA=true)
  @ASTNodeAnnotation.Source(aspect="", declaredAt=":0")
  public ASTNode rewrittenNode() {
    if (rewrittenNode_computed) {
      return rewrittenNode_value;
    }
    ASTNode$State state = state();
    if (!rewrittenNode_initialized) {
      rewrittenNode_initialized = true;
      rewrittenNode_value = this;
      if (rewrittenNode_value != null) {
        rewrittenNode_value.setParent(getParent());
      }
    }
    if (!state.inCircle() || state.calledByLazyAttribute()) {
      state.enterCircle();
      do {
        rewrittenNode_cycle = state.nextCycle();
        ASTNode new_rewrittenNode_value = rewrittenNode_value.rewriteTo();
        if (new_rewrittenNode_value != rewrittenNode_value || new_rewrittenNode_value.canRewrite()) {
          state.setChangeInCycle();
        }
        rewrittenNode_value = new_rewrittenNode_value;
        if (rewrittenNode_value != null) {
          rewrittenNode_value.setParent(getParent());
        }
      } while (state.testAndClearChangeInCycle());
      rewrittenNode_computed = true;

      state.leaveCircle();
    } else if (rewrittenNode_cycle != state.cycle()) {
      rewrittenNode_cycle = state.cycle();
      ASTNode new_rewrittenNode_value = rewrittenNode_value.rewriteTo();
      if (new_rewrittenNode_value != rewrittenNode_value || new_rewrittenNode_value.canRewrite()) {
        state.setChangeInCycle();
      }
      rewrittenNode_value = new_rewrittenNode_value;
      if (rewrittenNode_value != null) {
        rewrittenNode_value.setParent(getParent());
      }
    } else {
    }
    return rewrittenNode_value;
  }
}
