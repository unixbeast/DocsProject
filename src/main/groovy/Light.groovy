class Light {
    def switchState = "OFF"

    public on() {
        this.switchState = "ON"
    }

    public off() {
        this.switchState = "OFF"
    }

    public String toString() {
        return "Light is $switchState"
    }
}
