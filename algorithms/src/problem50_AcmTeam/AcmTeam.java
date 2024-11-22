package problem50_AcmTeam;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;


public class AcmTeam {

    public static void main(String[] args) {
        List<String> topics = Arrays.asList("10101", "11110", "00010");
        System.out.println(acmTeam(topics));
    }

    private static List<Integer> acmTeam(List<String> topic) {
        int countMaxTopic = 0;
        int numberOfTeams = 0;
        for (int i = 0; i < topic.size() - 1; i++) {
            for (int j = i + 1; j < topic.size(); j++) {
                BigInteger personA = new BigInteger(topic.get(i), 2);
                BigInteger personB = new BigInteger(topic.get(j), 2);
                BigInteger combinedKnowledge = personA.or(personB);

                int knownTopics = combinedKnowledge.bitCount();

//                for(int k = 0; k < topic.get(i).length(); k++) {
//                    if(topic.get(i).charAt(k) == '1' || topic.get(j).charAt(k) == '1' ) {
//                        knownTopics++;
//                    }
//                }

                if (knownTopics > countMaxTopic) {
                    countMaxTopic = knownTopics;
                    numberOfTeams = 1;
                } else if (knownTopics == countMaxTopic) {
                    numberOfTeams++;
                }
            }
        }
        return Arrays.asList(countMaxTopic, numberOfTeams);
    }
}
