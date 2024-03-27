package fabrici;

import clase.PachetAllInclusive;
import clase.PachetTuristic;

public class FactoryPachetAllInclusive implements Factory{
    @Override
    public PachetTuristic createPachet() {
        return new PachetAllInclusive();
    }
}
