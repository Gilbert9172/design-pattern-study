package design.command.example1;

public class LightOffCommand implements Command {

    // 리시버를 받을 필드 정의
    Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }
}
