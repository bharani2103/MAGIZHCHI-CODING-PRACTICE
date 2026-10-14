
package javafxapplication1;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;



public class JavaFXApplication1 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        TextField t=new TextField();
   Button b =new Button("submit");
        Pane p=new Pane(b,t);
      
        Scene s=new Scene(p);
        
        Stage s1=new Stage();
        s1.setWidth(400);
        s1.setHeight(400);
        s1.setScene(s);
        s1.show();
   
    }

  
    public static void main(String[] args) {
        launch(args);
    }
    
}
