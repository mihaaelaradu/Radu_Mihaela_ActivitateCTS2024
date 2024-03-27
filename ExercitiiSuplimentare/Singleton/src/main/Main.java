package main;


import lazy_Initialization.Agentie;
import thread_Safe.AgentieThreadSafe;

public class Main {

    public static void main(String[] args) {
        AgentieThreadSafe primaAgentie=AgentieThreadSafe.getInstanta("AgeTur", 1000, 10);
        AgentieThreadSafe aDouaAgentie=AgentieThreadSafe.getInstanta("O alta agentie", 10, 2);

        Agentie agentie = Agentie.getInstanta("TURIs", 200, 2);
        Agentie ADOUAagentie = Agentie.getInstanta("BLABAK", 300, 5);

        System.out.println(primaAgentie.getNumeAgentie());
        System.out.println(aDouaAgentie.getNumeAgentie());
        System.out.println(agentie.getNumeAgentie());
        System.out.println(ADOUAagentie.getNumeAgentie());
    }
}