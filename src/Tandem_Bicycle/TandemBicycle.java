package Tandem_Bicycle;

import java.util.*;

class TandemBicycle {

  public static int tandemBicycle(int[] redShirtSpeeds, int[] blueShirtSpeeds, boolean fastest) {
    Arrays.sort(redShirtSpeeds);
    Arrays.sort(blueShirtSpeeds);
    int totalSpeed = 0;
    for (int i = 0; i < redShirtSpeeds.length; i++) {
        int rider1 = redShirtSpeeds[i];
        int rider2 = blueShirtSpeeds[fastest ? blueShirtSpeeds.length - 1 - i : i];
      totalSpeed += Math.max(rider1, rider2);
    }
    return totalSpeed;
  }

  public static void main(String[] args) {
    int[] redShirtSpeeds = {5, 5, 3, 9, 2};
    int[] blueShirtSpeeds = {3, 6, 7, 2, 1};
    System.out.println(tandemBicycle(redShirtSpeeds, blueShirtSpeeds, true));
  }
}