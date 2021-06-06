package lintcode.q1692;

import java.util.Arrays;

public class Solution {
    /**
     * @param heroPower: the power of heros
     * @param monsterPower: the power of monsters
     * @return: how many monsters can you kill at most?
     */
    public int getAns(int[] heroPower, int[] monsterPower) {
        // Write your code here
        Arrays.sort(heroPower);
        Arrays.sort(monsterPower);

        int weakHeroIndex=0;
        int weakMonsterIndex=0;
        int strongHeroIndex = heroPower.length-1;
        int strongMonsterIndex = monsterPower.length-1;

        int count=0;

        boolean isLast = true;
        while(isLast){
            if(weakHeroIndex == strongHeroIndex){
                isLast = false;
            }
            if(heroPower[strongHeroIndex] > monsterPower[strongMonsterIndex]){
                strongHeroIndex--;
                strongMonsterIndex--;
                count ++;
            }else if(heroPower[weakHeroIndex] > monsterPower[weakMonsterIndex]){
                weakHeroIndex++;
                weakMonsterIndex++;
                count ++;
            }else{
                weakHeroIndex++;
                strongMonsterIndex--;
            }
        }
        return count;
    }
}