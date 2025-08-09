public class Main {
    public static void main(String[] args) {

        Cage cage1 = new Cage("C001");
        Cage cage2 = new Cage("C002");

        Pet pet1 = new Pet("ChoHusky", 20, "Cho");
        Pet pet2 = new Pet("ChoTa", 12, "Cho");
        Pet pet3 = new Pet("Hamter", 2, "mouse");
        Pet pet4 = new Pet("NgaoTayTang", 50, "Cho");
        Pet pet5 = new Pet("Muop", 3, "Meo");

        cage1.addPet(pet1);
        cage1.addPet(pet2);
        cage1.addPet(pet3);

        cage2.addPet(pet4);
        cage2.addPet(pet5);

        System.out.println("TOng long da tao: " + Cage.totalCages);
        System.out.println();

        cage1.printAllPets();
        System.out.println();
        cage2.printAllPets();
        System.out.println();

        System.out.println("nhung con nang hon 10kg:");
        for (Pet pet : cage1.getPets()) {
            if (pet.isOverweight()) {
                pet.printInfo();
            }
        }
        for (Pet pet : cage2.getPets()) {
            if (pet.isOverweight()) {
                pet.printInfo();
            }
        }
    }
}
