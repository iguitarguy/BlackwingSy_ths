import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

/**
 * Class: BindPopUp
 * @author Mike Deiters
 * @version 1.0
 * March 23, 2016
 * ITEC 3860-01
 *
 * Description: TODO
 *
 * Purpose: TODO
 */

public class BindPopUp extends Stage {

	private final double WIDTH = 300;
	private final double HEIGHT = 400;

	private Label title;
	private Label key;
	private Label fileName;
	private javafx.scene.control.Button selector;
	private Button bindingBtn;
	private BorderPane mainPane;
	private BorderPane selectorPane;
	private Scene priamryScene;

	public BindPopUp() {

		setup();
	}

	public BindPopUp(String key, Button btn ) {

		setup();
		this.key.setText(key);
		this.bindingBtn = btn;
	}

	public void setKey(String key) {

		this.key.setText(key);
	}

	public String getKey() {

        return this.key.getText();
	}

	public void setBindingBtn( Button bindingBtn ) {

		this.bindingBtn = bindingBtn;
	}

	public Button getBindingBtn() {

		return bindingBtn;
	}

	private void selectFile() {

	}

	private void setup() {

		this.title = new Label();
		this.key = new Label();
		this.fileName = new Label();
		this.selector = new javafx.scene.control.Button("Open File");
		this.bindingBtn = new Button();
		this.mainPane = new BorderPane();
		this.selectorPane = new BorderPane();
		this.priamryScene = new Scene(mainPane, WIDTH, HEIGHT);
		super.setScene(priamryScene);
		super.setTitle("Bind Sound Bite");
	}

}
