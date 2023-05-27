public class VetClinic {
    String clinicName;
    Pet pet;

    public VetClinic(String clinicName) {
        this.clinicName = clinicName;
    }
    public Pet getPet() {
        return pet;
    }
    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
