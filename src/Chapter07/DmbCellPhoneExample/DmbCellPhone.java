package Chapter07.DmbCellPhoneExample;

public class DmbCellPhone extends CellPhone {
        int channel;

        DmbCellPhone(String model, String color, int channel){
            this.model = model;
            this.color = color;
        }

        void turnOnDmb(){
            System.out.println("채널" + channel + "번 DMB 방송 수신을 시작 합니다.");
        }
        void changeChannelDmb(int channel){
            this.channel = channel;
            System.out.println(("채널 " + channel + "번으로 바꿉니다."));
        }
        void turnOffDmb(){
            System.out.println("DMB 방속을 수신을 멈춥니다.");
        }
}
