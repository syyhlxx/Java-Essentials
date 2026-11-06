import java.util.ArrayList;
import java.util.Random;

public class Replication {

    static String order000 = "Penetrate Weir's office and wipe her hard drive.";
    static String order001 = "Find the ancient database and destroy it.";   
    static String order002 = "Steal any research related to the Hoffan drug.";
    static String order003 = "Locate and neutralize any Zed Pms that are still active.";
    static String order004 = "Infiltrate the Epsilon site and destroy the prototype replicant.";
    static ArrayList<String> orders = new ArrayList<>();
    static Random random = new Random();


    public static void main(String[] args) throws InterruptedException {

        orders.add(order000);
        orders.add(order001);
        orders.add(order002);
        orders.add(order003);
        orders.add(order004);

        Replicator replicator0001 = new Replicator("000111000");
        Replicator replicator0002 = new Replicator("000222000");
    }

    private static void infiltrateTarget(String target) {
        try {
            int number = random.nextInt(orders.size()); 
            System.out.println(target + " is executing the order: " 
            + orders.get(number));
            Thread.sleep(200);
        } catch (InterruptedException e) {
        }
    }

    public static class Replicator extends Thread {
        protected Replicant Castor;
        protected Replicant Pollux;

        public Replicator(String name) {
            super(name);
            Castor = new Replicant("Castor (replicator - " + getName() + ")");
            Pollux = new Replicant("Pollux (replicator - " + getName() + ")");
            start();
        }

        public void run() {
            System.out.println(getName() + " assembled a new replicant");
            try {
                initAllReplicants();
            } catch (InterruptedException e) {
            }
            System.out.println(getName() + ": All the replicants are in stasis pods. " + getName() + " quarantined them for further testing ");
        }

        private void initAllReplicants() throws InterruptedException {
            //In short: join() is a synchronization method that waits
            //  for another thread to terminate.
            Castor.start();
            Pollux.start();

            Castor.join();
            Pollux.join();
        }
    }

    public static class Replicant extends Thread {
        public Replicant(String name) {
            super(name);
        }

        public void run() {
            //System.out.println(getName() + " infiltrated the Alpha site...");
            infiltrateTarget(getName());
        }
    }
}
