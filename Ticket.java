//public class Employee1 {
//    int id;
//    String name;
//    String Description;
//
//    public Employee1(int i, String n, String d) {
//        this.id = i;
//        this.name = n;
//        this.Description = d;
//    }
//
//
//    void dispaly() {
//        System.out.println("id:" + id + "/n name:" + name + "/n Read:" + Description);
//    }
//
//    public static class IT_Team extends Employee1 {
//
//        public IT_Team(int i, String n, String d) {
//            super(i, n, d);
//        }
//
//        void dispaly() {
//            System.out.println("id:" + id + "/n name:" + name + "/n Read:" + Description);
//        }
//    }
//
//    public static class HR_Team extends IT_Team {
//        public HR_Team(int i, String n, String d) {
//            super(i, n, d);
//        }
//
//
//        void dispaly() {
//            System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description);
//        }
//    }
//
//    public static class Finance_Team extends HR_Team {
//        public Finance_Team(int i, String n, String d) {
//            super(i, n, d);
//        }
//
//        void dispaly() {
//            System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description);
//        }
//    }
//
//    public static class Facility_Team extends Finance_Team {
//
//
//        public Facility_Team(int i, String n, String d) {
//            super(i, n, d);
//        }
//
//        void dispaly() {
//
//            System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description);
//            System.out.println ("You have exited");
//        }
//    }
//
//
//    public static void main(String[] args) {
//        Employee1 obj = new Employee1(312, "ronak", " departure bangalore");
//        HR_Team obj1 = new HR_Team(21, "rk", "departure surat");
//        IT_Team obj2 = new IT_Team(123, "ro", "departure ahmedabad");
//        Facility_Team obj3 = new Facility_Team(1345, "rock", "departure udaipur");
//        Finance_Team obj4 = new Finance_Team(1235, "rona", "departure dharwad");
//        obj.dispaly();
//        obj1.dispaly();
//        obj2.dispaly();
//        obj3.dispaly();
//        obj4.dispaly();
//        class Train extends Thread {
//            @Override
//            public void run() {
//
//            }
//        }
//    }
//}


import java.util.HashMap;

class Ticket {

    int id;
    String name, Description, type;


    public Ticket(int i, String n, String d, String t, String p) {
        this.id = i;
        this.name = n;
        this.Description = d;
        this.type = t;


    }
    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ",Description="+Description + "type="+type+ "name='" + name + '\'' +
                '}';
    }

    public Ticket(int i, String s, String d) {
    }



    public void Emp() {

        switch (type) {
            case "IT Team":
                System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description + "\nType: " + type);
                break;
            case "HR Team":
                System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description + "\nType: " + type);
                break;
            case "Facility Team":
                System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description + "\nType: " + type);
                break;
            case "Finance Team":
                System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description + "\nType: " + type);
                break;
            default:
                System.out.println("id:" + id + "\n name:" + name + "\n Read:" + Description + "\nType: " + type);

                break;


        }
    }
}

    class Confirmation {
        int Ticket_no;
        String AssngTeam, Reservation;
        private String Res;

        public Confirmation(int t, String At, String Res) {

            this.Ticket_no = t;
            this.AssngTeam = At;
            this.Reservation = Res;
            if (Res != "FIX") {
                System.out.println("Ticket not Confirmed");
            } else {
                System.out.println("Ticket confirmed");
            }
        }

        @Override
        public String toString() {
            return "Confirmation{" +
                    "Ticket_no=" + Ticket_no +
                    "AssngTeam=" + AssngTeam + "Reservation=" + Reservation + '\'' +
                    '}';
        }

        void dispaly() {
            System.out.println("ticketnumb:" + Ticket_no + "\n AssgnTeam:" + AssngTeam + "\n REservation:" + Reservation);

        }
        static class Excel1 extends Thread {
            @Override
            public void run() {

                HashMap<String, String> hash_map = new HashMap<String, String>();


                hash_map.put("Nick", "Team_HR");
                hash_map.put("Mike", "Team_IT");
                hash_map.put("John", "Team_Fin");
                hash_map.put("Kelly", "Team_Fin");
                hash_map.put("Jade", "Team_IT");
                hash_map.put("Nicholas", "Team_IT");
                hash_map.put("Tim", "Team_HR");
                hash_map.put("Michael", "Team_HR");
                hash_map.put("Paula", "Team_Fin");
                hash_map.put("Charles", "Team_Fin");


                System.out.println("Excel1: " + hash_map);

            }
        }
        static class Excel2 extends Thread {
            @Override
            public void run() {

                HashMap<String, String> hash_map1 = new HashMap<String, String>();


                hash_map1.put("Nick", "HR");
                hash_map1.put("Mike", "IT");
                hash_map1.put("John", "Fin");
                hash_map1.put("Kelly", "Fin");
                hash_map1.put("Jade", "IT");
                hash_map1.put("Nicholas", "IT");
                hash_map1.put("Tim", "HR");
                hash_map1.put("Michael", "HR");
                hash_map1.put("Paula", "Fin");
                hash_map1.put("Charles", "Fin");


                System.out.println("Excel2: " + hash_map1);

            }
        }


        static class Status {
            String TeamWorking,Ticket_Owner,Description,Severity;
            Status(String w,String o,String d,String se){
                this.TeamWorking=w;
                this.Ticket_Owner=o;
                this.Description=d;
                this.Severity=se;
            }
            @Override
            public String toString() {
                return "Status{" +
                        "TeamWorking=" + TeamWorking +
                        "Ticket_Owner=" + Ticket_Owner + "Ticket_Owner=" + Description +"Description=" + Severity + '\'' +
                        '}';
            }
void Check_staus(){
    System.out.println("working:"+ TeamWorking +"\n Owner:" + Ticket_Owner + "\n Readme:"+ Description +"\n Severity:"+ Severity);
}
        }

        public static void main(String[] args) throws InterruptedException {
            Ticket obj1 = new Ticket(312, "tom", " departure bangalore");
            Ticket obj2 = new Ticket(123, "rom", "departure udapiur");
            Ticket obj3 = new Ticket(145, "ron", "departure kolkata");
            Ticket obj4 = new Ticket(167, "rock", "departure kochin");
            System.out.println(obj1);
            System.out.println(obj2);
            System.out.println(obj3);
            System.out.println(obj4);

            System. out. println( "\n 1 " );//quit

            Confirmation y = new Confirmation(312, "HR_Team", "ETA");
            System.out.println(y);
            Confirmation y1 = new Confirmation(3342, "IT_Team", "FIX");
            System.out.println(y1);

            System. out. println( "\n 2 " );//quit

            Excel1 n1 = new Excel1();
            Excel2 n2 = new Excel2();
            n1.start();
            n1.join();
            n2.start();

            System. out. println( "\n 3 " );//quit 


            Status status=new Status("HR_Team","Nick","departure bangalore","less");
            Status status1=new Status("IT_Team","Mike","departure Udaipur","MORE");
            Status status2=new Status("Fin_Team","John","departure DARJELLING","less");
            status.Check_staus();
            status1.Check_staus();
            status2.Check_staus();

            System. out. println( "\n 4 " );//quit 
            System.exit(0); //exit

        }
    }

