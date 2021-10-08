package uk.tw.energy.domain;

import java.math.BigDecimal;
import java.time.Instant;

public class ElectricityReading {

    private Instant time;
    private BigDecimal reading; // kW

    public ElectricityReading() {
    }

    public ElectricityReading(Instant time, BigDecimal reading) {
        this.time = time;
        this.reading = reading;
    }

    public BigDecimal getReading() {
        return reading;
    }

    public Instant getTime() {
        return time;
    }

    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof ElectricityReading)) {
            return false;
        }

        ElectricityReading r = (ElectricityReading) o;

        return this.reading.equals(r.reading) && this.time.equals(r.time);
    }
}
