public class MyPizza {
    public static void main(String[] args) {
 
    int numPizza = 1;
    int numSlicesPerPizza= 8;
    int numChild = 2;
    int numParent= 8;
     
    int totalSlices = (numPizza * numSlicesPerPizza);

    System.out.println("numPizza: " + numPizza);
    System.out.println("numSlicesPerPizza: " + numSlicesPerPizza);
    System.out.println("totalSlices: " + totalSlices);


    int slicesPerParent = (totalSlices / (numParent * 2)) * 2;
    System.out.println("Slices per parent: " + slicesPerParent);

    int totalSlicesAfterParent = totalSlices - (numParent * slicesPerParent);

    System.out.println("Slices left: " + totalSlicesAfterParent);
    System.out.println("Slices per child: " + totalSlicesAfterParent / numChild);

   }


}