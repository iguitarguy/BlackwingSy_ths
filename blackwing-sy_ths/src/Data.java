import javafx.scene.input.KeyCode;
public class Data {

	public Button Qbtn;
	public ButtonControls Qctrl;
	public Button Wbtn;
	public ButtonControls Wctrl;
	public Button Ebtn;
	public ButtonControls Ectrl;
	public Button Abtn;
	public ButtonControls Actrl;
	public Button Sbtn;
	public ButtonControls Sctrl;
	public Button Dbtn;
	public ButtonControls Dctrl;
	public Button Zbtn;
	public ButtonControls Zctrl;
	public Button Xbtn;
	public ButtonControls Xctrl;
	public Button Cbtn;
	public ButtonControls Cctrl;

	public Data() {
		Qbtn = new Button("Q");
		Qctrl = new ButtonControls(KeyCode.Q, Qbtn);
		Wbtn = new Button("W");
		Wctrl = new ButtonControls(KeyCode.W, Wbtn);
		Ebtn = new Button("E");
		Ectrl = new ButtonControls(KeyCode.E, Ebtn);
		Abtn = new Button("A");
		Actrl = new ButtonControls(KeyCode.A, Abtn);
		Sbtn = new Button("S");
		Sctrl = new ButtonControls(KeyCode.S, Sbtn);
		Dbtn = new Button("D");
		Dctrl = new ButtonControls(KeyCode.D, Dbtn);
		Zbtn = new Button("Z");
		Zctrl = new ButtonControls(KeyCode.Z, Zbtn);
		Xbtn = new Button("X");
		Xctrl = new ButtonControls(KeyCode.X, Xbtn);
		Cbtn = new Button("C");
		Cctrl = new ButtonControls(KeyCode.C, Cbtn);
	}

}
