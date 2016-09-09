class MyCoolLight extends Light {

    int brightness
    int hue
    int saturation
    int color

    public MyCoolLight() {
        super()
        brightness = 0
        hue = 0
        saturation = 0
        color = 0
    }

    // Set the brightness
    public setBrightness(int level) {
        this.brightness = getBoundedValue(level, 0, 100)
    }

    // Set the color
    public setColor(Map options) {
        this.hue = getBoundedValue(options.hue, 0, 255)
        this.saturation = getBoundedValue(options.saturation, 0, 255)
        this.color = options.color
        this.brightness = options.level ? options.level : 100
        on()
    }

    public String toString() {
        return "MyCoolLight. brightness: $brightness, hue: $hue, saturation: $saturation, color: $color, state: ${getSwitchState()}"
    }

    private getBoundedValue(int actual, int lower, int upper) {
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
