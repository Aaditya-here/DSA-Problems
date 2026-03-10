package Interview.Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {

	public List<List<String>> groupAnagrams(String[] strs) {

		HashMap<String, List<String>> map = new HashMap<>();

		for (String str : strs) {
			char[] characters = str.toCharArray();

			Arrays.sort(characters);

			String sortedString = new String(characters);

			if (!map.containsKey(sortedString)) {
				map.put(sortedString, new ArrayList<>());
			}

			map.get(sortedString).add(str);

		}

		return new ArrayList<>(map.values());
	}

	public static void main(String[] args) {
		String[] str = { "eat", "tea", "tan", "ate", "nat", "bat" };

		GroupAnagrams anagrams = new GroupAnagrams();
		List res = anagrams.groupAnagrams(str);
		System.out.println(res);
	}

}
