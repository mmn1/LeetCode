package mergeIntervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution {
    private class IntervalComparator implements Comparator<Interval> {
    	//通过创建一个私有类，继承Comparator类。然后改写类里面的比较方法，使其对数组起作用
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
    	Collections.sort(intervals, new IntervalComparator());
    	//根据一个   特定的比较器   来比较链表
    	LinkedList<Interval> merged = new LinkedList<>();
    	for(Interval interval : intervals) {
    		if(merged.isEmpty()|| merged.getLast().end < interval.start) {
    			merged.add(interval);
    		}else {
    			merged.getLast().end = Math.max(merged.getLast().end, interval.end);
    			//结尾取两个数的最大值
    		}
    	}
    	return merged;
    }
}
//        Collections.sort(intervals, new IntervalComparator());
//        //根据一个   特定的比较器   来比较链表
//
//        LinkedList<Interval> merged = new LinkedList<Interval>();
//        for (Interval interval : intervals) {
//            // if the list of merged intervals is empty or if the current
//            // interval does not overlap with the previous, simply append it.
//            if (merged.isEmpty() || merged.getLast().end < interval.start) {
//                merged.add(interval);
//            }
//            // otherwise, there is overlap, so we merge the current and previous
//            // intervals.
//            else {
//                merged.getLast().end = Math.max(merged.getLast().end, interval.end);
//            }
//        }
//
//        return merged;
//    }
//}