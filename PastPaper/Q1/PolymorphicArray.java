public class PolymorphicArray {
    // Enter Your Methods Here
    public static void main(String[] args) {
        // Enter Your Code Here
        Truck[] truck = new Truck[2];
        truck[0] = new HGV();
        truck[1] = new Garbage();
        for(int i = 0; i < truck.length; i++){
            truck[i].load("Stuff");
        }
    }
}