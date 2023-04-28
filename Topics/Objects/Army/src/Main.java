class Army {

    public static void createArmy() {
        Unit unit = new Unit("firstUnit");
        Unit secondunit = new Unit("secondUnit");
        Unit thirdunit = new Unit("thirdUnit");
        Unit forthunit = new Unit("forthUnit");
        Unit fifthunit = new Unit("fifthUnit");

        Knight knight = new Knight("firstKnight");
        Knight secondknight = new Knight("secondKnight");
        Knight thirdKnight = new Knight("thirdKnight");

        General general = new General("Matt");

        Doctor doctor = new Doctor("Kebron");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}