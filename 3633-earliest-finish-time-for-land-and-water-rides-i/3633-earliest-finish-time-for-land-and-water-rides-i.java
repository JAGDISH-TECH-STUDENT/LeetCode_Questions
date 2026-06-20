class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration,
                                  int[] waterStartTime, int[] waterDuration) {
        int ans = Integer.MAX_VALUE;

        // Try every land ride with every water ride
        for (int i = 0; i < landStartTime.length; i++) {
            for (int j = 0; j < waterStartTime.length; j++) {
                
                // Case 1: Land ride first, then water ride
                int finishLand = landStartTime[i] + landDuration[i];
                int startWater = Math.max(finishLand, waterStartTime[j]);
                int finishWater = startWater + waterDuration[j];
                ans = Math.min(ans, finishWater);

                // Case 2: Water ride first, then land ride
                int finishWaterFirst = waterStartTime[j] + waterDuration[j];
                int startLand = Math.max(finishWaterFirst, landStartTime[i]);
                int finishLandAfter = startLand + landDuration[i];
                ans = Math.min(ans, finishLandAfter);
            }
        }

        return ans;
    }
}
