public class D_Trapping_Rain_Water {
    public static int totalTrappedWater(int[] barHeight) {
        int trappedWater = 0;
        int n = barHeight.length;
        
        // calculate left max boundary - array
        int[] leftMax = new int[n];
        leftMax[0] = barHeight[0];
        for(int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i-1], barHeight[i]);
        }

        // calculate right max boundary - array
        int[] rightMax = new int[n];
        rightMax[n - 1] = barHeight[n - 1];
        for(int i = barHeight.length - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i+1], barHeight[i]);
        }

        // loop
        for(int i = 0; i < n; i++) {
            int waterLevel = Math.min(rightMax[i], leftMax[i]);
            trappedWater += (waterLevel - barHeight[i]);
        }

        return trappedWater;
    }
    public static void main(String[] args) {
        int barHeight[] = {4, 2, 0, 6, 3, 2, 5};
        int trappedWater = totalTrappedWater(barHeight);
        System.out.println("Total Trapped Water: " + trappedWater);
    }
}
