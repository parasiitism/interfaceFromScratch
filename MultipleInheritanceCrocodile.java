package Interface;

public class MultipleInheritanceCrocodile implements MultipleInheritance_LandAnimal,MultipleInheritance_WaterAnimal{
    @Override
    public boolean canBreathe() {
        return true;
    }
}
