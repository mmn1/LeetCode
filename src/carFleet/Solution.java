package carFleet;

import java.util.Arrays;

public class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int N = position.length;
        Car[] cars = new Car[N];
        for(int i = 0; i<N; i++) {
        	cars[i] = new Car(position[i], (double)((target - position[i])/speed[i]));
        }
        Arrays.sort(cars, (a, b) -> Integer.compare(a.position, b.position));
        int tmp = N, res = 0;
        while(--tmp > 0) {
        	if(cars[tmp].time < cars[tmp-1].time) {
        		res++;
        	}else {
        		cars[tmp-1] = cars[tmp];
        	}
        }
        return res + (tmp==0?1:0);
    }
}
class Car{
	int position;
	double time;
	Car(int p, double t){
		position = p;
		time = t;
	}
}
