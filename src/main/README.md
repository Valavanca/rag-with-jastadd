### Reference Attribute Grammars with JastAdd

Reference Attribute Grammars (RAGs) and JastAdd, a Java implementation for [RAGs](http://citeseerx.ist.psu.edu/viewdoc/download?doi=10.1.1.108.8792&rep=rep1&type=pdf) are introduced. Developed a RAG specification for a small expression language, that can evaluate simple
expressions. JastAdd is a tool that generates a Java implementation of a given RAG comprising of context-free grammar and a set of attribute definitions

##### Tasks: 
- Extension of expression language
- Rewrite to optimize
- Code analysis 

##### The contents are as follows in `/jastadd`:

* `expressions.ast` is the grammar
* `expressions.flex` contains the jflex lexer specification
* `expressions.parser` contains the beaver parser specification
* `Printing.jrag` contains the pretty-printer
* `NameResolution.jrag` should contain the name resolution
* `Evaluation.jrag` should contain an evaluation attribute
* `Optimization.jrag` should contain the rewrites and their helper attributes
* `Analysis.jrag` should contain the unused definitions attribute
* `ASTPrinting.jadd` contains helper methods to display the AST

A complete set of source files to run is available on the course [page](https://tu-dresden.de/ing/informatik/smt/st/studium/lehrveranstaltungen?subject=353&lang=en&leaf=1&head=3&embedding_id=47eddfa7c5a54ed5be49042aff35a31b).

##### Usefull links: 
- [JastAdd](http://jastadd.org)  
- [JastAdd source](https://bitbucket.org/jastadd/jastadd2)
- [JastAdd manual](http://jastadd.org/web/documentation/reference-manual.php)