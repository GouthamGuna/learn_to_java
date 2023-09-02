# Referencing the type form another package:-
**************************************************

  ### A Fully Qualified Class Name ***FQCN*** :-)

    ex: 
         java.util.ArrayList = new java.util.ArrayList();

  ### A Single-type-import declaration :-)

    ex:
         import java.util.ArrayList;

         ArrayList aList = new ArrayList();

  ### A Type-import-on-demand declaration :-)

    ex:
         import java.util.*;

         ArrayList aList = new ArrayList();

  ### A single-static-import declaration for static variable
    ex: 
        import static java.lang.Math.PI;
        import static java.lang.Math.sqrt;

 ### A static-import on demand declaration for static variable
    ex: import static java.lang.Math.*;