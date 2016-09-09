class MyCoolLight extends Light {

    Light light

    // Turn the light on
    def on() {
        light.on()
    }

    // Turn the light off
    def off() {
        light.off()
    }

    /* Set the brightness level of the light
     * param: level - integer value between 0-100 to set the level to
     */
    def setBrightness(int level) {
        light.setLevel(level)
    }

}
