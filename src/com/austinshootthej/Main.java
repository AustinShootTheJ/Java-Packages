package com.austinshootthej;


// an import will remove the node error by importing the package or you can do it in the code
// what is important to note is that you can only package per keyword. All other uses of the same keyword
// that reside in a different package must be specified directly.
import javafx.scene.Node;

public class Main {

    public static void main(String[] args) {

        // to do it this way you must specify the package each time.
      //  Node node = null;
       // org.w3c.dom.Node  anotherNode = null;



        AdditionalWindow myWindow = new AdditionalWindow("Complete Java");
        myWindow.setVisible(true);



    }
}
