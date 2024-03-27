package fabrici;

import clase.PachetCazareTransport;
import clase.PachetTuristic;

public class FactoryPachetCazareTransport implements Factory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetCazareTransport();
    }
}
