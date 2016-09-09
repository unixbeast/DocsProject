# MyCoolLight

My cool light is a wrapper for the `Light` class.
This wrapper outlines the methods discussed below.

---

**MyCoolLight**

Class members:

* Light light

The `MyCoolLight` class can be instantiated with a light like so:

```groovy
def myLight = new MyCoolLight(light: aLight)
```

Let's take a look at the methods that this class provides to us.

---

*on()*

The `on()` method turns the light on.

**Arguments:**
    None.

---

*off()*

The `off()` method turns the light off.

**Arguments:**
    None.

---

*setBrightness(int level)*

The `setBrightness(level)` method will set the brightness level of the light.

**Arguments:**

| Argument name       | Type       | Description                          |
| ------------------- |:----------:| ------------------------------------ |
| level               | int        | Set the level to the specified value |
