
package com.mycompany.arbolbinario;

public class Arbolbinario {

    public static void main(String[] args) {
      
        BusquedaArbol<Integer> arbol = new BusquedaArbol<>();
        
        arbol.add(45);
        arbol.add(15);
        arbol.add(8);
        arbol.add(35);
        arbol.add(1);
        arbol.add(2);
        arbol.add(20);
        arbol.add(arbol.getRoot(), 50);
        arbol.add(arbol.getRoot(), 43);
        arbol.add(arbol.getRoot(), 65);
        arbol.add(arbol.getRoot(), 32);
        arbol.add(arbol.getRoot(), 46);
      
        
      
       
       
        System.out.println("preorder");
       arbol.preorder(arbol.getRoot());
       System.out.println("postorder");
       arbol.postorder(arbol.getRoot());
       System.out.println("inorder");
       arbol.inorder(arbol.getRoot());


    }
}
