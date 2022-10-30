class SpaceAge {

    private double ageInSeconds;
    private final double  EARTH_DAYS = 365.25;
    SpaceAge(double seconds) {
        this.ageInSeconds = seconds;
    }

    /**
     * The method change the Earth days on seconds
     *
     * @return double
     * @since 15.10.22
     */

    double getSeconds() {
        return EARTH_DAYS * 24 * 60 * 60;
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Earth: orbital period 1.0 Earth years, 365.25 Earth days,
     * or 31557600 seconds
     *
     * @return double
     * @since 15.10.22
     */
    double onEarth() {
        double earthOrbitalPeriod = 1.0;

        // change seconds on years
        return this.ageInSeconds / (earthOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Mercury: orbital period 0.2408467 Earth years
     *
     * @return double
     * @since 15.10.22
     */
    double onMercury() {
        double mercuryOrbitalPeriod = 0.2408467;

        return this.ageInSeconds / (mercuryOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Venus: orbital period 0.61519726 Earth years
     *
     * @return double
     * @since 16.10.22
     */
    double onVenus() {
        double venusOrbitalPeriod = 0.61519726;

        return this.ageInSeconds / (venusOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Mars: orbital period 1.8808158 Earth years
     *
     * @return double
     * @since 16.10.22
     */
    double onMars() {
        double marsOrbitalPeriod = 1.8808158;

        return this.ageInSeconds / (marsOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Jupiter: orbital period 11.862615 Earth years
     *
     * @return double
     * @since 16.10.22
     */
    double onJupiter() {
        double jupiterOrbitalPeriod = 11.862615;

        return this.ageInSeconds / (jupiterOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Saturn: orbital period 29.447498 Earth years
     *
     * @return double
     * @since 16.10.22
     */
    double onSaturn() {
        double saturnOrbitalPeriod = 29.447498;

        return this.ageInSeconds / (saturnOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Uranus: orbital period 84.016846 Earth years
     *
     * @return double
     * @since 16.10.22
     */
    double onUranus() {
        double uranusOrbitalPeriod = 84.016846;

        return this.ageInSeconds / (uranusOrbitalPeriod * this.getSeconds());
    }

    /**
     * Given an age in seconds and return age in Earth years.
     * For Neptune: orbital period 164.79132 Earth years
     *
     * @return double
     * @since 16.10.22
     */
    double onNeptune() {
        double neptuneOrbitalPeriod = 164.79132;

        return this.ageInSeconds / (neptuneOrbitalPeriod * this.getSeconds());
    }
}
