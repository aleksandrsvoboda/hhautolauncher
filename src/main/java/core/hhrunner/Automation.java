package core.hhrunner;

public class Automation {
    public String name;
    public String user;
    public String password;
    public String character;
    public int scenarioId;
    public boolean isStartTime = false;

    public long startTime = 0;
    public boolean disabled = false;
    public boolean isRepeted = false;
    public int duration = -1;
    public int interval = -1;
}
