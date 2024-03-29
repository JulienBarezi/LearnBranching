// Author: Julien and Lando

package checkinandout;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

class Staff_Test {

	// Testing check in method in staff
	
	@Test
	void testcheckin() {
		
		Staff stest = new Staff("1403" ,"ella", "ella@alueducation.com", "facilitator", "24-03-2021", "true", "00:10:20", "Not yet");
		ArrayList<String> list = stest.staffcheckin();
		
		String originallist[] = new String[list.size()];
		for (int j = 0; j<list.size(); j++) {
			originallist[j] = list.get(j);
		}
		String[] expected_output = {"1403" ,"ella", "ella@alueducation.com", "facilitator", "24-03-2021", "true", "00:10:20", "Not yet"};
		
		assertArrayEquals(expected_output, originallist);
	}
	
	// Testing check out method in staff
	
	@Test
	void testcheckout() {
		Staff stest0 = new Staff();
		Staff stest = new Staff("1404" ,"bobson", "bobson@alueducation.com","facilitator", "24-03-2021", "true", "00:10:20", "Not yet");
		ArrayList<String> list = stest.staffcheckin();
		
		List<List<String>> sdata = new ArrayList<List<String>>();
		sdata.add(list);
		
		String time = "";
		
		String name = "bobson";
		List<List<String>> list2 = stest0.checkout(sdata, name);
	
		ArrayList<String> list3 = new ArrayList<String>();
		for(int row = 0; row < list2.size(); row++) {
			for(int column = 0; column < list2.get(row).size(); column++) {
				list3.add(list2.get(row).get(0));
				list3.add(list2.get(row).get(1));
				list3.add(list2.get(row).get(2));
				list3.add(list2.get(row).get(3));
				list3.add(list2.get(row).get(4));
				list3.add(list2.get(row).get(5));
				list3.add(list2.get(row).get(6));
				list3.add(list2.get(row).get(7));
				time = list2.get(row).get(7);
				break;
			}
		}
		
		String listnew[] = new String[list3.size()];
		for (int j = 0; j<list3.size(); j++) {
			listnew[j] = list3.get(j);
		}
		String[] expected = {"1404" ,"bobson", "bobson@alueducation.com", "facilitator", "24-03-2021", "true", "00:10:20", time};
		
		assertArrayEquals(expected, listnew);
	
	}

}
