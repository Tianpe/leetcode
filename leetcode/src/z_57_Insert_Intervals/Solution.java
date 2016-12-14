package z_57_Insert_Intervals;

import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Interval> insert(List<Interval> intervals, Interval newInterval){
		LinkedList result = new LinkedList<Interval>();
		int i = 0;
		
		while(i < intervals.size() && newInterval.start > intervals.get(i).end){
			result.add(intervals.get(i));
			i++;
		}
		while(i < intervals.size() && newInterval.end >= intervals.get(i).start&& newInterval.start <= intervals.get(i).end){
			newInterval.start = Math.min(newInterval.start, intervals.get(i).start);
			newInterval.end = Math.max(newInterval.end, intervals.get(i).end);
			i++;
		}
		result.add(new Interval(newInterval.start, newInterval.end));
		while(i < intervals.size()){
			result.add(intervals.get(i));
			i++;
		}
		return result;
		
		
		
		

	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
