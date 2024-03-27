package fabrici;

import clase.PachetCazare;
import clase.PachetTuristic;

public class FactoryPachetCazare implements Factory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazare();
    }
}
