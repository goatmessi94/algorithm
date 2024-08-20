package self;

import java.util.*;
import java.util.stream.Collectors;

public class Temp17 {

    List<List<List<String>>> result = new ArrayList<>();
    List<String> resultStr = new ArrayList<>();
    List<List<String>> tickets;
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> map = new HashMap<>();
        List<String> list = new LinkedList<>();
        for (List<String> ticket : tickets) {
            map.putIfAbsent(ticket.get(0), new PriorityQueue<>()); // 이미 있을 경우 아무일도 일어나지 않는다.
            map.get(ticket.get(0)).add(ticket.get(1));
        }

        return null;
    }

    public void dfs() {

    }

    public static void main(String[] args) {
//        String[][] cos = new String[][]{{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}};
        String[][] cos = new String[][]{{"JFK","SFO"},{"JFK","ATL"},{"SFO","ATL"},{"ATL","JFK"},{"ATL","SFO"}};

        Temp17 temp17 = new Temp17();
        List<List<String>> tickets = new ArrayList<>();
        for (int i = 0; i < cos.length; i++) {
            List<String> ticket = new ArrayList<>();
            ticket.add(cos[i][0]);
            ticket.add(cos[i][1]);
            tickets.add(ticket);
        }

        temp17.findItinerary(tickets);
    }
}
