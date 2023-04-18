package ru.job4j.hmap;

import java.util.*;

public class AnalyzeByMap {
    public static double averageScore(List<Pupil> pupils) {
        double allScore = 0;
        double i = 0;
        for (Pupil el: pupils) {
            for (Subject sub: el.subjects()) {
                allScore += sub.score();
                i += 1;
            }
        }
        return allScore / i;
    }

    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> avPupils = new ArrayList<>();
        for (Pupil el: pupils) {
            double allScore = 0;
            double i = 0;
            for (Subject sub: el.subjects()) {
                allScore += sub.score();
                i += 1;
            }
            allScore = allScore / i;
            Label avPupil = new Label(el.name(), allScore);
            avPupils.add(avPupil);
        }
        return avPupils;
    }

    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
        List<Label> avScores = new ArrayList<>();
        int i = 0;
        for (Pupil el: pupils) {
            i += 1;
            Integer value = 0;
            for (Subject sub: el.subjects()) {
                String nameCourse = sub.name();
                if (!temp.containsKey(nameCourse)) {
                    temp.put(nameCourse, sub.score());
                } else {
                    value = temp.get(nameCourse);
                    value += sub.score();
                    temp.put(nameCourse, value);
                }
            }
        }
        for (Map.Entry<String, Integer> name : temp.entrySet()) {
            String names = name.getKey();
            Integer score = name.getValue();
            Label avScore = new Label(names, score / i);
            avScores.add(avScore);
        }
        return avScores;
    }

    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> scores = new ArrayList<>();
        for (Pupil el: pupils) {
            double allScore = 0;
            for (Subject sub: el.subjects()) {
                allScore += sub.score();
            }
            Label bestScore = new Label(el.name(), allScore);
            scores.add(bestScore);
        }
        scores.sort(Comparator.naturalOrder());
        return scores.get(scores.size() - 1);
    }

    public static Label bestSubject(List<Pupil> pupils) {
        LinkedHashMap<String, Integer> temp = new LinkedHashMap<>();
        List<Label> allScores = new ArrayList<>();
        for (Pupil el: pupils) {
            Integer value;
            for (Subject sub: el.subjects()) {
                String nameCourse = sub.name();
                if (!temp.containsKey(nameCourse)) {
                    temp.put(nameCourse, sub.score());
                } else {
                    value = temp.get(nameCourse);
                    value += sub.score();
                    temp.put(nameCourse, value);
                }
            }
        }
        for (Map.Entry<String, Integer> name : temp.entrySet()) {
            Label avScore = new Label(name.getKey(), name.getValue());
            allScores.add(avScore);
        }
        allScores.sort(Comparator.naturalOrder());
        return allScores.get(allScores.size() - 1);
    }
}
