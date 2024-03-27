package fabrici;

import clase.PachetTransport;
import clase.PachetTuristic;

public class FactoryPachetTransport implements Factory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetTransport();
    }
}
