package z_56_Merge_Interval;

import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Solution {
	public List<Interval> merge(List<Interval> intervals){
		
		if(intervals.size() <= 1){return intervals;}
		
		Collections.sort(intervals, new Comparator<Interval>(){
			public int compare(Interval i1, Interval i2){
				return Integer.compare(i1.start, i2.start);
			}
		});
		
		List<Interval> result= new LinkedList<Interval>();
		int start = intervals.get(0).start;
		int end = intervals.get(0).end;
		
		for(Interval interval:intervals){
			if(interval.end > start){
				end = Math.max(end, interval.end);
			}
			else{
				result.add(new Interval(start, end));
				start = interval.start;
				end = interval.end;
			}
		}
		result.add(new Interval(start, end));
		
		
		
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
