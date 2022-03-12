package domein;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

	@Override
	public void undo() {
		// TODO Auto-generated method stub
		light.on();
	}

}
