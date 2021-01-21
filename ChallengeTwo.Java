public class Main {
  /** @return the index of optimal (balanced) sum of numbers found in an array */
  public static int getOptimal(int input[]) {
    //TODO
    int arrayLength = input.length;
    int endIndex = input.length - 1;
    //Validating that the driver has task
    if (arrayLength > 0) {
      for (int i = 0; i < endIndex; i++) {
        //the sum of all tasks from 0 to i equals the sum i+1 to n.
        if (arrayLength == input[i + 1]) {
          return input[i + 1];
        } else {
          return 0;
        }
      }
    }

    return arrayLength;
  }

  public static void main(String[] args) {
    int[] inputArray = {
      1,
      1
    };

    System.out.println(getOptimal(inputArray));
  }
}