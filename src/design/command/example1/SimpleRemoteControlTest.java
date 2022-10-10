package design.command.example1;

public class SimpleRemoteControlTest {

    public static void main(String[] args) {

        // Invoker => 커멘드 객체 보관
        SimpleRemoteControl remote = new SimpleRemoteControl();

        // Receiver => 일련의 작업을 처리할 객체
        Light light = new Light();

        // Command Object => 리시버 정보 && 행동 보관 => 행동이 들어있는 리시버를 캡슐화
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        remote.setCommand(lightOnCommand);
        remote.buttonWasPressed();

        remote.setCommand(lightOffCommand);
        remote.buttonWasPressed();
    }
}
