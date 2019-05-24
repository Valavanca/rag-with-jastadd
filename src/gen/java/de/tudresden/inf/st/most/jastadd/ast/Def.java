/* This file was generated with JastAdd2 (http://jastadd.org) version 2.2.2 */
package de.tudresden.inf.st.most.jastadd.ast;
/**
 * @ast node
 * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/expressions.ast:2
 * @production Def : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span> <span class="component">&lt;Value:float&gt;</span>;

 */
public class Def extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @declaredat ASTNode:1
   */
  public Def() {
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
  /**
   * @declaredat ASTNode:12
   */
  public Def(String p0, float p1) {
    setName(p0);
    setValue(p1);
  }
  /**
   * @declaredat ASTNode:16
   */
  public Def(beaver.Symbol p0, float p1) {
    setName(p0);
    setValue(p1);
  }
  /** @apilevel low-level 
   * @declaredat ASTNode:21
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @declaredat ASTNode:27
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:31
   */
  public void flushAttrCache() {
    super.flushAttrCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:35
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /** @apilevel internal 
   * @declaredat ASTNode:39
   */
  public Def clone() throws CloneNotSupportedException {
    Def node = (Def) super.clone();
    return node;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:44
   */
  public Def copy() {
    try {
      Def node = (Def) clone();
      node.parent = null;
      if (children != null) {
        node.children = (ASTNode[]) children.clone();
      }
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " + getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @deprecated Please use treeCopy or treeCopyNoTransform instead
   * @declaredat ASTNode:63
   */
  @Deprecated
  public Def fullCopy() {
    return treeCopyNoTransform();
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:73
   */
  public Def treeCopyNoTransform() {
    Def tree = (Def) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if (child != null) {
          child = child.treeCopyNoTransform();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The subtree of this node is traversed to trigger rewrites before copy.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   * @declaredat ASTNode:93
   */
  public Def treeCopy() {
    Def tree = (Def) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) getChild(i);
        if (child != null) {
          child = child.treeCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /** @apilevel internal 
   * @declaredat ASTNode:107
   */
  protected boolean is$Equal(ASTNode node) {
    return super.is$Equal(node) && (tokenString_Name == ((Def) node).tokenString_Name) && (tokenfloat_Value == ((Def) node).tokenfloat_Value);    
  }
  /**
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   */
  public void setName(String value) {
    tokenString_Name = value;
  }
  /** @apilevel internal 
   */
  protected String tokenString_Name;
  /**
   */
  public int Namestart;
  /**
   */
  public int Nameend;
  /**
   * JastAdd-internal setter for lexeme Name using the Beaver parser.
   * @param symbol Symbol containing the new value for the lexeme Name
   * @apilevel internal
   */
  public void setName(beaver.Symbol symbol) {
    if (symbol.value != null && !(symbol.value instanceof String))
    throw new UnsupportedOperationException("setName is only valid for String lexemes");
    tokenString_Name = (String)symbol.value;
    Namestart = symbol.getStart();
    Nameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Name")
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * Replaces the lexeme Value.
   * @param value The new value for the lexeme Value.
   * @apilevel high-level
   */
  public void setValue(float value) {
    tokenfloat_Value = value;
  }
  /** @apilevel internal 
   */
  protected float tokenfloat_Value;
  /**
   * Retrieves the value for the lexeme Value.
   * @return The value for the lexeme Value.
   * @apilevel high-level
   */
  @ASTNodeAnnotation.Token(name="Value")
  public float getValue() {
    return tokenfloat_Value;
  }
  /**
   * @attribute syn
   * @aspect NameResolution
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/NameResolution.jrag:16
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="NameResolution", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/NameResolution.jrag:16")
  public Def isEquals(String name) {
    {
            if (getName().equals(name)) return this;
            return null;
      }
  }
  /**
   * @attribute syn
   * @aspect Printing
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Printing.jrag:3
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.SYN)
  @ASTNodeAnnotation.Source(aspect="Printing", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Printing.jrag:3")
  public String print() {
    String print_value = getName() + " = " + Float.toString(getValue());
    return print_value;
  }
  /**
   * @attribute inh
   * @aspect Analysis
   * @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Analysis.jrag:18
   */
  @ASTNodeAnnotation.Attribute(kind=ASTNodeAnnotation.Kind.INH)
  @ASTNodeAnnotation.Source(aspect="Analysis", declaredAt="/home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Analysis.jrag:18")
  public boolean isUsed() {
    boolean isUsed_value = getParent().Define_isUsed(this, null);
    return isUsed_value;
  }
  /** @apilevel internal */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /** @apilevel internal */
  public boolean canRewrite() {
    return false;
  }
  protected void collect_contributors_Root_unusedDefs(Root _root, java.util.Map<ASTNode, java.util.Set<ASTNode>> _map) {
    // @declaredat /home/valavanca/Documents/hal/jastadd-exercise/jastadd_task/src/main/jastadd/Analysis.jrag:5
    if (!isUsed()) {
      {
        java.util.Set<ASTNode> contributors = _map.get(_root);
        if (contributors == null) {
          contributors = new java.util.LinkedHashSet<ASTNode>();
          _map.put((ASTNode) _root, contributors);
        }
        contributors.add(this);
      }
    }
    super.collect_contributors_Root_unusedDefs(_root, _map);
  }
  protected void contributeTo_Root_unusedDefs(java.util.Set<Def> collection) {
    super.contributeTo_Root_unusedDefs(collection);
    if (!isUsed()) {
      collection.add(this);
    }
  }
}
