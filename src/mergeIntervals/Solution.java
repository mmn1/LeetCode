package mergeIntervals;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

class Solution {
    private class IntervalComparator implements Comparator<Interval> {
    	//ͨ������һ��˽���࣬�̳�Comparator�ࡣȻ���д������ıȽϷ�����ʹ�������������
        @Override
        public int compare(Interval a, Interval b) {
            return a.start < b.start ? -1 : a.start == b.start ? 0 : 1;
        }
    }

    public List<Interval> merge(List<Interval> intervals) {
    	Collections.sort(intervals, new IntervalComparator());
    	//����һ��   �ض��ıȽ���   ���Ƚ�����
    	LinkedList<Interval> merged = new LinkedList<>();
    	for(Interval interval : intervals) {
    		if(merged.isEmpty()|| merged.getLast().end < interval.start) {
    			merged.add(interval);
    		}else {
    			merged.getLast().end = Math.max(merged.getLast().end, interval.end);
    			//��βȡ�����������ֵ
    		}
    	}
    	return merged;
    }
}
//        Collections.sort(intervals, new IntervalComparator());
//        //����һ��   �ض��ıȽ���   ���Ƚ�����
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