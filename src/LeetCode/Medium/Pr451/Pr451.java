package LeetCode.Medium.Pr451;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Pr451 {
    public String frequencySort(String s) {
        Map<Character, Integer> hashMap = new HashMap<>();

        for (char ch : s.toCharArray()) {
            hashMap.put(ch, hashMap.getOrDefault(ch, 0)+1);
        }

        PriorityQueue<Map.Entry<Character,Integer>> priorityQueue = new PriorityQueue<>( // Map.Entry로 객체의 집합을 제네릭으로 설정
                (a, b) -> b.getValue() - a.getValue() // 빈도 수에 따른 우선순위 설정
        );

        priorityQueue.addAll(hashMap.entrySet()); // EntrySet 할당

        StringBuilder sb = new StringBuilder();
        while (!priorityQueue.isEmpty()) {
            Map.Entry<Character, Integer> entry = priorityQueue.poll();
            sb.append(String.valueOf(entry.getKey()).repeat(entry.getValue()));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(new Pr451().frequencySort("IkWBhGISvgpEEvw5XdEp25kwMtnf2ww7sbbEqoOx9BXz2pS2TE7YolAw42hioODDph5FfadcWyFMpln381SinvWe6Lzz5b8hkCvnIU38ph0T1iXPp2elYNunfqH1wH1luqfgZ51LQIGkOVT9JnNSgYnBzooJBcXKeet4NnjfuEIhQBl5C4M4pE4DJSlJ6YZilH7qvSjdnixjJDin6Xpk3xaMd2TRSFGAZo7HqSu0NmlKrzgEK3n5jfNkm0SGvaFNyUTAQVcEnLx4omizRJg0lB72y4yNh4GpBddD6SiP9yuPjo96U3QZJMFlAFNP4psWR3MoCKwmIlzyEWdcgDdXnoDBWYqpTMXGx90pDMpezvvQ99HKuUhJLWgGu7EEU49SnpebahRXtpuGchpBRnzfY6ZMMGkjhEIe5lFEiNNNagfhgMRf6I4udgP9y84YyLXWETO40xVOc5ntXqvzvko63FzugCWxzugJzKA2AmdCFNs1mZQSW8oJwWc58TnmaatX5P7ub98O9boTTncWPS7zd5xaVutjPhtg6VLew3Rq0UXOz1Pl2BeNLwJJ9SUuGewwVgRqpECIn0Y9VLq5cE5QKsVJxcRDiqtOP9Aan4u8UgypcTa0ngDw4ejJFDNofwybaOD53vFI99cCMnhFUkKV8DsqFtx8gLnw3L5uL60BWJ0aLPpW46LvUzPjbWjTRJHzWj7P6z4nNDYNoMg9OoZU2fkyELtz4Vq8R5BsIcC4lrC12AMjfPju1Oy4rmGqDcZZMNy5bG9Z8qvgIc6bhu6qfVB2P4i0XtHw9Fsr4pv8rY5WgXv8XYcL2Fj3cnNgGj2a9IoFHWQvt8SWxG33LOW7NU8P39Zoh13C84bm4JfyDG6pcByhPAEFURTfJn0aNiMyGo1zyD6G2K4uvpnOvhCJGB591HcnxQw34Jju0Ag1fEatI4lQWj8XewxpuDzzjMXaUkApHhRpmJXzepzH9e0rFb0uL6B7uhZbYAKCX7QX"));
    }
}
