class MyCoolLight extends Light {

    def brightness = 0
    def hue = 0
    def saturation = 0
    def color = 0

    // Set the brightness
    public setBrightness(int level) {
        this.brightness = getBoundedValue(level, 0, 100)
    }

    // Set the color
    public setColor(Map options) {
        this.hue = getBoundedValue(options.hue, 0, 255)
        this.saturation = getBoundedValue(options.saturation, 0, 255)
        this.brightness = getBoundedValue((options.level ? options.level : 100), 0, 100)
        this.color = options.color
        on()
    }

    public String toString() {
        return "MyCoolLight. brightness: $brightness, hue: $hue, saturation: $saturation, color: $color, state: ${getSwitchState()}"
    }

    private int getBoundedValue(int actual, int lower, int upper) {
        def target
        if (actual < lower) {
            target = lower
        } else if (actual > upper) {
            target = upper
        } else {
            target = actual
        }
        return target
    }
}
