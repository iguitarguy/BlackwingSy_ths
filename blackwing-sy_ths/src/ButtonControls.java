import javafx.event.EventHandler;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;


public class ButtonControls extends MainGUI{

	private KeyCode key;
	private boolean keyPressed;
	private Button btn;

	/** Method: ButtonControls.java()
	 * 
	 * Constructor Method that accepts values for the ButtonControls.java attributes
	 * and sets them
	 * 
	 */
	public ButtonControls()
	{
		
				
	}

	/** Method: ButtonControls.java()
	 * 
	 * Constructor Method that accepts values for the ButtonControls.java attributes
	 * and sets them
	 * 
	 * @param key
	 * @param btn
	 */
	public ButtonControls(KeyCode key, Button btn)
	{
		this.key = key;
		this.btn = btn;
		
	}

	/**Method: setKey()
	 * @param key
	 */
	public void setKey(KeyCode key)
	{
		this.key = key;
	}

	
	/**Method: getKey()
	 * @return key
	 */
	public KeyCode getKey()
	{
        return key;
	}

	/**Method: setButton()
	 * @param btn
	 */
	public void setButton(Button btn)
	{
		this.btn = btn;		
	}

	/**Method: getButton()
	 * @return
	 */
	public Button getButton()
	{
        return btn;
	}
	
	/**Method: isKeyPress()
	 * @return
	 */
	public boolean isKeyPress()
	{
		return keyPressed;
	}

	/**Method: keyEventHandlers()
	 * 
	 */
	 public void keyEventHandler()
		{
			getScene().setOnKeyPressed(new EventHandler<KeyEvent>() {
				@Override
	            public void handle(KeyEvent event)
	    		{
	    			switch (event.getCode()) {
	    			/** btn still needs to be replaced with the 
	    			* correct buttons. btn is being used as 
	    			* a placeholder that "doesn't cause" errors
	    			*/
	    				case Q: btn.playSound(); break;
	    				case W: btn.playSound(); break;
	    				case E: btn.playSound(); break;
	    				case A: btn.playSound(); break;
	    				case S: btn.playSound(); break;
	    				case D: btn.playSound(); break;
	    				case Z: btn.playSound(); break;
	    				case X: btn.playSound(); break;
	    				case C: btn.playSound(); break;
	    				default: break;
	    			}
	            }
	        });
			
		}
}
