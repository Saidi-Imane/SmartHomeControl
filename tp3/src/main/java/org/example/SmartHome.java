package org.example;

public class SmartHome {
    private String name;
    private Integer id;
    private Adresse adresse;
    private RemoteControl remoteControl;
    private SmartHome(ConcretSmartHomeBuilder builder) {
        this.name = builder.name;
        this.id = builder.id;
        this.adresse = builder.adresse;
        this.remoteControl = builder.remoteControl;
    }
    public String report() {

            StringBuilder report = new StringBuilder();

            for (Command command : remoteControl.getCommands()) {
                Device device = command.getDevice();
                String deviceType = (device instanceof TV) ? "TV" : "Camera";

                if (command instanceof OnCommand) {
                    report.append(deviceType + " On-");
                } else if (command instanceof OffCommand) {
                    report.append(deviceType + " Off-");
                }else if(remoteControl.getUndoCommand() != null ){

                }
            }


        return report.toString();
        }

    public static class ConcretSmartHomeBuilder {
        private String name;
        private int id;
        private Adresse adresse;
        private RemoteControl remoteControl;


        public ConcretSmartHomeBuilder(String name, int id) {
            this.name = name;
            this.id = id;
        }

        public ConcretSmartHomeBuilder withAdresse(Adresse adresse) {
            this.adresse = adresse;
            return this;
        }

        public ConcretSmartHomeBuilder withRemoteControl(RemoteControl remoteControl) {
            this.remoteControl = remoteControl;
            return this;
        }

        public SmartHome build() {
            return new SmartHome(this);
        }
    }

}
