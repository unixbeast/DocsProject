class Light {
    private String switchState

    public Light() {
        this.switchState = "OFF"
    }

    public on() {
        this.switchState = "ON"
    }

    public off() {
        this.switchState = "OFF"
    }

    public getSwitchState() {
        return switchState
    }

    public String toString() {
        return "Light is $switchState"
    }
}
