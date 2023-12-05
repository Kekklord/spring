package com.dem.kek;

import com.dem.kek.model.Jumpcode;
import com.dem.kek.model.Quiz;
import com.dem.kek.repository.JumpcodeRepository;
import com.dem.kek.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.util.Pair;
import org.springframework.stereotype.Component;

import java.util.List;

//To call the class
//@Component
public class Runner implements CommandLineRunner {
    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private JumpcodeRepository jumpcodeRepository;


    @Override
    public void run(String... args) throws Exception {
        System.out.println("-----STARTING MONGODB INITIALIZATION-----\n");
        deleteQuizData();
    }

    public void createQuizData() {
        System.out.println("-----STARTING QUIZZES CREATION-----\n");
        quizRepository.save(new Quiz(
                0,
                "Which country has the largest population in the world?",
                List.of(
                        Pair.of("United States", 1),
                        Pair.of("India", 2),
                        Pair.of("China", 3),
                        Pair.of("Japan", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                1,
                "What is the name of the tallest mountain in the world?",
                List.of(
                        Pair.of("Mount Chimborazo's", 1),
                        Pair.of("Mount Everest's", 2),
                        Pair.of("Mount Kilimanjaro", 3),
                        Pair.of("Mauna Kea", 4)
                ),
                2
        ));

        quizRepository.save(new Quiz(
                2,
                "What is the name of the longest river in the world?",
                List.of(
                        Pair.of("Nile River", 1),
                        Pair.of("Amazon–Ucayali–Apurímac", 2),
                        Pair.of("Yangtze", 3),
                        Pair.of("Mississippi–Missouri–Red Rock", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                3,
                "What American city is the Golden Gate Bridge located in?",
                List.of(
                        Pair.of("New York", 1),
                        Pair.of("San Francisco", 2),
                        Pair.of("Chicago", 3),
                        Pair.of("Los Angeles", 4)
                ),
                2
        ));

        quizRepository.save(new Quiz(
                4,
                "What is the name of the largest country in the world?",
                List.of(
                        Pair.of("United States of America", 1),
                        Pair.of("Canada", 2),
                        Pair.of("China", 3),
                        Pair.of("Russia", 4)
                ),
                4
        ));

        quizRepository.save(new Quiz(
                5,
                "What U.S. state is home to no documented poisonous snakes?",
                List.of(
                        Pair.of("Kansas", 1),
                        Pair.of("Arizona", 2),
                        Pair.of("Alaska", 3),
                        Pair.of("Wyoming", 4)
                ),
                3
        ));

        quizRepository.save(new Quiz(
                6,
                "What is the capital of Mexico?",
                List.of(
                        Pair.of("Mexico City", 1),
                        Pair.of("Puebla", 2),
                        Pair.of("Zapopan", 3),
                        Pair.of("Saltillo", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                7,
                "Where is the Eiffel Tower located?",
                List.of(
                        Pair.of("Germany", 1),
                        Pair.of("Italy", 2),
                        Pair.of("France", 3),
                        Pair.of("Belgium", 4)
                ),
                3
        ));

        quizRepository.save(new Quiz(
                8,
                "What is the capital of Canada?",
                List.of(
                        Pair.of("Victoria", 1),
                        Pair.of("Regina", 2),
                        Pair.of("Ottawa", 3),
                        Pair.of("Toronto", 4)
                ),
                3
        ));

        quizRepository.save(new Quiz(
                9,
                "What is the name of the largest ocean in the world?",
                List.of(
                        Pair.of("Indian Ocean", 1),
                        Pair.of("Atlantic Ocean", 2),
                        Pair.of("Pacific Ocean", 3),
                        Pair.of("Arctic Ocean", 4)
                ),
                3
        ));

        quizRepository.save(new Quiz(
                10,
                "What country are the Great Pyramids of Giza located in?",
                List.of(
                        Pair.of("Egypt", 1),
                        Pair.of("Saudi Arabia", 2),
                        Pair.of("Libya", 3),
                        Pair.of("Sudan", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                11,
                "What is the capital of Thailand?",
                List.of(
                        Pair.of("Hanoi", 1),
                        Pair.of("Jakarta", 2),
                        Pair.of("Bangkok", 3),
                        Pair.of("Phuket", 4)
                ),
                3
        ));

        quizRepository.save(new Quiz(
                12,
                "What is the name of the smallest country in the world?",
                List.of(
                        Pair.of("Monaco", 1),
                        Pair.of("Vatican City", 2),
                        Pair.of("San Marino", 3),
                        Pair.of("Nauru", 4)
                ),
                2
        ));

        quizRepository.save(new Quiz(
                13,
                "How many States does the United States consist of?",
                List.of(
                        Pair.of("47", 1),
                        Pair.of("48", 2),
                        Pair.of("49", 3),
                        Pair.of("50", 4)
                ),
                4
        ));

        quizRepository.save(new Quiz(
                14,
                "What is the name of the river that flows through the Brazilian rainforest?",
                List.of(
                        Pair.of("Amazon River", 1),
                        Pair.of("Nile River", 2),
                        Pair.of("Yangtze River", 3),
                        Pair.of("Congo River", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                15,
                "What is the coldest place on Earth?",
                List.of(
                        Pair.of("Barrow, Alaska", 1),
                        Pair.of("Antarctica Plateau", 2),
                        Pair.of("Oymyakon, Russia", 3),
                        Pair.of("North Ice, Greenland", 4)
                ),
                2
        ));

        quizRepository.save(new Quiz(
                16,
                "What type of leaf is on the Canadian flag?",
                List.of(
                        Pair.of("Maple Leaf", 1),
                        Pair.of("Oak Leaf", 2),
                        Pair.of("Pine Leaf", 3),
                        Pair.of("Cedar Leaf", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                17,
                "Which strait separates the Malay Peninsula from the island of Sumatra?",
                List.of(
                        Pair.of("Malacca Strait", 1),
                        Pair.of("Sunda Strait", 2),
                        Pair.of("Lombok Strait", 3),
                        Pair.of("Bering Strait", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                18,
                "The \"Ring of Fire\" is a region in the Pacific Ocean basin known for its high seismic and volcanic activity. Which Asian country is part of the Ring of Fire?",
                List.of(
                        Pair.of("Japan", 1),
                        Pair.of("Mongolia", 2),
                        Pair.of("Thailand", 3),
                        Pair.of("Bangladesh", 4)
                ),
                1
        ));

        quizRepository.save(new Quiz(
                19,
                "What ancient city, known for its archaeological wonders like the Treasury and the Monastery, is located in the modern-day country of Jordan?",
                List.of(
                        Pair.of("Petra", 1),
                        Pair.of("Palmyra", 2),
                        Pair.of("Persepolis", 3),
                        Pair.of("Ephesus", 4)
                ),
                1
        ));
    }

    public void deleteQuizData() {
        quizRepository.deleteAll();
    }

    public void createJumpcode(Jumpcode jumpcode) {
        jumpcodeRepository.save(jumpcode);
    }
}