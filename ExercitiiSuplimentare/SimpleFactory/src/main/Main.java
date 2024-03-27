package main;


import clase.AgentieFactory;
import clase.PachetCazare;
import clase.PachetTuristic;
import clase.TipPachet;

public class Main {

    public static void main(String[] args)  {
        AgentieFactory agentieFactory = new AgentieFactory();
        PachetTuristic pachetTuristic = null;
        PachetTuristic pachetTuristic2 = null;

        try {
            pachetTuristic = agentieFactory.createPachet(TipPachet.pachetCazare);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        try {
            pachetTuristic2 =  agentieFactory.createPachet(TipPachet.pachetCazareSiTransport);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        pachetTuristic.descriere();
        pachetTuristic2.descriere();




		/*AgentieSingletonFactory agentieFabrica = AgentieSingletonFactory.getInstanta();
		try {
			pachetTuristic = agentieFabrica.createPachet(TipPachet.pachetCazareSiTransport);
		} catch (Exception e) {
			e.printStackTrace();
		}
		pachetTuristic.descriere();*/
    }
}